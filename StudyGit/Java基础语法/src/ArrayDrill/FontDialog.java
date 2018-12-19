package ArrayDrill;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class FontDialog extends JDialog implements ItemListener {

	JComboBox fontName;
	JTextArea txtContent;
	Font font1;
	JButton yes,no;
	final String[] fontArr;
	final String strArr="Hello 奥运";
	Ziti ziti;
	public FontDialog() {
		txtContent = new JTextArea();
		txtContent.setText(strArr);
		JScrollPane jsp = new JScrollPane(txtContent);
		GraphicsEnvironment env = GraphicsEnvironment
				.getLocalGraphicsEnvironment();
		fontArr = env.getAvailableFontFamilyNames();
		fontName = new JComboBox(fontArr);
		fontName.addItemListener(this);
		fontName.setSelectedItem("宋体");
		FlowLayout layout = new FlowLayout(FlowLayout.CENTER, 40, 5);
		JPanel pan = new JPanel(layout);
		pan.add(fontName);
		Container c = this.getContentPane();
		yes = new JButton("确定");
		no = new JButton("取消");
		yes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getActionCommand().equals("确定")) {
					ziti.setArea(font1);
					setVisible(false);
				}
			}
		});
		no.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getActionCommand().equals("取消")) {
					setVisible(false);
				}
			}
		});
		JPanel pan2 = new JPanel(layout);
		pan2.add(yes);
		pan2.add(no);
		c.add(pan, BorderLayout.NORTH);
		c.add(jsp, BorderLayout.CENTER);
		c.add(pan2, BorderLayout.SOUTH);
		this.setBounds(600, 260, 400, 300);
		this.setResizable(false);
		this.setVisible(false);

		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		String s=(String) fontName.getSelectedItem();
		font1=new Font(s,Font.PLAIN,55);
		txtContent.setFont(font1);
	}
	

}
