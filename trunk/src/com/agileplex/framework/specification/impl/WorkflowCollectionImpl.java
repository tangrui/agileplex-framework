/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.agileplex.framework.specification.impl;

import com.agileplex.framework.specification.SpecificationPackage;
import com.agileplex.framework.specification.Stateflow;
import com.agileplex.framework.specification.WorkflowCollection;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Workflow Collection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.agileplex.framework.specification.impl.WorkflowCollectionImpl#getStateflow <em>Stateflow</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WorkflowCollectionImpl extends EObjectImpl implements WorkflowCollection {
	/**
	 * The cached value of the '{@link #getStateflow() <em>Stateflow</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateflow()
	 * @generated
	 * @ordered
	 */
	protected EList<Stateflow> stateflow;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkflowCollectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpecificationPackage.Literals.WORKFLOW_COLLECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Stateflow> getStateflow() {
		if (stateflow == null) {
			stateflow = new EObjectContainmentEList<Stateflow>(Stateflow.class, this, SpecificationPackage.WORKFLOW_COLLECTION__STATEFLOW);
		}
		return stateflow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpecificationPackage.WORKFLOW_COLLECTION__STATEFLOW:
				return ((InternalEList<?>)getStateflow()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpecificationPackage.WORKFLOW_COLLECTION__STATEFLOW:
				return getStateflow();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SpecificationPackage.WORKFLOW_COLLECTION__STATEFLOW:
				getStateflow().clear();
				getStateflow().addAll((Collection<? extends Stateflow>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SpecificationPackage.WORKFLOW_COLLECTION__STATEFLOW:
				getStateflow().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SpecificationPackage.WORKFLOW_COLLECTION__STATEFLOW:
				return stateflow != null && !stateflow.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WorkflowCollectionImpl
