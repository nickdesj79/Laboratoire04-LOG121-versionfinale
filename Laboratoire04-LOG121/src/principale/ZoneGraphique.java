package principale;

import java.awt.Color;
import java.awt.Image;

import javax.swing.JPanel;

import vues.Vue;
import vues.VueTranslater;
import vues.VueZoomer;

public class ZoneGraphique extends JPanel{
	
	
	Vue vue1 = new Vue();
	Vue vue2 = new VueZoomer();
	Vue vue3 = new VueTranslater();
	
	private Image img;

	public ZoneGraphique() {
		
		this.setSize(1200,770);
		this.setBackground(Color.blue);
		
		this.setLayout(null);
		
		
		vue1.setLocation(this.getWidth()/2 - vue1.getWidth() / 2, this.getHeight()/10);
		this.add(vue1);
		
		vue2.setLocation(850,500);
		this.add(vue2);
		
		vue3.setLocation(100,500);
		this.add(vue3);
		
		loadImage();
	}
	
	private void loadImage() {
		img = Loader.getInstance().getImage();
		
		vue1.setImage(img);
		vue2.setImage(img);
		vue3.setImage(img);
		
		
	}

}
