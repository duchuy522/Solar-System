import java.awt.*;

public class Lab6MD 
{	Lab6 c;
	String a;
	Image img,iM;
	Double gra, surfaceA, orbit, density, gravity,surfaceAE, orbitE, densityE, gravityE ;
	public Lab6MD (Lab6 fromC)
	{ 
		System.out.println("At constructor in Model class");
		c = fromC;
		
	}
	public double calWeight(String inputW){
		System.out.println("At method calWeight");
		double newW,a;
		try {
			a = Double.parseDouble(inputW);
			newW = a * gra;
			return(newW);
			}
		catch (NumberFormatException e){
			System.out.println("Invalid double number"+ inputW +"please retype");
			return(0.0);
		}
	}
	public void clearData(){
		System.out.println("At method clearData");
		c.engUnit.setSelected(false);
		c.showMoon.setSelected(false);
		c.newW=null;
		c.inputWeight.setText("");
		c.outputWeight.setText("");
		c.fact.setSelectedIndex(0);
		c.list.setSelectedIndex(0);	
		c.unit.setText("Unit");
		c.factinfo.setText("Fact Box");
	}
		
	public void infoPlanet(){
		System.out.println("At method infoPlanet");
		a = (String) c.list.getSelectedValue();
		
		if (a=="Solar System") { img = c.iSS; iM = c.iSS; }
		if (a=="Mercury") { img = c.iMe; iM = c.iMNM; 
			gra = .38; surfaceA = 74797000.00; orbit = 57909227.0;
			density = 5.427; gravity = 3.7;}
		if (a=="Mars") {img = c.iMa; iM = c.iMMa; 
			gra=0.38;surfaceA = 144371391.00;orbit = 227943824.0;
			density = 3.93; gravity = 3.71;}
		if (a=="Venus") {img = c.iVe ; iM = c.iMNM; 
			gra=0.91;surfaceA = 460234317.00;orbit = 108209475.0;
			density = 5.243; gravity = 8.87; }
		if (a=="Earth") {img = c.iEa;iM=c.iMEa; 
			gra=1.0;surfaceA = 510064472.00;orbit = 149598262.00;
			density = 5.513; gravity = 9.8;}
		if (a=="Asteroids") {img = c.iAs; iM = c.iMNM; 
			gra=0.376;surfaceA = 191922564.04;orbit = 413690250.00;
			density = 2.09; gravity = 0.27; }
		if (a=="Jupiter") {img = c.iJu; iM=c.iMJu; 
			gra=2.53;surfaceA = 61418738571.00;orbit = 778340821.00;
			density = 1.326; gravity = 24.79;}
		if (a=="Saturn") {img = c.iSa; iM = c.iMSa;
			gra=1.07;surfaceA = 42612133285.00;orbit = 1426666422.00;
			density = 0.687; gravity = 10.4;}
		if (a=="Uranus") {img = c.iUr; iM = c.iMUr;
			gra=0.91;surfaceA = 8083079690.00; orbit = 2870658186.00;
			density = 1.27; gravity = 8.87;}
		if (a=="Neptune") {img = c.iNe; iM=c.iMNe;
			gra=1.14;surfaceA = 7618272763.00;orbit = 4498396441.00;
			density = 1.638; gravity = 11.15;}
		if (a=="Pluto") {img = c.iPl; iM = c.iMPl;
			gra=0.185;surfaceA = 94361927.32;orbit = 5906440628.00;
			density = 2.05; gravity = 0.66;}
		orbitE=orbit*0.621; densityE=density*62.428;surfaceAE=surfaceA*0.386; gravityE=gravity*3.281;
	}	
	public void addImage(Image img)
	{
		System.out.println("At method addImage");
		c.imgIC.setImage(img);
		c.imgLB.setIcon(c.imgIC);
		c.planetT.setText(""+a);
		c.repaint();
		
	}
	public void cvtToEng()
	{
		System.out.println("At method convertToEngUnit");
		if (c.b=="Orbit") 				{c.factinfo.setText("" +c.decimal.format(orbitE)); c.unit.setText("miles");}
		if (c.b=="Density") 			{c.factinfo.setText(""+c.decimal.format(densityE)); c.unit.setText("lb/ft3");}
		if (c.b=="Surface Area") 		{c.factinfo.setText(""+c.decimal.format(surfaceAE)); c.unit.setText("miles2");}
		if (c.b=="Gravity") 			{c.factinfo.setText(""+c.decimal.format(gravityE)); c.unit.setText("ft/s2");}
				
	}
	public void cvtToMks()
	{
		System.out.println("At method convertToMksUnit");
		if (c.b=="Orbit") 				{c.factinfo.setText("" +c.decimal.format(orbit)); c.unit.setText("Km");}
		if (c.b=="Density") 			{c.factinfo.setText(""+c.decimal.format(density)); c.unit.setText("g/cm3");}
		if (c.b=="Surface Area") 		{c.factinfo.setText(""+c.decimal.format(surfaceA)); c.unit.setText("Km2");}
		if (c.b=="Gravity") 			{c.factinfo.setText(""+c.decimal.format(gravity));c. unit.setText("m/s2");}
		
	}
}
