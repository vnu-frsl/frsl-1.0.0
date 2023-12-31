/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.sme.frslcs.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.sme.frslcs.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FrslCSFactoryImpl extends EFactoryImpl implements FrslCSFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FrslCSFactory init()
	{
		try
		{
			FrslCSFactory theFrslCSFactory = (FrslCSFactory)EPackage.Registry.INSTANCE.getEFactory(FrslCSPackage.eNS_URI);
			if (theFrslCSFactory != null)
			{
				return theFrslCSFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FrslCSFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrslCSFactoryImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass)
	{
		switch (eClass.getClassifierID())
		{
			case 0: return createFrslModelCS();
			case 1: return createUsecaseCS();
			case 2: return createUsecasePreconditionCS();
			case 3: return createUsecasePostconditionCS();
			case 4: return createStepCS();
			case 5: return createExtendCS();
			case 6: return createExtensionPointCS();
			case 7: return createAltFlowCS();
			case 8: return createSnapshotPatternCS();
			case 9: return createObjVarCS();
			case 10: return createVarLinkCS();
			case 11: return createAssociationCS();
			case 12: return createConstraintCS();
			case 13: return createActorCS();
			case 14: return createActionCS();
			case 15: return createActorActionCS();
			case 16: return createSystemActionCS();
			case 17: return createRejoinStepCS();
			case 18: return createUCStepCS();
			case 19: return createAssocEndCS();
			case 20: return createActStepCS();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FrslModelCS createFrslModelCS()
	{
		FrslModelCSImpl frslModelCS = new FrslModelCSImpl();
		return frslModelCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UsecaseCS createUsecaseCS()
	{
		UsecaseCSImpl usecaseCS = new UsecaseCSImpl();
		return usecaseCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UsecasePreconditionCS createUsecasePreconditionCS()
	{
		UsecasePreconditionCSImpl usecasePreconditionCS = new UsecasePreconditionCSImpl();
		return usecasePreconditionCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UsecasePostconditionCS createUsecasePostconditionCS()
	{
		UsecasePostconditionCSImpl usecasePostconditionCS = new UsecasePostconditionCSImpl();
		return usecasePostconditionCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StepCS createStepCS()
	{
		StepCSImpl stepCS = new StepCSImpl();
		return stepCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExtendCS createExtendCS()
	{
		ExtendCSImpl extendCS = new ExtendCSImpl();
		return extendCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExtensionPointCS createExtensionPointCS()
	{
		ExtensionPointCSImpl extensionPointCS = new ExtensionPointCSImpl();
		return extensionPointCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AltFlowCS createAltFlowCS()
	{
		AltFlowCSImpl altFlowCS = new AltFlowCSImpl();
		return altFlowCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SnapshotPatternCS createSnapshotPatternCS()
	{
		SnapshotPatternCSImpl snapshotPatternCS = new SnapshotPatternCSImpl();
		return snapshotPatternCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ObjVarCS createObjVarCS()
	{
		ObjVarCSImpl objVarCS = new ObjVarCSImpl();
		return objVarCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VarLinkCS createVarLinkCS()
	{
		VarLinkCSImpl varLinkCS = new VarLinkCSImpl();
		return varLinkCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssociationCS createAssociationCS()
	{
		AssociationCSImpl associationCS = new AssociationCSImpl();
		return associationCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstraintCS createConstraintCS()
	{
		ConstraintCSImpl constraintCS = new ConstraintCSImpl();
		return constraintCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActorCS createActorCS()
	{
		ActorCSImpl actorCS = new ActorCSImpl();
		return actorCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActionCS createActionCS()
	{
		ActionCSImpl actionCS = new ActionCSImpl();
		return actionCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActorActionCS createActorActionCS()
	{
		ActorActionCSImpl actorActionCS = new ActorActionCSImpl();
		return actorActionCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SystemActionCS createSystemActionCS()
	{
		SystemActionCSImpl systemActionCS = new SystemActionCSImpl();
		return systemActionCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RejoinStepCS createRejoinStepCS()
	{
		RejoinStepCSImpl rejoinStepCS = new RejoinStepCSImpl();
		return rejoinStepCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UCStepCS createUCStepCS()
	{
		UCStepCSImpl ucStepCS = new UCStepCSImpl();
		return ucStepCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssocEndCS createAssocEndCS()
	{
		AssocEndCSImpl assocEndCS = new AssocEndCSImpl();
		return assocEndCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActStepCS createActStepCS()
	{
		ActStepCSImpl actStepCS = new ActStepCSImpl();
		return actStepCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FrslCSPackage getFrslCSPackage()
	{
		return (FrslCSPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FrslCSPackage getPackage()
	{
		return FrslCSPackage.eINSTANCE;
	}

} //FrslCSFactoryImpl
