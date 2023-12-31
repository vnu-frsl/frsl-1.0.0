/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.sme.frslcs;

import org.eclipse.ocl.xtext.basecs.ModelElementCS;

import org.eclipse.ocl.xtext.essentialoclcs.ExpSpecificationCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sme.frslcs.ConstraintCS#getConstrExpr <em>Constr Expr</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sme.frslcs.FrslCSPackage#getConstraintCS()
 * @model
 * @generated
 */
public interface ConstraintCS extends ModelElementCS
{
	/**
	 * Returns the value of the '<em><b>Constr Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constr Expr</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constr Expr</em>' containment reference.
	 * @see #setConstrExpr(ExpSpecificationCS)
	 * @see org.eclipse.sme.frslcs.FrslCSPackage#getConstraintCS_ConstrExpr()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ExpSpecificationCS getConstrExpr();

	/**
	 * Sets the value of the '{@link org.eclipse.sme.frslcs.ConstraintCS#getConstrExpr <em>Constr Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constr Expr</em>' containment reference.
	 * @see #getConstrExpr()
	 * @generated
	 */
	void setConstrExpr(ExpSpecificationCS value);

} // ConstraintCS
