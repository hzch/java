import java.awt.Graphics;
import javax.swing.JApplet;
//<applet code="WelcomeJavaApplet.class" width=300 height=60></applet>
public class WelcomeJavaApplet extends JApplet
{
	public void paint(Graphics g)
	{
		g.drawString("Welocome to Java",20,40);
	}
}