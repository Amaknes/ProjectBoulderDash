package entities;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

/**
 * 
 * @author Flavien Spataro
 * @since 2017-06-19
 * 
 *
 */
public class Player extends Entities {

	public Player(String name, Image path, char code) {
		super(name, path, code);
		// TODO Auto-generated constructor stub
	}
	
	public static char[][] move(int a, char[][] tabMap){
		
		if(a==1) { //left
			int found=0;
			for(int y = 0; y < 25; y++) {
	            for(int x =0; x < 25; x++) {
	                 
	            	if(tabMap[y][x]=='P' && found==0) {
	            		if(tabMap[y][x+1]=='W') {
	            			found=1;
	            			break;
	            		}
	            		tabMap[y][x] = 'V';
	            		tabMap[y][x+1] = 'P';
	            		found=1;
	            		break;
	            	}
	            }
	        }
		}
		
		return tabMap;
	}
}
