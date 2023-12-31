/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.sme.frslcs.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.jdt.annotation.Nullable;

import org.eclipse.ocl.xtext.basecs.ElementCS;
import org.eclipse.ocl.xtext.basecs.FeatureCS;
import org.eclipse.ocl.xtext.basecs.ModelElementCS;
import org.eclipse.ocl.xtext.basecs.NamedElementCS;
import org.eclipse.ocl.xtext.basecs.PivotableElementCS;
import org.eclipse.ocl.xtext.basecs.ReferenceCS;
import org.eclipse.ocl.xtext.basecs.RootCS;
import org.eclipse.ocl.xtext.basecs.StructuralFeatureCS;
import org.eclipse.ocl.xtext.basecs.TypedElementCS;
import org.eclipse.sme.frslcs.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.sme.frslcs.FrslCSPackage
 * @generated
 */
public class FrslCSAdapterFactory extends AdapterFactoryImpl
{
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FrslCSPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrslCSAdapterFactory()
	{
		if (modelPackage == null)
		{
			modelPackage = FrslCSPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object)
	{
		if (object == modelPackage)
		{
			return true;
		}
		if (object instanceof EObject)
		{
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FrslCSSwitch<@Nullable Adapter> modelSwitch =
		new FrslCSSwitch<@Nullable Adapter>()
		{
			@Override
			public Adapter caseFrslModelCS(FrslModelCS object)
			{
				return createFrslModelCSAdapter();
			}
			@Override
			public Adapter caseUsecaseCS(UsecaseCS object)
			{
				return createUsecaseCSAdapter();
			}
			@Override
			public Adapter caseUsecasePreconditionCS(UsecasePreconditionCS object)
			{
				return createUsecasePreconditionCSAdapter();
			}
			@Override
			public Adapter caseUsecasePostconditionCS(UsecasePostconditionCS object)
			{
				return createUsecasePostconditionCSAdapter();
			}
			@Override
			public Adapter caseStepCS(StepCS object)
			{
				return createStepCSAdapter();
			}
			@Override
			public Adapter caseExtendCS(ExtendCS object)
			{
				return createExtendCSAdapter();
			}
			@Override
			public Adapter caseExtensionPointCS(ExtensionPointCS object)
			{
				return createExtensionPointCSAdapter();
			}
			@Override
			public Adapter caseAltFlowCS(AltFlowCS object)
			{
				return createAltFlowCSAdapter();
			}
			@Override
			public Adapter caseSnapshotPatternCS(SnapshotPatternCS object)
			{
				return createSnapshotPatternCSAdapter();
			}
			@Override
			public Adapter caseObjVarCS(ObjVarCS object)
			{
				return createObjVarCSAdapter();
			}
			@Override
			public Adapter caseVarLinkCS(VarLinkCS object)
			{
				return createVarLinkCSAdapter();
			}
			@Override
			public Adapter caseAssociationCS(AssociationCS object)
			{
				return createAssociationCSAdapter();
			}
			@Override
			public Adapter caseConstraintCS(ConstraintCS object)
			{
				return createConstraintCSAdapter();
			}
			@Override
			public Adapter caseActorCS(ActorCS object)
			{
				return createActorCSAdapter();
			}
			@Override
			public Adapter caseActionCS(ActionCS object)
			{
				return createActionCSAdapter();
			}
			@Override
			public Adapter caseActorActionCS(ActorActionCS object)
			{
				return createActorActionCSAdapter();
			}
			@Override
			public Adapter caseSystemActionCS(SystemActionCS object)
			{
				return createSystemActionCSAdapter();
			}
			@Override
			public Adapter caseRejoinStepCS(RejoinStepCS object)
			{
				return createRejoinStepCSAdapter();
			}
			@Override
			public Adapter caseUCStepCS(UCStepCS object)
			{
				return createUCStepCSAdapter();
			}
			@Override
			public Adapter caseAssocEndCS(AssocEndCS object)
			{
				return createAssocEndCSAdapter();
			}
			@Override
			public Adapter caseActStepCS(ActStepCS object)
			{
				return createActStepCSAdapter();
			}
			@Override
			public Adapter caseElementCS(ElementCS object)
			{
				return createElementCSAdapter();
			}
			@Override
			public Adapter casePivotableElementCS(PivotableElementCS object)
			{
				return createPivotableElementCSAdapter();
			}
			@Override
			public Adapter caseModelElementCS(ModelElementCS object)
			{
				return createModelElementCSAdapter();
			}
			@Override
			public Adapter caseRootCS(RootCS object)
			{
				return createRootCSAdapter();
			}
			@Override
			public Adapter caseNamedElementCS(NamedElementCS object)
			{
				return createNamedElementCSAdapter();
			}
			@Override
			public Adapter caseTypedElementCS(TypedElementCS object)
			{
				return createTypedElementCSAdapter();
			}
			@Override
			public Adapter caseFeatureCS(FeatureCS object)
			{
				return createFeatureCSAdapter();
			}
			@Override
			public Adapter caseStructuralFeatureCS(StructuralFeatureCS object)
			{
				return createStructuralFeatureCSAdapter();
			}
			@Override
			public Adapter caseReferenceCS(ReferenceCS object)
			{
				return createReferenceCSAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object)
			{
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target)
	{
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sme.frslcs.FrslModelCS <em>Frsl Model CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sme.frslcs.FrslModelCS
	 * @generated
	 */
	public Adapter createFrslModelCSAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sme.frslcs.UsecaseCS <em>Usecase CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sme.frslcs.UsecaseCS
	 * @generated
	 */
	public Adapter createUsecaseCSAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sme.frslcs.UsecasePreconditionCS <em>Usecase Precondition CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sme.frslcs.UsecasePreconditionCS
	 * @generated
	 */
	public Adapter createUsecasePreconditionCSAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sme.frslcs.UsecasePostconditionCS <em>Usecase Postcondition CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sme.frslcs.UsecasePostconditionCS
	 * @generated
	 */
	public Adapter createUsecasePostconditionCSAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sme.frslcs.StepCS <em>Step CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sme.frslcs.StepCS
	 * @generated
	 */
	public Adapter createStepCSAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sme.frslcs.ExtendCS <em>Extend CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sme.frslcs.ExtendCS
	 * @generated
	 */
	public Adapter createExtendCSAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sme.frslcs.ExtensionPointCS <em>Extension Point CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sme.frslcs.ExtensionPointCS
	 * @generated
	 */
	public Adapter createExtensionPointCSAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sme.frslcs.AltFlowCS <em>Alt Flow CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sme.frslcs.AltFlowCS
	 * @generated
	 */
	public Adapter createAltFlowCSAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sme.frslcs.SnapshotPatternCS <em>Snapshot Pattern CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sme.frslcs.SnapshotPatternCS
	 * @generated
	 */
	public Adapter createSnapshotPatternCSAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sme.frslcs.ObjVarCS <em>Obj Var CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sme.frslcs.ObjVarCS
	 * @generated
	 */
	public Adapter createObjVarCSAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sme.frslcs.VarLinkCS <em>Var Link CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sme.frslcs.VarLinkCS
	 * @generated
	 */
	public Adapter createVarLinkCSAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sme.frslcs.AssociationCS <em>Association CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sme.frslcs.AssociationCS
	 * @generated
	 */
	public Adapter createAssociationCSAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sme.frslcs.ConstraintCS <em>Constraint CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sme.frslcs.ConstraintCS
	 * @generated
	 */
	public Adapter createConstraintCSAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sme.frslcs.ActorCS <em>Actor CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sme.frslcs.ActorCS
	 * @generated
	 */
	public Adapter createActorCSAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sme.frslcs.ActionCS <em>Action CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sme.frslcs.ActionCS
	 * @generated
	 */
	public Adapter createActionCSAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sme.frslcs.ActorActionCS <em>Actor Action CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sme.frslcs.ActorActionCS
	 * @generated
	 */
	public Adapter createActorActionCSAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sme.frslcs.SystemActionCS <em>System Action CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sme.frslcs.SystemActionCS
	 * @generated
	 */
	public Adapter createSystemActionCSAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sme.frslcs.RejoinStepCS <em>Rejoin Step CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sme.frslcs.RejoinStepCS
	 * @generated
	 */
	public Adapter createRejoinStepCSAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sme.frslcs.UCStepCS <em>UC Step CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sme.frslcs.UCStepCS
	 * @generated
	 */
	public Adapter createUCStepCSAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sme.frslcs.AssocEndCS <em>Assoc End CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sme.frslcs.AssocEndCS
	 * @generated
	 */
	public Adapter createAssocEndCSAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.sme.frslcs.ActStepCS <em>Act Step CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.sme.frslcs.ActStepCS
	 * @generated
	 */
	public Adapter createActStepCSAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.xtext.basecs.ElementCS <em>Element CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.xtext.basecs.ElementCS
	 * @generated
	 */
	public Adapter createElementCSAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.xtext.basecs.PivotableElementCS <em>Pivotable Element CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.xtext.basecs.PivotableElementCS
	 * @generated
	 */
	public Adapter createPivotableElementCSAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.xtext.basecs.ModelElementCS <em>Model Element CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.xtext.basecs.ModelElementCS
	 * @generated
	 */
	public Adapter createModelElementCSAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.xtext.basecs.RootCS <em>Root CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.xtext.basecs.RootCS
	 * @generated
	 */
	public Adapter createRootCSAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.xtext.basecs.NamedElementCS <em>Named Element CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.xtext.basecs.NamedElementCS
	 * @generated
	 */
	public Adapter createNamedElementCSAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.xtext.basecs.TypedElementCS <em>Typed Element CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.xtext.basecs.TypedElementCS
	 * @generated
	 */
	public Adapter createTypedElementCSAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.xtext.basecs.FeatureCS <em>Feature CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.xtext.basecs.FeatureCS
	 * @generated
	 */
	public Adapter createFeatureCSAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.xtext.basecs.StructuralFeatureCS <em>Structural Feature CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.xtext.basecs.StructuralFeatureCS
	 * @generated
	 */
	public Adapter createStructuralFeatureCSAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.xtext.basecs.ReferenceCS <em>Reference CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.xtext.basecs.ReferenceCS
	 * @generated
	 */
	public Adapter createReferenceCSAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter()
	{
		return null;
	}

} //FrslCSAdapterFactory
