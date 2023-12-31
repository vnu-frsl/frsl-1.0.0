/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.sme.frslcs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Act Step CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sme.frslcs.ActStepCS#getPreSnapshot <em>Pre Snapshot</em>}</li>
 *   <li>{@link org.eclipse.sme.frslcs.ActStepCS#getPostSnapshot <em>Post Snapshot</em>}</li>
 *   <li>{@link org.eclipse.sme.frslcs.ActStepCS#getActions <em>Actions</em>}</li>
 *   <li>{@link org.eclipse.sme.frslcs.ActStepCS#isIsActorStep <em>Is Actor Step</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sme.frslcs.FrslCSPackage#getActStepCS()
 * @model
 * @generated
 */
public interface ActStepCS extends StepCS
{
	/**
	 * Returns the value of the '<em><b>Pre Snapshot</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre Snapshot</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre Snapshot</em>' containment reference.
	 * @see #setPreSnapshot(SnapshotPatternCS)
	 * @see org.eclipse.sme.frslcs.FrslCSPackage#getActStepCS_PreSnapshot()
	 * @model containment="true"
	 * @generated
	 */
	SnapshotPatternCS getPreSnapshot();

	/**
	 * Sets the value of the '{@link org.eclipse.sme.frslcs.ActStepCS#getPreSnapshot <em>Pre Snapshot</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre Snapshot</em>' containment reference.
	 * @see #getPreSnapshot()
	 * @generated
	 */
	void setPreSnapshot(SnapshotPatternCS value);

	/**
	 * Returns the value of the '<em><b>Post Snapshot</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Post Snapshot</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post Snapshot</em>' containment reference.
	 * @see #setPostSnapshot(SnapshotPatternCS)
	 * @see org.eclipse.sme.frslcs.FrslCSPackage#getActStepCS_PostSnapshot()
	 * @model containment="true"
	 * @generated
	 */
	SnapshotPatternCS getPostSnapshot();

	/**
	 * Sets the value of the '{@link org.eclipse.sme.frslcs.ActStepCS#getPostSnapshot <em>Post Snapshot</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post Snapshot</em>' containment reference.
	 * @see #getPostSnapshot()
	 * @generated
	 */
	void setPostSnapshot(SnapshotPatternCS value);

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sme.frslcs.ActionCS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see org.eclipse.sme.frslcs.FrslCSPackage#getActStepCS_Actions()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActionCS> getActions();

	/**
	 * Returns the value of the '<em><b>Is Actor Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Actor Step</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Actor Step</em>' attribute.
	 * @see #setIsActorStep(boolean)
	 * @see org.eclipse.sme.frslcs.FrslCSPackage#getActStepCS_IsActorStep()
	 * @model dataType="org.eclipse.ocl.pivot.Boolean"
	 * @generated
	 */
	boolean isIsActorStep();

	/**
	 * Sets the value of the '{@link org.eclipse.sme.frslcs.ActStepCS#isIsActorStep <em>Is Actor Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Actor Step</em>' attribute.
	 * @see #isIsActorStep()
	 * @generated
	 */
	void setIsActorStep(boolean value);

} // ActStepCS
