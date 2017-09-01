/*******************************************************************/
/*   Program Name:     GridLayoutEx                         */
/*                                                                 */
/*                                           */
/*   Semester:         Fall 2015                                   */
/*   Class-Section:    CoSc10403-(15/45)                              */
/*   Instructor:       Dr. Antonio Sanchez                         */
/*      @author  E.S.Boese
/*      @version modified Fall 2015                                  */
/*   Program Overview:                                             */
/*     This program creates a simple Java applet                   */
/*      Shows the use of nested Border Layouts/GridLayouts using methods    */
/*   Input:                                                        */
/*     There is no user input to this program.                     */
/*                                                                 */
/*   Output:                                                       */
/*        An applet displaying a nested GUI   */
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

public class GridLayoutEx extends JApplet
{  // global variables
   	JButton b1, b2, b3, b4, b5, b6; // initial reserve space for basic buttons
	// reserve and create the panels to be nested using the constructor at the this point 
   	JPanel panel21 = new JPanel(); 
	JPanel panel11 = new JPanel();
	JPanel panel33 = new JPanel();
	JButton  b21a, b21b; // initial reserve space for extended buttons
	JTextField tf33; // initial reserve space for  required textfield

	public void init( )
	{   System.out.println("Method init called by browser"); // print message on the console
		setSize(400,400);  // set size of JApplet
		setLayout( new GridLayout(3,2,4,5) ); // JApplet window layout as a 3x2 grid with 4x5 spacing
		// create global objects [i.e. blue] using the constructor
		// note that the JButton b1 = new JButton()  syntax is not used, otherwise the b1 button would be a local one [i.e. brown]
		 b1 = new JButton( "First" );
		b2 = new JButton( "Two" );
		b3 = new JButton( "Three" );
		b4 = new JButton( "Four" );
		b5 = new JButton( "Five" );
		b6 = new JButton( "Six" );
		addToGrid(); // call method to display basic 3,2 grid  Layout
		//nestedGrid(); // call method to display the nested grid Layout
	} // end method init
	
	public void addToGrid()
	{   System.out.println("Method addToGrid called by method init"); // print message on the console
	   //  calling the method add [from the JApplet library] to display in this object/class 
	    add( b1 );
		add( b2 );		
		add( b3 );
	    add( b4 );
        add( b5 );
		add( b6 );
	} // end method addToGrid
	public void nestedGrid()
	{  System.out.println("Method nestedGrid called by method init"); // print message on the console
	  // using contructors to create the GLOBAL 2 buttons and a textfield 
	   b21a = new JButton( "b 21a" );
	   b21b = new JButton( "b 21b" );
	   tf33 = new JTextField("tf 33");
		
	// set the colors for the panels by a call of the setBackground method in the library 
	    panel11.setBackground(Color.green);
		panel21.setBackground(Color.red);
		panel33.setBackground(Color.blue);

		// set the layout  for the nested panels  using the call of the setLayout in the library for the panels 
		panel21.setLayout( new BorderLayout() );  // constructing on the fly a BorderLayout for the nested panel
		panel33.setLayout( new GridLayout(1,2) );  // constructing on the fly a GridLayout  fpr the nested panel
		//  calling the method add [from the JApplet library] to display panels and JButtons in this object/class [BorderLayoutNested] 
		      // adding the object to the panel11 by defining the object [ eg panel11.add( )  ]
		      panel11.add( b1 );
		    add(panel11);
			add( b2 );
			  // adding the objects to the panel21 by defining the object [ eg panel21.add( )  ]
			  panel21.add( b21a, BorderLayout.NORTH );	
		      panel21.add( b21b, BorderLayout.CENTER );
			add( panel21 );
			add( b4 );
			add( b5 );
			  // adding the objects to the panel33 by defining the object [ eg panel33.add( )  ]
			  panel33.add(b6);
			  panel33.add(tf33);
			add( panel33 );
	}// end method addToGrid
}// end JApplet ( i.e. class GridLayoutEx)