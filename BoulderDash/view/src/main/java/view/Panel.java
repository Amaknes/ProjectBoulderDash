package view;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import model.*;

public class Panel extends JPanel  {
	
	
	public void paintComponent(Graphics g) {
		try {
			
			ReadData data = new ReadData();
			
			for(int i = 0; i < data.tabMap.length; i++) {
	            for(int j =0; j < data.tabMap.length; j++) {
	                 
	            	switch(data.tabMap[i][j]) {
	            	case 'W':
	            		BufferedImage img = ImageIO.read(new File("C:\\Users\\Utilisateur\\git\\ProjectBoulderDash\\Ressourcies\\wall.png"));	
	        			g.drawImage(img, i*16, j*16, this);
	        			break;
	            	case 'S':
	            		BufferedImage img1 = ImageIO.read(new File("C:\\Users\\Utilisateur\\git\\ProjectBoulderDash\\Ressourcies\\stone.png"));	
	        			g.drawImage(img1, i*16, j*16, this);
	        			break;
	            	case 'D':
	            		BufferedImage img2 = ImageIO.read(new File("C:\\Users\\Utilisateur\\git\\ProjectBoulderDash\\Ressourcies\\dirt.png"));	
	        			g.drawImage(img2, i*16, j*16, this);
	        			break;
	            	case 'V':
	            		BufferedImage img3 = ImageIO.read(new File("C:\\Users\\Utilisateur\\git\\ProjectBoulderDash\\Ressourcies\\void.png"));	
	        			g.drawImage(img3, i*16, j*16, this);
	        			break;
	            	case 'G':
	            		BufferedImage img4 = ImageIO.read(new File("C:\\Users\\Utilisateur\\git\\ProjectBoulderDash\\Ressourcies\\diamond.png"));	
	        			g.drawImage(img4, i*16, j*16, this);
	        			break;
	            	}
	                System.out.print(data.tabMap[i][j]);
	             
	 
	            }
	            System.out.println("");
	            System.out.println("fin ligne");
	        }

            System.out.println("fin tableau");
            
            
			
			} catch (IOException e) {
			e.printStackTrace();
		}
		

	}
	
	
	
}
