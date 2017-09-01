/*******************************************************************/
/*   Program Name:     Listener Border                            */
/*                                                                 */
/*   Student Name:     A Sanchez                                   */
/*   Semester:         Fall 2015                                   */
/*   Class-Section:    CoSc10403-(15/45)                              */
/*   Instructor:       Dr. Antonio Sanchez                         */
/*      @author  E.S.Boese
/*      @modified version fall 2015                                                               */
/*   Program Overview:                                             */
/*     This program creates a controller JApplet                    */
/*      extending the BorderLayoutNested as view                                                           */
/*   Input:                                                        */
/*     Button listener                      */
/*                                                                 */
/*   Output:                                                       */
/*      Changes the color of the Applet      */
/*                                                                 */
/*   Program Limitations:                                          */
/*     The buttons are active.                                   */
/*                                                                 */
/*   Significant Program Variables:                                */
/*                                                                 */
/*******************************************************************/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ListenerBorder extends BorderLayoutNested
		implements ActionListener
{ // this class extends the BorderLayoutNested class thus having access to the methods and objects of thta super claass
   public void init( )
   {     System.out.println("Method init controller called by browser"); // print message on the console
         super.init(); // call the init method of the view, i.e. BorderLayoutNested is the super
         setUpButtons();  // call the setUpBottoms method 
   } // end method init

   public void setUpButtons( )
   {   System.out.println("Method setUpButtons called by init"); // print message on the console
	   // change label in buttons
	   bNC.setText("Magenta");
	   bSC.setText("Cyan");
	  // change color foreground of buttons  
	   bNC.setForeground(Color.magenta);
	   bSC.setForeground(Color.cyan);
	   //add events listener
	   bNC.addActionListener( this );
	   bSC.addActionListener( this );
   } // end method setUpButtons
   // method definition for action listener
   public void actionPerformed( ActionEvent event )
   {   String command = event.getActionCommand();// alternative way to determine the button name
       System.out.println("Method actionPerformed called by the event interaction with button "+ command); // print message on the console
		Object obj = event.getSource( );  //get the source of the event
		// using the obj
		if( obj ==  bNC )  changeBackground(Color.magenta);
		  else changeBackground(Color.cyan);
		// validate(); repaint();  // call these methods to force validation and repaint 
	 }  // end method actionPerformed
   // method definition with a parameter in this case the color of the Background
   public void changeBackground(Color selection)
   {   System.out.println("Method changeBackground called by actionPerfomed with color "+ selection.toString()); // print message on the console
        nP.setBackground(selection); // change background of panel 
	    sP.setBackground(selection); // change background of panel 
	    bW.setForeground(selection); // change foreground of button 
   } // end method changeBackground
   
} // end of JApplet i.e. class ListenerBorder
