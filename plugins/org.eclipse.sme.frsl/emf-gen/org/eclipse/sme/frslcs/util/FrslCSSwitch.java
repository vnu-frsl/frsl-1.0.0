/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.sme.frslcs.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.sme.frslcs.FrslCSPackage
 * @generated
 */
public class FrslCSSwitch<@Nullable T> extends Switch<T>
{
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FrslCSPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrslCSSwitch()
	{
		if (modelPackage == null)
		{
			modelPackage = FrslCSPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage)
	{
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject)
	{
		switch (classifierID)
		{
			case 0:
			{
				FrslModelCS frslModelCS = (FrslModelCS)theEObject;
				T result = caseFrslModelCS(frslModelCS);
				if (result == null) result = caseRootCS(frslModelCS);
				if (result == null) result = caseModelElementCS(frslModelCS);
				if (result == null) result = casePivotableElementCS(frslModelCS);
				if (result == null) result = caseElementCS(frslModelCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case 1:
			{
				UsecaseCS usecaseCS = (UsecaseCS)theEObject;
				T result = caseUsecaseCS(usecaseCS);
				if (result == null) result = caseModelElementCS(usecaseCS);
				if (result == null) result = casePivotableElementCS(usecaseCS);
				if (result == null) result = caseElementCS(usecaseCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case 2:
			{
				UsecasePreconditionCS usecasePreconditionCS = (UsecasePreconditionCS)theEObject;
				T result = caseUsecasePreconditionCS(usecasePreconditionCS);
				if (result == null) result = caseModelElementCS(usecasePreconditionCS);
				if (result == null) result = casePivotableElementCS(usecasePreconditionCS);
				if (result == null) result = caseElementCS(usecasePreconditionCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case 3:
			{
				UsecasePostconditionCS usecasePostconditionCS = (UsecasePostconditionCS)theEObject;
				T result = caseUsecasePostconditionCS(usecasePostconditionCS);
				if (result == null) result = caseModelElementCS(usecasePostconditionCS);
				if (result == null) result = casePivotableElementCS(usecasePostconditionCS);
				if (result == null) result = caseElementCS(usecasePostconditionCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case 4:
			{
				StepCS stepCS = (StepCS)theEObject;
				T result = caseStepCS(stepCS);
				if (result == null) result = caseModelElementCS(stepCS);
				if (result == null) result = casePivotableElementCS(stepCS);
				if (result == null) result = caseElementCS(stepCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case 5:
			{
				ExtendCS extendCS = (ExtendCS)theEObject;
				T result = caseExtendCS(extendCS);
				if (result == null) result = caseModelElementCS(extendCS);
				if (result == null) result = casePivotableElementCS(extendCS);
				if (result == null) result = caseElementCS(extendCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case 6:
			{
				ExtensionPointCS extensionPointCS = (ExtensionPointCS)theEObject;
				T result = caseExtensionPointCS(extensionPointCS);
				if (result == null) result = caseModelElementCS(extensionPointCS);
				if (result == null) result = casePivotableElementCS(extensionPointCS);
				if (result == null) result = caseElementCS(extensionPointCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case 7:
			{
				AltFlowCS altFlowCS = (AltFlowCS)theEObject;
				T result = caseAltFlowCS(altFlowCS);
				if (result == null) result = caseModelElementCS(altFlowCS);
				if (result == null) result = casePivotableElementCS(altFlowCS);
				if (result == null) result = caseElementCS(altFlowCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case 8:
			{
				SnapshotPatternCS snapshotPatternCS = (SnapshotPatternCS)theEObject;
				T result = caseSnapshotPatternCS(snapshotPatternCS);
				if (result == null) result = caseModelElementCS(snapshotPatternCS);
				if (result == null) result = casePivotableElementCS(snapshotPatternCS);
				if (result == null) result = caseElementCS(snapshotPatternCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case 9:
			{
				ObjVarCS objVarCS = (ObjVarCS)theEObject;
				T result = caseObjVarCS(objVarCS);
				if (result == null) result = caseModelElementCS(objVarCS);
				if (result == null) result = casePivotableElementCS(objVarCS);
				if (result == null) result = caseElementCS(objVarCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case 10:
			{
				VarLinkCS varLinkCS = (VarLinkCS)theEObject;
				T result = caseVarLinkCS(varLinkCS);
				if (result == null) result = caseModelElementCS(varLinkCS);
				if (result == null) result = casePivotableElementCS(varLinkCS);
				if (result == null) result = caseElementCS(varLinkCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case 11:
			{
				AssociationCS associationCS = (AssociationCS)theEObject;
				T result = caseAssociationCS(associationCS);
				if (result == null) result = caseModelElementCS(associationCS);
				if (result == null) result = casePivotableElementCS(associationCS);
				if (result == null) result = caseElementCS(associationCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case 12:
			{
				ConstraintCS constraintCS = (ConstraintCS)theEObject;
				T result = caseConstraintCS(constraintCS);
				if (result == null) result = caseModelElementCS(constraintCS);
				if (result == null) result = casePivotableElementCS(constraintCS);
				if (result == null) result = caseElementCS(constraintCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case 13:
			{
				ActorCS actorCS = (ActorCS)theEObject;
				T result = caseActorCS(actorCS);
				if (result == null) result = caseModelElementCS(actorCS);
				if (result == null) result = casePivotableElementCS(actorCS);
				if (result == null) result = caseElementCS(actorCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case 14:
			{
				ActionCS actionCS = (ActionCS)theEObject;
				T result = caseActionCS(actionCS);
				if (result == null) result = caseModelElementCS(actionCS);
				if (result == null) result = casePivotableElementCS(actionCS);
				if (result == null) result = caseElementCS(actionCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case 15:
			{
				ActorActionCS actorActionCS = (ActorActionCS)theEObject;
				T result = caseActorActionCS(actorActionCS);
				if (result == null) result = caseActionCS(actorActionCS);
				if (result == null) result = caseModelElementCS(actorActionCS);
				if (result == null) result = casePivotableElementCS(actorActionCS);
				if (result == null) result = caseElementCS(actorActionCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case 16:
			{
				SystemActionCS systemActionCS = (SystemActionCS)theEObject;
				T result = caseSystemActionCS(systemActionCS);
				if (result == null) result = caseActionCS(systemActionCS);
				if (result == null) result = caseModelElementCS(systemActionCS);
				if (result == null) result = casePivotableElementCS(systemActionCS);
				if (result == null) result = caseElementCS(systemActionCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case 17:
			{
				RejoinStepCS rejoinStepCS = (RejoinStepCS)theEObject;
				T result = caseRejoinStepCS(rejoinStepCS);
				if (result == null) result = caseStepCS(rejoinStepCS);
				if (result == null) result = caseModelElementCS(rejoinStepCS);
				if (result == null) result = casePivotableElementCS(rejoinStepCS);
				if (result == null) result = caseElementCS(rejoinStepCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case 18:
			{
				UCStepCS ucStepCS = (UCStepCS)theEObject;
				T result = caseUCStepCS(ucStepCS);
				if (result == null) result = caseStepCS(ucStepCS);
				if (result == null) result = caseModelElementCS(ucStepCS);
				if (result == null) result = casePivotableElementCS(ucStepCS);
				if (result == null) result = caseElementCS(ucStepCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case 19:
			{
				AssocEndCS assocEndCS = (AssocEndCS)theEObject;
				T result = caseAssocEndCS(assocEndCS);
				if (result == null) result = caseReferenceCS(assocEndCS);
				if (result == null) result = caseStructuralFeatureCS(assocEndCS);
				if (result == null) result = caseFeatureCS(assocEndCS);
				if (result == null) result = caseTypedElementCS(assocEndCS);
				if (result == null) result = caseNamedElementCS(assocEndCS);
				if (result == null) result = caseModelElementCS(assocEndCS);
				if (result == null) result = casePivotableElementCS(assocEndCS);
				if (result == null) result = caseElementCS(assocEndCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case 20:
			{
				ActStepCS actStepCS = (ActStepCS)theEObject;
				T result = caseActStepCS(actStepCS);
				if (result == null) result = caseStepCS(actStepCS);
				if (result == null) result = caseModelElementCS(actStepCS);
				if (result == null) result = casePivotableElementCS(actStepCS);
				if (result == null) result = caseElementCS(actStepCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Frsl Model CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Frsl Model CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFrslModelCS(FrslModelCS object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Usecase CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Usecase CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUsecaseCS(UsecaseCS object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Usecase Precondition CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Usecase Precondition CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUsecasePreconditionCS(UsecasePreconditionCS object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Usecase Postcondition CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Usecase Postcondition CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUsecasePostconditionCS(UsecasePostconditionCS object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Step CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Step CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStepCS(StepCS object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extend CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extend CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtendCS(ExtendCS object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extension Point CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extension Point CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtensionPointCS(ExtensionPointCS object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alt Flow CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alt Flow CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAltFlowCS(AltFlowCS object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Snapshot Pattern CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Snapshot Pattern CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSnapshotPatternCS(SnapshotPatternCS object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Obj Var CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Obj Var CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjVarCS(ObjVarCS object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Var Link CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Var Link CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVarLinkCS(VarLinkCS object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociationCS(AssociationCS object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraintCS(ConstraintCS object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actor CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actor CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActorCS(ActorCS object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionCS(ActionCS object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actor Action CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actor Action CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActorActionCS(ActorActionCS object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Action CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Action CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemActionCS(SystemActionCS object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rejoin Step CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rejoin Step CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRejoinStepCS(RejoinStepCS object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UC Step CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UC Step CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUCStepCS(UCStepCS object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assoc End CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assoc End CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssocEndCS(AssocEndCS object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Act Step CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Act Step CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActStepCS(ActStepCS object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementCS(ElementCS object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pivotable Element CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pivotable Element CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePivotableElementCS(PivotableElementCS object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Element CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Element CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelElementCS(ModelElementCS object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRootCS(RootCS object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElementCS(NamedElementCS object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Typed Element CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typed Element CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypedElementCS(TypedElementCS object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureCS(FeatureCS object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structural Feature CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structural Feature CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructuralFeatureCS(StructuralFeatureCS object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceCS(ReferenceCS object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object)
	{
		return null;
	}

} //FrslCSSwitch
