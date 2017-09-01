

import java.awt.event.*;


public class Lab6ExpControl extends Lab6ExpView implements ActionListener,
                   ItemListener
{   public Lab6ExpModel m = new Lab6ExpModel(this);
    double result;
	public void init()
     {    System.out.println("@ init method of Control Class");
    	      super.init();
    	      // add listeners
    	      bCompute.addActionListener(this);
    	      bStop.addActionListener(this);
    	      ccChoice.addItemListener(this);
      }
    
    
     public void actionPerformed(ActionEvent e)
     { System.out.println("@ actionPerformed in Control Class");    
    	 if (e.getSource() == bCompute) 
    		  { result = m.pCompute(inputTF.getText());
    		    if (result !=0 ) outputL.setText(" SQRT is " + decimal.format(result));
    		    else outputL.setText(" invalid number please retype ");
    		  }
    	 else if (e.getSource() == bStop)  m.pStop();
     }
	public void itemStateChanged(ItemEvent i) {
		System.out.println("@ itemStateChanged in Control Class");  
		if (i.getSource() == ccChoice && ccChoice.getSelectedIndex() == 0 )
			 { System.out.println("Please select a Sound "); 
			   outputL.setText("Please select a sound"); }
		else if (i.getSource() == ccChoice && ccChoice.getSelectedIndex() == 1 ) sa.play();
		else if (i.getSource() == ccChoice && ccChoice.getSelectedIndex() == 2 ) sb.play();
		else if (i.getSource() == ccChoice && ccChoice.getSelectedIndex() == 3 ) sc.play();
		else if (i.getSource() == ccChoice && ccChoice.getSelectedIndex() == 4 ) sd.play();
		}  
    
}