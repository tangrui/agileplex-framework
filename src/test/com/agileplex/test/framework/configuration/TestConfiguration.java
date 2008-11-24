package com.agileplex.test.framework.configuration;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.agileplex.framework.Framework;
import com.agileplex.framework.configuration.Action;
import com.agileplex.framework.configuration.ActionCollection;
import com.agileplex.framework.configuration.Arc;
import com.agileplex.framework.configuration.ArcCollection;
import com.agileplex.framework.configuration.ConfigurationFactory;
import com.agileplex.framework.configuration.DocumentRoot;
import com.agileplex.framework.configuration.State;
import com.agileplex.framework.configuration.StateCollection;
import com.agileplex.framework.configuration.Stateflow;
import com.agileplex.framework.configuration.WorkflowCollection;
import com.agileplex.framework.configuration.util.ConfigurationResourceFactoryImpl;
import com.agileplex.framework.impl.FrameworkImpl;

public class TestConfiguration {

	@Parameters({"configuration-file-name"})
	public void testBuildConfiguration(String fileName) {
		ConfigurationFactory factory = ConfigurationFactory.eINSTANCE;
		
		DocumentRoot root = factory.createDocumentRoot();
		
		com.agileplex.framework.configuration.Configuration config = factory.createConfiguration();
		root.setConfiguration(config);
		
		WorkflowCollection wfCollection = factory.createWorkflowCollection();
		config.setWorkflows(wfCollection);
		
		Stateflow sf = factory.createStateflow();
		sf.setId("task");
		sf.setName("Task");
		
		ActionCollection actionCollection = factory.createActionCollection();
		sf.setActions(actionCollection);
		
		Action action = null;
		State state = null;
		Arc arc = null;
		
		action = factory.createAction();
		action.setId("create");
		action.setName("Create");
		actionCollection.getActions().add(action);
		
		StateCollection stateCollection = factory.createStateCollection();
		sf.setStates(stateCollection);
		
		state = factory.createState();
		state.setId("draft");
		state.setName("Draft");
		stateCollection.getStates().add(state);
		
		ArcCollection arcCollection = factory.createArcCollection();
		sf.setArcs(arcCollection);
		
		arc = factory.createArc();
		arc.setId("postCreate");
		arc.setName("Post create");
		arc.setSource("create");
		arc.setTarget("draft");
		arcCollection.getArcs().add(arc);
		
		wfCollection.getStateflows().add(sf);
		
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION, new ConfigurationResourceFactoryImpl());
		URI fileURI = URI.createFileURI(new File(fileName).getAbsolutePath());
		XMLResource resource = (XMLResource)resourceSet.createResource(fileURI);
		resource.setEncoding("UTF-8");
		resource.getContents().add(config);
		
		try {
			resource.save(System.out, Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Parameters({"configuration-file-name"})
	@Test
	public void testLoadConfiguration(String fileName) throws FileNotFoundException {
		File file = new File(fileName);
		Framework framework = new FrameworkImpl(file);
		com.agileplex.framework.configuration.Configuration cfg = framework.getConfiguration();
		Assert.assertEquals(cfg.getVersion(), "1.0");
		
		WorkflowCollection workflows = cfg.getWorkflows();
		Assert.assertEquals(workflows.getStateflows().size(), 2);
		
		Stateflow sf1 = workflows.getStateflows().get(0);
		Assert.assertEquals(sf1.getId(), "simple_task");
		
		Stateflow sf2 = workflows.getStateflows().get(1);
		Assert.assertEquals(sf2.getId(), "complex_task");
	}
}
