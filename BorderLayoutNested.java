
/*******************************************************************/
/*   Program Name:      BorderLayoutNested                         */
/*                                  */
/*   Semester:         Fall 2015                                   */
/*   Class-Section:    CoSc10403-(15/45)                              */
/*   Instructor:       Dr. Antonio Sanchez                         */
/*      @author  E.S.Boese
 *      modified by A Sanchez
 */
/*      @version fall 2015                                         */
/*   Program Overview:                                             */
/*     This program creates a simple Java applet                   */
/*      Shows the use of nested Border Layouts using methods       */
/*   Input:                                                        */
/*     There is no user input to this program.                     */
/*                                                                 */
/*   Output:                                                       */
/*     An applet displaying a nested GUI      */
/*                                                                 */
/*   Program Limitations:                                          */
/*     The buttons are inactive.                                   */
/*                                                                 */
/*   Significant Program Variables:                                */
/*                                                                 */
/*******************************************************************/

// import the all awt and swing classes 
import java.awt.*;
import javax.swing.*;

public class BorderLayoutNested extends JApplet
{    // global variables
  	JButton bN, bS, bE, bW, bC; // initial reserve space for basic buttons
  	JPanel nP, sP;  // Panels to be nested
  	JButton bNW, bNE, bSW, bSE, bNC, bSC; // initial reserve space for extended buttons

    public void init( ) 
    {   System.out.println("Method init called by browser"); // print message on the console
       //	fivePoints();  // call method to display simple Border Layout
    	    ninePoints();    // call method to display nested Border Layout
    } // end method init
    
    // method definition for simple 5 location border layout
    public void fivePoints()
    {   System.out.println("Method fivePoints called by method init"); // print message on the console
        setSize(400,400);  // set size of JApplet
		setLayout( new BorderLayout( ) );  // JApplet window layout 
		// using contructors to create the 5 basic buttons
		bN = new JButton( "North" );
		bS = new JButton( "South" );
		bW = new JButton( "Wild ....... Wide ...... West" );  // this text is longer to increase the size of the button
		bE = new JButton( "East" );
		bC = new JButton( "Center" );
        //  calling the method add [from the JApplet library] to display the bottom in this object/class [BorderLayoutNested] 
		add( bN, BorderLayout.NORTH );
		add( bS, BorderLayout.SOUTH );
		add( bW, BorderLayout.WEST );
		add( bE, BorderLayout.EAST );
		add( bC, BorderLayout.CENTER );
		// set the colors for the text in five buttons using the call of the setForeground method in the library for each button [ eg bN.setF  ] 
		bN.setForeground(Color.red);
		bE.setForeground(Color.magenta);
		bW.setForeground(Color.blue);
    } // end of method fivePoints
    
    
    public void ninePoints()
    {   System.out.println("Method ninePoints called by method init"); // print message on the console
    	setSize(400,400);  // set size of JApplet
        setLayout( new BorderLayout( ) );  // JApplet window layout 
	   // using contructors to create the all the buttons and panels
		nP = new JPanel( new BorderLayout( ) );
		sP = new JPanel( new BorderLayout( ) );
		bN = new JButton( "North" );
		bS = new JButton( "South" );
		bW = new JButton( "Wild ....... Wide ...... West" );  // this text is longer to increase the size of the button
		bE = new JButton( "East" );
		bC = new JButton( "Center" );
		bNW = new JButton( "North West" );
		bNE = new JButton( "North East" );
		bSE = new JButton( "South East" );
		bSW = new JButton( "South West" );
		bNC = new JButton( "North Center" );
		bSC = new JButton( "South Center" );
		//  calling the method add [from the JApplet library] to display the bottom and panels using the location
		
		// adding the object to the north panel by defining the object [ eg nP.add( )  for north panel]
	    nP.add( bNW, BorderLayout.WEST );
		   nP.add( bNE, BorderLayout.EAST );
		   nP.add( bNC, BorderLayout.CENTER );
		add( nP, BorderLayout.NORTH ); //  calling the method add to display the north panel in this object/class [BorderLayoutNested] 
		// adding the object to the north panel by defining the object [ eg sP.add( )  for south panel]  
		   sP.add( bSW, BorderLayout.WEST );
		   sP.add( bSE, BorderLayout.EAST );
		   sP.add( bSC, BorderLayout.CENTER );
		add( sP, BorderLayout.SOUTH ); //  calling the method add to display the north panel in this object/class [BorderLayoutNested] 
		add( bW, BorderLayout.WEST );
		add( bE, BorderLayout.EAST );
		add( bC, BorderLayout.CENTER );
		// set the colors for the background of the panel using the call of the setBackground method in the library for each button 
		nP.setBackground(Color.red);
	    sP.setBackground(Color.blue);		
		// set the colors for the text in three buttons using the call of the setForeground method in the library for each button [ eg bN.setF  ] 
		bN.setForeground(Color.red);
		bSC.setForeground(Color.magenta);
		bW.setForeground(Color.blue);
    } // end of method ninePoints
    
} // end of JApplet i.e. class BorderLayoutNested
