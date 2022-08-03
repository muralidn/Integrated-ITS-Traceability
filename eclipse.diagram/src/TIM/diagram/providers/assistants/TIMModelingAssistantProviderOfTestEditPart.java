/*
 * 
 */
package TIM.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import TIM.diagram.edit.parts.TestEditPart;
import TIM.diagram.providers.TIMElementTypes;
import TIM.diagram.providers.TIMModelingAssistantProvider;

/**
 * @generated
 */
public class TIMModelingAssistantProviderOfTestEditPart extends TIMModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((TestEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(TestEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(TIMElementTypes.Verify_4003);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((TestEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(TestEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == TIMElementTypes.Verify_4003) {
			types.add(TIMElementTypes.FunctionalRequirement_2002);
		}
		return types;
	}

}
