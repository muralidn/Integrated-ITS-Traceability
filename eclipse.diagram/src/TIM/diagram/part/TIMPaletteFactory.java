
/*
 * 
 */
package TIM.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import TIM.diagram.providers.TIMElementTypes;

/**
 * @generated
 */
public class TIMPaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
		paletteRoot.add(createConnections2Group());
	}

	/**
	* Creates "Objects" palette tool group
	* @generated
	*/
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createChange_Request_Ticket1CreationTool());
		paletteContainer.add(createFunctionalRequirement2CreationTool());
		paletteContainer.add(createGTMController3CreationTool());
		paletteContainer.add(createGTMVersion4CreationTool());
		paletteContainer.add(createLTMController5CreationTool());
		paletteContainer.add(createModel6CreationTool());
		paletteContainer.add(createSystemRequirement7CreationTool());
		paletteContainer.add(createTest8CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "Connections" palette tool group
	* @generated
	*/
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createDerive1CreationTool());
		paletteContainer.add(createImplement2CreationTool());
		paletteContainer.add(createVerify3CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createChange_Request_Ticket1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Change_Request_Ticket1CreationTool_title,
				Messages.Change_Request_Ticket1CreationTool_desc,
				Collections.singletonList(TIMElementTypes.Change_Request_Ticket_2008));
		entry.setId("createChange_Request_Ticket1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TIMElementTypes.getImageDescriptor(TIMElementTypes.Change_Request_Ticket_2008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createFunctionalRequirement2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.FunctionalRequirement2CreationTool_title,
				Messages.FunctionalRequirement2CreationTool_desc,
				Collections.singletonList(TIMElementTypes.FunctionalRequirement_2002));
		entry.setId("createFunctionalRequirement2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TIMElementTypes.getImageDescriptor(TIMElementTypes.FunctionalRequirement_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createGTMController3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.GTMController3CreationTool_title,
				Messages.GTMController3CreationTool_desc,
				Collections.singletonList(TIMElementTypes.GTMController_2005));
		entry.setId("createGTMController3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TIMElementTypes.getImageDescriptor(TIMElementTypes.GTMController_2005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createGTMVersion4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.GTMVersion4CreationTool_title,
				Messages.GTMVersion4CreationTool_desc, Collections.singletonList(TIMElementTypes.GTMVersion_2007));
		entry.setId("createGTMVersion4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TIMElementTypes.getImageDescriptor(TIMElementTypes.GTMVersion_2007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createLTMController5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.LTMController5CreationTool_title,
				Messages.LTMController5CreationTool_desc,
				Collections.singletonList(TIMElementTypes.LTMController_2006));
		entry.setId("createLTMController5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TIMElementTypes.getImageDescriptor(TIMElementTypes.LTMController_2006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createModel6CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Model6CreationTool_title,
				Messages.Model6CreationTool_desc, Collections.singletonList(TIMElementTypes.Model_2003));
		entry.setId("createModel6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TIMElementTypes.getImageDescriptor(TIMElementTypes.Model_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSystemRequirement7CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.SystemRequirement7CreationTool_title,
				Messages.SystemRequirement7CreationTool_desc,
				Collections.singletonList(TIMElementTypes.SystemRequirement_2001));
		entry.setId("createSystemRequirement7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TIMElementTypes.getImageDescriptor(TIMElementTypes.SystemRequirement_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTest8CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Test8CreationTool_title,
				Messages.Test8CreationTool_desc, Collections.singletonList(TIMElementTypes.Test_2004));
		entry.setId("createTest8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TIMElementTypes.getImageDescriptor(TIMElementTypes.Test_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDerive1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Derive1CreationTool_title,
				Messages.Derive1CreationTool_desc, Collections.singletonList(TIMElementTypes.Derive_4001));
		entry.setId("createDerive1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TIMElementTypes.getImageDescriptor(TIMElementTypes.Derive_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createImplement2CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Implement2CreationTool_title,
				Messages.Implement2CreationTool_desc, Collections.singletonList(TIMElementTypes.Implement_4002));
		entry.setId("createImplement2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TIMElementTypes.getImageDescriptor(TIMElementTypes.Implement_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createVerify3CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Verify3CreationTool_title,
				Messages.Verify3CreationTool_desc, Collections.singletonList(TIMElementTypes.Verify_4003));
		entry.setId("createVerify3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TIMElementTypes.getImageDescriptor(TIMElementTypes.Verify_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
