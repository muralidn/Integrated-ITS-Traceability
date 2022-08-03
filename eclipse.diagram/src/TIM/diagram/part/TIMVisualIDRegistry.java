/*
* 
*/
package TIM.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import TIM.GlobalTraceModel;
import TIM.TIMPackage;
import TIM.diagram.edit.parts.Change_Request_TicketCrIDEditPart;
import TIM.diagram.edit.parts.Change_Request_TicketEditPart;
import TIM.diagram.edit.parts.DeriveEditPart;
import TIM.diagram.edit.parts.DeriveTypeEditPart;
import TIM.diagram.edit.parts.FunctionalRequirementArtifactIDProgressEditPart;
import TIM.diagram.edit.parts.FunctionalRequirementEditPart;
import TIM.diagram.edit.parts.GTMControllerCreateNewCRLtmCREditPart;
import TIM.diagram.edit.parts.GTMControllerEditPart;
import TIM.diagram.edit.parts.GTMVersionEditPart;
import TIM.diagram.edit.parts.GTMVersionVersionEditPart;
import TIM.diagram.edit.parts.GlobalTraceModelEditPart;
import TIM.diagram.edit.parts.ImplementEditPart;
import TIM.diagram.edit.parts.ImplementTypeEditPart;
import TIM.diagram.edit.parts.LTMControllerCompleteEditPart;
import TIM.diagram.edit.parts.LTMControllerEditPart;
import TIM.diagram.edit.parts.ModelArtifactIDProgressEditPart;
import TIM.diagram.edit.parts.ModelEditPart;
import TIM.diagram.edit.parts.SystemRequirementArtifactIDProgressEditPart;
import TIM.diagram.edit.parts.SystemRequirementEditPart;
import TIM.diagram.edit.parts.TestArtifactIDProgressEditPart;
import TIM.diagram.edit.parts.TestEditPart;
import TIM.diagram.edit.parts.VerifyEditPart;
import TIM.diagram.edit.parts.VerifyTypeEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class TIMVisualIDRegistry {

	/**
	* @generated
	*/
	private static final String DEBUG_KEY = "eclipse.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (GlobalTraceModelEditPart.MODEL_ID.equals(view.getType())) {
				return GlobalTraceModelEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return TIM.diagram.part.TIMVisualIDRegistry.getVisualID(view.getType());
	}

	/**
	* @generated
	*/
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	* @generated
	*/
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				TIMDiagramEditorPlugin.getInstance()
						.logError("Unable to parse view type as a visualID number: " + type);
			}
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	* @generated
	*/
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (TIMPackage.eINSTANCE.getGlobalTraceModel().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((GlobalTraceModel) domainElement)) {
			return GlobalTraceModelEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = TIM.diagram.part.TIMVisualIDRegistry.getModelID(containerView);
		if (!GlobalTraceModelEditPart.MODEL_ID.equals(containerModelID) && !"TIM".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (GlobalTraceModelEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = TIM.diagram.part.TIMVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = GlobalTraceModelEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case GlobalTraceModelEditPart.VISUAL_ID:
			if (TIMPackage.eINSTANCE.getSystemRequirement().isSuperTypeOf(domainElement.eClass())) {
				return SystemRequirementEditPart.VISUAL_ID;
			}
			if (TIMPackage.eINSTANCE.getFunctionalRequirement().isSuperTypeOf(domainElement.eClass())) {
				return FunctionalRequirementEditPart.VISUAL_ID;
			}
			if (TIMPackage.eINSTANCE.getModel().isSuperTypeOf(domainElement.eClass())) {
				return ModelEditPart.VISUAL_ID;
			}
			if (TIMPackage.eINSTANCE.getTest().isSuperTypeOf(domainElement.eClass())) {
				return TestEditPart.VISUAL_ID;
			}
			if (TIMPackage.eINSTANCE.getGTMController().isSuperTypeOf(domainElement.eClass())) {
				return GTMControllerEditPart.VISUAL_ID;
			}
			if (TIMPackage.eINSTANCE.getLTMController().isSuperTypeOf(domainElement.eClass())) {
				return LTMControllerEditPart.VISUAL_ID;
			}
			if (TIMPackage.eINSTANCE.getGTMVersion().isSuperTypeOf(domainElement.eClass())) {
				return GTMVersionEditPart.VISUAL_ID;
			}
			if (TIMPackage.eINSTANCE.getChange_Request_Ticket().isSuperTypeOf(domainElement.eClass())) {
				return Change_Request_TicketEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = TIM.diagram.part.TIMVisualIDRegistry.getModelID(containerView);
		if (!GlobalTraceModelEditPart.MODEL_ID.equals(containerModelID) && !"TIM".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (GlobalTraceModelEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = TIM.diagram.part.TIMVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = GlobalTraceModelEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case GlobalTraceModelEditPart.VISUAL_ID:
			if (SystemRequirementEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FunctionalRequirementEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ModelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TestEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GTMControllerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LTMControllerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GTMVersionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Change_Request_TicketEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SystemRequirementEditPart.VISUAL_ID:
			if (SystemRequirementArtifactIDProgressEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FunctionalRequirementEditPart.VISUAL_ID:
			if (FunctionalRequirementArtifactIDProgressEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ModelEditPart.VISUAL_ID:
			if (ModelArtifactIDProgressEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TestEditPart.VISUAL_ID:
			if (TestArtifactIDProgressEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GTMControllerEditPart.VISUAL_ID:
			if (GTMControllerCreateNewCRLtmCREditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LTMControllerEditPart.VISUAL_ID:
			if (LTMControllerCompleteEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GTMVersionEditPart.VISUAL_ID:
			if (GTMVersionVersionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Change_Request_TicketEditPart.VISUAL_ID:
			if (Change_Request_TicketCrIDEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DeriveEditPart.VISUAL_ID:
			if (DeriveTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ImplementEditPart.VISUAL_ID:
			if (ImplementTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case VerifyEditPart.VISUAL_ID:
			if (VerifyTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (TIMPackage.eINSTANCE.getDerive().isSuperTypeOf(domainElement.eClass())) {
			return DeriveEditPart.VISUAL_ID;
		}
		if (TIMPackage.eINSTANCE.getImplement().isSuperTypeOf(domainElement.eClass())) {
			return ImplementEditPart.VISUAL_ID;
		}
		if (TIMPackage.eINSTANCE.getVerify().isSuperTypeOf(domainElement.eClass())) {
			return VerifyEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* User can change implementation of this method to handle some specific
	* situations not covered by default logic.
	* 
	* @generated
	*/
	private static boolean isDiagram(GlobalTraceModel element) {
		return true;
	}

	/**
	* @generated
	*/
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	* @generated
	*/
	public static boolean isCompartmentVisualID(int visualID) {
		return false;
	}

	/**
	* @generated
	*/
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case GlobalTraceModelEditPart.VISUAL_ID:
			return false;
		case SystemRequirementEditPart.VISUAL_ID:
		case FunctionalRequirementEditPart.VISUAL_ID:
		case ModelEditPart.VISUAL_ID:
		case TestEditPart.VISUAL_ID:
		case GTMControllerEditPart.VISUAL_ID:
		case LTMControllerEditPart.VISUAL_ID:
		case GTMVersionEditPart.VISUAL_ID:
		case Change_Request_TicketEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		* @generated
		*/
		@Override

		public int getVisualID(View view) {
			return TIM.diagram.part.TIMVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return TIM.diagram.part.TIMVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return TIM.diagram.part.TIMVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return TIM.diagram.part.TIMVisualIDRegistry.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return TIM.diagram.part.TIMVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return TIM.diagram.part.TIMVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
