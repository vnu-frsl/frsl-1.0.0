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

import org.eclipse.ocl.xtext.basecs.ReferenceCS;

import org.eclipse.ocl.xtext.basecs.impl.ModelElementCSImpl;

import org.eclipse.ocl.xtext.basecs.util.BaseCSVisitor;
import org.eclipse.sme.frslcs.AssociationCS;
import org.eclipse.sme.frslcs.FrslCSPackage;
import org.eclipse.sme.frslcs.util.FRSLCSVisitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association CS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sme.frslcs.impl.AssociationCSImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.sme.frslcs.impl.AssociationCSImpl#getAssocEnds <em>Assoc Ends</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssociationCSImpl extends ModelElementCSImpl implements AssociationCS
{
	/**
	 * The number of structural features of the '<em>Association CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSOCIATION_CS_FEATURE_COUNT = ModelElementCSImpl.MODEL_ELEMENT_CS_FEATURE_COUNT + 2;


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
	 * The cached value of the '{@link #getAssocEnds() <em>Assoc Ends</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssocEnds()
	 * @generated
	 * @ordered
	 */
	protected EList<ReferenceCS> assocEnds;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationCSImpl()
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
		return FrslCSPackage.Literals.ASSOCIATION_CS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName()
	{
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName)
	{
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelElementCSImpl.MODEL_ELEMENT_CS_FEATURE_COUNT + 0, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ReferenceCS> getAssocEnds()
	{
		if (assocEnds == null)
		{
			assocEnds = new EObjectContainmentEList<ReferenceCS>(ReferenceCS.class, this, ModelElementCSImpl.MODEL_ELEMENT_CS_FEATURE_COUNT + 1);
		}
		return assocEnds;
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
			case ModelElementCSImpl.MODEL_ELEMENT_CS_FEATURE_COUNT + 1:
				return ((InternalEList<?>)getAssocEnds()).basicRemove(otherEnd, msgs);
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
			case ModelElementCSImpl.MODEL_ELEMENT_CS_FEATURE_COUNT + 0:
				return getName();
			case ModelElementCSImpl.MODEL_ELEMENT_CS_FEATURE_COUNT + 1:
				return getAssocEnds();
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
			case ModelElementCSImpl.MODEL_ELEMENT_CS_FEATURE_COUNT + 0:
				setName((String)newValue);
				return;
			case ModelElementCSImpl.MODEL_ELEMENT_CS_FEATURE_COUNT + 1:
				getAssocEnds().clear();
				getAssocEnds().addAll((Collection<? extends ReferenceCS>)newValue);
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
			case ModelElementCSImpl.MODEL_ELEMENT_CS_FEATURE_COUNT + 0:
				setName(NAME_EDEFAULT);
				return;
			case ModelElementCSImpl.MODEL_ELEMENT_CS_FEATURE_COUNT + 1:
				getAssocEnds().clear();
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
			case ModelElementCSImpl.MODEL_ELEMENT_CS_FEATURE_COUNT + 0:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ModelElementCSImpl.MODEL_ELEMENT_CS_FEATURE_COUNT + 1:
				return assocEnds != null && !assocEnds.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
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
			return (R) ((FRSLCSVisitor<?>)visitor).visitAssociationCS(this);
		}
		else {
			return super.accept(visitor);
		}
	}

} //AssociationCSImpl
