package main;


import java.sql.SQLException;

import controller.Controller;
import controller.Gameloop;
import model.*;

/**
 * <h1>The Class Main.</h1>
 *
 * @author Flavien Spataro
 * @version 1.0
 */
//Verification
public class Main  {

    /**
     * The main method.
     *
     * @param args
     *            the arguments
     * @throws SQLException 
     */
	
    public static void main(final String[] args) throws SQLException{
    	

        ReadData data = new ReadData(); // -> lire base de donnée
       Controller controller = new Controller(1, data.tabMap);
       Gameloop GLBoulderDash = new Gameloop();
       GLBoulderDash.SummonGravity(controller);
    
    }
    }
