/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.agileplex.framework.configuration;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.agileplex.framework.configuration.Configuration#getWorkflows <em>Workflows</em>}</li>
 *   <li>{@link com.agileplex.framework.configuration.Configuration#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.agileplex.framework.configuration.ConfigurationPackage#getConfiguration()
 * @model extendedMetaData="name='Configuration' kind='elementOnly'"
 * @generated
 */
public interface Configuration extends EObject {
	/**
	 * Returns the value of the '<em><b>Workflows</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Workflows</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workflows</em>' containment reference.
	 * @see #setWorkflows(WorkflowCollection)
	 * @see com.agileplex.framework.configuration.ConfigurationPackage#getConfiguration_Workflows()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='workflows' namespace='##targetNamespace'"
	 * @generated
	 */
	WorkflowCollection getWorkflows();

	/**
	 * Sets the value of the '{@link com.agileplex.framework.configuration.Configuration#getWorkflows <em>Workflows</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Workflows</em>' containment reference.
	 * @see #getWorkflows()
	 * @generated
	 */
	void setWorkflows(WorkflowCollection value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #isSetVersion()
	 * @see #unsetVersion()
	 * @see #setVersion(String)
	 * @see com.agileplex.framework.configuration.ConfigurationPackage#getConfiguration_Version()
	 * @model default="1.0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='version'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link com.agileplex.framework.configuration.Configuration#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #isSetVersion()
	 * @see #unsetVersion()
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Unsets the value of the '{@link com.agileplex.framework.configuration.Configuration#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVersion()
	 * @see #getVersion()
	 * @see #setVersion(String)
	 * @generated
	 */
	void unsetVersion();

	/**
	 * Returns whether the value of the '{@link com.agileplex.framework.configuration.Configuration#getVersion <em>Version</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Version</em>' attribute is set.
	 * @see #unsetVersion()
	 * @see #getVersion()
	 * @see #setVersion(String)
	 * @generated
	 */
	boolean isSetVersion();

} // Configuration
