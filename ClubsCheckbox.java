import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ClubsCheckbox extends JFrame{

  public boolean[] clubsCategories = new boolean[3];
  private JCheckBox cs,ds,math;
  
  public ClubsCheckbox(){
    setLayout(new FlowLayout());
    clubsCategories = {false,false,false};
    cs = new JCheckBox("CS clubs");
    ds = new JCheckBox("DS clubs");
    math = new JCheckBox("Math clubs");
    add(cs);
    add(ds);
    add(math);
    
    HandlerClass handler = new HandlerClass();
    cs.addItemListener(handler);
    ds.addItemListener(handler);
    math.addItemListener(handler); 
  }
  
  private HandlerClass implements ItemListener{
    public void itemStateChanged(ItemEvent event){
      boolean clubs = null;
      if(cs.isSelected()){
        clubsCategories[0]=true;
      }
      if(ds.isSelected()){
        clubsCategories[1]=true;
      }
      if(math.isSelected()){
        clubsCategories[2]=true;
      }
      
      if(!cs.isSelected()){
        clubsCategories[0]=false;
      }
      if(!ds.isSelected()){
        clubsCategories[1]=false;
      }
      if(!math.isSelected()){
        clubsCategories[2]=false;
      }
    }
  }
}
