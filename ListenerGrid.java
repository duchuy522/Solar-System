/*******************************************************************/
/*   Program Name:     ListenerGrid                           */
/*                                                                 */
/*   Student Name:     A Sanchez                                   */
/*   Semester:         Fall 2015                                   */
/*   Class-Section:    CoSc10403-(15/45)                              */
/*   Instructor:       Dr. Antonio Sanchez                         */
/*      @author  E.S.Boese
/*      @modified version fall 2015                                                               */
/*   Program Overview:                                             */
/*      This program creates a controller JApplet                    */
/*      extending the GridLayoutEx as view                                                           */
/*   Input:                                                        */
/*     Button listener                      */
/*                                                                 */
/*   Output:                                                       */
/*      Changes the color and size of the Applet      */
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
public class ListenerGrid extends GridLayoutEx
		implements ActionListener
{ // this class extends the GridLayoutEx class thus having access to the methods and objects of thta super claass
    int x=300; // defines a variable x to be use for the size of the JApplet
	
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
	   b1.setText("Magenta");
	   b21a.setText("Pink");
	   b21b.setText("Cyan");
	   b6.setText("Resize");
	  // change color foreground of buttons  
	   b1.setForeground(Color.magenta);
	   b21b.setForeground(Color.cyan);
	   b21a.setForeground(Color.pink);
	   //add events listener
	   b1.addActionListener( this );
	   b21a.addActionListener( this );
	   b6.addActionListener( this );
	   b21b.addActionListener( this );
   } // end method setUpButtons
   // method definition for action listener
   public void actionPerformed( ActionEvent event )
   {   String command = event.getActionCommand();// alternative way to determine the button name
       System.out.println("Method actionPerformed called by the event interaction with button "+ command); // print message on the console
		// Object obj = event.getSource( );  //get the source of the event
		// using the command as a string
		if( command.equals("Magenta") ) changeBackground(Color.magenta);
		  else if( command.equals("Pink") ) changeBackground(Color.pink);
		    else if( command.equals("Cyan") ) changeBackground(Color.cyan);
		    else  changeSize();
		// validate(); repaint();  // call these methods to force validation and repaint 
	 }  // end method actionPerformed
   // method definition with a parameter in this case the color of the Background
   public void changeBackground(Color selection)
   {   System.out.println("Method changeBackground called by actionPerfomed with color "+ selection.toString()); // print message on the console
        panel11.setBackground(selection); // change background of panel 
	    panel21.setBackground(selection); // change background of panel 
	    panel33.setBackground(selection); // change background of panel 
   } // end method changeBackground
   
   public void changeSize()
   {   System.out.println("Method changeSize called by actionPerfomed"); // print message on the console
        String text = tf33.getText(); // read the text value for intege x
        x = Integer.parseInt(text); // parse the text to convert to an integer
        setSize(x,x);  // set the size of the JApplet
        validate(); repaint();  // call these methods to force validation and repaint 
       
   } // end method changeSize
   
} // end of JApplet i.e. class ListenerGrid
