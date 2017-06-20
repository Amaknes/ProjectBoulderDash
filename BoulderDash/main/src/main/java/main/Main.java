package main;


import controller.Controller;

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
     */
    public static void main(final String[] args){
        Controller controller = new Controller();
        controller.start(1);
    }

}
