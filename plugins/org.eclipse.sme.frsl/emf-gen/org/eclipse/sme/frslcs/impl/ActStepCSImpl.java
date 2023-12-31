/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.sme.frslcs.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.jdt.annotation.NonNull;

import org.eclipse.ocl.xtext.basecs.impl.ModelElementCSImpl;

import org.eclipse.ocl.xtext.basecs.util.BaseCSVisitor;
import org.eclipse.sme.frslcs.ActStepCS;
import org.eclipse.sme.frslcs.ActionCS;
import org.eclipse.sme.frslcs.FrslCSPackage;
import org.eclipse.sme.frslcs.SnapshotPatternCS;
import org.eclipse.sme.frslcs.util.FRSLCSVisitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Act Step CS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sme.frslcs.impl.ActStepCSImpl#getPreSnapshot <em>Pre Snapshot</em>}</li>
 *   <li>{@link org.eclipse.sme.frslcs.impl.ActStepCSImpl#getPostSnapshot <em>Post Snapshot</em>}</li>
 *   <li>{@link org.eclipse.sme.frslcs.impl.ActStepCSImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link org.eclipse.sme.frslcs.impl.ActStepCSImpl#isIsActorStep <em>Is Actor Step</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActStepCSImpl extends StepCSImpl implements ActStepCS
{
	/**
	 * The number of structural features of the '<em>Act Step CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACT_STEP_CS_FEATURE_COUNT = StepCSImpl.STEP_CS_FEATURE_COUNT + 4;


	/**
	 * The cached value of the '{@link #getPreSnapshot() <em>Pre Snapshot</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreSnapshot()
	 * @generated
	 * @ordered
	 */
	protected SnapshotPatternCS preSnapshot;

	/**
	 * The cached value of the '{@link #getPostSnapshot() <em>Post Snapshot</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostSnapshot()
	 * @generated
	 * @ordered
	 */
	protected SnapshotPatternCS postSnapshot;

	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<ActionCS> actions;

	/**
	 * The default value of the '{@link #isIsActorStep() <em>Is Actor Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsActorStep()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ACTOR_STEP_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsActorStep() <em>Is Actor Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsActorStep()
	 * @generated
	 * @ordered
	 */
	protected boolean isActorStep = IS_ACTOR_STEP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActStepCSImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return FrslCSPackage.Literals.ACT_STEP_CS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SnapshotPatternCS getPreSnapshot()
	{
		return preSnapshot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreSnapshot(SnapshotPatternCS newPreSnapshot, NotificationChain msgs)
	{
		SnapshotPatternCS oldPreSnapshot = preSnapshot;
		preSnapshot = newPreSnapshot;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelElementCSImpl.MODEL_ELEMENT_CS_FEATURE_COUNT + 4, oldPreSnapshot, newPreSnapshot);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPreSnapshot(SnapshotPatternCS newPreSnapshot)
	{
		if (newPreSnapshot != preSnapshot)
		{
			NotificationChain msgs = null;
			if (preSnapshot != null)
				msgs = ((InternalEObject)preSnapshot).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - (ModelElementCSImpl.MODEL_ELEMENT_CS_FEATURE_COUNT + 4), null, msgs);
			if (newPreSnapshot != null)
				msgs = ((InternalEObject)newPreSnapshot).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - (ModelElementCSImpl.MODEL_ELEMENT_CS_FEATURE_COUNT + 4), null, msgs);
			msgs = basicSetPreSnapshot(newPreSnapshot, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelElementCSImpl.MODEL_ELEMENT_CS_FEATURE_COUNT + 4, newPreSnapshot, newPreSnapshot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SnapshotPatternCS getPostSnapshot()
	{
		return postSnapshot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPostSnapshot(SnapshotPatternCS newPostSnapshot, NotificationChain msgs)
	{
		SnapshotPatternCS oldPostSnapshot = postSnapshot;
		postSnapshot = newPostSnapshot;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelElementCSImpl.MODEL_ELEMENT_CS_FEATURE_COUNT + 5, oldPostSnapshot, newPostSnapshot);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPostSnapshot(SnapshotPatternCS newPostSnapshot)
	{
		if (newPostSnapshot != postSnapshot)
		{
			NotificationChain msgs = null;
			if (postSnapshot != null)
				msgs = ((InternalEObject)postSnapshot).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - (ModelElementCSImpl.MODEL_ELEMENT_CS_FEATURE_COUNT + 5), null, msgs);
			if (newPostSnapshot != null)
				msgs = ((InternalEObject)newPostSnapshot).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - (ModelElementCSImpl.MODEL_ELEMENT_CS_FEATURE_COUNT + 5), null, msgs);
			msgs = basicSetPostSnapshot(newPostSnapshot, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelElementCSImpl.MODEL_ELEMENT_CS_FEATURE_COUNT + 5, newPostSnapshot, newPostSnapshot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ActionCS> getActions()
	{
		if (actions == null)
		{
			actions = new EObjectContainmentEList<ActionCS>(ActionCS.class, this, ModelElementCSImpl.MODEL_ELEMENT_CS_FEATURE_COUNT + 6);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsActorStep()
	{
		return isActorStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsActorStep(boolean newIsActorStep)
	{
		boolean oldIsActorStep = isActorStep;
		isActorStep = newIsActorStep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelElementCSImpl.MODEL_ELEMENT_CS_FEATURE_COUNT + 7, oldIsActorStep, isActorStep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case ModelElementCSImpl.MODEL_ELEMENT_CS_FEATURE_COUNT + 4:
				return basicSetPreSnapshot(null, msgs);
			case ModelElementCSImpl.MODEL_ELEMENT_CS_FEATURE_COUNT + 5:
				return basicSetPostSnapshot(null, msgs);
			case ModelElementCSImpl.MODEL_ELEMENT_CS_FEATURE_COUNT + 6:
				return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case ModelElementCSImpl.MODEL_ELEMENT_CS_FEATURE_COUNT + 4:
				return getPreSnapshot();
			case ModelElementCSImpl.MODEL_ELEMENT_CS_FEATURE_COUNT + 5:
				return getPostSnapshot();
			case ModelElementCSImpl.MODEL_ELEMENT_CS_FEATURE_COUNT + 6:
				return getActions();
			case ModelElementCSImpl.MODEL_ELEMENT_CS_FEATURE_COUNT + 7:
				return isIsActorStep();
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
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case ModelElementCSImpl.MODEL_ELEMENT_CS_FEATURE_COUNT + 4:
				setPreSnapshot((SnapshotPatternCS)newValue);
				return;
			case ModelElementCSImpl.MODEL_ELEMENT_CS_FEATURE_COUNT + 5:
				setPostSnapshot((SnapshotPatternCS)newValue);
				return;
			case ModelElementCSImpl.MODEL_ELEMENT_CS_FEATURE_COUNT + 6:
				getActions().clear();
				getActions().addAll((Collection<? extends ActionCS>)newValue);
				return;
			case ModelElementCSImpl.MODEL_ELEMENT_CS_FEATURE_COUNT + 7:
				setIsActorStep((Boolean)newValue);
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
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case ModelElementCSImpl.MODEL_ELEMENT_CS_FEATURE_COUNT + 4:
				setPreSnapshot((SnapshotPatternCS)null);
				return;
			case ModelElementCSImpl.MODEL_ELEMENT_CS_FEATURE_COUNT + 5:
				setPostSnapshot((SnapshotPatternCS)null);
				return;
			case ModelElementCSImpl.MODEL_ELEMENT_CS_FEATURE_COUNT + 6:
				getActions().clear();
				return;
			case ModelElementCSImpl.MODEL_ELEMENT_CS_FEATURE_COUNT + 7:
				setIsActorStep(IS_ACTOR_STEP_EDEFAULT);
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
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case ModelElementCSImpl.MODEL_ELEMENT_CS_FEATURE_COUNT + 4:
				return preSnapshot != null;
			case ModelElementCSImpl.MODEL_ELEMENT_CS_FEATURE_COUNT + 5:
				return postSnapshot != null;
			case ModelElementCSImpl.MODEL_ELEMENT_CS_FEATURE_COUNT + 6:
				return actions != null && !actions.isEmpty();
			case ModelElementCSImpl.MODEL_ELEMENT_CS_FEATURE_COUNT + 7:
				return isActorStep != IS_ACTOR_STEP_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (isActorStep: ");
		result.append(isActorStep);
		result.append(')');
		return result.toString();
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public <R> R accept(@NonNull BaseCSVisitor<R> visitor) {
		if (visitor instanceof FRSLCSVisitor) {
			return (R) ((FRSLCSVisitor<?>)visitor).visitActStepCS(this);
		}
		else {
			return super.accept(visitor);
		}
	}

} //ActStepCSImpl
