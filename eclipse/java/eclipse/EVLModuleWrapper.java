package eclipse;

import java.io.File;

import org.eclipse.epsilon.evl.EvlModule;

public class EVLModuleWrapper {
	private EvlModule evlModule = null;

	public EVLModuleWrapper() {
		evlModule = new EvlModule();		
	}
	
	public void addEMFModel (EMFModelWrapper model) {
		evlModule.getContext().getModelRepository().addModel(model.getmodel());
	}
	
	private int parseEVLString (String eolStatements) {
		try {
			evlModule.parse(eolStatements);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1;
		}
		return 0;
	}
	
	private int parseEVLFile (File eolFile) {
		try {
			evlModule.parse(eolFile);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1;
		}
		return 0;
	}
	
	public int parseEVL(String eolStatement) {
		return parseEVLString (eolStatement);
	}

	public int parseEVL(File eolFile) {
		return parseEVLFile (eolFile);
	}
	
	
	public int executeEVL () {
		try {
			evlModule.execute();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1;
		}
		return 0;
	}
	
	public Object getEOLVariable(String variableName) {
		
		return evlModule.getContext().getFrameStack().get(variableName).getValue();
	}	
	
}
