package eclipse;

import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;

public class EMFModelWrapper {
	private EmfModel model = null;
	
	public EMFModelWrapper(String modelPath, String metamodelFile, String modelName) {
		model = new EmfModel();
		model.setMetamodelFile(metamodelFile);
		model.setModelFile(modelPath);
		model.setName(modelName);
		model.setReadOnLoad(true);
		model.setStoredOnDisposal(true);		
	}
	
	public int loadModel () {
		try {
			model.load();
		} catch (EolModelLoadingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			model.close();
			return -2;
		}
		return 0;
		
	}
	
	public EmfModel getmodel() {
		return model;
	}
	
	public void closeModel () {
		model.close();
		
	}
}
