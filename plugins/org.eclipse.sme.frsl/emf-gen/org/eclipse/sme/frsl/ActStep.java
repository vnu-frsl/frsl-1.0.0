/**
 * generated by Xtext 2.25.0
 */
package org.eclipse.sme.frsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Act Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sme.frsl.ActStep#getPreSnapshot <em>Pre Snapshot</em>}</li>
 *   <li>{@link org.eclipse.sme.frsl.ActStep#getPostSnapshot <em>Post Snapshot</em>}</li>
 *   <li>{@link org.eclipse.sme.frsl.ActStep#getAction <em>Action</em>}</li>
 *   <li>{@link org.eclipse.sme.frsl.ActStep#isIsActorStep <em>Is Actor Step</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sme.frsl.FrslPackage#getActStep()
 * @model
 * @generated
 */
public interface ActStep extends Step {
	/**
	 * Returns the value of the '<em><b>Pre Snapshot</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre Snapshot</em>' containment reference.
	 * @see #setPreSnapshot(SnapshotPattern)
	 * @see org.eclipse.sme.frsl.FrslPackage#getActStep_PreSnapshot()
	 * @model containment="true"
	 * @generated
	 */
	SnapshotPattern getPreSnapshot();

	/**
	 * Sets the value of the '{@link org.eclipse.sme.frsl.ActStep#getPreSnapshot <em>Pre Snapshot</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre Snapshot</em>' containment reference.
	 * @see #getPreSnapshot()
	 * @generated
	 */
	void setPreSnapshot(SnapshotPattern value);

	/**
	 * Returns the value of the '<em><b>Post Snapshot</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post Snapshot</em>' containment reference.
	 * @see #setPostSnapshot(SnapshotPattern)
	 * @see org.eclipse.sme.frsl.FrslPackage#getActStep_PostSnapshot()
	 * @model containment="true"
	 * @generated
	 */
	SnapshotPattern getPostSnapshot();

	/**
	 * Sets the value of the '{@link org.eclipse.sme.frsl.ActStep#getPostSnapshot <em>Post Snapshot</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post Snapshot</em>' containment reference.
	 * @see #getPostSnapshot()
	 * @generated
	 */
	void setPostSnapshot(SnapshotPattern value);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sme.frsl.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' containment reference list.
	 * @see org.eclipse.sme.frsl.FrslPackage#getActStep_Action()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getAction();

	/**
	 * Returns the value of the '<em><b>Is Actor Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Actor Step</em>' attribute.
	 * @see #setIsActorStep(boolean)
	 * @see org.eclipse.sme.frsl.FrslPackage#getActStep_IsActorStep()
	 * @model dataType="org.eclipse.ocl.pivot.Boolean"
	 * @generated
	 */
	boolean isIsActorStep();

	/**
	 * Sets the value of the '{@link org.eclipse.sme.frsl.ActStep#isIsActorStep <em>Is Actor Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Actor Step</em>' attribute.
	 * @see #isIsActorStep()
	 * @generated
	 */
	void setIsActorStep(boolean value);

} // ActStep