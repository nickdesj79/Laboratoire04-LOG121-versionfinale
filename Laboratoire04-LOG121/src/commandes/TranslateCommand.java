package commandes;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import vues.Vue;

public class TranslateCommand implements MouseMotionListener {

	private int position_souris_x;
	private int position_souris_y;

	private Vue vue;

	private MouseEvent me;

	public TranslateCommand(Vue vue) {
		this.vue = vue;
	}

	public void mouseDragged(MouseEvent arg0) {

		int x = arg0.getLocationOnScreen().x;
		int y = arg0.getLocationOnScreen().y;

		vue.set_x(x);
		vue.set_y(y);

		vue.setLocation();
		vue.removeAll();
		vue.repaint();

		arg0.consume();

	}

	@Override
	public void mouseMoved(MouseEvent arg0) {

	}

}
