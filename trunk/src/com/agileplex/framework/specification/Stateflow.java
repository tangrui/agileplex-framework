/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.agileplex.framework.specification;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stateflow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.agileplex.framework.specification.Stateflow#getState <em>State</em>}</li>
 *   <li>{@link com.agileplex.framework.specification.Stateflow#getAction <em>Action</em>}</li>
 *   <li>{@link com.agileplex.framework.specification.Stateflow#getArc <em>Arc</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.agileplex.framework.specification.SpecificationPackage#getStateflow()
 * @model extendedMetaData="name='Stateflow' kind='elementOnly'"
 * @generated
 */
public interface Stateflow extends ObjectBase {
	/**
	 * Returns the value of the '<em><b>State</b></em>' containment reference list.
	 * The list contents are of type {@link com.agileplex.framework.specification.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' containment reference list.
	 * @see com.agileplex.framework.specification.SpecificationPackage#getStateflow_State()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='state' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<State> getState();

	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference list.
	 * The list contents are of type {@link com.agileplex.framework.specification.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' containment reference list.
	 * @see com.agileplex.framework.specification.SpecificationPackage#getStateflow_Action()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='action' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Action> getAction();

	/**
	 * Returns the value of the '<em><b>Arc</b></em>' containment reference list.
	 * The list contents are of type {@link com.agileplex.framework.specification.Arc}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arc</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arc</em>' containment reference list.
	 * @see com.agileplex.framework.specification.SpecificationPackage#getStateflow_Arc()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='arc' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Arc> getArc();

} // Stateflow
