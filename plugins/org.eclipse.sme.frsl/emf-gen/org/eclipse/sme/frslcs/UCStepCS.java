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
 * A representation of the model object '<em><b>UC Step CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sme.frslcs.UCStepCS#getIncludedUC <em>Included UC</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sme.frslcs.FrslCSPackage#getUCStepCS()
 * @model
 * @generated
 */
public interface UCStepCS extends StepCS
{
	/**
	 * Returns the value of the '<em><b>Included UC</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Included UC</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Included UC</em>' containment reference.
	 * @see #setIncludedUC(ModelElementRefCS)
	 * @see org.eclipse.sme.frslcs.FrslCSPackage#getUCStepCS_IncludedUC()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ModelElementRefCS getIncludedUC();

	/**
	 * Sets the value of the '{@link org.eclipse.sme.frslcs.UCStepCS#getIncludedUC <em>Included UC</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Included UC</em>' containment reference.
	 * @see #getIncludedUC()
	 * @generated
	 */
	void setIncludedUC(ModelElementRefCS value);

} // UCStepCS
