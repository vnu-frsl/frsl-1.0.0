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

import org.eclipse.ocl.xtext.essentialoclcs.ExpSpecificationCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sme.frslcs.ActionCS#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.sme.frslcs.ActionCS#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.sme.frslcs.ActionCS#getActor <em>Actor</em>}</li>
 *   <li>{@link org.eclipse.sme.frslcs.ActionCS#getObjVars <em>Obj Vars</em>}</li>
 *   <li>{@link org.eclipse.sme.frslcs.ActionCS#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sme.frslcs.FrslCSPackage#getActionCS()
 * @model
 * @generated
 */
public interface ActionCS extends ModelElementCS
{
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.eclipse.sme.frslcs.FrslCSPackage#getActionCS_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.eclipse.sme.frslcs.ActionCS#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.eclipse.sme.frslcs.FrslCSPackage#getActionCS_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.sme.frslcs.ActionCS#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Actor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actor</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actor</em>' containment reference.
	 * @see #setActor(ModelElementRefCS)
	 * @see org.eclipse.sme.frslcs.FrslCSPackage#getActionCS_Actor()
	 * @model containment="true"
	 * @generated
	 */
	ModelElementRefCS getActor();

	/**
	 * Sets the value of the '{@link org.eclipse.sme.frslcs.ActionCS#getActor <em>Actor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actor</em>' containment reference.
	 * @see #getActor()
	 * @generated
	 */
	void setActor(ModelElementRefCS value);

	/**
	 * Returns the value of the '<em><b>Obj Vars</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sme.frslcs.ObjVarCS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Obj Vars</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Obj Vars</em>' containment reference list.
	 * @see org.eclipse.sme.frslcs.FrslCSPackage#getActionCS_ObjVars()
	 * @model containment="true"
	 * @generated
	 */
	EList<ObjVarCS> getObjVars();

	/**
	 * Returns the value of the '<em><b>Values</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.ocl.xtext.essentialoclcs.ExpSpecificationCS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' containment reference list.
	 * @see org.eclipse.sme.frslcs.FrslCSPackage#getActionCS_Values()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExpSpecificationCS> getValues();

} // ActionCS
