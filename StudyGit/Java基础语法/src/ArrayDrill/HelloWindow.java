package ArrayDrill;


import java.util.concurrent.TimeUnit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class HelloWindow {
	public static void main(String[] args) throws InterruptedException {
		JFrame frame=new JFrame();
		JLabel label=new JLabel("A Label");
		frame.add(label);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(100,300);
		frame.setVisible(true);
		frame.setTitle("hello world");
		TimeUnit.SECONDS.sleep(5);
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				label.setText("Hey! this is Different");	
			}
		});
		
	}

}
