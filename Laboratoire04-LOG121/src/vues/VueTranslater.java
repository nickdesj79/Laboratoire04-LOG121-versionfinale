package vues;

import commandes.TranslateCommand;

public class VueTranslater extends Vue {

	public VueTranslater() {
		this.addMouseMotionListener(new TranslateCommand(this));
	}

}
