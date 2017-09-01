
public class Lab6ExpModel 
{    Lab6ExpControl c;
     public Lab6ExpModel(Lab6ExpControl fromC)
     {    System.out.println("@ contructor in Model Class");
    	      c = fromC;
     }
     public double pCompute(String sData)
     {    System.out.println("@ pCompute in Model Class");
         try{ double  d =  Double.parseDouble(sData);
              c.sn.loop();
              return Math.sqrt(d); }
        catch (NumberFormatException e)
	    { System.out.println("invalid double number " + sData + " please retype ");
	      return 0.0; }   
     }
     public void pStop()
     {    System.out.println("@ pStop in Model Class");
          c.ccChoice.setSelectedIndex(0);
          c.inputTF.setText("");
          c.outputL.setText("square root calculation");
          c.sn.stop();
    	      
     }
     
     
}