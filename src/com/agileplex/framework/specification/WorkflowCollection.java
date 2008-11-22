/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.agileplex.framework.specification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workflow Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.agileplex.framework.specification.WorkflowCollection#getStateflow <em>Stateflow</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.agileplex.framework.specification.SpecificationPackage#getWorkflowCollection()
 * @model extendedMetaData="name='WorkflowCollection' kind='elementOnly'"
 * @generated
 */
public interface WorkflowCollection extends EObject {
	/**
	 * Returns the value of the '<em><b>Stateflow</b></em>' containment reference list.
	 * The list contents are of type {@link com.agileplex.framework.specification.Stateflow}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stateflow</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stateflow</em>' containment reference list.
	 * @see com.agileplex.framework.specification.SpecificationPackage#getWorkflowCollection_Stateflow()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='stateflow' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Stateflow> getStateflow();

} // WorkflowCollection
