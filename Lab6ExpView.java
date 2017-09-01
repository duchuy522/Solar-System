import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

import javax.swing.*;
 

public class Lab6ExpView extends JApplet //implements ActionListener
{    public  JTextField  inputTF = new JTextField(20);
     public AudioClip sa,sb,sc,sd,sn;                         
     public JComboBox         ccChoice = new JComboBox();
     public JButton      bCompute = new JButton("SQRT");
     public JButton      bStop = new JButton("Stop Sound");
     public JLabel       outputL = new JLabel("square root calculation",JLabel.CENTER);
     public JPanel       pg = new JPanel(new BorderLayout());
     public JPanel       pWest = new JPanel(new BorderLayout());
     public JPanel       pCenter = new JPanel(new GridLayout(1,2,10,10));
     public DecimalFormat decimal = new DecimalFormat("###,###.###");
     public Font bF = new Font("SansSerif",Font.BOLD,20);
     
     public void init()
     {    System.out.println("@ init method of View Class");
    	  setLayout(new FlowLayout());
          setSize(400,200);
          add(pg);
          pg.add("West",pWest);
          pg.add("Center",pCenter);
          pg.setBackground(Color.cyan);
          pWest.setBackground(Color.MAGENTA);
          pCenter.setBackground(Color.BLUE);
          addCCitems();
          getSounds();
          pg.add("North",inputTF);
          pg.add("South",outputL);
          outputL.setFont(bF);
          inputTF.setFont(bF);
          pWest.add(ccChoice);
          pCenter.add(bCompute);
          pCenter.add(bStop);
          }
     public void addCCitems()
     {   System.out.println("@ add CCitems in View");
          ccChoice.addItem("..SELECT..");
          ccChoice.addItem("sound a");
          ccChoice.addItem("sound b");
          ccChoice.addItem("sound c");
          ccChoice.addItem("sound d");
     }    
     public void getSounds()    
     { System.out.println("@ get Sounds in View");
    	   sa = getAudioClip(getCodeBase(),"sounds/a.wav");
       sb = getAudioClip(getCodeBase(),"sounds/b.wav");
       sc = getAudioClip(getCodeBase(),"sounds/c.wav");
       sd = getAudioClip(getCodeBase(),"sounds/d.wav");
    	   sn = getAudioClip(getCodeBase(),"sounds/Click.wav");
     }
   
  
}