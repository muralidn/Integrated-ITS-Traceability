/*
 * 
 */
package TIM.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import TIM.diagram.edit.parts.ModelEditPart;
import TIM.diagram.providers.TIMElementTypes;
import TIM.diagram.providers.TIMModelingAssistantProvider;

/**
 * @generated
 */
public class TIMModelingAssistantProviderOfModelEditPart extends TIMModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((ModelEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(ModelEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(TIMElementTypes.Implement_4002);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((ModelEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(ModelEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == TIMElementTypes.Implement_4002) {
			types.add(TIMElementTypes.FunctionalRequirement_2002);
		}
		return types;
	}

}
