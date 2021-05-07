import java.awt.*;
import java.awt.event.*;

class MenuFrame extends Frame 
implements ActionListener,ItemListener,WindowListener
{
TextArea ta;
MenuFrame(String title)
{
super(title);
ta=new TextArea(10,20);
add(ta);
addWindowListener(this);
MenuBar  mb=new MenuBar();
setMenuBar(mb);

Menu a=new Menu("A");
mb.add(a);
MenuItem a1=new MenuItem("A1");
a1.addActionListener(this);
a.add(a1);
MenuItem a2=new MenuItem("A2");
a2.addActionListener(this);
a.add(a2);

Menu b=new Menu("B");
mb.add(b);
MenuItem b1=new MenuItem("B1");
b1.addActionListener(this);
b.add(b1);
MenuItem b2=new MenuItem("B2");
b2.addActionListener(this);
b.add(b2);

Menu c=new Menu("C");
mb.add(c);
MenuItem c1=new MenuItem("C1");
c1.addActionListener(this);
c.add(c1);
MenuItem c2=new MenuItem("C2");
c2.addActionListener(this);
c.add(c2);

}
public void actionPerformed(ActionEvent ae)
{
ta.append("ActionEvent:"+ae.getActionCommand()+"\n");
}
public void itemStateChanged(ItemEvent ie)
{
CheckboxMenuItem cbmi=(CheckboxMenuItem)ie.getSource();
ta.append("ItemEvent:"+cbmi.getLabel()+"\n");
}
public void windowActivated(WindowEvent we)
{
}
public void windowClosed(WindowEvent we)
{
}
public void windowClosing(WindowEvent we)
{
dispose();
}
public void windowDeactivated(WindowEvent we)
{
}
public void windowIconified(WindowEvent we)
{
}
public void windowDeiconified(WindowEvent we)
{
}
public void windowOpened(WindowEvent we)
{
}
}


public class FMenuItemEvents
{
public static void main(String a[])
{
MenuFrame mf=new MenuFrame("MyFrame");
mf.setVisible(true);
mf.setSize(300,300);
}
}





















