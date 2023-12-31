/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.sme.frslcs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.ocl.xtext.basecs.ModelElementCS;
import org.eclipse.ocl.xtext.basecs.ReferenceCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sme.frslcs.AssociationCS#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.sme.frslcs.AssociationCS#getAssocEnds <em>Assoc Ends</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sme.frslcs.FrslCSPackage#getAssociationCS()
 * @model
 * @generated
 */
public interface AssociationCS extends ModelElementCS
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
	 * @see org.eclipse.sme.frslcs.FrslCSPackage#getAssociationCS_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.sme.frslcs.AssociationCS#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Assoc Ends</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.ocl.xtext.basecs.ReferenceCS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assoc Ends</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assoc Ends</em>' containment reference list.
	 * @see org.eclipse.sme.frslcs.FrslCSPackage#getAssociationCS_AssocEnds()
	 * @model containment="true"
	 * @generated
	 */
	EList<ReferenceCS> getAssocEnds();

} // AssociationCS
