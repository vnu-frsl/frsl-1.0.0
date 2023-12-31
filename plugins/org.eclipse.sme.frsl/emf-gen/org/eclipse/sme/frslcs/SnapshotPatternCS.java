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
 * A representation of the model object '<em><b>Snapshot Pattern CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sme.frslcs.SnapshotPatternCS#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.sme.frslcs.SnapshotPatternCS#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.sme.frslcs.SnapshotPatternCS#getObjects <em>Objects</em>}</li>
 *   <li>{@link org.eclipse.sme.frslcs.SnapshotPatternCS#getNegObjects <em>Neg Objects</em>}</li>
 *   <li>{@link org.eclipse.sme.frslcs.SnapshotPatternCS#getLinks <em>Links</em>}</li>
 *   <li>{@link org.eclipse.sme.frslcs.SnapshotPatternCS#getConstraints <em>Constraints</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sme.frslcs.FrslCSPackage#getSnapshotPatternCS()
 * @model
 * @generated
 */
public interface SnapshotPatternCS extends ModelElementCS
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
	 * @see org.eclipse.sme.frslcs.FrslCSPackage#getSnapshotPatternCS_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.sme.frslcs.SnapshotPatternCS#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see org.eclipse.sme.frslcs.FrslCSPackage#getSnapshotPatternCS_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.sme.frslcs.SnapshotPatternCS#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Objects</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sme.frslcs.ObjVarCS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Objects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objects</em>' containment reference list.
	 * @see org.eclipse.sme.frslcs.FrslCSPackage#getSnapshotPatternCS_Objects()
	 * @model containment="true"
	 * @generated
	 */
	EList<ObjVarCS> getObjects();

	/**
	 * Returns the value of the '<em><b>Neg Objects</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.ocl.xtext.basecs.ModelElementRefCS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Neg Objects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neg Objects</em>' containment reference list.
	 * @see org.eclipse.sme.frslcs.FrslCSPackage#getSnapshotPatternCS_NegObjects()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModelElementRefCS> getNegObjects();

	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sme.frslcs.VarLinkCS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference list.
	 * @see org.eclipse.sme.frslcs.FrslCSPackage#getSnapshotPatternCS_Links()
	 * @model containment="true"
	 * @generated
	 */
	EList<VarLinkCS> getLinks();

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sme.frslcs.ConstraintCS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference list.
	 * @see org.eclipse.sme.frslcs.FrslCSPackage#getSnapshotPatternCS_Constraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConstraintCS> getConstraints();

} // SnapshotPatternCS
