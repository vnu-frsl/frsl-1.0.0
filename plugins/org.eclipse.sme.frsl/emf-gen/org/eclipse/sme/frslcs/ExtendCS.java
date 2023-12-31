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
 * A representation of the model object '<em><b>Extend CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sme.frslcs.ExtendCS#getExtendedUC <em>Extended UC</em>}</li>
 *   <li>{@link org.eclipse.sme.frslcs.ExtendCS#getExtension <em>Extension</em>}</li>
 *   <li>{@link org.eclipse.sme.frslcs.ExtendCS#getExtPoints <em>Ext Points</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sme.frslcs.FrslCSPackage#getExtendCS()
 * @model
 * @generated
 */
public interface ExtendCS extends ModelElementCS
{
	/**
	 * Returns the value of the '<em><b>Extended UC</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extended UC</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extended UC</em>' containment reference.
	 * @see #setExtendedUC(ModelElementRefCS)
	 * @see org.eclipse.sme.frslcs.FrslCSPackage#getExtendCS_ExtendedUC()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ModelElementRefCS getExtendedUC();

	/**
	 * Sets the value of the '{@link org.eclipse.sme.frslcs.ExtendCS#getExtendedUC <em>Extended UC</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extended UC</em>' containment reference.
	 * @see #getExtendedUC()
	 * @generated
	 */
	void setExtendedUC(ModelElementRefCS value);

	/**
	 * Returns the value of the '<em><b>Extension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension</em>' containment reference.
	 * @see #setExtension(ModelElementRefCS)
	 * @see org.eclipse.sme.frslcs.FrslCSPackage#getExtendCS_Extension()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ModelElementRefCS getExtension();

	/**
	 * Sets the value of the '{@link org.eclipse.sme.frslcs.ExtendCS#getExtension <em>Extension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extension</em>' containment reference.
	 * @see #getExtension()
	 * @generated
	 */
	void setExtension(ModelElementRefCS value);

	/**
	 * Returns the value of the '<em><b>Ext Points</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.ocl.xtext.basecs.ModelElementRefCS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ext Points</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ext Points</em>' containment reference list.
	 * @see org.eclipse.sme.frslcs.FrslCSPackage#getExtendCS_ExtPoints()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ModelElementRefCS> getExtPoints();

} // ExtendCS
