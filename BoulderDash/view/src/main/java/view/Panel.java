package view;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import model.*;
import entities.Player;

public class Panel extends JPanel implements KeyListener {
	
	private boolean FirstTime = true;
	public char map[][];
	
	public void paintComponent(Graphics g) {

		super.paintComponent(g);
		
		try {
			
			if(this.FirstTime == true) {
			
			for(int y=0; y < this.map.length; y++) {
	            for(int x=0; x < this.map.length; x++) {
	                 
	            	switch(this.map[y][x]) {
	            	case 'W':
	            		BufferedImage img = ImageIO.read(new File("C:\\Users\\Utilisateur\\git\\ProjectBoulderDash\\BoulderDash\\main\\target\\wall.png"));	
	        			g.drawImage(img, x*16, y*16, this);
	        			break;
	            	case 'S':
	            		BufferedImage img1 = ImageIO.read(new File("C:\\Users\\Utilisateur\\git\\ProjectBoulderDash\\BoulderDash\\main\\target\\stone.png"));	
	        			g.drawImage(img1, x*16, y*16, this);
	        			break;
	            	case 'D':
	            		BufferedImage img2 = ImageIO.read(new File("C:\\Users\\Utilisateur\\git\\ProjectBoulderDash\\BoulderDash\\main\\target\\dirt.png"));	
	        			g.drawImage(img2, x*16, y*16, this);
	        			break;
	            	case 'V':
	            		BufferedImage img3 = ImageIO.read(new File("C:\\Users\\Utilisateur\\git\\ProjectBoulderDash\\BoulderDash\\main\\target\\void.png"));	
	        			g.drawImage(img3, x*16, y*16, this);
	        			break;
	            	case 'G':
	            		BufferedImage img4 = ImageIO.read(new File("C:\\Users\\Utilisateur\\git\\ProjectBoulderDash\\BoulderDash\\main\\target\\diamond.png"));	
	        			g.drawImage(img4, x*16, y*16, this);
	        			break;
	            	case 'P':
	            		BufferedImage img5 = ImageIO.read(new File("C:\\Users\\Utilisateur\\git\\ProjectBoulderDash\\BoulderDash\\main\\target\\SpritePlayer.png"));	
	        			g.drawImage(img5, x*16, y*16, this);
	        			break;
	        			default:break;
	            	
	            	}
	           }
			}
			}
            
            
			
			} catch (IOException e) {
			e.printStackTrace();
		}
		repaint();
	
	}
	
	public void setMap(char[][] map, Panel WindowPanel) {
		
		this.map = map;
	}

	@Override
	public void keyPressed(KeyEvent k) {
		// TODO Auto-generated method stub
		int key = k.getKeyCode();
		switch (key) {
			case KeyEvent.VK_DOWN : 
				Player.boucle();
				this.map = Player.move(3, this.map);
				System.out.println("bas");
				break;
			case KeyEvent.VK_UP:
				this.map = Player.move(4, this.map);
				System.out.println("haut");
				break;
			case KeyEvent.VK_RIGHT:
				this.map = Player.move(2, this.map);
				System.out.println("droite");
				break;
			case KeyEvent.VK_LEFT:
				this.map = Player.move(1, this.map);
				System.out.println("gauche");
				break;
		}
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
		
}

	
	
	
	
	
	

