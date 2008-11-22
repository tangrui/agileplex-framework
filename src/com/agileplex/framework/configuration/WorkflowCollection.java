/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.agileplex.framework.configuration;

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
 *   <li>{@link com.agileplex.framework.configuration.WorkflowCollection#getStateflows <em>Stateflows</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.agileplex.framework.configuration.ConfigurationPackage#getWorkflowCollection()
 * @model extendedMetaData="name='WorkflowCollection' kind='elementOnly'"
 * @generated
 */
public interface WorkflowCollection extends EObject {
	/**
	 * Returns the value of the '<em><b>Stateflows</b></em>' containment reference list.
	 * The list contents are of type {@link com.agileplex.framework.configuration.Stateflow}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stateflows</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stateflows</em>' containment reference list.
	 * @see com.agileplex.framework.configuration.ConfigurationPackage#getWorkflowCollection_Stateflows()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='stateflow' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Stateflow> getStateflows();

} // WorkflowCollection
