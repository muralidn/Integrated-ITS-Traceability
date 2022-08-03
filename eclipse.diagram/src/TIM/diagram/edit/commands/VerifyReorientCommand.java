/*
 * 
 */
package TIM.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import TIM.FunctionalRequirement;
import TIM.GlobalTraceModel;
import TIM.Test;
import TIM.Verify;
import TIM.diagram.edit.policies.TIMBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class VerifyReorientCommand extends EditElementCommand {

	/**
	* @generated
	*/
	private final int reorientDirection;

	/**
	* @generated
	*/
	private final EObject oldEnd;

	/**
	* @generated
	*/
	private final EObject newEnd;

	/**
	* @generated
	*/
	public VerifyReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	* @generated
	*/
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof Verify) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof FunctionalRequirement && newEnd instanceof FunctionalRequirement)) {
			return false;
		}
		Test target = getLink().getDestination();
		if (!(getLink().eContainer() instanceof GlobalTraceModel)) {
			return false;
		}
		GlobalTraceModel container = (GlobalTraceModel) getLink().eContainer();
		return TIMBaseItemSemanticEditPolicy.getLinkConstraints().canExistVerify_4003(container, getLink(),
				getNewSource(), target);
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Test && newEnd instanceof Test)) {
			return false;
		}
		FunctionalRequirement source = getLink().getSource();
		if (!(getLink().eContainer() instanceof GlobalTraceModel)) {
			return false;
		}
		GlobalTraceModel container = (GlobalTraceModel) getLink().eContainer();
		return TIMBaseItemSemanticEditPolicy.getLinkConstraints().canExistVerify_4003(container, getLink(), source,
				getNewTarget());
	}

	/**
	* @generated
	*/
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException("Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	* @generated
	*/
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setSource(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	* @generated
	*/
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setDestination(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	* @generated
	*/
	protected Verify getLink() {
		return (Verify) getElementToEdit();
	}

	/**
	* @generated
	*/
	protected FunctionalRequirement getOldSource() {
		return (FunctionalRequirement) oldEnd;
	}

	/**
	* @generated
	*/
	protected FunctionalRequirement getNewSource() {
		return (FunctionalRequirement) newEnd;
	}

	/**
	* @generated
	*/
	protected Test getOldTarget() {
		return (Test) oldEnd;
	}

	/**
	* @generated
	*/
	protected Test getNewTarget() {
		return (Test) newEnd;
	}
}
