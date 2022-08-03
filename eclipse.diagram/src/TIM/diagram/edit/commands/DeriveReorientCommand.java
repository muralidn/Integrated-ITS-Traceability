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

import TIM.Derive;
import TIM.FunctionalRequirement;
import TIM.GlobalTraceModel;
import TIM.SystemRequirement;
import TIM.diagram.edit.policies.TIMBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class DeriveReorientCommand extends EditElementCommand {

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
	public DeriveReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	* @generated
	*/
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof Derive) {
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
		if (!(oldEnd instanceof SystemRequirement && newEnd instanceof SystemRequirement)) {
			return false;
		}
		FunctionalRequirement target = getLink().getDestination();
		if (!(getLink().eContainer() instanceof GlobalTraceModel)) {
			return false;
		}
		GlobalTraceModel container = (GlobalTraceModel) getLink().eContainer();
		return TIMBaseItemSemanticEditPolicy.getLinkConstraints().canExistDerive_4001(container, getLink(),
				getNewSource(), target);
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof FunctionalRequirement && newEnd instanceof FunctionalRequirement)) {
			return false;
		}
		SystemRequirement source = getLink().getSource();
		if (!(getLink().eContainer() instanceof GlobalTraceModel)) {
			return false;
		}
		GlobalTraceModel container = (GlobalTraceModel) getLink().eContainer();
		return TIMBaseItemSemanticEditPolicy.getLinkConstraints().canExistDerive_4001(container, getLink(), source,
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
	protected Derive getLink() {
		return (Derive) getElementToEdit();
	}

	/**
	* @generated
	*/
	protected SystemRequirement getOldSource() {
		return (SystemRequirement) oldEnd;
	}

	/**
	* @generated
	*/
	protected SystemRequirement getNewSource() {
		return (SystemRequirement) newEnd;
	}

	/**
	* @generated
	*/
	protected FunctionalRequirement getOldTarget() {
		return (FunctionalRequirement) oldEnd;
	}

	/**
	* @generated
	*/
	protected FunctionalRequirement getNewTarget() {
		return (FunctionalRequirement) newEnd;
	}
}
