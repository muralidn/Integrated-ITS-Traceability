/*
* 
*/
package TIM.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import TIM.diagram.part.TIMVisualIDRegistry;

/**
 * @generated
 */
public class TIMNavigatorSorter extends ViewerSorter {

	/**
	* @generated
	*/
	private static final int GROUP_CATEGORY = 4005;

	/**
	* @generated
	*/
	private static final int SHORTCUTS_CATEGORY = 4004;

	/**
	* @generated
	*/
	public int category(Object element) {
		if (element instanceof TIMNavigatorItem) {
			TIMNavigatorItem item = (TIMNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return TIMVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
