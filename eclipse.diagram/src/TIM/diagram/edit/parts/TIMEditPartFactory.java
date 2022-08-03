/*
 * 
 */
package TIM.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import TIM.diagram.part.TIMVisualIDRegistry;

/**
 * @generated
 */
public class TIMEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (TIMVisualIDRegistry.getVisualID(view)) {

			case GlobalTraceModelEditPart.VISUAL_ID:
				return new GlobalTraceModelEditPart(view);

			case SystemRequirementEditPart.VISUAL_ID:
				return new SystemRequirementEditPart(view);

			case SystemRequirementArtifactIDProgressEditPart.VISUAL_ID:
				return new SystemRequirementArtifactIDProgressEditPart(view);

			case FunctionalRequirementEditPart.VISUAL_ID:
				return new FunctionalRequirementEditPart(view);

			case FunctionalRequirementArtifactIDProgressEditPart.VISUAL_ID:
				return new FunctionalRequirementArtifactIDProgressEditPart(view);

			case ModelEditPart.VISUAL_ID:
				return new ModelEditPart(view);

			case ModelArtifactIDProgressEditPart.VISUAL_ID:
				return new ModelArtifactIDProgressEditPart(view);

			case TestEditPart.VISUAL_ID:
				return new TestEditPart(view);

			case TestArtifactIDProgressEditPart.VISUAL_ID:
				return new TestArtifactIDProgressEditPart(view);

			case GTMControllerEditPart.VISUAL_ID:
				return new GTMControllerEditPart(view);

			case GTMControllerCreateNewCRLtmCREditPart.VISUAL_ID:
				return new GTMControllerCreateNewCRLtmCREditPart(view);

			case LTMControllerEditPart.VISUAL_ID:
				return new LTMControllerEditPart(view);

			case LTMControllerCompleteEditPart.VISUAL_ID:
				return new LTMControllerCompleteEditPart(view);

			case GTMVersionEditPart.VISUAL_ID:
				return new GTMVersionEditPart(view);

			case GTMVersionVersionEditPart.VISUAL_ID:
				return new GTMVersionVersionEditPart(view);

			case Change_Request_TicketEditPart.VISUAL_ID:
				return new Change_Request_TicketEditPart(view);

			case Change_Request_TicketCrIDEditPart.VISUAL_ID:
				return new Change_Request_TicketCrIDEditPart(view);

			case DeriveEditPart.VISUAL_ID:
				return new DeriveEditPart(view);

			case DeriveTypeEditPart.VISUAL_ID:
				return new DeriveTypeEditPart(view);

			case ImplementEditPart.VISUAL_ID:
				return new ImplementEditPart(view);

			case ImplementTypeEditPart.VISUAL_ID:
				return new ImplementTypeEditPart(view);

			case VerifyEditPart.VISUAL_ID:
				return new VerifyEditPart(view);

			case VerifyTypeEditPart.VISUAL_ID:
				return new VerifyTypeEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	* @generated
	*/
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	* @generated
	*/
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}

}
