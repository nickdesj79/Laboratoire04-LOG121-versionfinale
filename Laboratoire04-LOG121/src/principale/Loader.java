package principale;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Loader {

	private static Loader instance = null;
	private Image img;
	
	private Loader(){
		img = loaderImage();
	}
	
	public static Loader getInstance(){
		if(instance == null){
			instance = new Loader();
		}
		
		return instance;
	}
	
	public Image loaderImage(){
	    
		JFileChooser chooser = new JFileChooser();
		
		FileNameExtensionFilter jpgFilter = new FileNameExtensionFilter("JPG", "jpg");
		FileNameExtensionFilter pngFilter = new FileNameExtensionFilter("PNG", "PNG");
		
		chooser.setFileFilter(pngFilter);
		chooser.setFileFilter(jpgFilter);
		
		chooser.showOpenDialog(null);
		
		try {
		    img = ImageIO.read(chooser.getSelectedFile());
		} catch (IOException e) {
		}
		return img;
	}
	
	public Image getImage(){
		return this.img;
	}
}
