/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.agileplex.framework.specification.impl;

import com.agileplex.framework.specification.Action;
import com.agileplex.framework.specification.Arc;
import com.agileplex.framework.specification.SpecificationPackage;
import com.agileplex.framework.specification.State;
import com.agileplex.framework.specification.Stateflow;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stateflow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.agileplex.framework.specification.impl.StateflowImpl#getState <em>State</em>}</li>
 *   <li>{@link com.agileplex.framework.specification.impl.StateflowImpl#getAction <em>Action</em>}</li>
 *   <li>{@link com.agileplex.framework.specification.impl.StateflowImpl#getArc <em>Arc</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StateflowImpl extends ObjectBaseImpl implements Stateflow {
	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected EList<State> state;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> action;

	/**
	 * The cached value of the '{@link #getArc() <em>Arc</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArc()
	 * @generated
	 * @ordered
	 */
	protected EList<Arc> arc;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateflowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpecificationPackage.Literals.STATEFLOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getState() {
		if (state == null) {
			state = new EObjectContainmentEList<State>(State.class, this, SpecificationPackage.STATEFLOW__STATE);
		}
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getAction() {
		if (action == null) {
			action = new EObjectContainmentEList<Action>(Action.class, this, SpecificationPackage.STATEFLOW__ACTION);
		}
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arc> getArc() {
		if (arc == null) {
			arc = new EObjectContainmentEList<Arc>(Arc.class, this, SpecificationPackage.STATEFLOW__ARC);
		}
		return arc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpecificationPackage.STATEFLOW__STATE:
				return ((InternalEList<?>)getState()).basicRemove(otherEnd, msgs);
			case SpecificationPackage.STATEFLOW__ACTION:
				return ((InternalEList<?>)getAction()).basicRemove(otherEnd, msgs);
			case SpecificationPackage.STATEFLOW__ARC:
				return ((InternalEList<?>)getArc()).basicRemove(otherEnd, msgs);
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
			case SpecificationPackage.STATEFLOW__STATE:
				return getState();
			case SpecificationPackage.STATEFLOW__ACTION:
				return getAction();
			case SpecificationPackage.STATEFLOW__ARC:
				return getArc();
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
			case SpecificationPackage.STATEFLOW__STATE:
				getState().clear();
				getState().addAll((Collection<? extends State>)newValue);
				return;
			case SpecificationPackage.STATEFLOW__ACTION:
				getAction().clear();
				getAction().addAll((Collection<? extends Action>)newValue);
				return;
			case SpecificationPackage.STATEFLOW__ARC:
				getArc().clear();
				getArc().addAll((Collection<? extends Arc>)newValue);
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
			case SpecificationPackage.STATEFLOW__STATE:
				getState().clear();
				return;
			case SpecificationPackage.STATEFLOW__ACTION:
				getAction().clear();
				return;
			case SpecificationPackage.STATEFLOW__ARC:
				getArc().clear();
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
			case SpecificationPackage.STATEFLOW__STATE:
				return state != null && !state.isEmpty();
			case SpecificationPackage.STATEFLOW__ACTION:
				return action != null && !action.isEmpty();
			case SpecificationPackage.STATEFLOW__ARC:
				return arc != null && !arc.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StateflowImpl
