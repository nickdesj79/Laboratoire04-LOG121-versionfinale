package commandes;

import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import vues.Vue;

public class ZoomCommand implements MouseWheelListener{

	private Vue vue;

	public ZoomCommand(Vue vue) {
		this.vue = vue;
	}

	@Override
	public void mouseWheelMoved(MouseWheelEvent e) {
		String message;
		int notches = e.getWheelRotation();

			if (notches < 0) {
					zoom();

			} else {
					unzoom();

			}
	}

	private void zoom() {
		
		vue.setScale(0.05);

		vue.setSize();
		vue.removeAll();
		vue.repaint();
	}

	private void unzoom() {
		
		vue.setScale(-0.05);
		vue.setSize();
		vue.removeAll();
		vue.repaint();
	}

}
