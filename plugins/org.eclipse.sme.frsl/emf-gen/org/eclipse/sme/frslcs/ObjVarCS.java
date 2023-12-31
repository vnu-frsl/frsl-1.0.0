/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.sme.frslcs;

import org.eclipse.ocl.xtext.basecs.ModelElementCS;
import org.eclipse.ocl.xtext.basecs.TypedRefCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Obj Var CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sme.frslcs.ObjVarCS#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.sme.frslcs.ObjVarCS#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.sme.frslcs.ObjVarCS#isIsMatched <em>Is Matched</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sme.frslcs.FrslCSPackage#getObjVarCS()
 * @model
 * @generated
 */
public interface ObjVarCS extends ModelElementCS
{
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.sme.frslcs.FrslCSPackage#getObjVarCS_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.sme.frslcs.ObjVarCS#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(TypedRefCS)
	 * @see org.eclipse.sme.frslcs.FrslCSPackage#getObjVarCS_Type()
	 * @model containment="true"
	 * @generated
	 */
	TypedRefCS getType();

	/**
	 * Sets the value of the '{@link org.eclipse.sme.frslcs.ObjVarCS#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(TypedRefCS value);

	/**
	 * Returns the value of the '<em><b>Is Matched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Matched</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Matched</em>' attribute.
	 * @see #setIsMatched(boolean)
	 * @see org.eclipse.sme.frslcs.FrslCSPackage#getObjVarCS_IsMatched()
	 * @model
	 * @generated
	 */
	boolean isIsMatched();

	/**
	 * Sets the value of the '{@link org.eclipse.sme.frslcs.ObjVarCS#isIsMatched <em>Is Matched</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Matched</em>' attribute.
	 * @see #isIsMatched()
	 * @generated
	 */
	void setIsMatched(boolean value);

} // ObjVarCS
