/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.sme.frslcs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.ocl.xtext.basecs.RootCS;

import org.eclipse.ocl.xtext.oclinecorecs.TopLevelCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Frsl Model CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sme.frslcs.FrslModelCS#getUsecases <em>Usecases</em>}</li>
 *   <li>{@link org.eclipse.sme.frslcs.FrslModelCS#getUcExtends <em>Uc Extends</em>}</li>
 *   <li>{@link org.eclipse.sme.frslcs.FrslModelCS#getDomainModel <em>Domain Model</em>}</li>
 *   <li>{@link org.eclipse.sme.frslcs.FrslModelCS#getAssocs <em>Assocs</em>}</li>
 *   <li>{@link org.eclipse.sme.frslcs.FrslModelCS#getActors <em>Actors</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sme.frslcs.FrslCSPackage#getFrslModelCS()
 * @model
 * @generated
 */
public interface FrslModelCS extends RootCS
{
	/**
	 * Returns the value of the '<em><b>Usecases</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sme.frslcs.UsecaseCS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usecases</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usecases</em>' containment reference list.
	 * @see org.eclipse.sme.frslcs.FrslCSPackage#getFrslModelCS_Usecases()
	 * @model containment="true"
	 * @generated
	 */
	EList<UsecaseCS> getUsecases();

	/**
	 * Returns the value of the '<em><b>Uc Extends</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sme.frslcs.ExtendCS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uc Extends</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uc Extends</em>' containment reference list.
	 * @see org.eclipse.sme.frslcs.FrslCSPackage#getFrslModelCS_UcExtends()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExtendCS> getUcExtends();

	/**
	 * Returns the value of the '<em><b>Domain Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Model</em>' containment reference.
	 * @see #setDomainModel(TopLevelCS)
	 * @see org.eclipse.sme.frslcs.FrslCSPackage#getFrslModelCS_DomainModel()
	 * @model containment="true"
	 * @generated
	 */
	TopLevelCS getDomainModel();

	/**
	 * Sets the value of the '{@link org.eclipse.sme.frslcs.FrslModelCS#getDomainModel <em>Domain Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Model</em>' containment reference.
	 * @see #getDomainModel()
	 * @generated
	 */
	void setDomainModel(TopLevelCS value);

	/**
	 * Returns the value of the '<em><b>Assocs</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sme.frslcs.AssociationCS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assocs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assocs</em>' containment reference list.
	 * @see org.eclipse.sme.frslcs.FrslCSPackage#getFrslModelCS_Assocs()
	 * @model containment="true"
	 * @generated
	 */
	EList<AssociationCS> getAssocs();

	/**
	 * Returns the value of the '<em><b>Actors</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sme.frslcs.ActorCS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actors</em>' containment reference list.
	 * @see org.eclipse.sme.frslcs.FrslCSPackage#getFrslModelCS_Actors()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActorCS> getActors();

} // FrslModelCS
