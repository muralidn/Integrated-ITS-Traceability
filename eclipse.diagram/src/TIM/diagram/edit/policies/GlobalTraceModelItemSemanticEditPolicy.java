/*
* 
*/
package TIM.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import TIM.diagram.edit.commands.Change_Request_TicketCreateCommand;
import TIM.diagram.edit.commands.FunctionalRequirementCreateCommand;
import TIM.diagram.edit.commands.GTMControllerCreateCommand;
import TIM.diagram.edit.commands.GTMVersionCreateCommand;
import TIM.diagram.edit.commands.LTMControllerCreateCommand;
import TIM.diagram.edit.commands.ModelCreateCommand;
import TIM.diagram.edit.commands.SystemRequirementCreateCommand;
import TIM.diagram.edit.commands.TestCreateCommand;
import TIM.diagram.providers.TIMElementTypes;

/**
 * @generated
 */
public class GlobalTraceModelItemSemanticEditPolicy extends TIMBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public GlobalTraceModelItemSemanticEditPolicy() {
		super(TIMElementTypes.GlobalTraceModel_1000);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (TIMElementTypes.SystemRequirement_2001 == req.getElementType()) {
			return getGEFWrapper(new SystemRequirementCreateCommand(req));
		}
		if (TIMElementTypes.FunctionalRequirement_2002 == req.getElementType()) {
			return getGEFWrapper(new FunctionalRequirementCreateCommand(req));
		}
		if (TIMElementTypes.Model_2003 == req.getElementType()) {
			return getGEFWrapper(new ModelCreateCommand(req));
		}
		if (TIMElementTypes.Test_2004 == req.getElementType()) {
			return getGEFWrapper(new TestCreateCommand(req));
		}
		if (TIMElementTypes.GTMController_2005 == req.getElementType()) {
			return getGEFWrapper(new GTMControllerCreateCommand(req));
		}
		if (TIMElementTypes.LTMController_2006 == req.getElementType()) {
			return getGEFWrapper(new LTMControllerCreateCommand(req));
		}
		if (TIMElementTypes.GTMVersion_2007 == req.getElementType()) {
			return getGEFWrapper(new GTMVersionCreateCommand(req));
		}
		if (TIMElementTypes.Change_Request_Ticket_2008 == req.getElementType()) {
			return getGEFWrapper(new Change_Request_TicketCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	* @generated
	*/
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost()).getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	* @generated
	*/
	private static class DuplicateAnythingCommand extends DuplicateEObjectsCommand {

		/**
		* @generated
		*/
		public DuplicateAnythingCommand(TransactionalEditingDomain editingDomain, DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req.getElementsToBeDuplicated(), req.getAllDuplicatedElementsMap());
		}

	}

}
