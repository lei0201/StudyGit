package ArrayDrill;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Ziti extends JFrame {
	JButton b;
	JCheckBox fontName;
	JTextArea area;
	FontDialog fd=new FontDialog();
	String [] fontArry;
	String strArr1="睿亚训java课程实验指导书（第二版）";
			
	public static void main(String[] args) {
	Ziti frame=new Ziti();
	frame.setBounds(600, 250, 800, 600);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setTitle("设置字体");
	frame.setVisible(true);
	}
Ziti(){
	fd.ziti = this;
	area = new JTextArea(5, 10);
	setLayout(new BorderLayout());
	b = new JButton("设置字体");
	b.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			if (e.getActionCommand().equals("设置字体")) {
				fd.setVisible(true);
			}
		}
	});
	area.setText(strArr1);
	add(b, BorderLayout.NORTH);
	add(new JScrollPane(area));


}
void setArea(Font font) {
	area.setFont(font);
}
}
