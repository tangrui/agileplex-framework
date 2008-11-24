/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.agileplex.framework.configuration;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stateflow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.agileplex.framework.configuration.Stateflow#getStates <em>States</em>}</li>
 *   <li>{@link com.agileplex.framework.configuration.Stateflow#getActions <em>Actions</em>}</li>
 *   <li>{@link com.agileplex.framework.configuration.Stateflow#getArcs <em>Arcs</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.agileplex.framework.configuration.ConfigurationPackage#getStateflow()
 * @model extendedMetaData="name='Stateflow' kind='elementOnly'"
 * @generated
 */
public interface Stateflow extends BaseObject {
	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference.
	 * @see #setStates(StateCollection)
	 * @see com.agileplex.framework.configuration.ConfigurationPackage#getStateflow_States()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='states' namespace='##targetNamespace'"
	 * @generated
	 */
	StateCollection getStates();

	/**
	 * Sets the value of the '{@link com.agileplex.framework.configuration.Stateflow#getStates <em>States</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>States</em>' containment reference.
	 * @see #getStates()
	 * @generated
	 */
	void setStates(StateCollection value);

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference.
	 * @see #setActions(ActionCollection)
	 * @see com.agileplex.framework.configuration.ConfigurationPackage#getStateflow_Actions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='actions' namespace='##targetNamespace'"
	 * @generated
	 */
	ActionCollection getActions();

	/**
	 * Sets the value of the '{@link com.agileplex.framework.configuration.Stateflow#getActions <em>Actions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actions</em>' containment reference.
	 * @see #getActions()
	 * @generated
	 */
	void setActions(ActionCollection value);

	/**
	 * Returns the value of the '<em><b>Arcs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arcs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arcs</em>' containment reference.
	 * @see #setArcs(ArcCollection)
	 * @see com.agileplex.framework.configuration.ConfigurationPackage#getStateflow_Arcs()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='arcs' namespace='##targetNamespace'"
	 * @generated
	 */
	ArcCollection getArcs();

	/**
	 * Sets the value of the '{@link com.agileplex.framework.configuration.Stateflow#getArcs <em>Arcs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arcs</em>' containment reference.
	 * @see #getArcs()
	 * @generated
	 */
	void setArcs(ArcCollection value);

} // Stateflow
