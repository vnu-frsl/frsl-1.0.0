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

import org.eclipse.ocl.xtext.basecs.impl.RootCSImpl;

import org.eclipse.ocl.xtext.basecs.util.BaseCSVisitor;

import org.eclipse.ocl.xtext.oclinecorecs.TopLevelCS;
import org.eclipse.sme.frslcs.ActorCS;
import org.eclipse.sme.frslcs.AssociationCS;
import org.eclipse.sme.frslcs.ExtendCS;
import org.eclipse.sme.frslcs.FrslCSPackage;
import org.eclipse.sme.frslcs.FrslModelCS;
import org.eclipse.sme.frslcs.UsecaseCS;
import org.eclipse.sme.frslcs.util.FRSLCSVisitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Frsl Model CS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sme.frslcs.impl.FrslModelCSImpl#getUsecases <em>Usecases</em>}</li>
 *   <li>{@link org.eclipse.sme.frslcs.impl.FrslModelCSImpl#getUcExtends <em>Uc Extends</em>}</li>
 *   <li>{@link org.eclipse.sme.frslcs.impl.FrslModelCSImpl#getDomainModel <em>Domain Model</em>}</li>
 *   <li>{@link org.eclipse.sme.frslcs.impl.FrslModelCSImpl#getAssocs <em>Assocs</em>}</li>
 *   <li>{@link org.eclipse.sme.frslcs.impl.FrslModelCSImpl#getActors <em>Actors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FrslModelCSImpl extends RootCSImpl implements FrslModelCS
{
	/**
	 * The number of structural features of the '<em>Frsl Model CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FRSL_MODEL_CS_FEATURE_COUNT = RootCSImpl.ROOT_CS_FEATURE_COUNT + 5;


	/**
	 * The cached value of the '{@link #getUsecases() <em>Usecases</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsecases()
	 * @generated
	 * @ordered
	 */
	protected EList<UsecaseCS> usecases;

	/**
	 * The cached value of the '{@link #getUcExtends() <em>Uc Extends</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUcExtends()
	 * @generated
	 * @ordered
	 */
	protected EList<ExtendCS> ucExtends;

	/**
	 * The cached value of the '{@link #getDomainModel() <em>Domain Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainModel()
	 * @generated
	 * @ordered
	 */
	protected TopLevelCS domainModel;

	/**
	 * The cached value of the '{@link #getAssocs() <em>Assocs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssocs()
	 * @generated
	 * @ordered
	 */
	protected EList<AssociationCS> assocs;

	/**
	 * The cached value of the '{@link #getActors() <em>Actors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActors()
	 * @generated
	 * @ordered
	 */
	protected EList<ActorCS> actors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FrslModelCSImpl()
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
		return FrslCSPackage.Literals.FRSL_MODEL_CS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UsecaseCS> getUsecases()
	{
		if (usecases == null)
		{
			usecases = new EObjectContainmentEList<UsecaseCS>(UsecaseCS.class, this, RootCSImpl.ROOT_CS_FEATURE_COUNT + 0);
		}
		return usecases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExtendCS> getUcExtends()
	{
		if (ucExtends == null)
		{
			ucExtends = new EObjectContainmentEList<ExtendCS>(ExtendCS.class, this, RootCSImpl.ROOT_CS_FEATURE_COUNT + 1);
		}
		return ucExtends;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TopLevelCS getDomainModel()
	{
		return domainModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDomainModel(TopLevelCS newDomainModel, NotificationChain msgs)
	{
		TopLevelCS oldDomainModel = domainModel;
		domainModel = newDomainModel;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RootCSImpl.ROOT_CS_FEATURE_COUNT + 2, oldDomainModel, newDomainModel);
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
	public void setDomainModel(TopLevelCS newDomainModel)
	{
		if (newDomainModel != domainModel)
		{
			NotificationChain msgs = null;
			if (domainModel != null)
				msgs = ((InternalEObject)domainModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - (RootCSImpl.ROOT_CS_FEATURE_COUNT + 2), null, msgs);
			if (newDomainModel != null)
				msgs = ((InternalEObject)newDomainModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - (RootCSImpl.ROOT_CS_FEATURE_COUNT + 2), null, msgs);
			msgs = basicSetDomainModel(newDomainModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RootCSImpl.ROOT_CS_FEATURE_COUNT + 2, newDomainModel, newDomainModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AssociationCS> getAssocs()
	{
		if (assocs == null)
		{
			assocs = new EObjectContainmentEList<AssociationCS>(AssociationCS.class, this, RootCSImpl.ROOT_CS_FEATURE_COUNT + 3);
		}
		return assocs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ActorCS> getActors()
	{
		if (actors == null)
		{
			actors = new EObjectContainmentEList<ActorCS>(ActorCS.class, this, RootCSImpl.ROOT_CS_FEATURE_COUNT + 4);
		}
		return actors;
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
			case RootCSImpl.ROOT_CS_FEATURE_COUNT + 0:
				return ((InternalEList<?>)getUsecases()).basicRemove(otherEnd, msgs);
			case RootCSImpl.ROOT_CS_FEATURE_COUNT + 1:
				return ((InternalEList<?>)getUcExtends()).basicRemove(otherEnd, msgs);
			case RootCSImpl.ROOT_CS_FEATURE_COUNT + 2:
				return basicSetDomainModel(null, msgs);
			case RootCSImpl.ROOT_CS_FEATURE_COUNT + 3:
				return ((InternalEList<?>)getAssocs()).basicRemove(otherEnd, msgs);
			case RootCSImpl.ROOT_CS_FEATURE_COUNT + 4:
				return ((InternalEList<?>)getActors()).basicRemove(otherEnd, msgs);
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
			case RootCSImpl.ROOT_CS_FEATURE_COUNT + 0:
				return getUsecases();
			case RootCSImpl.ROOT_CS_FEATURE_COUNT + 1:
				return getUcExtends();
			case RootCSImpl.ROOT_CS_FEATURE_COUNT + 2:
				return getDomainModel();
			case RootCSImpl.ROOT_CS_FEATURE_COUNT + 3:
				return getAssocs();
			case RootCSImpl.ROOT_CS_FEATURE_COUNT + 4:
				return getActors();
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
			case RootCSImpl.ROOT_CS_FEATURE_COUNT + 0:
				getUsecases().clear();
				getUsecases().addAll((Collection<? extends UsecaseCS>)newValue);
				return;
			case RootCSImpl.ROOT_CS_FEATURE_COUNT + 1:
				getUcExtends().clear();
				getUcExtends().addAll((Collection<? extends ExtendCS>)newValue);
				return;
			case RootCSImpl.ROOT_CS_FEATURE_COUNT + 2:
				setDomainModel((TopLevelCS)newValue);
				return;
			case RootCSImpl.ROOT_CS_FEATURE_COUNT + 3:
				getAssocs().clear();
				getAssocs().addAll((Collection<? extends AssociationCS>)newValue);
				return;
			case RootCSImpl.ROOT_CS_FEATURE_COUNT + 4:
				getActors().clear();
				getActors().addAll((Collection<? extends ActorCS>)newValue);
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
			case RootCSImpl.ROOT_CS_FEATURE_COUNT + 0:
				getUsecases().clear();
				return;
			case RootCSImpl.ROOT_CS_FEATURE_COUNT + 1:
				getUcExtends().clear();
				return;
			case RootCSImpl.ROOT_CS_FEATURE_COUNT + 2:
				setDomainModel((TopLevelCS)null);
				return;
			case RootCSImpl.ROOT_CS_FEATURE_COUNT + 3:
				getAssocs().clear();
				return;
			case RootCSImpl.ROOT_CS_FEATURE_COUNT + 4:
				getActors().clear();
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
			case RootCSImpl.ROOT_CS_FEATURE_COUNT + 0:
				return usecases != null && !usecases.isEmpty();
			case RootCSImpl.ROOT_CS_FEATURE_COUNT + 1:
				return ucExtends != null && !ucExtends.isEmpty();
			case RootCSImpl.ROOT_CS_FEATURE_COUNT + 2:
				return domainModel != null;
			case RootCSImpl.ROOT_CS_FEATURE_COUNT + 3:
				return assocs != null && !assocs.isEmpty();
			case RootCSImpl.ROOT_CS_FEATURE_COUNT + 4:
				return actors != null && !actors.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public <R> R accept(@NonNull BaseCSVisitor<R> visitor) {
		if (visitor instanceof FRSLCSVisitor) {
			return (R) ((FRSLCSVisitor<?>)visitor).visitFrslModelCS(this);
		}
		else {
			return super.accept(visitor);
		}
	}

} //FrslModelCSImpl
