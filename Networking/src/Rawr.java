import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;


public class Rawr extends JFrame implements ActionListener{
	
	JTextArea pane;
	JTextField field;
	ChatClient client;
	
	public static void main (String[] args) {
		new Rawr();
	}

	public Rawr() {
		super("Rawr Instant Messenger");
		setSize(new Dimension(400 , 600));
		setLayout(new FlowLayout());
		
		client = new ChatClient();
		initialize();
		setVisible(true);
	}
	
	private void initialize() {
		JPanel messagePanel = new JPanel();
		pane = new JTextArea(30 , 40);
		pane.setEditable(false);
		messagePanel.add(pane);
		add(messagePanel);
		
		
		JPanel submitPanel = new JPanel();
		submitPanel.setLayout(new FlowLayout());
		field = new JTextField(20);
		submitPanel.add(field);
		JButton button = new JButton("send");
		button.setActionCommand("submit");
		button.addActionListener(this);
		submitPanel.add(button);
		add(submitPanel);
	}
	
	public void update() {
		//String contents = pane.getText();
		pane.setText(client.getUpdate(0));
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("submit")) {
			String message = field.getText();
			client.submit(message);
			field.setText("");
			update();
		}
	}
	
}
