/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.sme.frslcs;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.sme.frslcs.FrslCSFactory
 * @model kind="package"
 * @generated
 */
public interface FrslCSPackage extends EPackage
{
	String eCONTENT_TYPE = "org.eclipse.sme.frsl";
	
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "frslcs";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.xtext.org/sme/2020/FRSLCS";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "frslcs";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FrslCSPackage eINSTANCE = org.eclipse.sme.frslcs.impl.FrslCSPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.sme.frslcs.impl.FrslModelCSImpl <em>Frsl Model CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sme.frslcs.impl.FrslModelCSImpl
	 * @see org.eclipse.sme.frslcs.impl.FrslCSPackageImpl#getFrslModelCS()
	 * @generated
	 */
	int FRSL_MODEL_CS = 0;
	/**
	 * The meta object id for the '{@link org.eclipse.sme.frslcs.impl.UsecaseCSImpl <em>Usecase CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sme.frslcs.impl.UsecaseCSImpl
	 * @see org.eclipse.sme.frslcs.impl.FrslCSPackageImpl#getUsecaseCS()
	 * @generated
	 */
	int USECASE_CS = 1;
	/**
	 * The meta object id for the '{@link org.eclipse.sme.frslcs.impl.UsecasePreconditionCSImpl <em>Usecase Precondition CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sme.frslcs.impl.UsecasePreconditionCSImpl
	 * @see org.eclipse.sme.frslcs.impl.FrslCSPackageImpl#getUsecasePreconditionCS()
	 * @generated
	 */
	int USECASE_PRECONDITION_CS = 2;
	/**
	 * The meta object id for the '{@link org.eclipse.sme.frslcs.impl.UsecasePostconditionCSImpl <em>Usecase Postcondition CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sme.frslcs.impl.UsecasePostconditionCSImpl
	 * @see org.eclipse.sme.frslcs.impl.FrslCSPackageImpl#getUsecasePostconditionCS()
	 * @generated
	 */
	int USECASE_POSTCONDITION_CS = 3;
	/**
	 * The meta object id for the '{@link org.eclipse.sme.frslcs.impl.StepCSImpl <em>Step CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sme.frslcs.impl.StepCSImpl
	 * @see org.eclipse.sme.frslcs.impl.FrslCSPackageImpl#getStepCS()
	 * @generated
	 */
	int STEP_CS = 4;
	/**
	 * The meta object id for the '{@link org.eclipse.sme.frslcs.impl.ExtendCSImpl <em>Extend CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sme.frslcs.impl.ExtendCSImpl
	 * @see org.eclipse.sme.frslcs.impl.FrslCSPackageImpl#getExtendCS()
	 * @generated
	 */
	int EXTEND_CS = 5;
	/**
	 * The meta object id for the '{@link org.eclipse.sme.frslcs.impl.ExtensionPointCSImpl <em>Extension Point CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sme.frslcs.impl.ExtensionPointCSImpl
	 * @see org.eclipse.sme.frslcs.impl.FrslCSPackageImpl#getExtensionPointCS()
	 * @generated
	 */
	int EXTENSION_POINT_CS = 6;
	/**
	 * The meta object id for the '{@link org.eclipse.sme.frslcs.impl.AltFlowCSImpl <em>Alt Flow CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sme.frslcs.impl.AltFlowCSImpl
	 * @see org.eclipse.sme.frslcs.impl.FrslCSPackageImpl#getAltFlowCS()
	 * @generated
	 */
	int ALT_FLOW_CS = 7;
	/**
	 * The meta object id for the '{@link org.eclipse.sme.frslcs.impl.SnapshotPatternCSImpl <em>Snapshot Pattern CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sme.frslcs.impl.SnapshotPatternCSImpl
	 * @see org.eclipse.sme.frslcs.impl.FrslCSPackageImpl#getSnapshotPatternCS()
	 * @generated
	 */
	int SNAPSHOT_PATTERN_CS = 8;
	/**
	 * The meta object id for the '{@link org.eclipse.sme.frslcs.impl.ObjVarCSImpl <em>Obj Var CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sme.frslcs.impl.ObjVarCSImpl
	 * @see org.eclipse.sme.frslcs.impl.FrslCSPackageImpl#getObjVarCS()
	 * @generated
	 */
	int OBJ_VAR_CS = 9;
	/**
	 * The meta object id for the '{@link org.eclipse.sme.frslcs.impl.VarLinkCSImpl <em>Var Link CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sme.frslcs.impl.VarLinkCSImpl
	 * @see org.eclipse.sme.frslcs.impl.FrslCSPackageImpl#getVarLinkCS()
	 * @generated
	 */
	int VAR_LINK_CS = 10;
	/**
	 * The meta object id for the '{@link org.eclipse.sme.frslcs.impl.AssociationCSImpl <em>Association CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sme.frslcs.impl.AssociationCSImpl
	 * @see org.eclipse.sme.frslcs.impl.FrslCSPackageImpl#getAssociationCS()
	 * @generated
	 */
	int ASSOCIATION_CS = 11;
	/**
	 * The meta object id for the '{@link org.eclipse.sme.frslcs.impl.ConstraintCSImpl <em>Constraint CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sme.frslcs.impl.ConstraintCSImpl
	 * @see org.eclipse.sme.frslcs.impl.FrslCSPackageImpl#getConstraintCS()
	 * @generated
	 */
	int CONSTRAINT_CS = 12;
	/**
	 * The meta object id for the '{@link org.eclipse.sme.frslcs.impl.ActorCSImpl <em>Actor CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sme.frslcs.impl.ActorCSImpl
	 * @see org.eclipse.sme.frslcs.impl.FrslCSPackageImpl#getActorCS()
	 * @generated
	 */
	int ACTOR_CS = 13;
	/**
	 * The meta object id for the '{@link org.eclipse.sme.frslcs.impl.ActionCSImpl <em>Action CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sme.frslcs.impl.ActionCSImpl
	 * @see org.eclipse.sme.frslcs.impl.FrslCSPackageImpl#getActionCS()
	 * @generated
	 */
	int ACTION_CS = 14;
	/**
	 * The meta object id for the '{@link org.eclipse.sme.frslcs.impl.ActorActionCSImpl <em>Actor Action CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sme.frslcs.impl.ActorActionCSImpl
	 * @see org.eclipse.sme.frslcs.impl.FrslCSPackageImpl#getActorActionCS()
	 * @generated
	 */
	int ACTOR_ACTION_CS = 15;
	/**
	 * The meta object id for the '{@link org.eclipse.sme.frslcs.impl.SystemActionCSImpl <em>System Action CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sme.frslcs.impl.SystemActionCSImpl
	 * @see org.eclipse.sme.frslcs.impl.FrslCSPackageImpl#getSystemActionCS()
	 * @generated
	 */
	int SYSTEM_ACTION_CS = 16;
	/**
	 * The meta object id for the '{@link org.eclipse.sme.frslcs.impl.RejoinStepCSImpl <em>Rejoin Step CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sme.frslcs.impl.RejoinStepCSImpl
	 * @see org.eclipse.sme.frslcs.impl.FrslCSPackageImpl#getRejoinStepCS()
	 * @generated
	 */
	int REJOIN_STEP_CS = 17;
	/**
	 * The meta object id for the '{@link org.eclipse.sme.frslcs.impl.UCStepCSImpl <em>UC Step CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sme.frslcs.impl.UCStepCSImpl
	 * @see org.eclipse.sme.frslcs.impl.FrslCSPackageImpl#getUCStepCS()
	 * @generated
	 */
	int UC_STEP_CS = 18;
	/**
	 * The meta object id for the '{@link org.eclipse.sme.frslcs.impl.AssocEndCSImpl <em>Assoc End CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sme.frslcs.impl.AssocEndCSImpl
	 * @see org.eclipse.sme.frslcs.impl.FrslCSPackageImpl#getAssocEndCS()
	 * @generated
	 */
	int ASSOC_END_CS = 19;
	/**
	 * The meta object id for the '{@link org.eclipse.sme.frslcs.impl.ActStepCSImpl <em>Act Step CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sme.frslcs.impl.ActStepCSImpl
	 * @see org.eclipse.sme.frslcs.impl.FrslCSPackageImpl#getActStepCS()
	 * @generated
	 */
	int ACT_STEP_CS = 20;


