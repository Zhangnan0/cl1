package uk.ac.rhul.cs.cl1.ui.cytoscape3;

import org.cytoscape.application.swing.AbstractCyAction;

/**
 * Abstract action superclass for ClusterONE-related actions.
 * @author ntamas
 *
 */
public abstract class AbstractClusterONEAction extends AbstractCyAction {

	/**
	 * The ClusterONE Cytoscape application.
	 */
	protected final CytoscapeApp app;
	
	// --------------------------------------------------------------------
	// Constructors
	// --------------------------------------------------------------------
	
	public AbstractClusterONEAction(CytoscapeApp app, String title) {
		super(title);
		this.app = app;
	}
	
	// --------------------------------------------------------------------
	// Properties
	// --------------------------------------------------------------------

	// --------------------------------------------------------------------
	// Query methods
	// --------------------------------------------------------------------

	// --------------------------------------------------------------------
	// Manipulation methods
	// --------------------------------------------------------------------

	/**
	 * Installs the action in the Apps menu.
	 */
	public void installInMenu() {
		setPreferredMenu(CytoscapeApp.PREFERRED_MENU);
	}
	
	// --------------------------------------------------------------------
	// Private methods
	// --------------------------------------------------------------------

}
