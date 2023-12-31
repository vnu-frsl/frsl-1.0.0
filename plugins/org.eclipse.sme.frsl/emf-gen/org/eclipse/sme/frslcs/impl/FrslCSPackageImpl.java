/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.sme.frslcs.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.ocl.pivot.PivotPackage;

import org.eclipse.ocl.xtext.basecs.BaseCSPackage;

import org.eclipse.ocl.xtext.basecs.impl.ModelElementCSImpl;
import org.eclipse.ocl.xtext.basecs.impl.RootCSImpl;

import org.eclipse.ocl.xtext.essentialoclcs.EssentialOCLCSPackage;

import org.eclipse.ocl.xtext.oclinecorecs.OCLinEcoreCSPackage;
import org.eclipse.sme.frslcs.ActStepCS;
import org.eclipse.sme.frslcs.ActionCS;
import org.eclipse.sme.frslcs.ActorActionCS;
import org.eclipse.sme.frslcs.ActorCS;
import org.eclipse.sme.frslcs.AltFlowCS;
import org.eclipse.sme.frslcs.AssocEndCS;
import org.eclipse.sme.frslcs.AssociationCS;
import org.eclipse.sme.frslcs.ConstraintCS;
import org.eclipse.sme.frslcs.ExtendCS;
import org.eclipse.sme.frslcs.ExtensionPointCS;
import org.eclipse.sme.frslcs.FrslCSFactory;
import org.eclipse.sme.frslcs.FrslCSPackage;
import org.eclipse.sme.frslcs.FrslModelCS;
import org.eclipse.sme.frslcs.ObjVarCS;
import org.eclipse.sme.frslcs.RejoinStepCS;
import org.eclipse.sme.frslcs.SnapshotPatternCS;
import org.eclipse.sme.frslcs.StepCS;
import org.eclipse.sme.frslcs.SystemActionCS;
import org.eclipse.sme.frslcs.UCStepCS;
import org.eclipse.sme.frslcs.UsecaseCS;
import org.eclipse.sme.frslcs.UsecasePostconditionCS;
import org.eclipse.sme.frslcs.UsecasePreconditionCS;
import org.eclipse.sme.frslcs.VarLinkCS;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FrslCSPackageImpl extends EPackageImpl implements FrslCSPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass frslModelCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass usecaseCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass usecasePreconditionCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass usecasePostconditionCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stepCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extendCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extensionPointCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass altFlowCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass snapshotPatternCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objVarCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass varLinkCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actorCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actorActionCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemActionCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rejoinStepCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ucStepCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assocEndCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actStepCSEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.sme.frslcs.FrslCSPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FrslCSPackageImpl()
	{
		super(eNS_URI, FrslCSFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link FrslCSPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FrslCSPackage init()
	{
		if (isInited) return (FrslCSPackage)EPackage.Registry.INSTANCE.getEPackage(FrslCSPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredFrslCSPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		FrslCSPackageImpl theFrslCSPackage = registeredFrslCSPackage instanceof FrslCSPackageImpl ? (FrslCSPackageImpl)registeredFrslCSPackage : new FrslCSPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		BaseCSPackage.eINSTANCE.eClass();
		EssentialOCLCSPackage.eINSTANCE.eClass();
		OCLinEcoreCSPackage.eINSTANCE.eClass();
		PivotPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theFrslCSPackage.createPackageContents();

		// Initialize created meta-data
		theFrslCSPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFrslCSPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FrslCSPackage.eNS_URI, theFrslCSPackage);
		return theFrslCSPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFrslModelCS()
	{
		return frslModelCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFrslModelCS_Usecases()
	{
		return (EReference)frslModelCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFrslModelCS_UcExtends()
	{
		return (EReference)frslModelCSEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFrslModelCS_DomainModel()
	{
		return (EReference)frslModelCSEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFrslModelCS_Assocs()
	{
		return (EReference)frslModelCSEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFrslModelCS_Actors()
	{
		return (EReference)frslModelCSEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUsecaseCS()
	{
		return usecaseCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUsecaseCS_Name()
	{
		return (EAttribute)usecaseCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUsecaseCS_Description()
	{
		return (EAttribute)usecaseCSEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUsecaseCS_PrimaryActor()
	{
		return (EReference)usecaseCSEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUsecaseCS_SecondaryActors()
	{
		return (EReference)usecaseCSEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUsecaseCS_Precondition()
	{
		return (EReference)usecaseCSEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUsecaseCS_Postcondition()
	{
		return (EReference)usecaseCSEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUsecaseCS_FirstStep()
	{
		return (EReference)usecaseCSEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUsecaseCS_ExtPoints()
	{
		return (EReference)usecaseCSEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUsecasePreconditionCS()
	{
		return usecasePreconditionCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUsecasePreconditionCS_Description()
	{
		return (EAttribute)usecasePreconditionCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUsecasePreconditionCS_Snapshot()
	{
		return (EReference)usecasePreconditionCSEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUsecasePostconditionCS()
	{
		return usecasePostconditionCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUsecasePostconditionCS_Description()
	{
		return (EAttribute)usecasePostconditionCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUsecasePostconditionCS_Snapshot()
	{
		return (EReference)usecasePostconditionCSEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStepCS()
	{
		return stepCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStepCS_NextStep()
	{
		return (EReference)stepCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStepCS_AltFlows()
	{
		return (EReference)stepCSEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStepCS_Name()
	{
		return (EAttribute)stepCSEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStepCS_Description()
	{
		return (EAttribute)stepCSEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExtendCS()
	{
		return extendCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExtendCS_ExtendedUC()
	{
		return (EReference)extendCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExtendCS_Extension()
	{
		return (EReference)extendCSEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExtendCS_ExtPoints()
	{
		return (EReference)extendCSEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExtensionPointCS()
	{
		return extensionPointCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExtensionPointCS_Name()
	{
		return (EAttribute)extensionPointCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExtensionPointCS_Locations()
	{
		return (EReference)extensionPointCSEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExtensionPointCS_Condition()
	{
		return (EReference)extensionPointCSEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExtensionPointCS_Extends()
	{
		return (EReference)extensionPointCSEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExtensionPointCS_Description()
	{
		return (EAttribute)extensionPointCSEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAltFlowCS()
	{
		return altFlowCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAltFlowCS_Name()
	{
		return (EAttribute)altFlowCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAltFlowCS_Description()
	{
		return (EAttribute)altFlowCSEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAltFlowCS_Condition()
	{
		return (EReference)altFlowCSEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAltFlowCS_BaseStep()
	{
		return (EReference)altFlowCSEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAltFlowCS_AltStep()
	{
		return (EReference)altFlowCSEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSnapshotPatternCS()
	{
		return snapshotPatternCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSnapshotPatternCS_Name()
	{
		return (EAttribute)snapshotPatternCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSnapshotPatternCS_Description()
	{
		return (EAttribute)snapshotPatternCSEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSnapshotPatternCS_Objects()
	{
		return (EReference)snapshotPatternCSEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSnapshotPatternCS_NegObjects()
	{
		return (EReference)snapshotPatternCSEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSnapshotPatternCS_Links()
	{
		return (EReference)snapshotPatternCSEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSnapshotPatternCS_Constraints()
	{
		return (EReference)snapshotPatternCSEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getObjVarCS()
	{
		return objVarCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getObjVarCS_Name()
	{
		return (EAttribute)objVarCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getObjVarCS_Type()
	{
		return (EReference)objVarCSEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getObjVarCS_IsMatched()
	{
		return (EAttribute)objVarCSEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVarLinkCS()
	{
		return varLinkCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVarLinkCS_ObjVars()
	{
		return (EReference)varLinkCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVarLinkCS_Assoc()
	{
		return (EReference)varLinkCSEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVarLinkCS_IsNeg()
	{
		return (EAttribute)varLinkCSEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssociationCS()
	{
		return associationCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssociationCS_Name()
	{
		return (EAttribute)associationCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssociationCS_AssocEnds()
	{
		return (EReference)associationCSEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConstraintCS()
	{
		return constraintCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConstraintCS_ConstrExpr()
	{
		return (EReference)constraintCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getActorCS()
	{
		return actorCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActorCS_Name()
	{
		return (EAttribute)actorCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActorCS_Description()
	{
		return (EAttribute)actorCSEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getActionCS()
	{
		return actionCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActionCS_Type()
	{
		return (EAttribute)actionCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActionCS_Description()
	{
		return (EAttribute)actionCSEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActionCS_Actor()
	{
		return (EReference)actionCSEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActionCS_ObjVars()
	{
		return (EReference)actionCSEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActionCS_Values()
	{
		return (EReference)actionCSEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getActorActionCS()
	{
		return actorActionCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSystemActionCS()
	{
		return systemActionCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRejoinStepCS()
	{
		return rejoinStepCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRejoinStepCS_Condition()
	{
		return (EReference)rejoinStepCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRejoinStepCS_RejoinTo()
	{
		return (EReference)rejoinStepCSEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUCStepCS()
	{
		return ucStepCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUCStepCS_IncludedUC()
	{
		return (EReference)ucStepCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssocEndCS()
	{
		return assocEndCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getActStepCS()
	{
		return actStepCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActStepCS_PreSnapshot()
	{
		return (EReference)actStepCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActStepCS_PostSnapshot()
	{
		return (EReference)actStepCSEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActStepCS_Actions()
	{
		return (EReference)actStepCSEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActStepCS_IsActorStep()
	{
		return (EAttribute)actStepCSEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FrslCSFactory getFrslCSFactory()
	{
		return (FrslCSFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents()
	{
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		frslModelCSEClass = createEClass(0);
		createEReference(frslModelCSEClass, RootCSImpl.ROOT_CS_FEATURE_COUNT + 0);
		createEReference(frslModelCSEClass, RootCSImpl.ROOT_CS_FEATURE_COUNT + 1);
		createEReference(frslModelCSEClass, RootCSImpl.ROOT_CS_FEATURE_COUNT + 2);
		createEReference(frslModelCSEClass, RootCSImpl.ROOT_CS_FEATURE_COUNT + 3);
		createEReference(frslModelCSEClass, RootCSImpl.ROOT_CS_FEATURE_COUNT + 4);

		usecaseCSEClass = createEClass(1);
		createEAttribute(usecaseCSEClass, ModelElementCSImpl.MODEL_ELEMENT_CS_FEATURE_COUNT + 0);
		createEAttribute(usecaseCSEClass, ModelElementCSImpl.MODEL_ELEMENT_CS_FEATURE_COUNT + 1);
		createEReference(usecaseCSEClass, ModelElementCSImpl.MODEL_ELEMENT_CS_FEATURE_COUNT + 2);
		createEReference(usecaseCSEClass, ModelElementCSImpl.MODEL_ELEMENT_CS_FEATURE_COUNT + 3);
		createEReference(usecaseCSEClass, ModelElementCSImpl.MODEL_ELEMENT_CS_FEATURE_COUNT + 4);
		createEReference(usecaseCSEClass, ModelElementCSImpl.MODEL_ELEMENT_CS_FEATURE_COUNT + 5);
		createEReference(usecaseCSEClass, ModelElementCSImpl.MODEL_ELEMENT_CS_FEATURE_COUNT + 6);
		createEReference(usecaseCSEClass, ModelElementCSImpl.MODEL_ELEMENT_CS_FEATURE_COUNT + 7);

		usecasePreconditionCSEClass = createEClass(2);
		createEAttribute(usecasePreconditionCSEClass, ModelElementCSImpl.MODEL_ELEMENT_CS_FEATURE_COUNT + 0);
		createEReference(usecasePreconditionCSEClass, ModelElementCSImpl.MODEL_ELEMENT_CS_FEATURE_COUNT + 1);

		usecasePostconditionCSEClass = createEClass(3);
		createEAttribute(usecasePostconditionCSEClass, ModelElementCSImpl.MODEL_ELEMENT_CS_FEATURE_COUNT + 0);
		createEReference(usecasePostconditionCSEClass, ModelElementCSImpl.MODEL_ELEMENT_CS_FEATURE_COUNT + 1);

		stepCSEClass = createEClass(4);
		createEReference(stepCSEClass, ModelElementCSImpl.MODEL_ELEMENT_CS_FEATURE_COUNT + 0);
		createEReference(stepCSEClass, ModelElementCSImpl.MODEL_ELEMENT_CS_FEATURE_COUNT + 1);
		createEAttribute(stepCSEClass, ModelElementCSImpl.MODEL_ELEMENT_CS_FEATURE_COUNT + 2);
		createEAttribute(stepCSEClass, ModelElementCSImpl.MODEL_ELEMENT_CS_FEATURE_COUNT + 3);

		extendCSEClass = createEClass(5);
		createEReference(extendCSEClass, ModelElementCSImpl.MODEL_ELEMENT_CS_FEATURE_COUNT + 0);
		createEReference(extendCSEClass, ModelElementCSImpl.MODEL_ELEMENT_CS_FEATURE_COUNT + 1);
		createEReference(extendCSEClass, ModelElementCSImpl.MODEL_ELEMENT_CS_FEATURE_COUNT + 2);

		extensionPointCSEClass = createEClass(6);
		createEAttribute(extensionPointCSEClass, ModelElementCSImpl.MODEL_ELEMENT_CS_FEATURE_COUNT + 0);
		createEReference(extensionPointCSEClass, ModelElementCSImpl.MODEL_ELEMENT_CS_FEATURE_COUNT + 1);
		createEReference(extensionPointCSEClass, ModelElementCSImpl.MODEL_ELEMENT_CS_FEATURE_COUNT + 2);
		createEReference(extensionPointCSEClass, ModelElementCSImpl.MODEL_ELEMENT_CS_FEATURE_COUNT + 3);
		createEAttribute(extensionPointCSEClass, ModelElementCSImpl.MODEL_ELEMENT_CS_FEATURE_COUNT + 4);

		altFlowCSEClass = createEClass(7);
		createEAttribute(altFlowCSEClass, ModelElementCSImpl.MODEL_ELEMENT_CS_FEATURE_COUNT + 0);
		createEAttribute(altFlowCSEClass, ModelElementCSImpl.MODEL_ELEMENT_CS_FEATURE_COUNT + 1);
		createEReference(altFlowCSEClass, ModelElementCSImpl.MODEL_ELEMENT_CS_FEATURE_COUNT + 2);
		createEReference(altFlowCSEClass, ModelElementCSImpl.MODEL_ELEMENT_CS_FEATURE_COUNT + 3);
		createEReference(altFlowCSEClass, ModelElementCSImpl.MODEL_ELEMENT_CS_FEATURE_COUNT + 4);

		snapshotPatternCSEClass = createEClass(8);
		createEAttribute(snapshotPatternCSEClass, ModelElementCSImpl.MODEL_ELEMENT_CS_FEATURE_COUNT + 0);
		createEAttribute(snapshotPatternCSEClass, ModelElementCSImpl.MODEL_ELEMENT_CS_FEATURE_COUNT + 1);
		createEReference(snapshotPatternCSEClass, ModelElementCSImpl.MODEL_ELEMENT_CS_FEATURE_COUNT + 2);
		createEReference(snapshotPatternCSEClass, ModelElementCSImpl.MODEL_ELEMENT_CS_FEATURE_COUNT + 3);
		createEReference(snapshotPatternCSEClass, ModelElementCSImpl.MODEL_ELEMENT_CS_FEATURE_COUNT + 4);
		createEReference(snapshotPatternCSEClass, ModelElementCSImpl.MODEL_ELEMENT_CS_FEATURE_COUNT + 5);

		objVarCSEClass = createEClass(9);
		createEAttribute(objVarCSEClass, ModelElementCSImpl.MODEL_ELEMENT_CS_FEATURE_COUNT + 0);
		createEReference(objVarCSEClass, ModelElementCSImpl.MODEL_ELEMENT_CS_FEATURE_COUNT + 1);
		createEAttribute(objVarCSEClass, ModelElementCSImpl.MODEL_ELEMENT_CS_FEATURE_COUNT + 2);

		varLinkCSEClass = createEClass(10);
		createEReference(varLinkCSEClass, ModelElementCSImpl.MODEL_ELEMENT_CS_FEATURE_COUNT + 0);
		createEReference(varLinkCSEClass, ModelElementCSImpl.MODEL_ELEMENT_CS_FEATURE_COUNT + 1);
		createEAttribute(varLinkCSEClass, ModelElementCSImpl.MODEL_ELEMENT_CS_FEATURE_COUNT + 2);

		associationCSEClass = createEClass(11);
		createEAttribute(associationCSEClass, ModelElementCSImpl.MODEL_ELEMENT_CS_FEATURE_COUNT + 0);
		createEReference(associationCSEClass, ModelElementCSImpl.MODEL_ELEMENT_CS_FEATURE_COUNT + 1);

		constraintCSEClass = createEClass(12);
		createEReference(constraintCSEClass, ModelElementCSImpl.MODEL_ELEMENT_CS_FEATURE_COUNT + 0);

		actorCSEClass = createEClass(13);
		createEAttribute(actorCSEClass, ModelElementCSImpl.MODEL_ELEMENT_CS_FEATURE_COUNT + 0);
		createEAttribute(actorCSEClass, ModelElementCSImpl.MODEL_ELEMENT_CS_FEATURE_COUNT + 1);

		actionCSEClass = createEClass(14);
		createEAttribute(actionCSEClass, ModelElementCSImpl.MODEL_ELEMENT_CS_FEATURE_COUNT + 0);
		createEAttribute(actionCSEClass, ModelElementCSImpl.MODEL_ELEMENT_CS_FEATURE_COUNT + 1);
		createEReference(actionCSEClass, ModelElementCSImpl.MODEL_ELEMENT_CS_FEATURE_COUNT + 2);
		createEReference(actionCSEClass, ModelElementCSImpl.MODEL_ELEMENT_CS_FEATURE_COUNT + 3);
		createEReference(actionCSEClass, ModelElementCSImpl.MODEL_ELEMENT_CS_FEATURE_COUNT + 4);

		actorActionCSEClass = createEClass(15);

		systemActionCSEClass = createEClass(16);

		rejoinStepCSEClass = createEClass(17);
		createEReference(rejoinStepCSEClass, ModelElementCSImpl.MODEL_ELEMENT_CS_FEATURE_COUNT + 4);
		createEReference(rejoinStepCSEClass, ModelElementCSImpl.MODEL_ELEMENT_CS_FEATURE_COUNT + 5);

		ucStepCSEClass = createEClass(18);
		createEReference(ucStepCSEClass, ModelElementCSImpl.MODEL_ELEMENT_CS_FEATURE_COUNT + 4);

		assocEndCSEClass = createEClass(19);

		actStepCSEClass = createEClass(20);
		createEReference(actStepCSEClass, ModelElementCSImpl.MODEL_ELEMENT_CS_FEATURE_COUNT + 4);
		createEReference(actStepCSEClass, ModelElementCSImpl.MODEL_ELEMENT_CS_FEATURE_COUNT + 5);
		createEReference(actStepCSEClass, ModelElementCSImpl.MODEL_ELEMENT_CS_FEATURE_COUNT + 6);
		createEAttribute(actStepCSEClass, ModelElementCSImpl.MODEL_ELEMENT_CS_FEATURE_COUNT + 7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents()
	{
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		BaseCSPackage theBaseCSPackage = (BaseCSPackage)EPackage.Registry.INSTANCE.getEPackage(BaseCSPackage.eNS_URI);
		OCLinEcoreCSPackage theOCLinEcoreCSPackage = (OCLinEcoreCSPackage)EPackage.Registry.INSTANCE.getEPackage(OCLinEcoreCSPackage.eNS_URI);
		PivotPackage thePivotPackage = (PivotPackage)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI);
		EssentialOCLCSPackage theEssentialOCLCSPackage = (EssentialOCLCSPackage)EPackage.Registry.INSTANCE.getEPackage(EssentialOCLCSPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		frslModelCSEClass.getESuperTypes().add(theBaseCSPackage.getRootCS());
		usecaseCSEClass.getESuperTypes().add(theBaseCSPackage.getModelElementCS());
		usecasePreconditionCSEClass.getESuperTypes().add(theBaseCSPackage.getModelElementCS());
		usecasePostconditionCSEClass.getESuperTypes().add(theBaseCSPackage.getModelElementCS());
		stepCSEClass.getESuperTypes().add(theBaseCSPackage.getModelElementCS());
		extendCSEClass.getESuperTypes().add(theBaseCSPackage.getModelElementCS());
		extensionPointCSEClass.getESuperTypes().add(theBaseCSPackage.getModelElementCS());
		altFlowCSEClass.getESuperTypes().add(theBaseCSPackage.getModelElementCS());
		snapshotPatternCSEClass.getESuperTypes().add(theBaseCSPackage.getModelElementCS());
		objVarCSEClass.getESuperTypes().add(theBaseCSPackage.getModelElementCS());
		varLinkCSEClass.getESuperTypes().add(theBaseCSPackage.getModelElementCS());
		associationCSEClass.getESuperTypes().add(theBaseCSPackage.getModelElementCS());
		constraintCSEClass.getESuperTypes().add(theBaseCSPackage.getModelElementCS());
		actorCSEClass.getESuperTypes().add(theBaseCSPackage.getModelElementCS());
		actionCSEClass.getESuperTypes().add(theBaseCSPackage.getModelElementCS());
		actorActionCSEClass.getESuperTypes().add(this.getActionCS());
		systemActionCSEClass.getESuperTypes().add(this.getActionCS());
		rejoinStepCSEClass.getESuperTypes().add(this.getStepCS());
		ucStepCSEClass.getESuperTypes().add(this.getStepCS());
		assocEndCSEClass.getESuperTypes().add(theBaseCSPackage.getReferenceCS());
		actStepCSEClass.getESuperTypes().add(this.getStepCS());

		// Initialize classes and features; add operations and parameters
		initEClass(frslModelCSEClass, FrslModelCS.class, "FrslModelCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFrslModelCS_Usecases(), this.getUsecaseCS(), null, "usecases", null, 0, -1, FrslModelCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFrslModelCS_UcExtends(), this.getExtendCS(), null, "ucExtends", null, 0, -1, FrslModelCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFrslModelCS_DomainModel(), theOCLinEcoreCSPackage.getTopLevelCS(), null, "domainModel", null, 0, 1, FrslModelCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFrslModelCS_Assocs(), this.getAssociationCS(), null, "assocs", null, 0, -1, FrslModelCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFrslModelCS_Actors(), this.getActorCS(), null, "actors", null, 0, -1, FrslModelCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(usecaseCSEClass, UsecaseCS.class, "UsecaseCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUsecaseCS_Name(), ecorePackage.getEString(), "name", null, 0, 1, UsecaseCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUsecaseCS_Description(), ecorePackage.getEString(), "description", null, 0, 1, UsecaseCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUsecaseCS_PrimaryActor(), theBaseCSPackage.getModelElementRefCS(), null, "primaryActor", null, 0, 1, UsecaseCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUsecaseCS_SecondaryActors(), theBaseCSPackage.getModelElementRefCS(), null, "secondaryActors", null, 0, -1, UsecaseCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUsecaseCS_Precondition(), this.getUsecasePreconditionCS(), null, "precondition", null, 0, 1, UsecaseCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUsecaseCS_Postcondition(), this.getUsecasePostconditionCS(), null, "postcondition", null, 0, 1, UsecaseCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUsecaseCS_FirstStep(), this.getStepCS(), null, "firstStep", null, 0, 1, UsecaseCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUsecaseCS_ExtPoints(), this.getExtensionPointCS(), null, "extPoints", null, 0, -1, UsecaseCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(usecasePreconditionCSEClass, UsecasePreconditionCS.class, "UsecasePreconditionCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUsecasePreconditionCS_Description(), ecorePackage.getEString(), "description", null, 0, 1, UsecasePreconditionCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUsecasePreconditionCS_Snapshot(), this.getSnapshotPatternCS(), null, "snapshot", null, 0, 1, UsecasePreconditionCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(usecasePostconditionCSEClass, UsecasePostconditionCS.class, "UsecasePostconditionCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUsecasePostconditionCS_Description(), ecorePackage.getEString(), "description", null, 0, 1, UsecasePostconditionCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUsecasePostconditionCS_Snapshot(), this.getSnapshotPatternCS(), null, "snapshot", null, 0, 1, UsecasePostconditionCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stepCSEClass, StepCS.class, "StepCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStepCS_NextStep(), this.getStepCS(), null, "nextStep", null, 0, 1, StepCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStepCS_AltFlows(), this.getAltFlowCS(), null, "altFlows", null, 0, -1, StepCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStepCS_Name(), ecorePackage.getEString(), "name", null, 0, 1, StepCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStepCS_Description(), ecorePackage.getEString(), "description", null, 0, 1, StepCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(extendCSEClass, ExtendCS.class, "ExtendCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExtendCS_ExtendedUC(), theBaseCSPackage.getModelElementRefCS(), null, "extendedUC", null, 1, 1, ExtendCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtendCS_Extension(), theBaseCSPackage.getModelElementRefCS(), null, "extension", null, 1, 1, ExtendCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtendCS_ExtPoints(), theBaseCSPackage.getModelElementRefCS(), null, "extPoints", null, 1, -1, ExtendCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(extensionPointCSEClass, ExtensionPointCS.class, "ExtensionPointCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExtensionPointCS_Name(), ecorePackage.getEString(), "name", null, 0, 1, ExtensionPointCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtensionPointCS_Locations(), theBaseCSPackage.getModelElementRefCS(), null, "locations", null, 0, -1, ExtensionPointCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtensionPointCS_Condition(), this.getSnapshotPatternCS(), null, "condition", null, 0, 1, ExtensionPointCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtensionPointCS_Extends(), this.getExtendCS(), null, "extends", null, 0, -1, ExtensionPointCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExtensionPointCS_Description(), ecorePackage.getEString(), "description", null, 0, 1, ExtensionPointCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(altFlowCSEClass, AltFlowCS.class, "AltFlowCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAltFlowCS_Name(), ecorePackage.getEString(), "name", null, 0, 1, AltFlowCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAltFlowCS_Description(), ecorePackage.getEString(), "description", null, 0, 1, AltFlowCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAltFlowCS_Condition(), this.getSnapshotPatternCS(), null, "condition", null, 0, 1, AltFlowCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAltFlowCS_BaseStep(), theBaseCSPackage.getModelElementRefCS(), null, "baseStep", null, 1, 1, AltFlowCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAltFlowCS_AltStep(), this.getStepCS(), null, "altStep", null, 1, 1, AltFlowCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(snapshotPatternCSEClass, SnapshotPatternCS.class, "SnapshotPatternCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSnapshotPatternCS_Name(), ecorePackage.getEString(), "name", null, 0, 1, SnapshotPatternCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSnapshotPatternCS_Description(), ecorePackage.getEString(), "description", null, 0, 1, SnapshotPatternCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSnapshotPatternCS_Objects(), this.getObjVarCS(), null, "objects", null, 0, -1, SnapshotPatternCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSnapshotPatternCS_NegObjects(), theBaseCSPackage.getModelElementRefCS(), null, "negObjects", null, 0, -1, SnapshotPatternCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSnapshotPatternCS_Links(), this.getVarLinkCS(), null, "links", null, 0, -1, SnapshotPatternCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSnapshotPatternCS_Constraints(), this.getConstraintCS(), null, "constraints", null, 0, -1, SnapshotPatternCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objVarCSEClass, ObjVarCS.class, "ObjVarCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getObjVarCS_Name(), ecorePackage.getEString(), "name", null, 0, 1, ObjVarCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjVarCS_Type(), theBaseCSPackage.getTypedRefCS(), null, "type", null, 0, 1, ObjVarCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjVarCS_IsMatched(), ecorePackage.getEBoolean(), "isMatched", null, 0, 1, ObjVarCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(varLinkCSEClass, VarLinkCS.class, "VarLinkCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVarLinkCS_ObjVars(), theBaseCSPackage.getModelElementRefCS(), null, "objVars", null, 2, 2, VarLinkCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVarLinkCS_Assoc(), theBaseCSPackage.getModelElementRefCS(), null, "assoc", null, 1, 1, VarLinkCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVarLinkCS_IsNeg(), thePivotPackage.getBoolean(), "isNeg", null, 0, 1, VarLinkCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(associationCSEClass, AssociationCS.class, "AssociationCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssociationCS_Name(), ecorePackage.getEString(), "name", null, 0, 1, AssociationCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssociationCS_AssocEnds(), theBaseCSPackage.getReferenceCS(), null, "assocEnds", null, 0, -1, AssociationCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constraintCSEClass, ConstraintCS.class, "ConstraintCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstraintCS_ConstrExpr(), theEssentialOCLCSPackage.getExpSpecificationCS(), null, "constrExpr", null, 1, 1, ConstraintCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actorCSEClass, ActorCS.class, "ActorCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActorCS_Name(), ecorePackage.getEString(), "name", null, 0, 1, ActorCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActorCS_Description(), ecorePackage.getEString(), "description", null, 0, 1, ActorCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionCSEClass, ActionCS.class, "ActionCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActionCS_Type(), ecorePackage.getEString(), "type", null, 0, 1, ActionCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActionCS_Description(), ecorePackage.getEString(), "description", null, 0, 1, ActionCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActionCS_Actor(), theBaseCSPackage.getModelElementRefCS(), null, "actor", null, 0, 1, ActionCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActionCS_ObjVars(), this.getObjVarCS(), null, "objVars", null, 0, -1, ActionCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActionCS_Values(), theEssentialOCLCSPackage.getExpSpecificationCS(), null, "values", null, 0, -1, ActionCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actorActionCSEClass, ActorActionCS.class, "ActorActionCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(systemActionCSEClass, SystemActionCS.class, "SystemActionCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rejoinStepCSEClass, RejoinStepCS.class, "RejoinStepCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRejoinStepCS_Condition(), this.getSnapshotPatternCS(), null, "condition", null, 0, 1, RejoinStepCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRejoinStepCS_RejoinTo(), theBaseCSPackage.getModelElementRefCS(), null, "rejoinTo", null, 1, 1, RejoinStepCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ucStepCSEClass, UCStepCS.class, "UCStepCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUCStepCS_IncludedUC(), theBaseCSPackage.getModelElementRefCS(), null, "includedUC", null, 1, 1, UCStepCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assocEndCSEClass, AssocEndCS.class, "AssocEndCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(actStepCSEClass, ActStepCS.class, "ActStepCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActStepCS_PreSnapshot(), this.getSnapshotPatternCS(), null, "preSnapshot", null, 0, 1, ActStepCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActStepCS_PostSnapshot(), this.getSnapshotPatternCS(), null, "postSnapshot", null, 0, 1, ActStepCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActStepCS_Actions(), this.getActionCS(), null, "actions", null, 0, -1, ActStepCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActStepCS_IsActorStep(), thePivotPackage.getBoolean(), "isActorStep", null, 0, 1, ActStepCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //FrslCSPackageImpl
