package vues;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JPanel;

public class Vue extends JPanel{
	
	private int width = 250, height = 200;
	
	private Image img;
	
	private int _x;
	private int _y;

	private double scale = 1.00;

	public Vue() {
		this.setBackground(Color.green);
		this.setSize((int)(width * scale), (int)(height * scale));
		
		_x = this.getX();
		_y = this.getY();
	}
	
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		
		g.drawImage(img, 0, 0, this.getWidth(),this.getHeight(),this);
		
	}
	
	public void setImage(Image img) {
		this.img = img;
	}
	
	public void setLocation() {
		this.setLocation(_x, _y);
	}
	
	public void setSize() {
		this.setSize((int)(width * scale), (int)(height*scale));
	}
	
	public void setScale(double x){
		scale += x;
		if(scale <= 0.05)
			scale = 0.05;
	}
	
	public void set_x(int _x) {
		this._x = _x;
	}

	public void set_y(int _y) {
		this._y = _y;
	}

}
