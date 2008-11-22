/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.agileplex.framework.configuration.impl;

import com.agileplex.framework.configuration.ActionCollection;
import com.agileplex.framework.configuration.ArcCollection;
import com.agileplex.framework.configuration.ConfigurationPackage;
import com.agileplex.framework.configuration.StateCollection;
import com.agileplex.framework.configuration.Stateflow;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stateflow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.agileplex.framework.configuration.impl.StateflowImpl#getStates <em>States</em>}</li>
 *   <li>{@link com.agileplex.framework.configuration.impl.StateflowImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link com.agileplex.framework.configuration.impl.StateflowImpl#getArcs <em>Arcs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StateflowImpl extends BaseObjectImpl implements Stateflow {
	/**
	 * The cached value of the '{@link #getStates() <em>States</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStates()
	 * @generated
	 * @ordered
	 */
	protected StateCollection states;

	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected ActionCollection actions;

	/**
	 * The cached value of the '{@link #getArcs() <em>Arcs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArcs()
	 * @generated
	 * @ordered
	 */
	protected ArcCollection arcs;

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
		return ConfigurationPackage.Literals.STATEFLOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateCollection getStates() {
		return states;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStates(StateCollection newStates, NotificationChain msgs) {
		StateCollection oldStates = states;
		states = newStates;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConfigurationPackage.STATEFLOW__STATES, oldStates, newStates);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStates(StateCollection newStates) {
		if (newStates != states) {
			NotificationChain msgs = null;
			if (states != null)
				msgs = ((InternalEObject)states).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConfigurationPackage.STATEFLOW__STATES, null, msgs);
			if (newStates != null)
				msgs = ((InternalEObject)newStates).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConfigurationPackage.STATEFLOW__STATES, null, msgs);
			msgs = basicSetStates(newStates, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.STATEFLOW__STATES, newStates, newStates));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionCollection getActions() {
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActions(ActionCollection newActions, NotificationChain msgs) {
		ActionCollection oldActions = actions;
		actions = newActions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConfigurationPackage.STATEFLOW__ACTIONS, oldActions, newActions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActions(ActionCollection newActions) {
		if (newActions != actions) {
			NotificationChain msgs = null;
			if (actions != null)
				msgs = ((InternalEObject)actions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConfigurationPackage.STATEFLOW__ACTIONS, null, msgs);
			if (newActions != null)
				msgs = ((InternalEObject)newActions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConfigurationPackage.STATEFLOW__ACTIONS, null, msgs);
			msgs = basicSetActions(newActions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.STATEFLOW__ACTIONS, newActions, newActions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArcCollection getArcs() {
		return arcs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArcs(ArcCollection newArcs, NotificationChain msgs) {
		ArcCollection oldArcs = arcs;
		arcs = newArcs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConfigurationPackage.STATEFLOW__ARCS, oldArcs, newArcs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArcs(ArcCollection newArcs) {
		if (newArcs != arcs) {
			NotificationChain msgs = null;
			if (arcs != null)
				msgs = ((InternalEObject)arcs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConfigurationPackage.STATEFLOW__ARCS, null, msgs);
			if (newArcs != null)
				msgs = ((InternalEObject)newArcs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConfigurationPackage.STATEFLOW__ARCS, null, msgs);
			msgs = basicSetArcs(newArcs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.STATEFLOW__ARCS, newArcs, newArcs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConfigurationPackage.STATEFLOW__STATES:
				return basicSetStates(null, msgs);
			case ConfigurationPackage.STATEFLOW__ACTIONS:
				return basicSetActions(null, msgs);
			case ConfigurationPackage.STATEFLOW__ARCS:
				return basicSetArcs(null, msgs);
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
			case ConfigurationPackage.STATEFLOW__STATES:
				return getStates();
			case ConfigurationPackage.STATEFLOW__ACTIONS:
				return getActions();
			case ConfigurationPackage.STATEFLOW__ARCS:
				return getArcs();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ConfigurationPackage.STATEFLOW__STATES:
				setStates((StateCollection)newValue);
				return;
			case ConfigurationPackage.STATEFLOW__ACTIONS:
				setActions((ActionCollection)newValue);
				return;
			case ConfigurationPackage.STATEFLOW__ARCS:
				setArcs((ArcCollection)newValue);
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
			case ConfigurationPackage.STATEFLOW__STATES:
				setStates((StateCollection)null);
				return;
			case ConfigurationPackage.STATEFLOW__ACTIONS:
				setActions((ActionCollection)null);
				return;
			case ConfigurationPackage.STATEFLOW__ARCS:
				setArcs((ArcCollection)null);
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
			case ConfigurationPackage.STATEFLOW__STATES:
				return states != null;
			case ConfigurationPackage.STATEFLOW__ACTIONS:
				return actions != null;
			case ConfigurationPackage.STATEFLOW__ARCS:
				return arcs != null;
		}
		return super.eIsSet(featureID);
	}

} //StateflowImpl
