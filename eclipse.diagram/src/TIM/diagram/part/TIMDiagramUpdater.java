/*
* 
*/
package TIM.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import TIM.Change_Request_Ticket;
import TIM.Derive;
import TIM.FunctionalRequirement;
import TIM.GTMController;
import TIM.GTMVersion;
import TIM.GlobalTraceModel;
import TIM.Implement;
import TIM.LTMController;
import TIM.Model;
import TIM.SystemRequirement;
import TIM.TIMPackage;
import TIM.Test;
import TIM.Verify;
import TIM.diagram.edit.parts.Change_Request_TicketEditPart;
import TIM.diagram.edit.parts.DeriveEditPart;
import TIM.diagram.edit.parts.FunctionalRequirementEditPart;
import TIM.diagram.edit.parts.GTMControllerEditPart;
import TIM.diagram.edit.parts.GTMVersionEditPart;
import TIM.diagram.edit.parts.GlobalTraceModelEditPart;
import TIM.diagram.edit.parts.ImplementEditPart;
import TIM.diagram.edit.parts.LTMControllerEditPart;
import TIM.diagram.edit.parts.ModelEditPart;
import TIM.diagram.edit.parts.SystemRequirementEditPart;
import TIM.diagram.edit.parts.TestEditPart;
import TIM.diagram.edit.parts.VerifyEditPart;
import TIM.diagram.providers.TIMElementTypes;

/**
 * @generated
 */
public class TIMDiagramUpdater {

