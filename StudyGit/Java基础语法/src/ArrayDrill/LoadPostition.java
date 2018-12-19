package ArrayDrill;

import java.awt.Frame;
import java.awt.Window;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JLabel;

import com.term.Factorial;
public class LoadPostition extends Frame {

	public void look() {
		setSize(500,500);
		setLocation(100,100);
		setLocationRelativeTo(null);
		setVisible(true);
		setTitle("hello");
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	public static void main(String[] args) {
		LoadPostition lp=new LoadPostition();
		lp.look();
	
		JLabel lblMsg=new JLabel("hello Word");
		
	}
}
