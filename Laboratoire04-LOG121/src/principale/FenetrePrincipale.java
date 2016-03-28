package principale;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class FenetrePrincipale extends JFrame {
	
	private Menu menu = new Menu();
	private ZoneGraphique ecranDaffichage = new ZoneGraphique();

	public FenetrePrincipale() {
		
		this.setTitle("Laboratoire 04 - LOG121");
		this.setBounds(100,100,1200,800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		this.setResizable(false);
		
		this.add(menu, BorderLayout.NORTH);
		
		this.add(ecranDaffichage, BorderLayout.CENTER);
		
		
		this.setVisible(true);
		
		
	}

	public static void main(String[] args) {
		FenetrePrincipale fp = new FenetrePrincipale();
	}

}
