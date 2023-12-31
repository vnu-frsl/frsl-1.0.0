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
 * A representation of the model object '<em><b>Usecase CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sme.frslcs.UsecaseCS#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.sme.frslcs.UsecaseCS#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.sme.frslcs.UsecaseCS#getPrimaryActor <em>Primary Actor</em>}</li>
 *   <li>{@link org.eclipse.sme.frslcs.UsecaseCS#getSecondaryActors <em>Secondary Actors</em>}</li>
 *   <li>{@link org.eclipse.sme.frslcs.UsecaseCS#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link org.eclipse.sme.frslcs.UsecaseCS#getPostcondition <em>Postcondition</em>}</li>
 *   <li>{@link org.eclipse.sme.frslcs.UsecaseCS#getFirstStep <em>First Step</em>}</li>
 *   <li>{@link org.eclipse.sme.frslcs.UsecaseCS#getExtPoints <em>Ext Points</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sme.frslcs.FrslCSPackage#getUsecaseCS()
 * @model
 * @generated
 */
public interface UsecaseCS extends ModelElementCS
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
	 * @see org.eclipse.sme.frslcs.FrslCSPackage#getUsecaseCS_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.sme.frslcs.UsecaseCS#getName <em>Name</em>}' attribute.
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
	 * @see org.eclipse.sme.frslcs.FrslCSPackage#getUsecaseCS_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.sme.frslcs.UsecaseCS#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Primary Actor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary Actor</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Actor</em>' containment reference.
	 * @see #setPrimaryActor(ModelElementRefCS)
	 * @see org.eclipse.sme.frslcs.FrslCSPackage#getUsecaseCS_PrimaryActor()
	 * @model containment="true"
	 * @generated
	 */
	ModelElementRefCS getPrimaryActor();

	/**
	 * Sets the value of the '{@link org.eclipse.sme.frslcs.UsecaseCS#getPrimaryActor <em>Primary Actor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Actor</em>' containment reference.
	 * @see #getPrimaryActor()
	 * @generated
	 */
	void setPrimaryActor(ModelElementRefCS value);

	/**
	 * Returns the value of the '<em><b>Secondary Actors</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.ocl.xtext.basecs.ModelElementRefCS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Secondary Actors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secondary Actors</em>' containment reference list.
	 * @see org.eclipse.sme.frslcs.FrslCSPackage#getUsecaseCS_SecondaryActors()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModelElementRefCS> getSecondaryActors();

	/**
	 * Returns the value of the '<em><b>Precondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precondition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precondition</em>' containment reference.
	 * @see #setPrecondition(UsecasePreconditionCS)
	 * @see org.eclipse.sme.frslcs.FrslCSPackage#getUsecaseCS_Precondition()
	 * @model containment="true"
	 * @generated
	 */
	UsecasePreconditionCS getPrecondition();

	/**
	 * Sets the value of the '{@link org.eclipse.sme.frslcs.UsecaseCS#getPrecondition <em>Precondition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precondition</em>' containment reference.
	 * @see #getPrecondition()
	 * @generated
	 */
	void setPrecondition(UsecasePreconditionCS value);

	/**
	 * Returns the value of the '<em><b>Postcondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Postcondition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postcondition</em>' containment reference.
	 * @see #setPostcondition(UsecasePostconditionCS)
	 * @see org.eclipse.sme.frslcs.FrslCSPackage#getUsecaseCS_Postcondition()
	 * @model containment="true"
	 * @generated
	 */
	UsecasePostconditionCS getPostcondition();

	/**
	 * Sets the value of the '{@link org.eclipse.sme.frslcs.UsecaseCS#getPostcondition <em>Postcondition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postcondition</em>' containment reference.
	 * @see #getPostcondition()
	 * @generated
	 */
	void setPostcondition(UsecasePostconditionCS value);

	/**
	 * Returns the value of the '<em><b>First Step</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Step</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Step</em>' containment reference.
	 * @see #setFirstStep(StepCS)
	 * @see org.eclipse.sme.frslcs.FrslCSPackage#getUsecaseCS_FirstStep()
	 * @model containment="true"
	 * @generated
	 */
	StepCS getFirstStep();

	/**
	 * Sets the value of the '{@link org.eclipse.sme.frslcs.UsecaseCS#getFirstStep <em>First Step</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Step</em>' containment reference.
	 * @see #getFirstStep()
	 * @generated
	 */
	void setFirstStep(StepCS value);

	/**
	 * Returns the value of the '<em><b>Ext Points</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sme.frslcs.ExtensionPointCS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ext Points</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ext Points</em>' containment reference list.
	 * @see org.eclipse.sme.frslcs.FrslCSPackage#getUsecaseCS_ExtPoints()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExtensionPointCS> getExtPoints();

} // UsecaseCS
