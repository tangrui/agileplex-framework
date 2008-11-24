/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.agileplex.framework.configuration;

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
 * @see com.agileplex.framework.configuration.ConfigurationFactory
 * @model kind="package"
 * @generated
 */
public interface ConfigurationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "configuration";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.agileplex.com/framework/configuration";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ap";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConfigurationPackage eINSTANCE = com.agileplex.framework.configuration.impl.ConfigurationPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.agileplex.framework.configuration.impl.BaseObjectImpl <em>Base Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.agileplex.framework.configuration.impl.BaseObjectImpl
	 * @see com.agileplex.framework.configuration.impl.ConfigurationPackageImpl#getBaseObject()
	 * @generated
	 */
	int BASE_OBJECT = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_OBJECT__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_OBJECT__NAME = 1;

	/**
	 * The number of structural features of the '<em>Base Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_OBJECT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.agileplex.framework.configuration.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.agileplex.framework.configuration.impl.ActionImpl
	 * @see com.agileplex.framework.configuration.impl.ConfigurationPackageImpl#getAction()
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
	int ACTION__ID = BASE_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NAME = BASE_OBJECT__NAME;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.agileplex.framework.configuration.impl.ActionCollectionImpl <em>Action Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.agileplex.framework.configuration.impl.ActionCollectionImpl
	 * @see com.agileplex.framework.configuration.impl.ConfigurationPackageImpl#getActionCollection()
	 * @generated
	 */
	int ACTION_COLLECTION = 1;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_COLLECTION__ACTIONS = 0;

	/**
	 * The number of structural features of the '<em>Action Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_COLLECTION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.agileplex.framework.configuration.impl.ArcImpl <em>Arc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.agileplex.framework.configuration.impl.ArcImpl
	 * @see com.agileplex.framework.configuration.impl.ConfigurationPackageImpl#getArc()
	 * @generated
	 */
	int ARC = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__ID = BASE_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__NAME = BASE_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__SOURCE = BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__TARGET = BASE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_FEATURE_COUNT = BASE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.agileplex.framework.configuration.impl.ArcCollectionImpl <em>Arc Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.agileplex.framework.configuration.impl.ArcCollectionImpl
	 * @see com.agileplex.framework.configuration.impl.ConfigurationPackageImpl#getArcCollection()
	 * @generated
	 */
	int ARC_COLLECTION = 3;

	/**
	 * The feature id for the '<em><b>Arcs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_COLLECTION__ARCS = 0;

	/**
	 * The number of structural features of the '<em>Arc Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_COLLECTION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.agileplex.framework.configuration.impl.ConfigurationImpl <em>Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.agileplex.framework.configuration.impl.ConfigurationImpl
	 * @see com.agileplex.framework.configuration.impl.ConfigurationPackageImpl#getConfiguration()
	 * @generated
	 */
	int CONFIGURATION = 5;

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
	 * The meta object id for the '{@link com.agileplex.framework.configuration.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.agileplex.framework.configuration.impl.DocumentRootImpl
	 * @see com.agileplex.framework.configuration.impl.ConfigurationPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 6;

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
	 * The meta object id for the '{@link com.agileplex.framework.configuration.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.agileplex.framework.configuration.impl.StateImpl
	 * @see com.agileplex.framework.configuration.impl.ConfigurationPackageImpl#getState()
	 * @generated
	 */
	int STATE = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ID = BASE_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NAME = BASE_OBJECT__NAME;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.agileplex.framework.configuration.impl.StateCollectionImpl <em>State Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.agileplex.framework.configuration.impl.StateCollectionImpl
	 * @see com.agileplex.framework.configuration.impl.ConfigurationPackageImpl#getStateCollection()
	 * @generated
	 */
	int STATE_COLLECTION = 8;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_COLLECTION__STATES = 0;

	/**
	 * The number of structural features of the '<em>State Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_COLLECTION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.agileplex.framework.configuration.impl.StateflowImpl <em>Stateflow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.agileplex.framework.configuration.impl.StateflowImpl
	 * @see com.agileplex.framework.configuration.impl.ConfigurationPackageImpl#getStateflow()
	 * @generated
	 */
	int STATEFLOW = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEFLOW__ID = BASE_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEFLOW__NAME = BASE_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEFLOW__STATES = BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEFLOW__ACTIONS = BASE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Arcs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEFLOW__ARCS = BASE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Stateflow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEFLOW_FEATURE_COUNT = BASE_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link com.agileplex.framework.configuration.impl.WorkflowCollectionImpl <em>Workflow Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.agileplex.framework.configuration.impl.WorkflowCollectionImpl
	 * @see com.agileplex.framework.configuration.impl.ConfigurationPackageImpl#getWorkflowCollection()
	 * @generated
	 */
	int WORKFLOW_COLLECTION = 10;

	/**
	 * The feature id for the '<em><b>Stateflows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_COLLECTION__STATEFLOWS = 0;

	/**
	 * The number of structural features of the '<em>Workflow Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_COLLECTION_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link com.agileplex.framework.configuration.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see com.agileplex.framework.configuration.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for class '{@link com.agileplex.framework.configuration.ActionCollection <em>Action Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Collection</em>'.
	 * @see com.agileplex.framework.configuration.ActionCollection
	 * @generated
	 */
	EClass getActionCollection();

	/**
	 * Returns the meta object for the containment reference list '{@link com.agileplex.framework.configuration.ActionCollection#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see com.agileplex.framework.configuration.ActionCollection#getActions()
	 * @see #getActionCollection()
	 * @generated
	 */
	EReference getActionCollection_Actions();

	/**
	 * Returns the meta object for class '{@link com.agileplex.framework.configuration.Arc <em>Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc</em>'.
	 * @see com.agileplex.framework.configuration.Arc
	 * @generated
	 */
	EClass getArc();

	/**
	 * Returns the meta object for the attribute '{@link com.agileplex.framework.configuration.Arc#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see com.agileplex.framework.configuration.Arc#getSource()
	 * @see #getArc()
	 * @generated
	 */
	EAttribute getArc_Source();

	/**
	 * Returns the meta object for the attribute '{@link com.agileplex.framework.configuration.Arc#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see com.agileplex.framework.configuration.Arc#getTarget()
	 * @see #getArc()
	 * @generated
	 */
	EAttribute getArc_Target();

	/**
	 * Returns the meta object for class '{@link com.agileplex.framework.configuration.ArcCollection <em>Arc Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc Collection</em>'.
	 * @see com.agileplex.framework.configuration.ArcCollection
	 * @generated
	 */
	EClass getArcCollection();

	/**
	 * Returns the meta object for the containment reference list '{@link com.agileplex.framework.configuration.ArcCollection#getArcs <em>Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arcs</em>'.
	 * @see com.agileplex.framework.configuration.ArcCollection#getArcs()
	 * @see #getArcCollection()
	 * @generated
	 */
	EReference getArcCollection_Arcs();

	/**
	 * Returns the meta object for class '{@link com.agileplex.framework.configuration.BaseObject <em>Base Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base Object</em>'.
	 * @see com.agileplex.framework.configuration.BaseObject
	 * @generated
	 */
	EClass getBaseObject();

	/**
	 * Returns the meta object for the attribute '{@link com.agileplex.framework.configuration.BaseObject#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.agileplex.framework.configuration.BaseObject#getId()
	 * @see #getBaseObject()
	 * @generated
	 */
	EAttribute getBaseObject_Id();

	/**
	 * Returns the meta object for the attribute '{@link com.agileplex.framework.configuration.BaseObject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.agileplex.framework.configuration.BaseObject#getName()
	 * @see #getBaseObject()
	 * @generated
	 */
	EAttribute getBaseObject_Name();

	/**
	 * Returns the meta object for class '{@link com.agileplex.framework.configuration.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration</em>'.
	 * @see com.agileplex.framework.configuration.Configuration
	 * @generated
	 */
	EClass getConfiguration();

	/**
	 * Returns the meta object for the containment reference '{@link com.agileplex.framework.configuration.Configuration#getWorkflows <em>Workflows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Workflows</em>'.
	 * @see com.agileplex.framework.configuration.Configuration#getWorkflows()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Workflows();

	/**
	 * Returns the meta object for the attribute '{@link com.agileplex.framework.configuration.Configuration#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see com.agileplex.framework.configuration.Configuration#getVersion()
	 * @see #getConfiguration()
	 * @generated
	 */
	EAttribute getConfiguration_Version();

	/**
	 * Returns the meta object for class '{@link com.agileplex.framework.configuration.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see com.agileplex.framework.configuration.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link com.agileplex.framework.configuration.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see com.agileplex.framework.configuration.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link com.agileplex.framework.configuration.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see com.agileplex.framework.configuration.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link com.agileplex.framework.configuration.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see com.agileplex.framework.configuration.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link com.agileplex.framework.configuration.DocumentRoot#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Configuration</em>'.
	 * @see com.agileplex.framework.configuration.DocumentRoot#getConfiguration()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Configuration();

	/**
	 * Returns the meta object for class '{@link com.agileplex.framework.configuration.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see com.agileplex.framework.configuration.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for class '{@link com.agileplex.framework.configuration.StateCollection <em>State Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Collection</em>'.
	 * @see com.agileplex.framework.configuration.StateCollection
	 * @generated
	 */
	EClass getStateCollection();

	/**
	 * Returns the meta object for the containment reference list '{@link com.agileplex.framework.configuration.StateCollection#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States</em>'.
	 * @see com.agileplex.framework.configuration.StateCollection#getStates()
	 * @see #getStateCollection()
	 * @generated
	 */
	EReference getStateCollection_States();

	/**
	 * Returns the meta object for class '{@link com.agileplex.framework.configuration.Stateflow <em>Stateflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stateflow</em>'.
	 * @see com.agileplex.framework.configuration.Stateflow
	 * @generated
	 */
	EClass getStateflow();

	/**
	 * Returns the meta object for the containment reference '{@link com.agileplex.framework.configuration.Stateflow#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>States</em>'.
	 * @see com.agileplex.framework.configuration.Stateflow#getStates()
	 * @see #getStateflow()
	 * @generated
	 */
	EReference getStateflow_States();

	/**
	 * Returns the meta object for the containment reference '{@link com.agileplex.framework.configuration.Stateflow#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Actions</em>'.
	 * @see com.agileplex.framework.configuration.Stateflow#getActions()
	 * @see #getStateflow()
	 * @generated
	 */
	EReference getStateflow_Actions();

	/**
	 * Returns the meta object for the containment reference '{@link com.agileplex.framework.configuration.Stateflow#getArcs <em>Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Arcs</em>'.
	 * @see com.agileplex.framework.configuration.Stateflow#getArcs()
	 * @see #getStateflow()
	 * @generated
	 */
	EReference getStateflow_Arcs();

	/**
	 * Returns the meta object for class '{@link com.agileplex.framework.configuration.WorkflowCollection <em>Workflow Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow Collection</em>'.
	 * @see com.agileplex.framework.configuration.WorkflowCollection
	 * @generated
	 */
	EClass getWorkflowCollection();

	/**
	 * Returns the meta object for the containment reference list '{@link com.agileplex.framework.configuration.WorkflowCollection#getStateflows <em>Stateflows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stateflows</em>'.
	 * @see com.agileplex.framework.configuration.WorkflowCollection#getStateflows()
	 * @see #getWorkflowCollection()
	 * @generated
	 */
	EReference getWorkflowCollection_Stateflows();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ConfigurationFactory getConfigurationFactory();

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
		 * The meta object literal for the '{@link com.agileplex.framework.configuration.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.agileplex.framework.configuration.impl.ActionImpl
		 * @see com.agileplex.framework.configuration.impl.ConfigurationPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '{@link com.agileplex.framework.configuration.impl.ActionCollectionImpl <em>Action Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.agileplex.framework.configuration.impl.ActionCollectionImpl
		 * @see com.agileplex.framework.configuration.impl.ConfigurationPackageImpl#getActionCollection()
		 * @generated
		 */
		EClass ACTION_COLLECTION = eINSTANCE.getActionCollection();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_COLLECTION__ACTIONS = eINSTANCE.getActionCollection_Actions();

		/**
		 * The meta object literal for the '{@link com.agileplex.framework.configuration.impl.ArcImpl <em>Arc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.agileplex.framework.configuration.impl.ArcImpl
		 * @see com.agileplex.framework.configuration.impl.ConfigurationPackageImpl#getArc()
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
		 * The meta object literal for the '{@link com.agileplex.framework.configuration.impl.ArcCollectionImpl <em>Arc Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.agileplex.framework.configuration.impl.ArcCollectionImpl
		 * @see com.agileplex.framework.configuration.impl.ConfigurationPackageImpl#getArcCollection()
		 * @generated
		 */
		EClass ARC_COLLECTION = eINSTANCE.getArcCollection();

		/**
		 * The meta object literal for the '<em><b>Arcs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARC_COLLECTION__ARCS = eINSTANCE.getArcCollection_Arcs();

		/**
		 * The meta object literal for the '{@link com.agileplex.framework.configuration.impl.BaseObjectImpl <em>Base Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.agileplex.framework.configuration.impl.BaseObjectImpl
		 * @see com.agileplex.framework.configuration.impl.ConfigurationPackageImpl#getBaseObject()
		 * @generated
		 */
		EClass BASE_OBJECT = eINSTANCE.getBaseObject();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASE_OBJECT__ID = eINSTANCE.getBaseObject_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASE_OBJECT__NAME = eINSTANCE.getBaseObject_Name();

		/**
		 * The meta object literal for the '{@link com.agileplex.framework.configuration.impl.ConfigurationImpl <em>Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.agileplex.framework.configuration.impl.ConfigurationImpl
		 * @see com.agileplex.framework.configuration.impl.ConfigurationPackageImpl#getConfiguration()
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
		 * The meta object literal for the '{@link com.agileplex.framework.configuration.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.agileplex.framework.configuration.impl.DocumentRootImpl
		 * @see com.agileplex.framework.configuration.impl.ConfigurationPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '{@link com.agileplex.framework.configuration.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.agileplex.framework.configuration.impl.StateImpl
		 * @see com.agileplex.framework.configuration.impl.ConfigurationPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '{@link com.agileplex.framework.configuration.impl.StateCollectionImpl <em>State Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.agileplex.framework.configuration.impl.StateCollectionImpl
		 * @see com.agileplex.framework.configuration.impl.ConfigurationPackageImpl#getStateCollection()
		 * @generated
		 */
		EClass STATE_COLLECTION = eINSTANCE.getStateCollection();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_COLLECTION__STATES = eINSTANCE.getStateCollection_States();

		/**
		 * The meta object literal for the '{@link com.agileplex.framework.configuration.impl.StateflowImpl <em>Stateflow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.agileplex.framework.configuration.impl.StateflowImpl
		 * @see com.agileplex.framework.configuration.impl.ConfigurationPackageImpl#getStateflow()
		 * @generated
		 */
		EClass STATEFLOW = eINSTANCE.getStateflow();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEFLOW__STATES = eINSTANCE.getStateflow_States();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEFLOW__ACTIONS = eINSTANCE.getStateflow_Actions();

		/**
		 * The meta object literal for the '<em><b>Arcs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEFLOW__ARCS = eINSTANCE.getStateflow_Arcs();

		/**
		 * The meta object literal for the '{@link com.agileplex.framework.configuration.impl.WorkflowCollectionImpl <em>Workflow Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.agileplex.framework.configuration.impl.WorkflowCollectionImpl
		 * @see com.agileplex.framework.configuration.impl.ConfigurationPackageImpl#getWorkflowCollection()
		 * @generated
		 */
		EClass WORKFLOW_COLLECTION = eINSTANCE.getWorkflowCollection();

		/**
		 * The meta object literal for the '<em><b>Stateflows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW_COLLECTION__STATEFLOWS = eINSTANCE.getWorkflowCollection_Stateflows();

	}

} //ConfigurationPackage
