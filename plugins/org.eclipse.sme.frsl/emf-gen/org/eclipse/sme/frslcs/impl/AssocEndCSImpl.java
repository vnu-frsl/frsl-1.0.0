/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.sme.frslcs.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.jdt.annotation.NonNull;

import org.eclipse.ocl.xtext.basecs.impl.ReferenceCSImpl;

import org.eclipse.ocl.xtext.basecs.util.BaseCSVisitor;
import org.eclipse.sme.frslcs.AssocEndCS;
import org.eclipse.sme.frslcs.FrslCSPackage;
import org.eclipse.sme.frslcs.util.FRSLCSVisitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assoc End CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class AssocEndCSImpl extends ReferenceCSImpl implements AssocEndCS
{
	/**
	 * The number of structural features of the '<em>Assoc End CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSOC_END_CS_FEATURE_COUNT = ReferenceCSImpl.REFERENCE_CS_FEATURE_COUNT + 0;


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssocEndCSImpl()
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
		return FrslCSPackage.Literals.ASSOC_END_CS;
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public <R> R accept(@NonNull BaseCSVisitor<R> visitor) {
		if (visitor instanceof FRSLCSVisitor) {
			return (R) ((FRSLCSVisitor<?>)visitor).visitAssocEndCS(this);
		}
		else {
			return super.accept(visitor);
		}
	}

} //AssocEndCSImpl
