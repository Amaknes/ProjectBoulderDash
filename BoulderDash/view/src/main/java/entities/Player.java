package entities;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
/**
 * 
 * @author Flavien Spataro
 * @since 2017-06-19
 * 
 *
 */
public class Player extends Entities implements KeyListener {
	
	private int posX;
	private int posY;
	
	public Player(String name, Image path, char code) {
		super(name, path, code);
		// TODO Auto-generated constructor stub
	}
	
	public static void boucle(){
		System.out.println("touche");
	}
	
	public static char[][] move(int a, char[][] tabMap){
		System.out.println("Move !");
		
		int depX = 0;
		int depY = 0;
		switch(a) {
			case 1: depX=-1; depY=0; break;
			case 2:depX=1; depY=0; break;
			case 3: depY=1; depX=0; break;
			case 4: depY=-1; depX=0;break;
			default:break;
		}
		
		//if(a==1) { //left
			int found=0;
			for(int y = 0; y < 25; y++) {
	            for(int x =0; x < 25; x++) {
	                 
	            	if(tabMap[y][x]=='P' && found==0) {
	            		if(tabMap[y+depY][x+depX]=='W') {
	            			found=1;
	            			break;
	            		}
	            		tabMap[y][x] = 'V';
	            		tabMap[y+depY][x+depX] = 'P';
	            		System.out.println("Player actuel : "+x+","+y+" | Move pos : "+x+depX+","+y+depY);
	            		found=1;
	            		break;
	            	}
	            }
	        }
		//}
		System.out.println(depX);
		return tabMap;
	}

	@Override
	public void keyPressed(KeyEvent k) {
		// TODO Auto-generated method stub
		int key = k.getKeyCode();
		switch (key) {
			case KeyEvent.VK_DOWN :
				getkeypressed(1);
				break;
			case KeyEvent.VK_UP:
				getkeypressed(2);
				//move(2, tabMap);
				break;
			case KeyEvent.VK_RIGHT:
				getkeypressed(3);
				//move(3, char[][] tabMap);
				break;
			case KeyEvent.VK_LEFT:
				getkeypressed(4);
				//move(4, char[][] tabMap);
				break;
		}
	}
	
	public static int getkeypressed(int a){
		return a;
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