	/**
	 * Returns the meta object for class '{@link org.eclipse.sme.frslcs.FrslModelCS <em>Frsl Model CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Frsl Model CS</em>'.
	 * @see org.eclipse.sme.frslcs.FrslModelCS
	 * @generated
	 */
	EClass getFrslModelCS();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sme.frslcs.FrslModelCS#getUsecases <em>Usecases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Usecases</em>'.
	 * @see org.eclipse.sme.frslcs.FrslModelCS#getUsecases()
	 * @see #getFrslModelCS()
	 * @generated
	 */
	EReference getFrslModelCS_Usecases();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sme.frslcs.FrslModelCS#getUcExtends <em>Uc Extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Uc Extends</em>'.
	 * @see org.eclipse.sme.frslcs.FrslModelCS#getUcExtends()
	 * @see #getFrslModelCS()
	 * @generated
	 */
	EReference getFrslModelCS_UcExtends();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.sme.frslcs.FrslModelCS#getDomainModel <em>Domain Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Domain Model</em>'.
	 * @see org.eclipse.sme.frslcs.FrslModelCS#getDomainModel()
	 * @see #getFrslModelCS()
	 * @generated
	 */
	EReference getFrslModelCS_DomainModel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sme.frslcs.FrslModelCS#getAssocs <em>Assocs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assocs</em>'.
	 * @see org.eclipse.sme.frslcs.FrslModelCS#getAssocs()
	 * @see #getFrslModelCS()
	 * @generated
	 */
	EReference getFrslModelCS_Assocs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sme.frslcs.FrslModelCS#getActors <em>Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actors</em>'.
	 * @see org.eclipse.sme.frslcs.FrslModelCS#getActors()
	 * @see #getFrslModelCS()
	 * @generated
	 */
	EReference getFrslModelCS_Actors();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sme.frslcs.UsecaseCS <em>Usecase CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Usecase CS</em>'.
	 * @see org.eclipse.sme.frslcs.UsecaseCS
	 * @generated
	 */
	EClass getUsecaseCS();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sme.frslcs.UsecaseCS#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.sme.frslcs.UsecaseCS#getName()
	 * @see #getUsecaseCS()
	 * @generated
	 */
	EAttribute getUsecaseCS_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sme.frslcs.UsecaseCS#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.sme.frslcs.UsecaseCS#getDescription()
	 * @see #getUsecaseCS()
	 * @generated
	 */
	EAttribute getUsecaseCS_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.sme.frslcs.UsecaseCS#getPrimaryActor <em>Primary Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Primary Actor</em>'.
	 * @see org.eclipse.sme.frslcs.UsecaseCS#getPrimaryActor()
	 * @see #getUsecaseCS()
	 * @generated
	 */
	EReference getUsecaseCS_PrimaryActor();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sme.frslcs.UsecaseCS#getSecondaryActors <em>Secondary Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Secondary Actors</em>'.
	 * @see org.eclipse.sme.frslcs.UsecaseCS#getSecondaryActors()
	 * @see #getUsecaseCS()
	 * @generated
	 */
	EReference getUsecaseCS_SecondaryActors();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.sme.frslcs.UsecaseCS#getPrecondition <em>Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Precondition</em>'.
	 * @see org.eclipse.sme.frslcs.UsecaseCS#getPrecondition()
	 * @see #getUsecaseCS()
	 * @generated
	 */
	EReference getUsecaseCS_Precondition();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.sme.frslcs.UsecaseCS#getPostcondition <em>Postcondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Postcondition</em>'.
	 * @see org.eclipse.sme.frslcs.UsecaseCS#getPostcondition()
	 * @see #getUsecaseCS()
	 * @generated
	 */
	EReference getUsecaseCS_Postcondition();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.sme.frslcs.UsecaseCS#getFirstStep <em>First Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>First Step</em>'.
	 * @see org.eclipse.sme.frslcs.UsecaseCS#getFirstStep()
	 * @see #getUsecaseCS()
	 * @generated
	 */
	EReference getUsecaseCS_FirstStep();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sme.frslcs.UsecaseCS#getExtPoints <em>Ext Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ext Points</em>'.
	 * @see org.eclipse.sme.frslcs.UsecaseCS#getExtPoints()
	 * @see #getUsecaseCS()
	 * @generated
	 */
	EReference getUsecaseCS_ExtPoints();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sme.frslcs.UsecasePreconditionCS <em>Usecase Precondition CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Usecase Precondition CS</em>'.
	 * @see org.eclipse.sme.frslcs.UsecasePreconditionCS
	 * @generated
	 */
	EClass getUsecasePreconditionCS();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sme.frslcs.UsecasePreconditionCS#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.sme.frslcs.UsecasePreconditionCS#getDescription()
	 * @see #getUsecasePreconditionCS()
	 * @generated
	 */
	EAttribute getUsecasePreconditionCS_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.sme.frslcs.UsecasePreconditionCS#getSnapshot <em>Snapshot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Snapshot</em>'.
	 * @see org.eclipse.sme.frslcs.UsecasePreconditionCS#getSnapshot()
	 * @see #getUsecasePreconditionCS()
	 * @generated
	 */
	EReference getUsecasePreconditionCS_Snapshot();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sme.frslcs.UsecasePostconditionCS <em>Usecase Postcondition CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Usecase Postcondition CS</em>'.
	 * @see org.eclipse.sme.frslcs.UsecasePostconditionCS
	 * @generated
	 */
	EClass getUsecasePostconditionCS();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sme.frslcs.UsecasePostconditionCS#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.sme.frslcs.UsecasePostconditionCS#getDescription()
	 * @see #getUsecasePostconditionCS()
	 * @generated
	 */
	EAttribute getUsecasePostconditionCS_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.sme.frslcs.UsecasePostconditionCS#getSnapshot <em>Snapshot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Snapshot</em>'.
	 * @see org.eclipse.sme.frslcs.UsecasePostconditionCS#getSnapshot()
	 * @see #getUsecasePostconditionCS()
	 * @generated
	 */
	EReference getUsecasePostconditionCS_Snapshot();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sme.frslcs.StepCS <em>Step CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step CS</em>'.
	 * @see org.eclipse.sme.frslcs.StepCS
	 * @generated
	 */
	EClass getStepCS();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.sme.frslcs.StepCS#getNextStep <em>Next Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Next Step</em>'.
	 * @see org.eclipse.sme.frslcs.StepCS#getNextStep()
	 * @see #getStepCS()
	 * @generated
	 */
	EReference getStepCS_NextStep();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sme.frslcs.StepCS#getAltFlows <em>Alt Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alt Flows</em>'.
	 * @see org.eclipse.sme.frslcs.StepCS#getAltFlows()
	 * @see #getStepCS()
	 * @generated
	 */
	EReference getStepCS_AltFlows();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sme.frslcs.StepCS#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.sme.frslcs.StepCS#getName()
	 * @see #getStepCS()
	 * @generated
	 */
	EAttribute getStepCS_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sme.frslcs.StepCS#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.sme.frslcs.StepCS#getDescription()
	 * @see #getStepCS()
	 * @generated
	 */
	EAttribute getStepCS_Description();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sme.frslcs.ExtendCS <em>Extend CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extend CS</em>'.
	 * @see org.eclipse.sme.frslcs.ExtendCS
	 * @generated
	 */
	EClass getExtendCS();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.sme.frslcs.ExtendCS#getExtendedUC <em>Extended UC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extended UC</em>'.
	 * @see org.eclipse.sme.frslcs.ExtendCS#getExtendedUC()
	 * @see #getExtendCS()
	 * @generated
	 */
	EReference getExtendCS_ExtendedUC();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.sme.frslcs.ExtendCS#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extension</em>'.
	 * @see org.eclipse.sme.frslcs.ExtendCS#getExtension()
	 * @see #getExtendCS()
	 * @generated
	 */
	EReference getExtendCS_Extension();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sme.frslcs.ExtendCS#getExtPoints <em>Ext Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ext Points</em>'.
	 * @see org.eclipse.sme.frslcs.ExtendCS#getExtPoints()
	 * @see #getExtendCS()
	 * @generated
	 */
	EReference getExtendCS_ExtPoints();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sme.frslcs.ExtensionPointCS <em>Extension Point CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extension Point CS</em>'.
	 * @see org.eclipse.sme.frslcs.ExtensionPointCS
	 * @generated
	 */
	EClass getExtensionPointCS();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sme.frslcs.ExtensionPointCS#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.sme.frslcs.ExtensionPointCS#getName()
	 * @see #getExtensionPointCS()
	 * @generated
	 */
	EAttribute getExtensionPointCS_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sme.frslcs.ExtensionPointCS#getLocations <em>Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Locations</em>'.
	 * @see org.eclipse.sme.frslcs.ExtensionPointCS#getLocations()
	 * @see #getExtensionPointCS()
	 * @generated
	 */
	EReference getExtensionPointCS_Locations();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.sme.frslcs.ExtensionPointCS#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.eclipse.sme.frslcs.ExtensionPointCS#getCondition()
	 * @see #getExtensionPointCS()
	 * @generated
	 */
	EReference getExtensionPointCS_Condition();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.sme.frslcs.ExtensionPointCS#getExtends <em>Extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Extends</em>'.
	 * @see org.eclipse.sme.frslcs.ExtensionPointCS#getExtends()
	 * @see #getExtensionPointCS()
	 * @generated
	 */
	EReference getExtensionPointCS_Extends();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sme.frslcs.ExtensionPointCS#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.sme.frslcs.ExtensionPointCS#getDescription()
	 * @see #getExtensionPointCS()
	 * @generated
	 */
	EAttribute getExtensionPointCS_Description();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sme.frslcs.AltFlowCS <em>Alt Flow CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alt Flow CS</em>'.
	 * @see org.eclipse.sme.frslcs.AltFlowCS
	 * @generated
	 */
	EClass getAltFlowCS();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sme.frslcs.AltFlowCS#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.sme.frslcs.AltFlowCS#getName()
	 * @see #getAltFlowCS()
	 * @generated
	 */
	EAttribute getAltFlowCS_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sme.frslcs.AltFlowCS#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.sme.frslcs.AltFlowCS#getDescription()
	 * @see #getAltFlowCS()
	 * @generated
	 */
	EAttribute getAltFlowCS_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.sme.frslcs.AltFlowCS#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.eclipse.sme.frslcs.AltFlowCS#getCondition()
	 * @see #getAltFlowCS()
	 * @generated
	 */
	EReference getAltFlowCS_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.sme.frslcs.AltFlowCS#getBaseStep <em>Base Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Base Step</em>'.
	 * @see org.eclipse.sme.frslcs.AltFlowCS#getBaseStep()
	 * @see #getAltFlowCS()
	 * @generated
	 */
	EReference getAltFlowCS_BaseStep();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.sme.frslcs.AltFlowCS#getAltStep <em>Alt Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Alt Step</em>'.
	 * @see org.eclipse.sme.frslcs.AltFlowCS#getAltStep()
	 * @see #getAltFlowCS()
	 * @generated
	 */
	EReference getAltFlowCS_AltStep();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sme.frslcs.SnapshotPatternCS <em>Snapshot Pattern CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Snapshot Pattern CS</em>'.
	 * @see org.eclipse.sme.frslcs.SnapshotPatternCS
	 * @generated
	 */
	EClass getSnapshotPatternCS();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sme.frslcs.SnapshotPatternCS#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.sme.frslcs.SnapshotPatternCS#getName()
	 * @see #getSnapshotPatternCS()
	 * @generated
	 */
	EAttribute getSnapshotPatternCS_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sme.frslcs.SnapshotPatternCS#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.sme.frslcs.SnapshotPatternCS#getDescription()
	 * @see #getSnapshotPatternCS()
	 * @generated
	 */
	EAttribute getSnapshotPatternCS_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sme.frslcs.SnapshotPatternCS#getObjects <em>Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Objects</em>'.
	 * @see org.eclipse.sme.frslcs.SnapshotPatternCS#getObjects()
	 * @see #getSnapshotPatternCS()
	 * @generated
	 */
	EReference getSnapshotPatternCS_Objects();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sme.frslcs.SnapshotPatternCS#getNegObjects <em>Neg Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Neg Objects</em>'.
	 * @see org.eclipse.sme.frslcs.SnapshotPatternCS#getNegObjects()
	 * @see #getSnapshotPatternCS()
	 * @generated
	 */
	EReference getSnapshotPatternCS_NegObjects();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sme.frslcs.SnapshotPatternCS#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Links</em>'.
	 * @see org.eclipse.sme.frslcs.SnapshotPatternCS#getLinks()
	 * @see #getSnapshotPatternCS()
	 * @generated
	 */
	EReference getSnapshotPatternCS_Links();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sme.frslcs.SnapshotPatternCS#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see org.eclipse.sme.frslcs.SnapshotPatternCS#getConstraints()
	 * @see #getSnapshotPatternCS()
	 * @generated
	 */
	EReference getSnapshotPatternCS_Constraints();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sme.frslcs.ObjVarCS <em>Obj Var CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Obj Var CS</em>'.
	 * @see org.eclipse.sme.frslcs.ObjVarCS
	 * @generated
	 */
	EClass getObjVarCS();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sme.frslcs.ObjVarCS#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.sme.frslcs.ObjVarCS#getName()
	 * @see #getObjVarCS()
	 * @generated
	 */
	EAttribute getObjVarCS_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.sme.frslcs.ObjVarCS#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see org.eclipse.sme.frslcs.ObjVarCS#getType()
	 * @see #getObjVarCS()
	 * @generated
	 */
	EReference getObjVarCS_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sme.frslcs.ObjVarCS#isIsMatched <em>Is Matched</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Matched</em>'.
	 * @see org.eclipse.sme.frslcs.ObjVarCS#isIsMatched()
	 * @see #getObjVarCS()
	 * @generated
	 */
	EAttribute getObjVarCS_IsMatched();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sme.frslcs.VarLinkCS <em>Var Link CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Var Link CS</em>'.
	 * @see org.eclipse.sme.frslcs.VarLinkCS
	 * @generated
	 */
	EClass getVarLinkCS();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sme.frslcs.VarLinkCS#getObjVars <em>Obj Vars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Obj Vars</em>'.
	 * @see org.eclipse.sme.frslcs.VarLinkCS#getObjVars()
	 * @see #getVarLinkCS()
	 * @generated
	 */
	EReference getVarLinkCS_ObjVars();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.sme.frslcs.VarLinkCS#getAssoc <em>Assoc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Assoc</em>'.
	 * @see org.eclipse.sme.frslcs.VarLinkCS#getAssoc()
	 * @see #getVarLinkCS()
	 * @generated
	 */
	EReference getVarLinkCS_Assoc();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sme.frslcs.VarLinkCS#isIsNeg <em>Is Neg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Neg</em>'.
	 * @see org.eclipse.sme.frslcs.VarLinkCS#isIsNeg()
	 * @see #getVarLinkCS()
	 * @generated
	 */
	EAttribute getVarLinkCS_IsNeg();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sme.frslcs.AssociationCS <em>Association CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association CS</em>'.
	 * @see org.eclipse.sme.frslcs.AssociationCS
	 * @generated
	 */
	EClass getAssociationCS();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sme.frslcs.AssociationCS#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.sme.frslcs.AssociationCS#getName()
	 * @see #getAssociationCS()
	 * @generated
	 */
	EAttribute getAssociationCS_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sme.frslcs.AssociationCS#getAssocEnds <em>Assoc Ends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assoc Ends</em>'.
	 * @see org.eclipse.sme.frslcs.AssociationCS#getAssocEnds()
	 * @see #getAssociationCS()
	 * @generated
	 */
	EReference getAssociationCS_AssocEnds();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sme.frslcs.ConstraintCS <em>Constraint CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint CS</em>'.
	 * @see org.eclipse.sme.frslcs.ConstraintCS
	 * @generated
	 */
	EClass getConstraintCS();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.sme.frslcs.ConstraintCS#getConstrExpr <em>Constr Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Constr Expr</em>'.
	 * @see org.eclipse.sme.frslcs.ConstraintCS#getConstrExpr()
	 * @see #getConstraintCS()
	 * @generated
	 */
	EReference getConstraintCS_ConstrExpr();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sme.frslcs.ActorCS <em>Actor CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor CS</em>'.
	 * @see org.eclipse.sme.frslcs.ActorCS
	 * @generated
	 */
	EClass getActorCS();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sme.frslcs.ActorCS#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.sme.frslcs.ActorCS#getName()
	 * @see #getActorCS()
	 * @generated
	 */
	EAttribute getActorCS_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sme.frslcs.ActorCS#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.sme.frslcs.ActorCS#getDescription()
	 * @see #getActorCS()
	 * @generated
	 */
	EAttribute getActorCS_Description();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sme.frslcs.ActionCS <em>Action CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action CS</em>'.
	 * @see org.eclipse.sme.frslcs.ActionCS
	 * @generated
	 */
	EClass getActionCS();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sme.frslcs.ActionCS#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.sme.frslcs.ActionCS#getType()
	 * @see #getActionCS()
	 * @generated
	 */
	EAttribute getActionCS_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sme.frslcs.ActionCS#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.sme.frslcs.ActionCS#getDescription()
	 * @see #getActionCS()
	 * @generated
	 */
	EAttribute getActionCS_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.sme.frslcs.ActionCS#getActor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Actor</em>'.
	 * @see org.eclipse.sme.frslcs.ActionCS#getActor()
	 * @see #getActionCS()
	 * @generated
	 */
	EReference getActionCS_Actor();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sme.frslcs.ActionCS#getObjVars <em>Obj Vars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Obj Vars</em>'.
	 * @see org.eclipse.sme.frslcs.ActionCS#getObjVars()
	 * @see #getActionCS()
	 * @generated
	 */
	EReference getActionCS_ObjVars();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sme.frslcs.ActionCS#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see org.eclipse.sme.frslcs.ActionCS#getValues()
	 * @see #getActionCS()
	 * @generated
	 */
	EReference getActionCS_Values();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sme.frslcs.ActorActionCS <em>Actor Action CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor Action CS</em>'.
	 * @see org.eclipse.sme.frslcs.ActorActionCS
	 * @generated
	 */
	EClass getActorActionCS();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sme.frslcs.SystemActionCS <em>System Action CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Action CS</em>'.
	 * @see org.eclipse.sme.frslcs.SystemActionCS
	 * @generated
	 */
	EClass getSystemActionCS();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sme.frslcs.RejoinStepCS <em>Rejoin Step CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rejoin Step CS</em>'.
	 * @see org.eclipse.sme.frslcs.RejoinStepCS
	 * @generated
	 */
	EClass getRejoinStepCS();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.sme.frslcs.RejoinStepCS#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.eclipse.sme.frslcs.RejoinStepCS#getCondition()
	 * @see #getRejoinStepCS()
	 * @generated
	 */
	EReference getRejoinStepCS_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.sme.frslcs.RejoinStepCS#getRejoinTo <em>Rejoin To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rejoin To</em>'.
	 * @see org.eclipse.sme.frslcs.RejoinStepCS#getRejoinTo()
	 * @see #getRejoinStepCS()
	 * @generated
	 */
	EReference getRejoinStepCS_RejoinTo();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sme.frslcs.UCStepCS <em>UC Step CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UC Step CS</em>'.
	 * @see org.eclipse.sme.frslcs.UCStepCS
	 * @generated
	 */
	EClass getUCStepCS();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.sme.frslcs.UCStepCS#getIncludedUC <em>Included UC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Included UC</em>'.
	 * @see org.eclipse.sme.frslcs.UCStepCS#getIncludedUC()
	 * @see #getUCStepCS()
	 * @generated
	 */
	EReference getUCStepCS_IncludedUC();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sme.frslcs.AssocEndCS <em>Assoc End CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assoc End CS</em>'.
	 * @see org.eclipse.sme.frslcs.AssocEndCS
	 * @generated
	 */
	EClass getAssocEndCS();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sme.frslcs.ActStepCS <em>Act Step CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Act Step CS</em>'.
	 * @see org.eclipse.sme.frslcs.ActStepCS
	 * @generated
	 */
	EClass getActStepCS();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.sme.frslcs.ActStepCS#getPreSnapshot <em>Pre Snapshot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pre Snapshot</em>'.
	 * @see org.eclipse.sme.frslcs.ActStepCS#getPreSnapshot()
	 * @see #getActStepCS()
	 * @generated
	 */
	EReference getActStepCS_PreSnapshot();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.sme.frslcs.ActStepCS#getPostSnapshot <em>Post Snapshot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Snapshot</em>'.
	 * @see org.eclipse.sme.frslcs.ActStepCS#getPostSnapshot()
	 * @see #getActStepCS()
	 * @generated
	 */
	EReference getActStepCS_PostSnapshot();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sme.frslcs.ActStepCS#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see org.eclipse.sme.frslcs.ActStepCS#getActions()
	 * @see #getActStepCS()
	 * @generated
	 */
	EReference getActStepCS_Actions();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sme.frslcs.ActStepCS#isIsActorStep <em>Is Actor Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Actor Step</em>'.
	 * @see org.eclipse.sme.frslcs.ActStepCS#isIsActorStep()
	 * @see #getActStepCS()
	 * @generated
	 */
	EAttribute getActStepCS_IsActorStep();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FrslCSFactory getFrslCSFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals
	{
		/**
		 * The meta object literal for the '{@link org.eclipse.sme.frslcs.impl.FrslModelCSImpl <em>Frsl Model CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sme.frslcs.impl.FrslModelCSImpl
		 * @see org.eclipse.sme.frslcs.impl.FrslCSPackageImpl#getFrslModelCS()
		 * @generated
		 */
		EClass FRSL_MODEL_CS = eINSTANCE.getFrslModelCS();

		/**
		 * The meta object literal for the '<em><b>Usecases</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FRSL_MODEL_CS__USECASES = eINSTANCE.getFrslModelCS_Usecases();

		/**
		 * The meta object literal for the '<em><b>Uc Extends</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FRSL_MODEL_CS__UC_EXTENDS = eINSTANCE.getFrslModelCS_UcExtends();

		/**
		 * The meta object literal for the '<em><b>Domain Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FRSL_MODEL_CS__DOMAIN_MODEL = eINSTANCE.getFrslModelCS_DomainModel();

		/**
		 * The meta object literal for the '<em><b>Assocs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FRSL_MODEL_CS__ASSOCS = eINSTANCE.getFrslModelCS_Assocs();

		/**
		 * The meta object literal for the '<em><b>Actors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FRSL_MODEL_CS__ACTORS = eINSTANCE.getFrslModelCS_Actors();

		/**
		 * The meta object literal for the '{@link org.eclipse.sme.frslcs.impl.UsecaseCSImpl <em>Usecase CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sme.frslcs.impl.UsecaseCSImpl
		 * @see org.eclipse.sme.frslcs.impl.FrslCSPackageImpl#getUsecaseCS()
		 * @generated
		 */
		EClass USECASE_CS = eINSTANCE.getUsecaseCS();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USECASE_CS__NAME = eINSTANCE.getUsecaseCS_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USECASE_CS__DESCRIPTION = eINSTANCE.getUsecaseCS_Description();

		/**
		 * The meta object literal for the '<em><b>Primary Actor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USECASE_CS__PRIMARY_ACTOR = eINSTANCE.getUsecaseCS_PrimaryActor();

		/**
		 * The meta object literal for the '<em><b>Secondary Actors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USECASE_CS__SECONDARY_ACTORS = eINSTANCE.getUsecaseCS_SecondaryActors();

		/**
		 * The meta object literal for the '<em><b>Precondition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USECASE_CS__PRECONDITION = eINSTANCE.getUsecaseCS_Precondition();

		/**
		 * The meta object literal for the '<em><b>Postcondition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USECASE_CS__POSTCONDITION = eINSTANCE.getUsecaseCS_Postcondition();

		/**
		 * The meta object literal for the '<em><b>First Step</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USECASE_CS__FIRST_STEP = eINSTANCE.getUsecaseCS_FirstStep();

		/**
		 * The meta object literal for the '<em><b>Ext Points</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USECASE_CS__EXT_POINTS = eINSTANCE.getUsecaseCS_ExtPoints();

		/**
		 * The meta object literal for the '{@link org.eclipse.sme.frslcs.impl.UsecasePreconditionCSImpl <em>Usecase Precondition CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sme.frslcs.impl.UsecasePreconditionCSImpl
		 * @see org.eclipse.sme.frslcs.impl.FrslCSPackageImpl#getUsecasePreconditionCS()
		 * @generated
		 */
		EClass USECASE_PRECONDITION_CS = eINSTANCE.getUsecasePreconditionCS();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USECASE_PRECONDITION_CS__DESCRIPTION = eINSTANCE.getUsecasePreconditionCS_Description();

		/**
		 * The meta object literal for the '<em><b>Snapshot</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USECASE_PRECONDITION_CS__SNAPSHOT = eINSTANCE.getUsecasePreconditionCS_Snapshot();

		/**
		 * The meta object literal for the '{@link org.eclipse.sme.frslcs.impl.UsecasePostconditionCSImpl <em>Usecase Postcondition CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sme.frslcs.impl.UsecasePostconditionCSImpl
		 * @see org.eclipse.sme.frslcs.impl.FrslCSPackageImpl#getUsecasePostconditionCS()
		 * @generated
		 */
		EClass USECASE_POSTCONDITION_CS = eINSTANCE.getUsecasePostconditionCS();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USECASE_POSTCONDITION_CS__DESCRIPTION = eINSTANCE.getUsecasePostconditionCS_Description();

		/**
		 * The meta object literal for the '<em><b>Snapshot</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USECASE_POSTCONDITION_CS__SNAPSHOT = eINSTANCE.getUsecasePostconditionCS_Snapshot();

		/**
		 * The meta object literal for the '{@link org.eclipse.sme.frslcs.impl.StepCSImpl <em>Step CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sme.frslcs.impl.StepCSImpl
		 * @see org.eclipse.sme.frslcs.impl.FrslCSPackageImpl#getStepCS()
		 * @generated
		 */
		EClass STEP_CS = eINSTANCE.getStepCS();

		/**
		 * The meta object literal for the '<em><b>Next Step</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP_CS__NEXT_STEP = eINSTANCE.getStepCS_NextStep();

		/**
		 * The meta object literal for the '<em><b>Alt Flows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP_CS__ALT_FLOWS = eINSTANCE.getStepCS_AltFlows();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP_CS__NAME = eINSTANCE.getStepCS_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP_CS__DESCRIPTION = eINSTANCE.getStepCS_Description();

		/**
		 * The meta object literal for the '{@link org.eclipse.sme.frslcs.impl.ExtendCSImpl <em>Extend CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sme.frslcs.impl.ExtendCSImpl
		 * @see org.eclipse.sme.frslcs.impl.FrslCSPackageImpl#getExtendCS()
		 * @generated
		 */
		EClass EXTEND_CS = eINSTANCE.getExtendCS();

		/**
		 * The meta object literal for the '<em><b>Extended UC</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTEND_CS__EXTENDED_UC = eINSTANCE.getExtendCS_ExtendedUC();

		/**
		 * The meta object literal for the '<em><b>Extension</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTEND_CS__EXTENSION = eINSTANCE.getExtendCS_Extension();

		/**
		 * The meta object literal for the '<em><b>Ext Points</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTEND_CS__EXT_POINTS = eINSTANCE.getExtendCS_ExtPoints();

		/**
		 * The meta object literal for the '{@link org.eclipse.sme.frslcs.impl.ExtensionPointCSImpl <em>Extension Point CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sme.frslcs.impl.ExtensionPointCSImpl
		 * @see org.eclipse.sme.frslcs.impl.FrslCSPackageImpl#getExtensionPointCS()
		 * @generated
		 */
		EClass EXTENSION_POINT_CS = eINSTANCE.getExtensionPointCS();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENSION_POINT_CS__NAME = eINSTANCE.getExtensionPointCS_Name();

		/**
		 * The meta object literal for the '<em><b>Locations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION_POINT_CS__LOCATIONS = eINSTANCE.getExtensionPointCS_Locations();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION_POINT_CS__CONDITION = eINSTANCE.getExtensionPointCS_Condition();

		/**
		 * The meta object literal for the '<em><b>Extends</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION_POINT_CS__EXTENDS = eINSTANCE.getExtensionPointCS_Extends();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENSION_POINT_CS__DESCRIPTION = eINSTANCE.getExtensionPointCS_Description();

		/**
		 * The meta object literal for the '{@link org.eclipse.sme.frslcs.impl.AltFlowCSImpl <em>Alt Flow CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sme.frslcs.impl.AltFlowCSImpl
		 * @see org.eclipse.sme.frslcs.impl.FrslCSPackageImpl#getAltFlowCS()
		 * @generated
		 */
		EClass ALT_FLOW_CS = eINSTANCE.getAltFlowCS();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALT_FLOW_CS__NAME = eINSTANCE.getAltFlowCS_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALT_FLOW_CS__DESCRIPTION = eINSTANCE.getAltFlowCS_Description();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALT_FLOW_CS__CONDITION = eINSTANCE.getAltFlowCS_Condition();

		/**
		 * The meta object literal for the '<em><b>Base Step</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALT_FLOW_CS__BASE_STEP = eINSTANCE.getAltFlowCS_BaseStep();

		/**
		 * The meta object literal for the '<em><b>Alt Step</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALT_FLOW_CS__ALT_STEP = eINSTANCE.getAltFlowCS_AltStep();

		/**
		 * The meta object literal for the '{@link org.eclipse.sme.frslcs.impl.SnapshotPatternCSImpl <em>Snapshot Pattern CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sme.frslcs.impl.SnapshotPatternCSImpl
		 * @see org.eclipse.sme.frslcs.impl.FrslCSPackageImpl#getSnapshotPatternCS()
		 * @generated
		 */
		EClass SNAPSHOT_PATTERN_CS = eINSTANCE.getSnapshotPatternCS();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SNAPSHOT_PATTERN_CS__NAME = eINSTANCE.getSnapshotPatternCS_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SNAPSHOT_PATTERN_CS__DESCRIPTION = eINSTANCE.getSnapshotPatternCS_Description();

		/**
		 * The meta object literal for the '<em><b>Objects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SNAPSHOT_PATTERN_CS__OBJECTS = eINSTANCE.getSnapshotPatternCS_Objects();

		/**
		 * The meta object literal for the '<em><b>Neg Objects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SNAPSHOT_PATTERN_CS__NEG_OBJECTS = eINSTANCE.getSnapshotPatternCS_NegObjects();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SNAPSHOT_PATTERN_CS__LINKS = eINSTANCE.getSnapshotPatternCS_Links();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SNAPSHOT_PATTERN_CS__CONSTRAINTS = eINSTANCE.getSnapshotPatternCS_Constraints();

		/**
		 * The meta object literal for the '{@link org.eclipse.sme.frslcs.impl.ObjVarCSImpl <em>Obj Var CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sme.frslcs.impl.ObjVarCSImpl
		 * @see org.eclipse.sme.frslcs.impl.FrslCSPackageImpl#getObjVarCS()
		 * @generated
		 */
		EClass OBJ_VAR_CS = eINSTANCE.getObjVarCS();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJ_VAR_CS__NAME = eINSTANCE.getObjVarCS_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJ_VAR_CS__TYPE = eINSTANCE.getObjVarCS_Type();

		/**
		 * The meta object literal for the '<em><b>Is Matched</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJ_VAR_CS__IS_MATCHED = eINSTANCE.getObjVarCS_IsMatched();

		/**
		 * The meta object literal for the '{@link org.eclipse.sme.frslcs.impl.VarLinkCSImpl <em>Var Link CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sme.frslcs.impl.VarLinkCSImpl
		 * @see org.eclipse.sme.frslcs.impl.FrslCSPackageImpl#getVarLinkCS()
		 * @generated
		 */
		EClass VAR_LINK_CS = eINSTANCE.getVarLinkCS();

		/**
		 * The meta object literal for the '<em><b>Obj Vars</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VAR_LINK_CS__OBJ_VARS = eINSTANCE.getVarLinkCS_ObjVars();

		/**
		 * The meta object literal for the '<em><b>Assoc</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VAR_LINK_CS__ASSOC = eINSTANCE.getVarLinkCS_Assoc();

		/**
		 * The meta object literal for the '<em><b>Is Neg</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VAR_LINK_CS__IS_NEG = eINSTANCE.getVarLinkCS_IsNeg();

		/**
		 * The meta object literal for the '{@link org.eclipse.sme.frslcs.impl.AssociationCSImpl <em>Association CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sme.frslcs.impl.AssociationCSImpl
		 * @see org.eclipse.sme.frslcs.impl.FrslCSPackageImpl#getAssociationCS()
		 * @generated
		 */
		EClass ASSOCIATION_CS = eINSTANCE.getAssociationCS();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION_CS__NAME = eINSTANCE.getAssociationCS_Name();

		/**
		 * The meta object literal for the '<em><b>Assoc Ends</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION_CS__ASSOC_ENDS = eINSTANCE.getAssociationCS_AssocEnds();

		/**
		 * The meta object literal for the '{@link org.eclipse.sme.frslcs.impl.ConstraintCSImpl <em>Constraint CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sme.frslcs.impl.ConstraintCSImpl
		 * @see org.eclipse.sme.frslcs.impl.FrslCSPackageImpl#getConstraintCS()
		 * @generated
		 */
		EClass CONSTRAINT_CS = eINSTANCE.getConstraintCS();

		/**
		 * The meta object literal for the '<em><b>Constr Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT_CS__CONSTR_EXPR = eINSTANCE.getConstraintCS_ConstrExpr();

		/**
		 * The meta object literal for the '{@link org.eclipse.sme.frslcs.impl.ActorCSImpl <em>Actor CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sme.frslcs.impl.ActorCSImpl
		 * @see org.eclipse.sme.frslcs.impl.FrslCSPackageImpl#getActorCS()
		 * @generated
		 */
		EClass ACTOR_CS = eINSTANCE.getActorCS();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR_CS__NAME = eINSTANCE.getActorCS_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR_CS__DESCRIPTION = eINSTANCE.getActorCS_Description();

		/**
		 * The meta object literal for the '{@link org.eclipse.sme.frslcs.impl.ActionCSImpl <em>Action CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sme.frslcs.impl.ActionCSImpl
		 * @see org.eclipse.sme.frslcs.impl.FrslCSPackageImpl#getActionCS()
		 * @generated
		 */
		EClass ACTION_CS = eINSTANCE.getActionCS();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_CS__TYPE = eINSTANCE.getActionCS_Type();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_CS__DESCRIPTION = eINSTANCE.getActionCS_Description();

		/**
		 * The meta object literal for the '<em><b>Actor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_CS__ACTOR = eINSTANCE.getActionCS_Actor();

		/**
		 * The meta object literal for the '<em><b>Obj Vars</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_CS__OBJ_VARS = eINSTANCE.getActionCS_ObjVars();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_CS__VALUES = eINSTANCE.getActionCS_Values();

		/**
		 * The meta object literal for the '{@link org.eclipse.sme.frslcs.impl.ActorActionCSImpl <em>Actor Action CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sme.frslcs.impl.ActorActionCSImpl
		 * @see org.eclipse.sme.frslcs.impl.FrslCSPackageImpl#getActorActionCS()
		 * @generated
		 */
		EClass ACTOR_ACTION_CS = eINSTANCE.getActorActionCS();

		/**
		 * The meta object literal for the '{@link org.eclipse.sme.frslcs.impl.SystemActionCSImpl <em>System Action CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sme.frslcs.impl.SystemActionCSImpl
		 * @see org.eclipse.sme.frslcs.impl.FrslCSPackageImpl#getSystemActionCS()
		 * @generated
		 */
		EClass SYSTEM_ACTION_CS = eINSTANCE.getSystemActionCS();

		/**
		 * The meta object literal for the '{@link org.eclipse.sme.frslcs.impl.RejoinStepCSImpl <em>Rejoin Step CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sme.frslcs.impl.RejoinStepCSImpl
		 * @see org.eclipse.sme.frslcs.impl.FrslCSPackageImpl#getRejoinStepCS()
		 * @generated
		 */
		EClass REJOIN_STEP_CS = eINSTANCE.getRejoinStepCS();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REJOIN_STEP_CS__CONDITION = eINSTANCE.getRejoinStepCS_Condition();

		/**
		 * The meta object literal for the '<em><b>Rejoin To</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REJOIN_STEP_CS__REJOIN_TO = eINSTANCE.getRejoinStepCS_RejoinTo();

		/**
		 * The meta object literal for the '{@link org.eclipse.sme.frslcs.impl.UCStepCSImpl <em>UC Step CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sme.frslcs.impl.UCStepCSImpl
		 * @see org.eclipse.sme.frslcs.impl.FrslCSPackageImpl#getUCStepCS()
		 * @generated
		 */
		EClass UC_STEP_CS = eINSTANCE.getUCStepCS();

		/**
		 * The meta object literal for the '<em><b>Included UC</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UC_STEP_CS__INCLUDED_UC = eINSTANCE.getUCStepCS_IncludedUC();

		/**
		 * The meta object literal for the '{@link org.eclipse.sme.frslcs.impl.AssocEndCSImpl <em>Assoc End CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sme.frslcs.impl.AssocEndCSImpl
		 * @see org.eclipse.sme.frslcs.impl.FrslCSPackageImpl#getAssocEndCS()
		 * @generated
		 */
		EClass ASSOC_END_CS = eINSTANCE.getAssocEndCS();

		/**
		 * The meta object literal for the '{@link org.eclipse.sme.frslcs.impl.ActStepCSImpl <em>Act Step CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sme.frslcs.impl.ActStepCSImpl
		 * @see org.eclipse.sme.frslcs.impl.FrslCSPackageImpl#getActStepCS()
		 * @generated
		 */
		EClass ACT_STEP_CS = eINSTANCE.getActStepCS();

		/**
		 * The meta object literal for the '<em><b>Pre Snapshot</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACT_STEP_CS__PRE_SNAPSHOT = eINSTANCE.getActStepCS_PreSnapshot();

		/**
		 * The meta object literal for the '<em><b>Post Snapshot</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACT_STEP_CS__POST_SNAPSHOT = eINSTANCE.getActStepCS_PostSnapshot();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACT_STEP_CS__ACTIONS = eINSTANCE.getActStepCS_Actions();

		/**
		 * The meta object literal for the '<em><b>Is Actor Step</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACT_STEP_CS__IS_ACTOR_STEP = eINSTANCE.getActStepCS_IsActorStep();

	}

} //FrslCSPackage
