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
	
	public static void move(int a, char[][] tabMap){
		
		if(a==1) { //left
			int found=0;
			for(int i = 0; i < 25; i++) {
	            for(int j =0; j < 25; j++) {
	                 
	            	if(tabMap[i][j]=='P' && found==0) {
	            		if(tabMap[i][j+1]=='W') {
	            			found=1;
	            			break;
	            		}
	            		tabMap[i][j] = 'V';
	            		tabMap[i][j+1] = 'P';
	            		found=1;
	            		break;
	            	}
	            }
	        }
			for(int i = 0; i < 25; i++) {
	            for(int j =0; j < 25; j++) {
	            	System.out.print(tabMap[i][j]);		
	            }
	            System.out.println("");
	        }
	        System.out.println("");
		}
	}
}
