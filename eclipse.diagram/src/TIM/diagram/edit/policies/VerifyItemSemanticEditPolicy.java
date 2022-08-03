/*
* 
*/
package TIM.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import TIM.diagram.providers.TIMElementTypes;

/**
 * @generated
 */
public class VerifyItemSemanticEditPolicy extends TIMBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public VerifyItemSemanticEditPolicy() {
		super(TIMElementTypes.Verify_4003);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
