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
 * A representation of the model object '<em><b>Arc Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.agileplex.framework.configuration.ArcCollection#getArcs <em>Arcs</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.agileplex.framework.configuration.ConfigurationPackage#getArcCollection()
 * @model extendedMetaData="name='ArcCollection' kind='elementOnly'"
 * @generated
 */
public interface ArcCollection extends EObject {
	/**
	 * Returns the value of the '<em><b>Arcs</b></em>' containment reference list.
	 * The list contents are of type {@link com.agileplex.framework.configuration.Arc}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arcs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arcs</em>' containment reference list.
	 * @see com.agileplex.framework.configuration.ConfigurationPackage#getArcCollection_Arcs()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='arc' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Arc> getArcs();

} // ArcCollection
