package com.agileplex.framework.classloader;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class StateflowClassLoader extends java.lang.ClassLoader {
	
	private final static String CLASS_FILE_EXT = ".class";
	private final static String ZIP_FILE_EXT = ".zip";
	private final static String JAR_FILE_EXT = ".jar";

	private File[] classPath;
	
	public StateflowClassLoader(File[] classPath) {
		super();
		this.classPath = classPath;
	}
	
	public StateflowClassLoader(File[] classPath, ClassLoader parent) {
		super(parent);
		this.classPath = classPath;
	}
	
	public Class<?> findClass(String className) {
		try {
			byte[] byteArray = this.loadClassData(className);
			if (byteArray == null) {
				return null;
			}
			
			return this.defineClass(className, byteArray, 0, byteArray.length);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassFormatError e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	private byte[] loadClassData(String name) throws IOException {
		for (int i = 0; i < this.classPath.length; i++) {
			File file = this.classPath[i];
			if (!file.exists()) {
				continue;
			}
			
			if (file.isFile()) {
				if (isClassFile(file)) {
					return this.loadClassDataFromClassFile(file, name);
				} else if (isZipFile(file)) {
					ZipFile zipFile = new ZipFile(file);
					return this.loadClassDataFromZipFile(zipFile, name);
				} else if (isJarFile(file)) {
					JarFile jarFile = new JarFile(file);
					return this.loadClassDataFromJarFile(jarFile, name);
				}
			} else if (file.isDirectory()) {
				return this.loadClassDataFromDirectory(file, name);
			}
		}
		
		return null;
	}
	
	private byte[] loadClassDataFromClassFile(File file, String className) throws IOException {
		String fileName = file.getName();
		int lastIndex = fileName.lastIndexOf('.');
		if (lastIndex == 0) {
			System.out.println("error");
			return null;
		}
		
		String mainName = fileName.substring(0, lastIndex);
		if (!mainName.equals(className)) {
			return null;
		}
		
		InputStream is = null;
		try {
			is = new FileInputStream(file);
			return loadClassDataFromInputStream(is);
		} finally {
			if (is != null) {
				is.close();
			}
		}
	}
	
	private byte[] loadClassDataFromZipFile(ZipFile zipFile, String className) throws IOException {
		String newClassName = replaceClassName(className);
		ZipEntry entry = zipFile.getEntry(newClassName);
		
		InputStream is = null;
		try {
			is = zipFile.getInputStream(entry);
			return this.loadClassDataFromInputStream(is);
		} finally {
			if (is != null) {
				is.close();
			}
		}
	}
	
	private byte[] loadClassDataFromJarFile(JarFile jarFile, String className) throws IOException {
		return this.loadClassDataFromZipFile(jarFile, className);
	}
	
	private byte[] loadClassDataFromDirectory(File dir, String className) throws IOException {
		String newClassName = replaceClassName(className);
		File file = new File(dir, newClassName);
		if (!file.exists()) {
			return null;
		}
		
		InputStream is = null;
		try {
			is = new FileInputStream(file);
			return this.loadClassDataFromInputStream(is);
		} finally {
			if (is != null) {
				is.close();
			}
		}
		
	}
	
	private byte[] loadClassDataFromInputStream(InputStream is) throws IOException {
		byte[] buffer = new byte[2048];
		ByteArrayOutputStream os = new ByteArrayOutputStream();
		
		int total = 0;
		int n;
		
		try {
			while ((n = is.read(buffer, total, buffer.length)) >= 0) {
				total += n;
				os.write(buffer);
			}
			
			return os.toByteArray();
		} finally {
			os.close();
		}
	}
	
	private static String replaceClassName(String className) {
		return className.replace('.', File.separatorChar) + CLASS_FILE_EXT;
	}
	
	private static boolean isClassFile(File file) {
		return isXXXFile(file, CLASS_FILE_EXT);
	}
	
	private static boolean isZipFile(File file) {
		return isXXXFile(file, ZIP_FILE_EXT);
	}
	
	private static boolean isJarFile(File file) {
		return isXXXFile(file, JAR_FILE_EXT);
	}
	
	private static boolean isXXXFile(File file, String ext) {
		String fileName = file.getName();
		String extName = fileName.substring(fileName.lastIndexOf('.'));
		
		return ext.equalsIgnoreCase(extName);
	}
}
