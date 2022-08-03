/*
 * 
 */
package TIM.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import TIM.diagram.edit.parts.GlobalTraceModelEditPart;
import TIM.diagram.edit.parts.TIMEditPartFactory;
import TIM.diagram.part.TIMVisualIDRegistry;

/**
 * @generated
 */
public class TIMEditPartProvider extends DefaultEditPartProvider {

	/**
	* @generated
	*/
	public TIMEditPartProvider() {
		super(new TIMEditPartFactory(), TIMVisualIDRegistry.TYPED_INSTANCE, GlobalTraceModelEditPart.MODEL_ID);
	}

}
