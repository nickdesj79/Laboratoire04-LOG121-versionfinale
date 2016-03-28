package vues;

import commandes.ZoomCommand;

public class VueZoomer extends Vue {

	public VueZoomer() {
		
		this.addMouseWheelListener(new ZoomCommand(this));
	}

}
