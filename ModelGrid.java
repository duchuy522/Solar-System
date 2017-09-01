/*******************************************************************/
/*   Program Name:     MdeolGrid                            */
/*                                                                 */
/*   Student Name:     A Sanchez                                   */
/*   Semester:         Fall 2015                                   */
/*   Class-Section:    CoSc10403-(15/45)                              */
/*   Instructor:       Dr. Antonio Sanchez                         */
/*      @author  E.S.Boese
/*      @modified version fall 2015                                                               */
/*   Program Overview:                                             */
/*      This program creates a Model class thta is called by                   */
/*      extending the Controller.java as Control                                                          */
/*   Input:                                                        */
/*      data from textfield                 */
/*                                                                 */
/*   Output:                                                       */
/*      Changes the color and size of the Applet
 *      popr up a JFrame      */
/*                                                                 */
/*   Program Limitations:                                          */
/*      Requires a Controller class                           */
/*                                                                 */
/*   Significant Program Variables:    int   x                           */
/*                                                                 */
/*******************************************************************/
import javax.swing.*;
import java.awt.*;

public class ModelGrid 
{ // this class is model to be call by a controller class 
    // global variable of the type of the controller
    ControllerGrid c;
    // defines a pop up frame
    JFrame popUpFrame = new JFrame("SOLAR SYSTEM");
    public ModelGrid(ControllerGrid fromC)
    {    System.out.println("Constructor of the class with parameter " + fromC.toString()); // print message on the console
     // constructor of the class as parameter the address of the controller
    	// after this all the methods and objects of the controller as accesible by referring them as c.---
    	c = fromC; // c will point to the location of the controller allowing access to objects and methods
    }
	
	public void changeBackground(Color selection)
   {   System.out.println("Method changeBackground called by actionPerfomed with color "+ selection.toString()); // print message on the console
        c.panel11.setBackground(selection); // change background of panel 
	    c.panel21.setBackground(selection); // change background of panel 
	    c.panel33.setBackground(selection); // change background of panel 
   } // end method changeBackground
   
   public void changeSize()
   {   System.out.println("Method changeSize called by actionPerfomed"); // print message on the console
        if(validateInteger(c.tf33))
         { String text = c.tf33.getText(); // read the text value for integer x
           int x = Integer.parseInt(text); // parse the text to convert to an integer
           c.setSize(x,x);  // set the size of the JApplet
           c.validate(); c.repaint();  // call these methods to force validation and repaint 
         }
   } // end method changeSize
   
// Method to create a Pop Up Frame 
 public void createFrame()
 {  System.out.println(" At Method create Frame");
    popUpFrame.setBackground(Color.cyan);
    popUpFrame.setSize(120,120);
    popUpFrame.setBounds(150,150,270,270);
    ImageIcon icon = new ImageIcon(c.getImage(c.getCodeBase(), "images/ss.jpg"));
    JLabel imageLabel = new JLabel(icon);
    JPanel pDisplay= new JPanel(new BorderLayout());
    //pDisplay.add(new PieChartCanvas(), BorderLayout.CENTER);
    pDisplay.add(imageLabel, BorderLayout.CENTER);
    pDisplay.setBackground(Color.cyan);
    // popUpFrame.add(new PieChartCanvas());
    popUpFrame.add(pDisplay);
    popUpFrame.setVisible(true);
 } // end method createFrame
 // this method is used to validate thta an integer is typed in the textfield 
 // if not an exception is catch reporting the error
 public boolean validateInteger(JTextField datum)
 {  System.out.println("Method validateInteger for textfied "+ datum.toString()); // print message on the console
   try  // trye to parse the string as an integer
       {  double  d =  Integer.parseInt(datum.getText());
          return true;
       }
    catch (NumberFormatException e)  // catch the exception to correct error
       {  System.out.println("invalid number " +
                datum.getText() + " please retype ");
          datum.setText("invalid\nretry");
          return false;
       }
 } // end method validateInteger 
 
   
} // end of JApplet i.e. class ModelGrid
