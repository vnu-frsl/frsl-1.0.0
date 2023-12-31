/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.sme.frslcs;

import org.eclipse.ocl.xtext.basecs.ModelElementCS;
import org.eclipse.ocl.xtext.basecs.ModelElementRefCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alt Flow CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sme.frslcs.AltFlowCS#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.sme.frslcs.AltFlowCS#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.sme.frslcs.AltFlowCS#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.eclipse.sme.frslcs.AltFlowCS#getBaseStep <em>Base Step</em>}</li>
 *   <li>{@link org.eclipse.sme.frslcs.AltFlowCS#getAltStep <em>Alt Step</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sme.frslcs.FrslCSPackage#getAltFlowCS()
 * @model
 * @generated
 */
public interface AltFlowCS extends ModelElementCS
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
	 * @see org.eclipse.sme.frslcs.FrslCSPackage#getAltFlowCS_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.sme.frslcs.AltFlowCS#getName <em>Name</em>}' attribute.
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
	 * @see org.eclipse.sme.frslcs.FrslCSPackage#getAltFlowCS_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.sme.frslcs.AltFlowCS#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(SnapshotPatternCS)
	 * @see org.eclipse.sme.frslcs.FrslCSPackage#getAltFlowCS_Condition()
	 * @model containment="true"
	 * @generated
	 */
	SnapshotPatternCS getCondition();

	/**
	 * Sets the value of the '{@link org.eclipse.sme.frslcs.AltFlowCS#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(SnapshotPatternCS value);

	/**
	 * Returns the value of the '<em><b>Base Step</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Step</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Step</em>' containment reference.
	 * @see #setBaseStep(ModelElementRefCS)
	 * @see org.eclipse.sme.frslcs.FrslCSPackage#getAltFlowCS_BaseStep()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ModelElementRefCS getBaseStep();

	/**
	 * Sets the value of the '{@link org.eclipse.sme.frslcs.AltFlowCS#getBaseStep <em>Base Step</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Step</em>' containment reference.
	 * @see #getBaseStep()
	 * @generated
	 */
	void setBaseStep(ModelElementRefCS value);

	/**
	 * Returns the value of the '<em><b>Alt Step</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alt Step</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alt Step</em>' containment reference.
	 * @see #setAltStep(StepCS)
	 * @see org.eclipse.sme.frslcs.FrslCSPackage#getAltFlowCS_AltStep()
	 * @model containment="true" required="true"
	 * @generated
	 */
	StepCS getAltStep();

	/**
	 * Sets the value of the '{@link org.eclipse.sme.frslcs.AltFlowCS#getAltStep <em>Alt Step</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alt Step</em>' containment reference.
	 * @see #getAltStep()
	 * @generated
	 */
	void setAltStep(StepCS value);

} // AltFlowCS
