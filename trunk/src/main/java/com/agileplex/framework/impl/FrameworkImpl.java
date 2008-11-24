package com.agileplex.framework.impl;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;

import com.agileplex.framework.Framework;
import com.agileplex.framework.classloader.StateflowClassLoader;
import com.agileplex.framework.configuration.Configuration;
import com.agileplex.framework.configuration.ConfigurationPackage;
import com.agileplex.framework.configuration.DocumentRoot;
import com.agileplex.framework.configuration.Stateflow;
import com.agileplex.framework.configuration.WorkflowCollection;
import com.agileplex.framework.configuration.util.ConfigurationResourceFactoryImpl;

public class FrameworkImpl implements Framework {
	
	private ResourceSet resourceSet;
	private Configuration configuration;
	
	public FrameworkImpl(File configurationFile) throws FileNotFoundException {
		if (!configurationFile.exists()) {
			throw new FileNotFoundException(configurationFile.getAbsolutePath());
		}
		
		URI configurationFileURI = URI.createFileURI(configurationFile.getAbsolutePath());
		this.init(configurationFileURI);
		
		this.parseConfiguration();
	}
	
	private void init(URI configurationFileURI) {
		System.out.println("configurationFileURI = " + configurationFileURI);
		
		this.resourceSet = new ResourceSetImpl();
		this.resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION, new ConfigurationResourceFactoryImpl());
	
		ConfigurationPackage configPackage = ConfigurationPackage.eINSTANCE;
		
		XMLResource resource = (XMLResource)this.resourceSet.getResource(configurationFileURI, true);
		DocumentRoot root = (DocumentRoot)resource.getEObject("/");
		this.configuration = root.getConfiguration();
	}
	
	private void parseConfiguration() {
		String version = this.configuration.getVersion();
		if (!Framework.VERSION_1_0.equals(version)) {
			System.out.println("Invalid version number.");
		}
		
		WorkflowCollection workflows = this.configuration.getWorkflows();
		EList<Stateflow> stateflows = workflows.getStateflows();
		if (stateflows.size() > 0) {
			ClassLoader sfClassLoader = new StateflowClassLoader(null, Thread.currentThread().getContextClassLoader());
			SchemaBuilder schemaBuilder = StateflowSchemaBuilder.buildScheam(stateflows);
		}
		
	}
	
	private void loadStateflowClasses() throws IOException {
		JarFile jarFile = new JarFile("agileplex-stateflow-1.0.jar");
		for (Enumeration<JarEntry> en = jarFile.entries(); en.hasMoreElements(); ) {
			JarEntry entry = en.nextElement();
			InputStream is = jarFile.getInputStream(entry);
			Thread.currentThread().getContextClassLoader().
		}
	}
	
	public Configuration getConfiguration() {
		return this.configuration;
	}
}
