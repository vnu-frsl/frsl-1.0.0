/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.sme.frslcs;

import org.eclipse.ocl.xtext.basecs.ModelElementRefCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rejoin Step CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sme.frslcs.RejoinStepCS#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.eclipse.sme.frslcs.RejoinStepCS#getRejoinTo <em>Rejoin To</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sme.frslcs.FrslCSPackage#getRejoinStepCS()
 * @model
 * @generated
 */
public interface RejoinStepCS extends StepCS
{
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
	 * @see org.eclipse.sme.frslcs.FrslCSPackage#getRejoinStepCS_Condition()
	 * @model containment="true"
	 * @generated
	 */
	SnapshotPatternCS getCondition();

	/**
	 * Sets the value of the '{@link org.eclipse.sme.frslcs.RejoinStepCS#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(SnapshotPatternCS value);

	/**
	 * Returns the value of the '<em><b>Rejoin To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rejoin To</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rejoin To</em>' containment reference.
	 * @see #setRejoinTo(ModelElementRefCS)
	 * @see org.eclipse.sme.frslcs.FrslCSPackage#getRejoinStepCS_RejoinTo()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ModelElementRefCS getRejoinTo();

	/**
	 * Sets the value of the '{@link org.eclipse.sme.frslcs.RejoinStepCS#getRejoinTo <em>Rejoin To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rejoin To</em>' containment reference.
	 * @see #getRejoinTo()
	 * @generated
	 */
	void setRejoinTo(ModelElementRefCS value);

} // RejoinStepCS