	/**
	* @generated
	*/
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null || view.getElement().eIsProxy();
	}

	/**
	* @generated
	*/
	public static List<TIMNodeDescriptor> getSemanticChildren(View view) {
		switch (TIMVisualIDRegistry.getVisualID(view)) {
		case GlobalTraceModelEditPart.VISUAL_ID:
			return getGlobalTraceModel_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<TIMNodeDescriptor> getGlobalTraceModel_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		GlobalTraceModel modelElement = (GlobalTraceModel) view.getElement();
		LinkedList<TIMNodeDescriptor> result = new LinkedList<TIMNodeDescriptor>();
		for (Iterator<?> it = modelElement.getSysRequirements().iterator(); it.hasNext();) {
			SystemRequirement childElement = (SystemRequirement) it.next();
			int visualID = TIMVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == SystemRequirementEditPart.VISUAL_ID) {
				result.add(new TIMNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getFuncRequirements().iterator(); it.hasNext();) {
			FunctionalRequirement childElement = (FunctionalRequirement) it.next();
			int visualID = TIMVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == FunctionalRequirementEditPart.VISUAL_ID) {
				result.add(new TIMNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getModelBlocks().iterator(); it.hasNext();) {
			Model childElement = (Model) it.next();
			int visualID = TIMVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ModelEditPart.VISUAL_ID) {
				result.add(new TIMNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getTestBlocks().iterator(); it.hasNext();) {
			Test childElement = (Test) it.next();
			int visualID = TIMVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == TestEditPart.VISUAL_ID) {
				result.add(new TIMNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			GTMController childElement = modelElement.getGtmController();
			int visualID = TIMVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == GTMControllerEditPart.VISUAL_ID) {
				result.add(new TIMNodeDescriptor(childElement, visualID));
			}
		}
		{
			LTMController childElement = modelElement.getLtmController();
			int visualID = TIMVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == LTMControllerEditPart.VISUAL_ID) {
				result.add(new TIMNodeDescriptor(childElement, visualID));
			}
		}
		{
			GTMVersion childElement = modelElement.getGtmVersion();
			int visualID = TIMVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == GTMVersionEditPart.VISUAL_ID) {
				result.add(new TIMNodeDescriptor(childElement, visualID));
			}
		}
		for (Iterator<?> it = modelElement.getCR_Tickets().iterator(); it.hasNext();) {
			Change_Request_Ticket childElement = (Change_Request_Ticket) it.next();
			int visualID = TIMVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Change_Request_TicketEditPart.VISUAL_ID) {
				result.add(new TIMNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<TIMLinkDescriptor> getContainedLinks(View view) {
		switch (TIMVisualIDRegistry.getVisualID(view)) {
		case GlobalTraceModelEditPart.VISUAL_ID:
			return getGlobalTraceModel_1000ContainedLinks(view);
		case SystemRequirementEditPart.VISUAL_ID:
			return getSystemRequirement_2001ContainedLinks(view);
		case FunctionalRequirementEditPart.VISUAL_ID:
			return getFunctionalRequirement_2002ContainedLinks(view);
		case ModelEditPart.VISUAL_ID:
			return getModel_2003ContainedLinks(view);
		case TestEditPart.VISUAL_ID:
			return getTest_2004ContainedLinks(view);
		case GTMControllerEditPart.VISUAL_ID:
			return getGTMController_2005ContainedLinks(view);
		case LTMControllerEditPart.VISUAL_ID:
			return getLTMController_2006ContainedLinks(view);
		case GTMVersionEditPart.VISUAL_ID:
			return getGTMVersion_2007ContainedLinks(view);
		case Change_Request_TicketEditPart.VISUAL_ID:
			return getChange_Request_Ticket_2008ContainedLinks(view);
		case DeriveEditPart.VISUAL_ID:
			return getDerive_4001ContainedLinks(view);
		case ImplementEditPart.VISUAL_ID:
			return getImplement_4002ContainedLinks(view);
		case VerifyEditPart.VISUAL_ID:
			return getVerify_4003ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<TIMLinkDescriptor> getIncomingLinks(View view) {
		switch (TIMVisualIDRegistry.getVisualID(view)) {
		case SystemRequirementEditPart.VISUAL_ID:
			return getSystemRequirement_2001IncomingLinks(view);
		case FunctionalRequirementEditPart.VISUAL_ID:
			return getFunctionalRequirement_2002IncomingLinks(view);
		case ModelEditPart.VISUAL_ID:
			return getModel_2003IncomingLinks(view);
		case TestEditPart.VISUAL_ID:
			return getTest_2004IncomingLinks(view);
		case GTMControllerEditPart.VISUAL_ID:
			return getGTMController_2005IncomingLinks(view);
		case LTMControllerEditPart.VISUAL_ID:
			return getLTMController_2006IncomingLinks(view);
		case GTMVersionEditPart.VISUAL_ID:
			return getGTMVersion_2007IncomingLinks(view);
		case Change_Request_TicketEditPart.VISUAL_ID:
			return getChange_Request_Ticket_2008IncomingLinks(view);
		case DeriveEditPart.VISUAL_ID:
			return getDerive_4001IncomingLinks(view);
		case ImplementEditPart.VISUAL_ID:
			return getImplement_4002IncomingLinks(view);
		case VerifyEditPart.VISUAL_ID:
			return getVerify_4003IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<TIMLinkDescriptor> getOutgoingLinks(View view) {
		switch (TIMVisualIDRegistry.getVisualID(view)) {
		case SystemRequirementEditPart.VISUAL_ID:
			return getSystemRequirement_2001OutgoingLinks(view);
		case FunctionalRequirementEditPart.VISUAL_ID:
			return getFunctionalRequirement_2002OutgoingLinks(view);
		case ModelEditPart.VISUAL_ID:
			return getModel_2003OutgoingLinks(view);
		case TestEditPart.VISUAL_ID:
			return getTest_2004OutgoingLinks(view);
		case GTMControllerEditPart.VISUAL_ID:
			return getGTMController_2005OutgoingLinks(view);
		case LTMControllerEditPart.VISUAL_ID:
			return getLTMController_2006OutgoingLinks(view);
		case GTMVersionEditPart.VISUAL_ID:
			return getGTMVersion_2007OutgoingLinks(view);
		case Change_Request_TicketEditPart.VISUAL_ID:
			return getChange_Request_Ticket_2008OutgoingLinks(view);
		case DeriveEditPart.VISUAL_ID:
			return getDerive_4001OutgoingLinks(view);
		case ImplementEditPart.VISUAL_ID:
			return getImplement_4002OutgoingLinks(view);
		case VerifyEditPart.VISUAL_ID:
			return getVerify_4003OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TIMLinkDescriptor> getGlobalTraceModel_1000ContainedLinks(View view) {
		GlobalTraceModel modelElement = (GlobalTraceModel) view.getElement();
		LinkedList<TIMLinkDescriptor> result = new LinkedList<TIMLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Derive_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Implement_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Verify_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TIMLinkDescriptor> getSystemRequirement_2001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TIMLinkDescriptor> getFunctionalRequirement_2002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TIMLinkDescriptor> getModel_2003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TIMLinkDescriptor> getTest_2004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TIMLinkDescriptor> getGTMController_2005ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TIMLinkDescriptor> getLTMController_2006ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TIMLinkDescriptor> getGTMVersion_2007ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TIMLinkDescriptor> getChange_Request_Ticket_2008ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TIMLinkDescriptor> getDerive_4001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TIMLinkDescriptor> getImplement_4002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TIMLinkDescriptor> getVerify_4003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TIMLinkDescriptor> getSystemRequirement_2001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TIMLinkDescriptor> getFunctionalRequirement_2002IncomingLinks(View view) {
		FunctionalRequirement modelElement = (FunctionalRequirement) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<TIMLinkDescriptor> result = new LinkedList<TIMLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Derive_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TIMLinkDescriptor> getModel_2003IncomingLinks(View view) {
		Model modelElement = (Model) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<TIMLinkDescriptor> result = new LinkedList<TIMLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Implement_4002(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TIMLinkDescriptor> getTest_2004IncomingLinks(View view) {
		Test modelElement = (Test) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<TIMLinkDescriptor> result = new LinkedList<TIMLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Verify_4003(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TIMLinkDescriptor> getGTMController_2005IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TIMLinkDescriptor> getLTMController_2006IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TIMLinkDescriptor> getGTMVersion_2007IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TIMLinkDescriptor> getChange_Request_Ticket_2008IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TIMLinkDescriptor> getDerive_4001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TIMLinkDescriptor> getImplement_4002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TIMLinkDescriptor> getVerify_4003IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TIMLinkDescriptor> getSystemRequirement_2001OutgoingLinks(View view) {
		SystemRequirement modelElement = (SystemRequirement) view.getElement();
		LinkedList<TIMLinkDescriptor> result = new LinkedList<TIMLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Derive_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TIMLinkDescriptor> getFunctionalRequirement_2002OutgoingLinks(View view) {
		FunctionalRequirement modelElement = (FunctionalRequirement) view.getElement();
		LinkedList<TIMLinkDescriptor> result = new LinkedList<TIMLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Implement_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Verify_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TIMLinkDescriptor> getModel_2003OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TIMLinkDescriptor> getTest_2004OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TIMLinkDescriptor> getGTMController_2005OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TIMLinkDescriptor> getLTMController_2006OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TIMLinkDescriptor> getGTMVersion_2007OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TIMLinkDescriptor> getChange_Request_Ticket_2008OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TIMLinkDescriptor> getDerive_4001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TIMLinkDescriptor> getImplement_4002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TIMLinkDescriptor> getVerify_4003OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	private static Collection<TIMLinkDescriptor> getContainedTypeModelFacetLinks_Derive_4001(
			GlobalTraceModel container) {
		LinkedList<TIMLinkDescriptor> result = new LinkedList<TIMLinkDescriptor>();
		for (Iterator<?> links = container.getDeriveTraceLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Derive) {
				continue;
			}
			Derive link = (Derive) linkObject;
			if (DeriveEditPart.VISUAL_ID != TIMVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			FunctionalRequirement dst = link.getDestination();
			SystemRequirement src = link.getSource();
			result.add(new TIMLinkDescriptor(src, dst, link, TIMElementTypes.Derive_4001, DeriveEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<TIMLinkDescriptor> getContainedTypeModelFacetLinks_Implement_4002(
			GlobalTraceModel container) {
		LinkedList<TIMLinkDescriptor> result = new LinkedList<TIMLinkDescriptor>();
		for (Iterator<?> links = container.getImplementTraceLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Implement) {
				continue;
			}
			Implement link = (Implement) linkObject;
			if (ImplementEditPart.VISUAL_ID != TIMVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Model dst = link.getDestination();
			FunctionalRequirement src = link.getSource();
			result.add(
					new TIMLinkDescriptor(src, dst, link, TIMElementTypes.Implement_4002, ImplementEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<TIMLinkDescriptor> getContainedTypeModelFacetLinks_Verify_4003(
			GlobalTraceModel container) {
		LinkedList<TIMLinkDescriptor> result = new LinkedList<TIMLinkDescriptor>();
		for (Iterator<?> links = container.getVerifyTraceLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Verify) {
				continue;
			}
			Verify link = (Verify) linkObject;
			if (VerifyEditPart.VISUAL_ID != TIMVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Test dst = link.getDestination();
			FunctionalRequirement src = link.getSource();
			result.add(new TIMLinkDescriptor(src, dst, link, TIMElementTypes.Verify_4003, VerifyEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<TIMLinkDescriptor> getIncomingTypeModelFacetLinks_Derive_4001(
			FunctionalRequirement target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<TIMLinkDescriptor> result = new LinkedList<TIMLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != TIMPackage.eINSTANCE.getDerive_Destination()
					|| false == setting.getEObject() instanceof Derive) {
				continue;
			}
			Derive link = (Derive) setting.getEObject();
			if (DeriveEditPart.VISUAL_ID != TIMVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			SystemRequirement src = link.getSource();
			result.add(new TIMLinkDescriptor(src, target, link, TIMElementTypes.Derive_4001, DeriveEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<TIMLinkDescriptor> getIncomingTypeModelFacetLinks_Implement_4002(Model target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<TIMLinkDescriptor> result = new LinkedList<TIMLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != TIMPackage.eINSTANCE.getImplement_Destination()
					|| false == setting.getEObject() instanceof Implement) {
				continue;
			}
			Implement link = (Implement) setting.getEObject();
			if (ImplementEditPart.VISUAL_ID != TIMVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			FunctionalRequirement src = link.getSource();
			result.add(new TIMLinkDescriptor(src, target, link, TIMElementTypes.Implement_4002,
					ImplementEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<TIMLinkDescriptor> getIncomingTypeModelFacetLinks_Verify_4003(Test target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<TIMLinkDescriptor> result = new LinkedList<TIMLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != TIMPackage.eINSTANCE.getVerify_Destination()
					|| false == setting.getEObject() instanceof Verify) {
				continue;
			}
			Verify link = (Verify) setting.getEObject();
			if (VerifyEditPart.VISUAL_ID != TIMVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			FunctionalRequirement src = link.getSource();
			result.add(new TIMLinkDescriptor(src, target, link, TIMElementTypes.Verify_4003, VerifyEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<TIMLinkDescriptor> getOutgoingTypeModelFacetLinks_Derive_4001(SystemRequirement source) {
		GlobalTraceModel container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof GlobalTraceModel) {
				container = (GlobalTraceModel) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<TIMLinkDescriptor> result = new LinkedList<TIMLinkDescriptor>();
		for (Iterator<?> links = container.getDeriveTraceLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Derive) {
				continue;
			}
			Derive link = (Derive) linkObject;
			if (DeriveEditPart.VISUAL_ID != TIMVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			FunctionalRequirement dst = link.getDestination();
			SystemRequirement src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new TIMLinkDescriptor(src, dst, link, TIMElementTypes.Derive_4001, DeriveEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<TIMLinkDescriptor> getOutgoingTypeModelFacetLinks_Implement_4002(
			FunctionalRequirement source) {
		GlobalTraceModel container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof GlobalTraceModel) {
				container = (GlobalTraceModel) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<TIMLinkDescriptor> result = new LinkedList<TIMLinkDescriptor>();
		for (Iterator<?> links = container.getImplementTraceLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Implement) {
				continue;
			}
			Implement link = (Implement) linkObject;
			if (ImplementEditPart.VISUAL_ID != TIMVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Model dst = link.getDestination();
			FunctionalRequirement src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(
					new TIMLinkDescriptor(src, dst, link, TIMElementTypes.Implement_4002, ImplementEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<TIMLinkDescriptor> getOutgoingTypeModelFacetLinks_Verify_4003(
			FunctionalRequirement source) {
		GlobalTraceModel container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof GlobalTraceModel) {
				container = (GlobalTraceModel) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<TIMLinkDescriptor> result = new LinkedList<TIMLinkDescriptor>();
		for (Iterator<?> links = container.getVerifyTraceLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Verify) {
				continue;
			}
			Verify link = (Verify) linkObject;
			if (VerifyEditPart.VISUAL_ID != TIMVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Test dst = link.getDestination();
			FunctionalRequirement src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new TIMLinkDescriptor(src, dst, link, TIMElementTypes.Verify_4003, VerifyEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/
		@Override

		public List<TIMNodeDescriptor> getSemanticChildren(View view) {
			return TIMDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<TIMLinkDescriptor> getContainedLinks(View view) {
			return TIMDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<TIMLinkDescriptor> getIncomingLinks(View view) {
			return TIMDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<TIMLinkDescriptor> getOutgoingLinks(View view) {
			return TIMDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
