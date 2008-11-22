/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.agileplex.framework.specification;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.agileplex.framework.specification.SpecificationFactory
 * @model kind="package"
 * @generated
 */
public interface SpecificationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "specification";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.agileplex.com/framework/specification";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "specification";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SpecificationPackage eINSTANCE = com.agileplex.framework.specification.impl.SpecificationPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.agileplex.framework.specification.impl.ObjectBaseImpl <em>Object Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.agileplex.framework.specification.impl.ObjectBaseImpl
	 * @see com.agileplex.framework.specification.impl.SpecificationPackageImpl#getObjectBase()
	 * @generated
	 */
	int OBJECT_BASE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_BASE__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_BASE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Object Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_BASE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.agileplex.framework.specification.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.agileplex.framework.specification.impl.ActionImpl
	 * @see com.agileplex.framework.specification.impl.SpecificationPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ID = OBJECT_BASE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NAME = OBJECT_BASE__NAME;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = OBJECT_BASE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.agileplex.framework.specification.impl.ArcImpl <em>Arc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.agileplex.framework.specification.impl.ArcImpl
	 * @see com.agileplex.framework.specification.impl.SpecificationPackageImpl#getArc()
	 * @generated
	 */
	int ARC = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__ID = OBJECT_BASE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__NAME = OBJECT_BASE__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__SOURCE = OBJECT_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__TARGET = OBJECT_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_FEATURE_COUNT = OBJECT_BASE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.agileplex.framework.specification.impl.ConfigurationImpl <em>Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.agileplex.framework.specification.impl.ConfigurationImpl
	 * @see com.agileplex.framework.specification.impl.SpecificationPackageImpl#getConfiguration()
	 * @generated
	 */
	int CONFIGURATION = 2;

	/**
	 * The feature id for the '<em><b>Workflows</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__WORKFLOWS = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__VERSION = 1;

	/**
	 * The number of structural features of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.agileplex.framework.specification.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.agileplex.framework.specification.impl.DocumentRootImpl
	 * @see com.agileplex.framework.specification.impl.SpecificationPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 3;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONFIGURATION = 3;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link com.agileplex.framework.specification.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.agileplex.framework.specification.impl.StateImpl
	 * @see com.agileplex.framework.specification.impl.SpecificationPackageImpl#getState()
	 * @generated
	 */
	int STATE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ID = OBJECT_BASE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NAME = OBJECT_BASE__NAME;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = OBJECT_BASE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.agileplex.framework.specification.impl.StateflowImpl <em>Stateflow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.agileplex.framework.specification.impl.StateflowImpl
	 * @see com.agileplex.framework.specification.impl.SpecificationPackageImpl#getStateflow()
	 * @generated
	 */
	int STATEFLOW = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEFLOW__ID = OBJECT_BASE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEFLOW__NAME = OBJECT_BASE__NAME;

	/**
	 * The feature id for the '<em><b>State</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEFLOW__STATE = OBJECT_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEFLOW__ACTION = OBJECT_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Arc</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEFLOW__ARC = OBJECT_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Stateflow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEFLOW_FEATURE_COUNT = OBJECT_BASE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link com.agileplex.framework.specification.impl.WorkflowCollectionImpl <em>Workflow Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.agileplex.framework.specification.impl.WorkflowCollectionImpl
	 * @see com.agileplex.framework.specification.impl.SpecificationPackageImpl#getWorkflowCollection()
	 * @generated
	 */
	int WORKFLOW_COLLECTION = 7;

	/**
	 * The feature id for the '<em><b>Stateflow</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_COLLECTION__STATEFLOW = 0;

	/**
	 * The number of structural features of the '<em>Workflow Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_COLLECTION_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link com.agileplex.framework.specification.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see com.agileplex.framework.specification.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for class '{@link com.agileplex.framework.specification.Arc <em>Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc</em>'.
	 * @see com.agileplex.framework.specification.Arc
	 * @generated
	 */
	EClass getArc();

	/**
	 * Returns the meta object for the attribute '{@link com.agileplex.framework.specification.Arc#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see com.agileplex.framework.specification.Arc#getSource()
	 * @see #getArc()
	 * @generated
	 */
	EAttribute getArc_Source();

	/**
	 * Returns the meta object for the attribute '{@link com.agileplex.framework.specification.Arc#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see com.agileplex.framework.specification.Arc#getTarget()
	 * @see #getArc()
	 * @generated
	 */
	EAttribute getArc_Target();

	/**
	 * Returns the meta object for class '{@link com.agileplex.framework.specification.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration</em>'.
	 * @see com.agileplex.framework.specification.Configuration
	 * @generated
	 */
	EClass getConfiguration();

	/**
	 * Returns the meta object for the containment reference '{@link com.agileplex.framework.specification.Configuration#getWorkflows <em>Workflows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Workflows</em>'.
	 * @see com.agileplex.framework.specification.Configuration#getWorkflows()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Workflows();

	/**
	 * Returns the meta object for the attribute '{@link com.agileplex.framework.specification.Configuration#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see com.agileplex.framework.specification.Configuration#getVersion()
	 * @see #getConfiguration()
	 * @generated
	 */
	EAttribute getConfiguration_Version();

	/**
	 * Returns the meta object for class '{@link com.agileplex.framework.specification.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see com.agileplex.framework.specification.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link com.agileplex.framework.specification.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see com.agileplex.framework.specification.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link com.agileplex.framework.specification.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see com.agileplex.framework.specification.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link com.agileplex.framework.specification.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see com.agileplex.framework.specification.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link com.agileplex.framework.specification.DocumentRoot#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Configuration</em>'.
	 * @see com.agileplex.framework.specification.DocumentRoot#getConfiguration()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Configuration();

	/**
	 * Returns the meta object for class '{@link com.agileplex.framework.specification.ObjectBase <em>Object Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Base</em>'.
	 * @see com.agileplex.framework.specification.ObjectBase
	 * @generated
	 */
	EClass getObjectBase();

	/**
	 * Returns the meta object for the attribute '{@link com.agileplex.framework.specification.ObjectBase#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.agileplex.framework.specification.ObjectBase#getId()
	 * @see #getObjectBase()
	 * @generated
	 */
	EAttribute getObjectBase_Id();

	/**
	 * Returns the meta object for the attribute '{@link com.agileplex.framework.specification.ObjectBase#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.agileplex.framework.specification.ObjectBase#getName()
	 * @see #getObjectBase()
	 * @generated
	 */
	EAttribute getObjectBase_Name();

	/**
	 * Returns the meta object for class '{@link com.agileplex.framework.specification.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see com.agileplex.framework.specification.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for class '{@link com.agileplex.framework.specification.Stateflow <em>Stateflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stateflow</em>'.
	 * @see com.agileplex.framework.specification.Stateflow
	 * @generated
	 */
	EClass getStateflow();

	/**
	 * Returns the meta object for the containment reference list '{@link com.agileplex.framework.specification.Stateflow#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>State</em>'.
	 * @see com.agileplex.framework.specification.Stateflow#getState()
	 * @see #getStateflow()
	 * @generated
	 */
	EReference getStateflow_State();

	/**
	 * Returns the meta object for the containment reference list '{@link com.agileplex.framework.specification.Stateflow#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Action</em>'.
	 * @see com.agileplex.framework.specification.Stateflow#getAction()
	 * @see #getStateflow()
	 * @generated
	 */
	EReference getStateflow_Action();

	/**
	 * Returns the meta object for the containment reference list '{@link com.agileplex.framework.specification.Stateflow#getArc <em>Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arc</em>'.
	 * @see com.agileplex.framework.specification.Stateflow#getArc()
	 * @see #getStateflow()
	 * @generated
	 */
	EReference getStateflow_Arc();

	/**
	 * Returns the meta object for class '{@link com.agileplex.framework.specification.WorkflowCollection <em>Workflow Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow Collection</em>'.
	 * @see com.agileplex.framework.specification.WorkflowCollection
	 * @generated
	 */
	EClass getWorkflowCollection();

	/**
	 * Returns the meta object for the containment reference list '{@link com.agileplex.framework.specification.WorkflowCollection#getStateflow <em>Stateflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stateflow</em>'.
	 * @see com.agileplex.framework.specification.WorkflowCollection#getStateflow()
	 * @see #getWorkflowCollection()
	 * @generated
	 */
	EReference getWorkflowCollection_Stateflow();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SpecificationFactory getSpecificationFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.agileplex.framework.specification.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.agileplex.framework.specification.impl.ActionImpl
		 * @see com.agileplex.framework.specification.impl.SpecificationPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '{@link com.agileplex.framework.specification.impl.ArcImpl <em>Arc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.agileplex.framework.specification.impl.ArcImpl
		 * @see com.agileplex.framework.specification.impl.SpecificationPackageImpl#getArc()
		 * @generated
		 */
		EClass ARC = eINSTANCE.getArc();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARC__SOURCE = eINSTANCE.getArc_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARC__TARGET = eINSTANCE.getArc_Target();

		/**
		 * The meta object literal for the '{@link com.agileplex.framework.specification.impl.ConfigurationImpl <em>Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.agileplex.framework.specification.impl.ConfigurationImpl
		 * @see com.agileplex.framework.specification.impl.SpecificationPackageImpl#getConfiguration()
		 * @generated
		 */
		EClass CONFIGURATION = eINSTANCE.getConfiguration();

		/**
		 * The meta object literal for the '<em><b>Workflows</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__WORKFLOWS = eINSTANCE.getConfiguration_Workflows();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION__VERSION = eINSTANCE.getConfiguration_Version();

		/**
		 * The meta object literal for the '{@link com.agileplex.framework.specification.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.agileplex.framework.specification.impl.DocumentRootImpl
		 * @see com.agileplex.framework.specification.impl.SpecificationPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CONFIGURATION = eINSTANCE.getDocumentRoot_Configuration();

		/**
		 * The meta object literal for the '{@link com.agileplex.framework.specification.impl.ObjectBaseImpl <em>Object Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.agileplex.framework.specification.impl.ObjectBaseImpl
		 * @see com.agileplex.framework.specification.impl.SpecificationPackageImpl#getObjectBase()
		 * @generated
		 */
		EClass OBJECT_BASE = eINSTANCE.getObjectBase();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_BASE__ID = eINSTANCE.getObjectBase_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_BASE__NAME = eINSTANCE.getObjectBase_Name();

		/**
		 * The meta object literal for the '{@link com.agileplex.framework.specification.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.agileplex.framework.specification.impl.StateImpl
		 * @see com.agileplex.framework.specification.impl.SpecificationPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '{@link com.agileplex.framework.specification.impl.StateflowImpl <em>Stateflow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.agileplex.framework.specification.impl.StateflowImpl
		 * @see com.agileplex.framework.specification.impl.SpecificationPackageImpl#getStateflow()
		 * @generated
		 */
		EClass STATEFLOW = eINSTANCE.getStateflow();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEFLOW__STATE = eINSTANCE.getStateflow_State();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEFLOW__ACTION = eINSTANCE.getStateflow_Action();

		/**
		 * The meta object literal for the '<em><b>Arc</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEFLOW__ARC = eINSTANCE.getStateflow_Arc();

		/**
		 * The meta object literal for the '{@link com.agileplex.framework.specification.impl.WorkflowCollectionImpl <em>Workflow Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.agileplex.framework.specification.impl.WorkflowCollectionImpl
		 * @see com.agileplex.framework.specification.impl.SpecificationPackageImpl#getWorkflowCollection()
		 * @generated
		 */
		EClass WORKFLOW_COLLECTION = eINSTANCE.getWorkflowCollection();

		/**
		 * The meta object literal for the '<em><b>Stateflow</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW_COLLECTION__STATEFLOW = eINSTANCE.getWorkflowCollection_Stateflow();

	}

} //SpecificationPackage
