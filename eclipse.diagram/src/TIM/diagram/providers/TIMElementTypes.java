/*
 * 
 */
package TIM.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import TIM.TIMPackage;
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
import TIM.diagram.part.TIMDiagramEditorPlugin;

/**
 * @generated
 */
public class TIMElementTypes {

	/**
	* @generated
	*/
	private TIMElementTypes() {
	}

	/**
	* @generated
	*/
	private static Map<IElementType, ENamedElement> elements;

	/**
	* @generated
	*/
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			TIMDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	* @generated
	*/
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	* @generated
	*/
	public static final IElementType GlobalTraceModel_1000 = getElementType("eclipse.diagram.GlobalTraceModel_1000"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType SystemRequirement_2001 = getElementType("eclipse.diagram.SystemRequirement_2001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType FunctionalRequirement_2002 = getElementType(
			"eclipse.diagram.FunctionalRequirement_2002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Model_2003 = getElementType("eclipse.diagram.Model_2003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Test_2004 = getElementType("eclipse.diagram.Test_2004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType GTMController_2005 = getElementType("eclipse.diagram.GTMController_2005"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType LTMController_2006 = getElementType("eclipse.diagram.LTMController_2006"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType GTMVersion_2007 = getElementType("eclipse.diagram.GTMVersion_2007"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Change_Request_Ticket_2008 = getElementType(
			"eclipse.diagram.Change_Request_Ticket_2008"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Derive_4001 = getElementType("eclipse.diagram.Derive_4001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Implement_4002 = getElementType("eclipse.diagram.Implement_4002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Verify_4003 = getElementType("eclipse.diagram.Verify_4003"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	* @generated
	*/
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	* @generated
	*/
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	* Returns 'type' of the ecore object associated with the hint.
	* 
	* @generated
	*/
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(GlobalTraceModel_1000, TIMPackage.eINSTANCE.getGlobalTraceModel());

			elements.put(SystemRequirement_2001, TIMPackage.eINSTANCE.getSystemRequirement());

			elements.put(FunctionalRequirement_2002, TIMPackage.eINSTANCE.getFunctionalRequirement());

			elements.put(Model_2003, TIMPackage.eINSTANCE.getModel());

			elements.put(Test_2004, TIMPackage.eINSTANCE.getTest());

			elements.put(GTMController_2005, TIMPackage.eINSTANCE.getGTMController());

			elements.put(LTMController_2006, TIMPackage.eINSTANCE.getLTMController());

			elements.put(GTMVersion_2007, TIMPackage.eINSTANCE.getGTMVersion());

			elements.put(Change_Request_Ticket_2008, TIMPackage.eINSTANCE.getChange_Request_Ticket());

			elements.put(Derive_4001, TIMPackage.eINSTANCE.getDerive());

			elements.put(Implement_4002, TIMPackage.eINSTANCE.getImplement());

			elements.put(Verify_4003, TIMPackage.eINSTANCE.getVerify());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	* @generated
	*/
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	* @generated
	*/
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(GlobalTraceModel_1000);
			KNOWN_ELEMENT_TYPES.add(SystemRequirement_2001);
			KNOWN_ELEMENT_TYPES.add(FunctionalRequirement_2002);
			KNOWN_ELEMENT_TYPES.add(Model_2003);
			KNOWN_ELEMENT_TYPES.add(Test_2004);
			KNOWN_ELEMENT_TYPES.add(GTMController_2005);
			KNOWN_ELEMENT_TYPES.add(LTMController_2006);
			KNOWN_ELEMENT_TYPES.add(GTMVersion_2007);
			KNOWN_ELEMENT_TYPES.add(Change_Request_Ticket_2008);
			KNOWN_ELEMENT_TYPES.add(Derive_4001);
			KNOWN_ELEMENT_TYPES.add(Implement_4002);
			KNOWN_ELEMENT_TYPES.add(Verify_4003);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case GlobalTraceModelEditPart.VISUAL_ID:
			return GlobalTraceModel_1000;
		case SystemRequirementEditPart.VISUAL_ID:
			return SystemRequirement_2001;
		case FunctionalRequirementEditPart.VISUAL_ID:
			return FunctionalRequirement_2002;
		case ModelEditPart.VISUAL_ID:
			return Model_2003;
		case TestEditPart.VISUAL_ID:
			return Test_2004;
		case GTMControllerEditPart.VISUAL_ID:
			return GTMController_2005;
		case LTMControllerEditPart.VISUAL_ID:
			return LTMController_2006;
		case GTMVersionEditPart.VISUAL_ID:
			return GTMVersion_2007;
		case Change_Request_TicketEditPart.VISUAL_ID:
			return Change_Request_Ticket_2008;
		case DeriveEditPart.VISUAL_ID:
			return Derive_4001;
		case ImplementEditPart.VISUAL_ID:
			return Implement_4002;
		case VerifyEditPart.VISUAL_ID:
			return Verify_4003;
		}
		return null;
	}

	/**
	* @generated
	*/
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(elementTypeImages) {

		/**
		* @generated
		*/
		@Override

		public boolean isKnownElementType(IElementType elementType) {
			return TIM.diagram.providers.TIMElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return TIM.diagram.providers.TIMElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return TIM.diagram.providers.TIMElementTypes.getElement(elementTypeAdapter);
		}
	};

}
