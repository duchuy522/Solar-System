 
import javax.swing.*;
import java.applet.AudioClip;
import java.awt.*;

public class Lab4 extends JApplet
{
	JLabel title = new JLabel("SOLAR SYSTEM");
	JLabel planetT;
	Font titleF = new Font("Serif", Font.BOLD, 30);
	Font planetF = new Font("SansSerif", Font.BOLD + Font.ITALIC, 20);
	
	DefaultListModel model = new DefaultListModel();
	JList list = new JList(model);
			
	JComboBox fact = new JComboBox();
	JTextField factinfo = new JTextField("Fact Box",10);
	JLabel unit = new JLabel("Unit");
	
	Image iSS,iMe,iVe,iEa,iMa,iAs,iJu,iSa,iUr,iNe,iPl,iMPl,iMJu,iMMa,iMNe,iMEa,iMUr,iMSa,iMNM;
	ImageIcon imgIC;
	JLabel imgLB;
	AudioClip snd1, snd2,snd3;
	
	
	JCheckBox showMoon = new JCheckBox("Show Moon");	
	JCheckBox engUnit = new JCheckBox("English Unit");
	
	JLabel weight = new JLabel("Your Weight on Earth");
	JTextField inputWeight = new JTextField(20);
	JLabel newWeight = new JLabel("Your Weight on this Planet");
	JTextField outputWeight = new JTextField(20);
	
	JButton submit = new JButton("Submit");
	JButton clear = new JButton("Clear");
	
	Color bgrColor = new Color (83,51,234);
	JPanel center, newCenter;
	
	
	String surfaceA;
	
	public void init()
	{
		System.out.println("At method init View");
		setLayout(new BorderLayout());
		doTitle();
		doLeftside();
		doCenter();
		doRightside();
		doBottom();
		addImg();
		addSound();
		setSize(520,580);
	}
	
	public void doTitle()
	{
		JPanel titleP = new JPanel(new FlowLayout());
			title.setFont(titleF);
			title.setForeground(Color.RED);
		titleP.add(title);
		titleP.setBackground(bgrColor);
		add(titleP,BorderLayout.NORTH);
			
	}
	
	public void doRightside()
	{	
		JPanel rightSide = new JPanel (new GridLayout(2,1));
		JPanel upRight = new JPanel (new GridLayout(2,1));
		JPanel factBoxP = new JPanel (new FlowLayout());
		
		factBoxP.setOpaque(false);
		upRight.setOpaque(false);
		
		fact.addItem("Select a fact");
		fact.addItem("Orbit");
		fact.addItem("Density");
		fact.addItem("Surface Area");
		fact.addItem("Gravity");
	
		
		JPanel factP = new JPanel(new FlowLayout());
		factP.setOpaque(false);
		factP.add(fact);
		showMoon.setOpaque(false);
		upRight.add(factP);
		upRight.add(showMoon);
		
		rightSide.add(upRight);
		factBoxP.add(factinfo);
		factBoxP.add(unit);
		rightSide.add(factBoxP);
		
		rightSide.setBackground(bgrColor);
		add(rightSide, BorderLayout.EAST);
	}
	
	public void doLeftside()
	{	
		JPanel leftSide = new JPanel(new FlowLayout());
		model.addElement("Solar System");
		model.addElement("Mercury");
		model.addElement("Venus");
		model.addElement("Earth");
		model.addElement("Mars");
		model.addElement("Asteroids");
		model.addElement("Jupiter");
		model.addElement("Saturn");
		model.addElement("Uranus");
		model.addElement("Neptune");
		model.addElement("Pluto");
		
		leftSide.add(list);
		leftSide.setBackground(bgrColor);
		add(leftSide,BorderLayout.WEST);
					
	}
	
	public void doCenter()
	{
		planetT = new JLabel("Solar System");
			planetT.setFont(planetF);
		center = new JPanel(new FlowLayout());
		iSS = getImage(getCodeBase(), "Images/ss.jpg");
		imgIC = new ImageIcon(iSS);
		imgLB = new JLabel(imgIC);
		center.add(imgLB);
		center.add(planetT);
		center.setBackground(bgrColor);
		add(center,BorderLayout.CENTER);
	}
	
	public void doBottom()
	{
		JPanel bottom = new JPanel(new GridLayout(2,1));
		JPanel bottom1 = new JPanel (new GridLayout(4,1));
		JPanel bottom2 = new JPanel (new FlowLayout());
		JPanel weightEP = new JPanel(new FlowLayout());
		JTextArea tutorial = new JTextArea ("SOLAR SYSTEM \n ---------------------------"
				+ " \n - Select a planet \n - Select a fact \n - Put in your weight \n - Change Unit if necessary \n - Press Submit \n - Press Clear", 7,30);
		
		weightEP.setOpaque(false);
			weightEP.add(weight);
			weightEP.add(inputWeight);
		bottom1.add(weightEP);
		
		JPanel weightPP = new JPanel(new FlowLayout());
		weightPP.setOpaque(false);
			weightPP.add(newWeight);
			weightPP.add(outputWeight);
		bottom1.add(weightPP);
		JPanel kmsU = new JPanel(new FlowLayout());
		kmsU.setOpaque(false); engUnit.setOpaque(false);
		kmsU.add(engUnit);
		bottom1.add(kmsU);
		
		JPanel subcle = new JPanel(new FlowLayout());
		subcle.setOpaque(false);
			subcle.add(submit);
			subcle.add(clear);
			submit.setFocusPainted(false);
			clear.setFocusPainted(false);
		bottom1.add(subcle);
		bottom1.setBackground(bgrColor);
		bottom2.add(tutorial);
		bottom2.setBackground(bgrColor);
		bottom.add(bottom1); bottom.add(bottom2);
		add(bottom, BorderLayout.SOUTH);
	}
	public void addImg()
	{	iMe = getImage(getCodeBase(), "Images/mercury.jpg");
		iMa = getImage(getCodeBase(), "Images/mars.jpg");
		iVe = getImage(getCodeBase(), "Images/venus.jpg");
		iEa = getImage(getCodeBase(), "Images/earth.jpg"); 
		iAs = getImage(getCodeBase(), "Images/asteroids.jpg"); 
		iJu = getImage(getCodeBase(), "Images/jupiter.jpg");
		iSa = getImage(getCodeBase(), "Images/saturn.jpg");
		iUr = getImage(getCodeBase(), "Images/uranus.jpg");
		iNe = getImage(getCodeBase(), "Images/neptune.jpg");
		iPl = getImage(getCodeBase(), "Images/pluto.jpg");
		iMPl = getImage(getCodeBase(), "Images/charon.jpg");
		iMJu = getImage(getCodeBase(), "Images/jupiterMoons.jpg");
		iMEa = getImage(getCodeBase(), "Images/moon.jpg");
		iMNe = getImage(getCodeBase(), "Images/neptuneMoon.jpg");
		iMMa = getImage(getCodeBase(), "Images/phobos.jpg");
		iMSa = getImage(getCodeBase(), "Images/saturnRings.jpg");
		iMUr = getImage(getCodeBase(), "Images/uranusMoons.jpg");
		iMNM =getImage(getCodeBase(), "Images/noMoons.jpg");
	}
	public void addSound(){
		snd1 = getAudioClip(getCodeBase(), "sounds/clickM.wav");
		snd2 = getAudioClip(getCodeBase(), "sounds/clickU.wav");
		snd3 = getAudioClip(getCodeBase(), "sounds/clickB.wav");
	}
}
