package view;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Panel extends JPanel {
	public void paintComponent(Graphics g) {
		try {
			BufferedImage img = ImageIO.read(new File("Ressourcies//wall.png"));	
			g.drawImage(img, 0, 0, this);
			BufferedImage img1 = ImageIO.read(new File("Ressourcies//stone.png"));	
			g.drawImage(img1, 16, 0, this);
			
		} catch (IOException e) {
			e.printStackTrace();
		}

		}
}
