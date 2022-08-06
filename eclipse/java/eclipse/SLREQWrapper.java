package eclipse;

import org.eclipse.epsilon.emc.simulink.requirement.model.SimulinkRequirementModel;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;

import java.io.File;

public class SLREQWrapper {
	SimulinkRequirementModel reqModel = null;
	
	public SLREQWrapper() {
		reqModel = new SimulinkRequirementModel();
		reqModel.setFile(new File("/Users/navee/MATLAB/Projects/examples/CruiseRequirementsExample/documents/crs_req_func_spec.slreqx"));
		reqModel.setReadOnLoad(true);
		reqModel.setStoredOnDisposal(false);
		reqModel.setName("SLREQ");
		reqModel.setProject("/Users/navee/MATLAB/Projects/examples/CruiseRequirementsExample/CruiseRequirementsExample.prj");

	}
	
	public int loadModel () {
		try {
			reqModel.load();
		} catch (EolModelLoadingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			reqModel.close();
			return -2;
		}
		return 0;
		
	}
	
	public SimulinkRequirementModel getmodel() {
		return reqModel;
	}
	
	public void closeModel () {
		reqModel.close();
		
	}
}
