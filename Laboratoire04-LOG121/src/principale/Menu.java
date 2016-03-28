package principale;

import java.awt.Dimension;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import actions.ActionQuitter;

public class Menu extends JMenuBar  {

	public Menu() {
		this.setPreferredSize(new Dimension(1200,30));
		this.setVisible(true);
		JMenuItem[] tabItems = new JMenuItem[] {new JMenuItem("Quitter")};
		ActionListener[] tabActions = new ActionListener[] {new ActionQuitter()};
		ajouterMenus("Fichier", tabItems, tabActions);
	}

	public void ajouterMenus(String nom, JMenuItem[] tabItems, ActionListener[] tabActions) {
		JMenu menu = new JMenu("Fichier");

		for (int i = 0; i < tabItems.length; i++) {
			menu.add(tabItems[i]);
			menu.getItem(i).addActionListener(tabActions[i]);
		}
		
		this.add(menu);
	}

}
