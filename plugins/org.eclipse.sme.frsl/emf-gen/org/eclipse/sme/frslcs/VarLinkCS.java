/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.sme.frslcs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.ocl.xtext.basecs.ModelElementCS;
import org.eclipse.ocl.xtext.basecs.ModelElementRefCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Var Link CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sme.frslcs.VarLinkCS#getObjVars <em>Obj Vars</em>}</li>
 *   <li>{@link org.eclipse.sme.frslcs.VarLinkCS#getAssoc <em>Assoc</em>}</li>
 *   <li>{@link org.eclipse.sme.frslcs.VarLinkCS#isIsNeg <em>Is Neg</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sme.frslcs.FrslCSPackage#getVarLinkCS()
 * @model
 * @generated
 */
public interface VarLinkCS extends ModelElementCS
{
	/**
	 * Returns the value of the '<em><b>Obj Vars</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.ocl.xtext.basecs.ModelElementRefCS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Obj Vars</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Obj Vars</em>' containment reference list.
	 * @see org.eclipse.sme.frslcs.FrslCSPackage#getVarLinkCS_ObjVars()
	 * @model containment="true" lower="2" upper="2"
	 * @generated
	 */
	EList<ModelElementRefCS> getObjVars();

	/**
	 * Returns the value of the '<em><b>Assoc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assoc</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assoc</em>' containment reference.
	 * @see #setAssoc(ModelElementRefCS)
	 * @see org.eclipse.sme.frslcs.FrslCSPackage#getVarLinkCS_Assoc()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ModelElementRefCS getAssoc();

	/**
	 * Sets the value of the '{@link org.eclipse.sme.frslcs.VarLinkCS#getAssoc <em>Assoc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assoc</em>' containment reference.
	 * @see #getAssoc()
	 * @generated
	 */
	void setAssoc(ModelElementRefCS value);

	/**
	 * Returns the value of the '<em><b>Is Neg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Neg</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Neg</em>' attribute.
	 * @see #setIsNeg(boolean)
	 * @see org.eclipse.sme.frslcs.FrslCSPackage#getVarLinkCS_IsNeg()
	 * @model dataType="org.eclipse.ocl.pivot.Boolean"
	 * @generated
	 */
	boolean isIsNeg();

	/**
	 * Sets the value of the '{@link org.eclipse.sme.frslcs.VarLinkCS#isIsNeg <em>Is Neg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Neg</em>' attribute.
	 * @see #isIsNeg()
	 * @generated
	 */
	void setIsNeg(boolean value);

} // VarLinkCS
