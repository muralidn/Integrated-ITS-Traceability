/*
 * 
 */
package TIM.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import TIM.TIMPackage;
import TIM.diagram.edit.parts.Change_Request_TicketCrIDEditPart;
import TIM.diagram.edit.parts.DeriveTypeEditPart;
import TIM.diagram.edit.parts.FunctionalRequirementArtifactIDProgressEditPart;
import TIM.diagram.edit.parts.GTMControllerCreateNewCRLtmCREditPart;
import TIM.diagram.edit.parts.GTMVersionVersionEditPart;
import TIM.diagram.edit.parts.ImplementTypeEditPart;
import TIM.diagram.edit.parts.LTMControllerCompleteEditPart;
import TIM.diagram.edit.parts.ModelArtifactIDProgressEditPart;
import TIM.diagram.edit.parts.SystemRequirementArtifactIDProgressEditPart;
import TIM.diagram.edit.parts.TestArtifactIDProgressEditPart;
import TIM.diagram.edit.parts.VerifyTypeEditPart;
import TIM.diagram.parsers.MessageFormatParser;
import TIM.diagram.part.TIMVisualIDRegistry;

/**
 * @generated
 */
public class TIMParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser systemRequirementArtifactIDProgress_5001Parser;

	/**
	* @generated
	*/
	private IParser getSystemRequirementArtifactIDProgress_5001Parser() {
		if (systemRequirementArtifactIDProgress_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { TIMPackage.eINSTANCE.getArtifact_ArtifactID(),
					TIMPackage.eINSTANCE.getArtifact_Progress() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}, Progress: {1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}, Progress: {1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}, Progress: {1}"); //$NON-NLS-1$
			systemRequirementArtifactIDProgress_5001Parser = parser;
		}
		return systemRequirementArtifactIDProgress_5001Parser;
	}

	/**
	* @generated
	*/
	private IParser functionalRequirementArtifactIDProgress_5002Parser;

	/**
	* @generated
	*/
	private IParser getFunctionalRequirementArtifactIDProgress_5002Parser() {
		if (functionalRequirementArtifactIDProgress_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { TIMPackage.eINSTANCE.getArtifact_ArtifactID(),
					TIMPackage.eINSTANCE.getArtifact_Progress() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}, Progress: {1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}, Progress: {1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}, Progress: {1}"); //$NON-NLS-1$
			functionalRequirementArtifactIDProgress_5002Parser = parser;
		}
		return functionalRequirementArtifactIDProgress_5002Parser;
	}

	/**
	* @generated
	*/
	private IParser modelArtifactIDProgress_5003Parser;

	/**
	* @generated
	*/
	private IParser getModelArtifactIDProgress_5003Parser() {
		if (modelArtifactIDProgress_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { TIMPackage.eINSTANCE.getArtifact_ArtifactID(),
					TIMPackage.eINSTANCE.getArtifact_Progress() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}, Progress: {1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}, Progress: {1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}, Progress: {1}"); //$NON-NLS-1$
			modelArtifactIDProgress_5003Parser = parser;
		}
		return modelArtifactIDProgress_5003Parser;
	}

	/**
	* @generated
	*/
	private IParser testArtifactIDProgress_5004Parser;

	/**
	* @generated
	*/
	private IParser getTestArtifactIDProgress_5004Parser() {
		if (testArtifactIDProgress_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { TIMPackage.eINSTANCE.getArtifact_ArtifactID(),
					TIMPackage.eINSTANCE.getArtifact_Progress() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}, Progress: {1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}, Progress: {1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}, Progress: {1}"); //$NON-NLS-1$
			testArtifactIDProgress_5004Parser = parser;
		}
		return testArtifactIDProgress_5004Parser;
	}

	/**
	* @generated
	*/
	private IParser gTMControllerCreateNewCRLtmCR_5005Parser;

	/**
	* @generated
	*/
	private IParser getGTMControllerCreateNewCRLtmCR_5005Parser() {
		if (gTMControllerCreateNewCRLtmCR_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { TIMPackage.eINSTANCE.getGTMController_CreateNewCR(),
					TIMPackage.eINSTANCE.getGTMController_LtmCR() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Create New CR: {0} (OR) LTM CR: {1}"); //$NON-NLS-1$
			parser.setEditorPattern("Create New CR: {0} (OR) LTM CR: {1}"); //$NON-NLS-1$
			parser.setEditPattern("Create New CR: {0} (OR) LTM CR: {1}"); //$NON-NLS-1$
			gTMControllerCreateNewCRLtmCR_5005Parser = parser;
		}
		return gTMControllerCreateNewCRLtmCR_5005Parser;
	}

	/**
	* @generated
	*/
	private IParser lTMControllerComplete_5006Parser;

	/**
	* @generated
	*/
	private IParser getLTMControllerComplete_5006Parser() {
		if (lTMControllerComplete_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { TIMPackage.eINSTANCE.getLTMController_Complete() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("CR Complete: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("CR Complete: {0}"); //$NON-NLS-1$
			parser.setEditPattern("CR Complete: {0}"); //$NON-NLS-1$
			lTMControllerComplete_5006Parser = parser;
		}
		return lTMControllerComplete_5006Parser;
	}

	/**
	* @generated
	*/
	private IParser gTMVersionVersion_5007Parser;

	/**
	* @generated
	*/
	private IParser getGTMVersionVersion_5007Parser() {
		if (gTMVersionVersion_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { TIMPackage.eINSTANCE.getGTMVersion_Version() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Build Version: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Build Version: {0}"); //$NON-NLS-1$
			parser.setEditPattern("Build Version: {0}"); //$NON-NLS-1$
			gTMVersionVersion_5007Parser = parser;
		}
		return gTMVersionVersion_5007Parser;
	}

	/**
	* @generated
	*/
	private IParser change_Request_TicketCrID_5008Parser;

	/**
	* @generated
	*/
	private IParser getChange_Request_TicketCrID_5008Parser() {
		if (change_Request_TicketCrID_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { TIMPackage.eINSTANCE.getChange_Request_Ticket_CrID() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("CR - #{0}"); //$NON-NLS-1$
			parser.setEditorPattern("CR - #{0}"); //$NON-NLS-1$
			parser.setEditPattern("CR - #{0}"); //$NON-NLS-1$
			change_Request_TicketCrID_5008Parser = parser;
		}
		return change_Request_TicketCrID_5008Parser;
	}

	/**
	* @generated
	*/
	private IParser deriveType_6001Parser;

	/**
	* @generated
	*/
	private IParser getDeriveType_6001Parser() {
		if (deriveType_6001Parser == null) {
			EAttribute[] features = new EAttribute[] { TIMPackage.eINSTANCE.getDerive_Type() };
			MessageFormatParser parser = new MessageFormatParser(features);
			deriveType_6001Parser = parser;
		}
		return deriveType_6001Parser;
	}

	/**
	* @generated
	*/
	private IParser implementType_6002Parser;

	/**
	* @generated
	*/
	private IParser getImplementType_6002Parser() {
		if (implementType_6002Parser == null) {
			EAttribute[] features = new EAttribute[] { TIMPackage.eINSTANCE.getImplement_Type() };
			MessageFormatParser parser = new MessageFormatParser(features);
			implementType_6002Parser = parser;
		}
		return implementType_6002Parser;
	}

	/**
	* @generated
	*/
	private IParser verifyType_6003Parser;

	/**
	* @generated
	*/
	private IParser getVerifyType_6003Parser() {
		if (verifyType_6003Parser == null) {
			EAttribute[] features = new EAttribute[] { TIMPackage.eINSTANCE.getVerify_Type() };
			MessageFormatParser parser = new MessageFormatParser(features);
			verifyType_6003Parser = parser;
		}
		return verifyType_6003Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case SystemRequirementArtifactIDProgressEditPart.VISUAL_ID:
			return getSystemRequirementArtifactIDProgress_5001Parser();
		case FunctionalRequirementArtifactIDProgressEditPart.VISUAL_ID:
			return getFunctionalRequirementArtifactIDProgress_5002Parser();
		case ModelArtifactIDProgressEditPart.VISUAL_ID:
			return getModelArtifactIDProgress_5003Parser();
		case TestArtifactIDProgressEditPart.VISUAL_ID:
			return getTestArtifactIDProgress_5004Parser();
		case GTMControllerCreateNewCRLtmCREditPart.VISUAL_ID:
			return getGTMControllerCreateNewCRLtmCR_5005Parser();
		case LTMControllerCompleteEditPart.VISUAL_ID:
			return getLTMControllerComplete_5006Parser();
		case GTMVersionVersionEditPart.VISUAL_ID:
			return getGTMVersionVersion_5007Parser();
		case Change_Request_TicketCrIDEditPart.VISUAL_ID:
			return getChange_Request_TicketCrID_5008Parser();
		case DeriveTypeEditPart.VISUAL_ID:
			return getDeriveType_6001Parser();
		case ImplementTypeEditPart.VISUAL_ID:
			return getImplementType_6002Parser();
		case VerifyTypeEditPart.VISUAL_ID:
			return getVerifyType_6003Parser();
		}
		return null;
	}

	/**
	* Utility method that consults ParserService
	* @generated
	*/
	public static IParser getParser(IElementType type, EObject object, String parserHint) {
		return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
	}

	/**
	* @generated
	*/
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(TIMVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(TIMVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (TIMElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	* @generated
	*/
	private static class HintAdapter extends ParserHintAdapter {

		/**
		* @generated
		*/
		private final IElementType elementType;

		/**
		* @generated
		*/
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		* @generated
		*/
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
