/**
 * generated by Xtext 2.25.0
 */
package org.eclipse.sme.frsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.sme.frsl.Extend;
import org.eclipse.sme.frsl.ExtensionPoint;
import org.eclipse.sme.frsl.FrslPackage;
import org.eclipse.sme.frsl.SnapshotPattern;
import org.eclipse.sme.frsl.Step;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extension Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sme.frsl.impl.ExtensionPointImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.sme.frsl.impl.ExtensionPointImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.sme.frsl.impl.ExtensionPointImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.eclipse.sme.frsl.impl.ExtensionPointImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.eclipse.sme.frsl.impl.ExtensionPointImpl#getExtend <em>Extend</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExtensionPointImpl extends MinimalEObjectImpl.Container implements ExtensionPoint {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected EList<Step> location;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected SnapshotPattern condition;

	/**
	 * The cached value of the '{@link #getExtend() <em>Extend</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtend()
	 * @generated
	 * @ordered
	 */
	protected EList<Extend> extend;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtensionPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FrslPackage.Literals.EXTENSION_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FrslPackage.EXTENSION_POINT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FrslPackage.EXTENSION_POINT__DESCRIPTION,
					oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Step> getLocation() {
		if (location == null) {
			location = new EObjectResolvingEList<Step>(Step.class, this, FrslPackage.EXTENSION_POINT__LOCATION);
		}
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SnapshotPattern getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(SnapshotPattern newCondition, NotificationChain msgs) {
		SnapshotPattern oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					FrslPackage.EXTENSION_POINT__CONDITION, oldCondition, newCondition);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCondition(SnapshotPattern newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject) condition).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - FrslPackage.EXTENSION_POINT__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject) newCondition).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - FrslPackage.EXTENSION_POINT__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FrslPackage.EXTENSION_POINT__CONDITION, newCondition,
					newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Extend> getExtend() {
		if (extend == null) {
			extend = new EObjectWithInverseResolvingEList.ManyInverse<Extend>(Extend.class, this,
					FrslPackage.EXTENSION_POINT__EXTEND, FrslPackage.EXTEND__EXT_POINT);
		}
		return extend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case FrslPackage.EXTENSION_POINT__EXTEND:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getExtend()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case FrslPackage.EXTENSION_POINT__CONDITION:
			return basicSetCondition(null, msgs);
		case FrslPackage.EXTENSION_POINT__EXTEND:
			return ((InternalEList<?>) getExtend()).basicRemove(otherEnd, msgs);
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
		case FrslPackage.EXTENSION_POINT__NAME:
			return getName();
		case FrslPackage.EXTENSION_POINT__DESCRIPTION:
			return getDescription();
		case FrslPackage.EXTENSION_POINT__LOCATION:
			return getLocation();
		case FrslPackage.EXTENSION_POINT__CONDITION:
			return getCondition();
		case FrslPackage.EXTENSION_POINT__EXTEND:
			return getExtend();
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
		case FrslPackage.EXTENSION_POINT__NAME:
			setName((String) newValue);
			return;
		case FrslPackage.EXTENSION_POINT__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case FrslPackage.EXTENSION_POINT__LOCATION:
			getLocation().clear();
			getLocation().addAll((Collection<? extends Step>) newValue);
			return;
		case FrslPackage.EXTENSION_POINT__CONDITION:
			setCondition((SnapshotPattern) newValue);
			return;
		case FrslPackage.EXTENSION_POINT__EXTEND:
			getExtend().clear();
			getExtend().addAll((Collection<? extends Extend>) newValue);
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
		case FrslPackage.EXTENSION_POINT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case FrslPackage.EXTENSION_POINT__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case FrslPackage.EXTENSION_POINT__LOCATION:
			getLocation().clear();
			return;
		case FrslPackage.EXTENSION_POINT__CONDITION:
			setCondition((SnapshotPattern) null);
			return;
		case FrslPackage.EXTENSION_POINT__EXTEND:
			getExtend().clear();
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
		case FrslPackage.EXTENSION_POINT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case FrslPackage.EXTENSION_POINT__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case FrslPackage.EXTENSION_POINT__LOCATION:
			return location != null && !location.isEmpty();
		case FrslPackage.EXTENSION_POINT__CONDITION:
			return condition != null;
		case FrslPackage.EXTENSION_POINT__EXTEND:
			return extend != null && !extend.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //ExtensionPointImpl