/*
* 
*/
package TIM.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

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
import TIM.diagram.part.TIMDiagramEditorPlugin;
import TIM.diagram.part.TIMVisualIDRegistry;
import TIM.diagram.providers.TIMElementTypes;
import TIM.diagram.providers.TIMParserProvider;

/**
 * @generated
 */
public class TIMNavigatorLabelProvider extends LabelProvider implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		TIMDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
		TIMDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof TIMNavigatorItem && !isOwnView(((TIMNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof TIMNavigatorGroup) {
			TIMNavigatorGroup group = (TIMNavigatorGroup) element;
			return TIMDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof TIMNavigatorItem) {
			TIMNavigatorItem navigatorItem = (TIMNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	* @generated
	*/
	public Image getImage(View view) {
		switch (TIMVisualIDRegistry.getVisualID(view)) {
		case GlobalTraceModelEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?Trace_Information_Model?GlobalTraceModel", //$NON-NLS-1$
					TIMElementTypes.GlobalTraceModel_1000);
		case SystemRequirementEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?Trace_Information_Model?SystemRequirement", //$NON-NLS-1$
					TIMElementTypes.SystemRequirement_2001);
		case FunctionalRequirementEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?Trace_Information_Model?FunctionalRequirement", //$NON-NLS-1$
					TIMElementTypes.FunctionalRequirement_2002);
		case ModelEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?Trace_Information_Model?Model", TIMElementTypes.Model_2003); //$NON-NLS-1$
		case TestEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?Trace_Information_Model?Test", TIMElementTypes.Test_2004); //$NON-NLS-1$
		case GTMControllerEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?Trace_Information_Model?GTMController", //$NON-NLS-1$
					TIMElementTypes.GTMController_2005);
		case LTMControllerEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?Trace_Information_Model?LTMController", //$NON-NLS-1$
					TIMElementTypes.LTMController_2006);
		case GTMVersionEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?Trace_Information_Model?GTMVersion", //$NON-NLS-1$
					TIMElementTypes.GTMVersion_2007);
		case Change_Request_TicketEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?Trace_Information_Model?Change_Request_Ticket", //$NON-NLS-1$
					TIMElementTypes.Change_Request_Ticket_2008);
		case DeriveEditPart.VISUAL_ID:
			return getImage("Navigator?Link?Trace_Information_Model?Derive", TIMElementTypes.Derive_4001); //$NON-NLS-1$
		case ImplementEditPart.VISUAL_ID:
			return getImage("Navigator?Link?Trace_Information_Model?Implement", TIMElementTypes.Implement_4002); //$NON-NLS-1$
		case VerifyEditPart.VISUAL_ID:
			return getImage("Navigator?Link?Trace_Information_Model?Verify", TIMElementTypes.Verify_4003); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = TIMDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null && TIMElementTypes.isKnownElementType(elementType)) {
			image = TIMElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	* @generated
	*/
	public String getText(Object element) {
		if (element instanceof TIMNavigatorGroup) {
			TIMNavigatorGroup group = (TIMNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof TIMNavigatorItem) {
			TIMNavigatorItem navigatorItem = (TIMNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	* @generated
	*/
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (TIMVisualIDRegistry.getVisualID(view)) {
		case GlobalTraceModelEditPart.VISUAL_ID:
			return getGlobalTraceModel_1000Text(view);
		case SystemRequirementEditPart.VISUAL_ID:
			return getSystemRequirement_2001Text(view);
		case FunctionalRequirementEditPart.VISUAL_ID:
			return getFunctionalRequirement_2002Text(view);
		case ModelEditPart.VISUAL_ID:
			return getModel_2003Text(view);
		case TestEditPart.VISUAL_ID:
			return getTest_2004Text(view);
		case GTMControllerEditPart.VISUAL_ID:
			return getGTMController_2005Text(view);
		case LTMControllerEditPart.VISUAL_ID:
			return getLTMController_2006Text(view);
		case GTMVersionEditPart.VISUAL_ID:
			return getGTMVersion_2007Text(view);
		case Change_Request_TicketEditPart.VISUAL_ID:
			return getChange_Request_Ticket_2008Text(view);
		case DeriveEditPart.VISUAL_ID:
			return getDerive_4001Text(view);
		case ImplementEditPart.VISUAL_ID:
			return getImplement_4002Text(view);
		case VerifyEditPart.VISUAL_ID:
			return getVerify_4003Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getGlobalTraceModel_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getSystemRequirement_2001Text(View view) {
		IParser parser = TIMParserProvider.getParser(TIMElementTypes.SystemRequirement_2001,
				view.getElement() != null ? view.getElement() : view,
				TIMVisualIDRegistry.getType(SystemRequirementArtifactIDProgressEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TIMDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getFunctionalRequirement_2002Text(View view) {
		IParser parser = TIMParserProvider.getParser(TIMElementTypes.FunctionalRequirement_2002,
				view.getElement() != null ? view.getElement() : view,
				TIMVisualIDRegistry.getType(FunctionalRequirementArtifactIDProgressEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TIMDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getModel_2003Text(View view) {
		IParser parser = TIMParserProvider.getParser(TIMElementTypes.Model_2003,
				view.getElement() != null ? view.getElement() : view,
				TIMVisualIDRegistry.getType(ModelArtifactIDProgressEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TIMDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTest_2004Text(View view) {
		IParser parser = TIMParserProvider.getParser(TIMElementTypes.Test_2004,
				view.getElement() != null ? view.getElement() : view,
				TIMVisualIDRegistry.getType(TestArtifactIDProgressEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TIMDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getGTMController_2005Text(View view) {
		IParser parser = TIMParserProvider.getParser(TIMElementTypes.GTMController_2005,
				view.getElement() != null ? view.getElement() : view,
				TIMVisualIDRegistry.getType(GTMControllerCreateNewCRLtmCREditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TIMDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLTMController_2006Text(View view) {
		IParser parser = TIMParserProvider.getParser(TIMElementTypes.LTMController_2006,
				view.getElement() != null ? view.getElement() : view,
				TIMVisualIDRegistry.getType(LTMControllerCompleteEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TIMDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getGTMVersion_2007Text(View view) {
		IParser parser = TIMParserProvider.getParser(TIMElementTypes.GTMVersion_2007,
				view.getElement() != null ? view.getElement() : view,
				TIMVisualIDRegistry.getType(GTMVersionVersionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TIMDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getChange_Request_Ticket_2008Text(View view) {
		IParser parser = TIMParserProvider.getParser(TIMElementTypes.Change_Request_Ticket_2008,
				view.getElement() != null ? view.getElement() : view,
				TIMVisualIDRegistry.getType(Change_Request_TicketCrIDEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TIMDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDerive_4001Text(View view) {
		IParser parser = TIMParserProvider.getParser(TIMElementTypes.Derive_4001,
				view.getElement() != null ? view.getElement() : view,
				TIMVisualIDRegistry.getType(DeriveTypeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TIMDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getImplement_4002Text(View view) {
		IParser parser = TIMParserProvider.getParser(TIMElementTypes.Implement_4002,
				view.getElement() != null ? view.getElement() : view,
				TIMVisualIDRegistry.getType(ImplementTypeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TIMDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getVerify_4003Text(View view) {
		IParser parser = TIMParserProvider.getParser(TIMElementTypes.Verify_4003,
				view.getElement() != null ? view.getElement() : view,
				TIMVisualIDRegistry.getType(VerifyTypeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TIMDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public void restoreState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public void saveState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	* @generated
	*/
	private boolean isOwnView(View view) {
		return GlobalTraceModelEditPart.MODEL_ID.equals(TIMVisualIDRegistry.getModelID(view));
	}

}
