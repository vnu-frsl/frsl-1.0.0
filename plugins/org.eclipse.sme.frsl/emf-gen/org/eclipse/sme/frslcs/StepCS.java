/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.sme.frslcs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.ocl.xtext.basecs.ModelElementCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Step CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sme.frslcs.StepCS#getNextStep <em>Next Step</em>}</li>
 *   <li>{@link org.eclipse.sme.frslcs.StepCS#getAltFlows <em>Alt Flows</em>}</li>
 *   <li>{@link org.eclipse.sme.frslcs.StepCS#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.sme.frslcs.StepCS#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sme.frslcs.FrslCSPackage#getStepCS()
 * @model
 * @generated
 */
public interface StepCS extends ModelElementCS
{
	/**
	 * Returns the value of the '<em><b>Next Step</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Step</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Step</em>' containment reference.
	 * @see #setNextStep(StepCS)
	 * @see org.eclipse.sme.frslcs.FrslCSPackage#getStepCS_NextStep()
	 * @model containment="true"
	 * @generated
	 */
	StepCS getNextStep();

	/**
	 * Sets the value of the '{@link org.eclipse.sme.frslcs.StepCS#getNextStep <em>Next Step</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Step</em>' containment reference.
	 * @see #getNextStep()
	 * @generated
	 */
	void setNextStep(StepCS value);

	/**
	 * Returns the value of the '<em><b>Alt Flows</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sme.frslcs.AltFlowCS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alt Flows</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alt Flows</em>' containment reference list.
	 * @see org.eclipse.sme.frslcs.FrslCSPackage#getStepCS_AltFlows()
	 * @model containment="true"
	 * @generated
	 */
	EList<AltFlowCS> getAltFlows();

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
	 * @see org.eclipse.sme.frslcs.FrslCSPackage#getStepCS_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.sme.frslcs.StepCS#getName <em>Name</em>}' attribute.
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
	 * @see org.eclipse.sme.frslcs.FrslCSPackage#getStepCS_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.sme.frslcs.StepCS#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // StepCS
