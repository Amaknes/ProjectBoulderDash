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
	
	private boolean FirstTime = true;
	
	public void paintComponent(Graphics g) {
		//System.out.println("paint compnentn : " + FirstTime);
		super.paintComponent(g);
		
		try {

			System.out.println("Avant If : "+this.FirstTime);
			if(this.FirstTime == true) {
				System.out.println("If : "+this.FirstTime);
				//System.out.println("true");
				
				//return;
			
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
	            	case 'P':
	            		BufferedImage img5 = ImageIO.read(new File("C:\\Users\\Utilisateur\\git\\ProjectBoulderDash\\Ressourcies\\SpritePlayer.png"));	
	        			g.drawImage(img5, i*16, j*16, this);
	        			break;
	        			default:break;
	            	
	            	}
	           }
			}
			}
		
			
	           else if(this.FirstTime == false) {

					System.out.println("Else : "+this.FirstTime);
	            	BufferedImage img = ImageIO.read(new File("C:\\Users\\Utilisateur\\git\\ProjectBoulderDash\\Ressourcies\\SpritePlayer.png"));	
        			g.drawImage(img, 160, 160, this);
        			
	           }
	                
	             
	 
	            
	            //System.out.println("");
	            //System.out.println("fin ligne");
	        

            //System.out.println("fin tableau");
            
            
			
			} catch (IOException e) {
			e.printStackTrace();
		}

		this.FirstTime=false;
		System.out.println(FirstTime);
		repaint();
	}
		
		/*public void setFirstTime(boolean p) {

			System.out.println("setFirst time : " + FirstTime);
			this.FirstTime=p;
			repaint();
		
		}*/
}

	
	
	
	
	
	

