/*
 * 
 */
package TIM.diagram.providers;

import TIM.diagram.part.TIMDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	* @generated
	*/
	public static ElementInitializers getInstance() {
		ElementInitializers cached = TIMDiagramEditorPlugin.getInstance().getElementInitializers();
		if (cached == null) {
			TIMDiagramEditorPlugin.getInstance().setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
