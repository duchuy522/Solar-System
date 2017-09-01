/*******************************************************************/
/*   Program Name:     ControllerGrid                           */
/*                                                                 */
/*   Student Name:     A Sanchez                                   */
/*   Semester:         Fall 2015                                   */
/*   Class-Section:    CoSc10403-(15/45)                              */
/*   Instructor:       Dr. Antonio Sanchez                         */
/*      @author  E.S.Boese
/*      @modified version fall 2015                                                               */
/*   Program Overview:                                             */
/*      This program creates a controller JApplet                    */
/*      extending the GridLayoutEx.java as view
 * and calling the ModelGrid.java as Model                                                           */
/*   Input:                                                        */
/*     Button listeners                      */
/*                                                                 */
/*   Output:                                                       */
/*      Changes the color and size of the Applet     
 *       also it pops uo a frame window    */
/*                                                                 */
/*   Program Limitations:                                          */
/*     The buttons are active.                                   */
/*                                                                 */
/*   Significant Program Variables:    int x                              */
/*                                                                 */
/*******************************************************************/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ControllerGrid extends GridLayoutEx
		implements ActionListener
{ // this class extends the GridLayoutEx class thus having access to the methods and objects of thta super claass
    int x=300; // defines a variable x to be use for the size of the JApplet
	// creates an object of the Model type to have access to methods and objects
    ModelGrid m = new ModelGrid(this);
	public void init( )
   {     System.out.println("Method init controller called by browser"); // print message on the console
         super.init(); // call the init method of the view, i.e. GridLayoutEx is the super
         setUpButtons();  // call the setUpBottoms method 
         setSize(x,x); // redefine the size of JApplet
         tf33.setText("300");
         validate(); repaint();  // call these methods to force validation and repaint 
   } // end method init

   public void setUpButtons( )
   {   System.out.println("Method setUpButtons called by init"); // print message on the console
	   // change label in buttons
	   b1.setText("Pop Up Frame");
	   b21a.setText("Pink");
	   b21b.setText("Magenta");
	   b6.setText("Resize");
	  // change color foreground of buttons  
	  
	   b21b.setForeground(Color.magenta);
	   b21a.setForeground(Color.pink);
	   //add events listener
	   b1.addActionListener( this );
	   b21a.addActionListener( this );
	   b6.addActionListener( this );
	   b21b.addActionListener( this );
   } // end method setUpButtons
   
   // method definition for action listener
   // in this case the method calls for methods in the controller by referring to them as m.----
   public void actionPerformed( ActionEvent event )
   {   String command = event.getActionCommand();// alternative way to determine the button name
       System.out.println("Method actionPerformed called by the event interaction with button "+ command); // print message on the console
		// Object obj = event.getSource( );  //get the source of the event
		// using the command as a string
		if( command.equals("Pop Up Frame") ) 
			 { m.createFrame(); b1.setText("Delete Frame"); }
		  else if( command.equals("Delete Frame") )
			 { m.popUpFrame.dispose(); b1.setText("Pop Up Frame"); }
		   else if( command.equals("Pink") ) m.changeBackground(Color.pink);
		    else if( command.equals("Magenta") ) m.changeBackground(Color.magenta);
		     else  m.changeSize();
		// validate(); repaint();  // call these methods to force validation and repaint 
	 }  // end method actionPerformed
  
   
} // end of JApplet i.e. class ControllerGrid
