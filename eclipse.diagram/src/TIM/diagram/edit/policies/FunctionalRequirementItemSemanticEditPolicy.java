/*
* 
*/
package TIM.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

import TIM.diagram.edit.commands.DeriveCreateCommand;
import TIM.diagram.edit.commands.DeriveReorientCommand;
import TIM.diagram.edit.commands.ImplementCreateCommand;
import TIM.diagram.edit.commands.ImplementReorientCommand;
import TIM.diagram.edit.commands.VerifyCreateCommand;
import TIM.diagram.edit.commands.VerifyReorientCommand;
import TIM.diagram.edit.parts.DeriveEditPart;
import TIM.diagram.edit.parts.ImplementEditPart;
import TIM.diagram.edit.parts.VerifyEditPart;
import TIM.diagram.part.TIMVisualIDRegistry;
import TIM.diagram.providers.TIMElementTypes;

/**
 * @generated
 */
public class FunctionalRequirementItemSemanticEditPolicy extends TIMBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public FunctionalRequirementItemSemanticEditPolicy() {
		super(TIMElementTypes.FunctionalRequirement_2002);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (TIMVisualIDRegistry.getVisualID(incomingLink) == DeriveEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (TIMVisualIDRegistry.getVisualID(outgoingLink) == ImplementEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (TIMVisualIDRegistry.getVisualID(outgoingLink) == VerifyEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (TIMElementTypes.Derive_4001 == req.getElementType()) {
			return null;
		}
		if (TIMElementTypes.Implement_4002 == req.getElementType()) {
			return getGEFWrapper(new ImplementCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (TIMElementTypes.Verify_4003 == req.getElementType()) {
			return getGEFWrapper(new VerifyCreateCommand(req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (TIMElementTypes.Derive_4001 == req.getElementType()) {
			return getGEFWrapper(new DeriveCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (TIMElementTypes.Implement_4002 == req.getElementType()) {
			return null;
		}
		if (TIMElementTypes.Verify_4003 == req.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case DeriveEditPart.VISUAL_ID:
			return getGEFWrapper(new DeriveReorientCommand(req));
		case ImplementEditPart.VISUAL_ID:
			return getGEFWrapper(new ImplementReorientCommand(req));
		case VerifyEditPart.VISUAL_ID:
			return getGEFWrapper(new VerifyReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
