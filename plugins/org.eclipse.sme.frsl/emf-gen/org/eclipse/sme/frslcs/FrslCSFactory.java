/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.sme.frslcs;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.sme.frslcs.FrslCSPackage
 * @generated
 */
public interface FrslCSFactory extends EFactory
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FrslCSFactory eINSTANCE = org.eclipse.sme.frslcs.impl.FrslCSFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Frsl Model CS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Frsl Model CS</em>'.
	 * @generated
	 */
	FrslModelCS createFrslModelCS();

	/**
	 * Returns a new object of class '<em>Usecase CS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Usecase CS</em>'.
	 * @generated
	 */
	UsecaseCS createUsecaseCS();

	/**
	 * Returns a new object of class '<em>Usecase Precondition CS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Usecase Precondition CS</em>'.
	 * @generated
	 */
	UsecasePreconditionCS createUsecasePreconditionCS();

	/**
	 * Returns a new object of class '<em>Usecase Postcondition CS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Usecase Postcondition CS</em>'.
	 * @generated
	 */
	UsecasePostconditionCS createUsecasePostconditionCS();

	/**
	 * Returns a new object of class '<em>Step CS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Step CS</em>'.
	 * @generated
	 */
	StepCS createStepCS();

	/**
	 * Returns a new object of class '<em>Extend CS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Extend CS</em>'.
	 * @generated
	 */
	ExtendCS createExtendCS();

	/**
	 * Returns a new object of class '<em>Extension Point CS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Extension Point CS</em>'.
	 * @generated
	 */
	ExtensionPointCS createExtensionPointCS();

	/**
	 * Returns a new object of class '<em>Alt Flow CS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Alt Flow CS</em>'.
	 * @generated
	 */
	AltFlowCS createAltFlowCS();

	/**
	 * Returns a new object of class '<em>Snapshot Pattern CS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Snapshot Pattern CS</em>'.
	 * @generated
	 */
	SnapshotPatternCS createSnapshotPatternCS();

	/**
	 * Returns a new object of class '<em>Obj Var CS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Obj Var CS</em>'.
	 * @generated
	 */
	ObjVarCS createObjVarCS();

	/**
	 * Returns a new object of class '<em>Var Link CS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Var Link CS</em>'.
	 * @generated
	 */
	VarLinkCS createVarLinkCS();

	/**
	 * Returns a new object of class '<em>Association CS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Association CS</em>'.
	 * @generated
	 */
	AssociationCS createAssociationCS();

	/**
	 * Returns a new object of class '<em>Constraint CS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constraint CS</em>'.
	 * @generated
	 */
	ConstraintCS createConstraintCS();

	/**
	 * Returns a new object of class '<em>Actor CS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actor CS</em>'.
	 * @generated
	 */
	ActorCS createActorCS();

	/**
	 * Returns a new object of class '<em>Action CS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action CS</em>'.
	 * @generated
	 */
	ActionCS createActionCS();

	/**
	 * Returns a new object of class '<em>Actor Action CS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actor Action CS</em>'.
	 * @generated
	 */
	ActorActionCS createActorActionCS();

	/**
	 * Returns a new object of class '<em>System Action CS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Action CS</em>'.
	 * @generated
	 */
	SystemActionCS createSystemActionCS();

	/**
	 * Returns a new object of class '<em>Rejoin Step CS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rejoin Step CS</em>'.
	 * @generated
	 */
	RejoinStepCS createRejoinStepCS();

	/**
	 * Returns a new object of class '<em>UC Step CS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UC Step CS</em>'.
	 * @generated
	 */
	UCStepCS createUCStepCS();

	/**
	 * Returns a new object of class '<em>Assoc End CS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assoc End CS</em>'.
	 * @generated
	 */
	AssocEndCS createAssocEndCS();

	/**
	 * Returns a new object of class '<em>Act Step CS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Act Step CS</em>'.
	 * @generated
	 */
	ActStepCS createActStepCS();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FrslCSPackage getFrslCSPackage();

} //FrslCSFactory
