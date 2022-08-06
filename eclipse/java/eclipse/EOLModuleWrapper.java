package eclipse;

import org.eclipse.epsilon.eol.EolModule;
import java.io.File;

public class EOLModuleWrapper {
	private EolModule eolModule = null;
	
	public EOLModuleWrapper() {
		eolModule = new EolModule();		
	}
	
	private void addEMFModel (EMFModelWrapper model) {
		eolModule.getContext().getModelRepository().addModel(model.getmodel());
	}
	
	private void addSimulinkModel (SLREQWrapper model) {
		eolModule.getContext().getModelRepository().addModel(model.getmodel());
	}
	
	public void addModel (EMFModelWrapper model) {
		addEMFModel(model);
	}

	public void addModel (SLREQWrapper model) {
		addSimulinkModel(model);
	}	
	
	private int parseEOLString (String eolStatements) {
		try {
			eolModule.parse(eolStatements);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1;
		}
		return 0;
	}
	
	private int parseEOLFile (File eolFile) {
		try {
			eolModule.parse(eolFile);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1;
		}
		return 0;
	}
	
	public int parseEOL(String eolStatement) {
		return parseEOLString (eolStatement);
	}

	public int parseEOL(File eolFile) {
		return parseEOLFile (eolFile);
	}
	
	
	public int executeEOL () {
		try {
			eolModule.execute();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1;
		}
		return 0;
	}
	
	public Object getEOLVariable(String variableName) {
		
		return eolModule.getContext().getFrameStack().get(variableName).getValue();
	}
}
