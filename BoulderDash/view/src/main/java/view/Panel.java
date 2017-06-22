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
	public char map[][];
	
	public void paintComponent(Graphics g) {
		//System.out.println("paint compnentn : " + FirstTime);
		super.paintComponent(g);
		
		try {

			System.out.println("Avant If : "+this.FirstTime);
			if(this.FirstTime == true) {
				for(int i = 0; i < map.length; i++) {
		            for(int j =0; j < map.length; j++) {
		            	System.out.print(map[i][j]);
		            }
		            System.out.println("");
				}
				System.out.println("If : "+this.FirstTime);
				//System.out.println("true");
				
				//return;
			
			//ReadData data = new ReadData();
			
			for(int y=0; y < this.map.length; y++) {
	            for(int x=0; x < this.map.length; x++) {
	                 
	            	switch(this.map[y][x]) {
	            	case 'W':
	            		BufferedImage img = ImageIO.read(new File("\\Ressourcies\\wall.png"));	
	        			g.drawImage(img, x*16, y*16, this);
	        			break;
	            	case 'S':
	            		BufferedImage img1 = ImageIO.read(new File("\\Ressourcies\\stone.png"));	
	        			g.drawImage(img1, x*16, y*16, this);
	        			break;
	            	case 'D':
	            		BufferedImage img2 = ImageIO.read(new File("\\Ressourcies\\dirt.png"));	
	        			g.drawImage(img2, x*16, y*16, this);
	        			break;
	            	case 'V':
	            		BufferedImage img3 = ImageIO.read(new File("\\Ressourcies\\void.png"));	
	        			g.drawImage(img3, x*16, y*16, this);
	        			break;
	            	case 'G':
	            		BufferedImage img4 = ImageIO.read(new File("\\Ressourcies\\diamond.png"));	
	        			g.drawImage(img4, x*16, y*16, this);
	        			break;
	            	case 'P':
	            		BufferedImage img5 = ImageIO.read(new File("\\Ressourcies\\SpritePlayer.png"));	
	        			g.drawImage(img5, x*16, y*16, this);
	        			break;
	        			default:break;
	            	
	            	}
	           }
			}
			}
		
			
	           
	                
	             
	 
	            
	            //System.out.println("");
	            //System.out.println("fin ligne");
	        

            //System.out.println("fin tableau");
            
            
			
			} catch (IOException e) {
			e.printStackTrace();
		}

		//this.FirstTime=true;
		//System.out.println(FirstTime);
		repaint();
	
	}
	
	public void setMap(char[][] map, Panel WindowPanel) {
		
		this.map = map;
		/*for(int i = 0; i < this.map.length; i++) {
            for(int j =0; j < this.map.length; j++) {
                 
                System.out.print(this.map[i][j]);
             
 
            }
            System.out.println("");
        }*/
		System.out.println("setmap");
	}
		
}

	
	
	
	
	
	

