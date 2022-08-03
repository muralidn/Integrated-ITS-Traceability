/*
 * 
 */
package TIM.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import TIM.diagram.providers.TIMElementTypes;
import TIM.diagram.providers.TIMModelingAssistantProvider;

/**
 * @generated
 */
public class TIMModelingAssistantProviderOfGlobalTraceModelEditPart extends TIMModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(8);
		types.add(TIMElementTypes.SystemRequirement_2001);
		types.add(TIMElementTypes.FunctionalRequirement_2002);
		types.add(TIMElementTypes.Model_2003);
		types.add(TIMElementTypes.Test_2004);
		types.add(TIMElementTypes.GTMController_2005);
		types.add(TIMElementTypes.LTMController_2006);
		types.add(TIMElementTypes.GTMVersion_2007);
		types.add(TIMElementTypes.Change_Request_Ticket_2008);
		return types;
	}

}
