  /***************************************************************/ 
  /*   Program Name:     Lab 6                                   */ 
  /*                                                             */ 
  /*   Student Name:     Huy Bui			                     */ 
  /*   Semester:         Fall, 2015			                     */ 
  /*   Class-Section:    CoSc10403-15					         */ 
  /*   Instructor:       Dr. Anotonio Sanchez	                 */ 
  /*                                                             */ 
  /*   Program Overview:                                         */ 
  /*     This program creates an applet to learn 			     */ 
  /*     about the solar system.                                 */ 
  /*                                                             */ 
  /*   Input:                                                    */ 
  /*     The user's weight in either pound or kilogram 			 */
  /* 	 The user selects a fact					             */ 
  /*                                                             */ 
  /*   Output:                                                   */ 
  /*     The user's weight on the selected planet                */ 
  /*     The fact on that planet								 */
  /*                                                             */ 
  /*                                                             */ 
  /*   Significant Program Variables:                            */ 
  /*     title - display the title of the applet			     */ 
  /*     list - list of possible planets  					     */ 
  /*     ssLB - display image of the solar system			     */ 
  /*     weight - input user's weight	  						 */
  /*     newweight - output new weight on the planet			 */
  /*     showPlanet, showMoon, engUnit, kmsUnit - checkboxes     */
  /*	 fact - possible facts	 								 */
  /* 	 factinfo - output fact									 */
  /* 										 					 */
  /***************************************************************/
 
import javax.swing.event.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class Lab6 extends Lab4 implements ActionListener, ItemListener, ListSelectionListener
{ 
	public Lab6MD m = new Lab6MD (this);
	public DecimalFormat decimal = new DecimalFormat("###,###,###.##");
	String b;
	Double newW;
	
	public void init(){
		System.out.println("At method init Control");
		super.init();
		
		list.addListSelectionListener(this);
		fact.addItemListener(this);
		
		showMoon.addItemListener(this);
		
		engUnit.addItemListener(this);
		submit.addActionListener(this);
		clear.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		System.out.println("At method ActionPerformed");
		snd3.play();
		newW = m.calWeight(inputWeight.getText());
		
		if (e.getSource() == submit) 
			{
			if ( newW > 0.0 && !engUnit.isSelected()) outputWeight.setText("" + decimal.format(newW) + "  kg");
			else if ( newW > 0.0 && engUnit.isSelected()) outputWeight.setText("" + decimal.format(newW) + "  lbs");
				else outputWeight.setText("Invalid weight. Please retype.");
			}
		if (e.getSource() == clear) m.clearData();
	}
	public void valueChanged(ListSelectionEvent e)
	{
		System.out.println("At method valueChanged");
		m.infoPlanet();
		snd1.play();	
		//show Image 
		
		m.addImage(m.img);
		if (showMoon.isSelected())	m.addImage (m.iM);
		
	}
	public void itemStateChanged(ItemEvent e)
	{
		System.out.println("At method itemStateChanged");
		//set up facts
		b = (String) fact.getSelectedItem();
		snd2.play();
		if (engUnit.isSelected()) m.cvtToEng();
		else if (! engUnit.isSelected()) m.cvtToMks();
				
		//check boxes
		//planet
		Object c = e.getSource();
		
		if (c==showMoon && showMoon.isSelected()) m.addImage(m.iM);
		else if (c==showMoon && ! showMoon.isSelected()) m.addImage(m.img);
				
		//Units
		if (c==engUnit && engUnit.isSelected()) {m.cvtToEng();newW=newW*2.204; outputWeight.setText("" + decimal.format(newW) + "  lbs");}
		else if (c== engUnit && ! engUnit.isSelected()) {m.cvtToMks(); newW=newW/2.204; outputWeight.setText("" + decimal.format(newW) + "  kg");}
		
	}
	
	
}

