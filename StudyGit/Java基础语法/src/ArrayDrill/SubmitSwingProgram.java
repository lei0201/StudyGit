package ArrayDrill;

import java.awt.HeadlessException;
import java.util.concurrent.TimeUnit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class SubmitSwingProgram extends JFrame {
	JLabel label;
	
	public SubmitSwingProgram(){
		super("hello Swing");
		label=new JLabel("A Label");
		add(label);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setSize(300,400);
		setTitle("hello Window");
	}
	static SubmitSwingProgram ssp;
	public static void main(String[] args) throws InterruptedException {
		SwingUtilities.invokeLater(new Runnable() {
						
			@Override
			public void run() {
				ssp=new SubmitSwingProgram();
				// TODO Auto-generated method stub
							}
		});
		TimeUnit.SECONDS.sleep(5);
		SwingUtilities.invokeLater(new Runnable() {
				
			@Override
			public void run() {
				// TODO Auto-generated method stub
			ssp.label.setText("过了五秒钟了");	
			}
		});
	}

}
