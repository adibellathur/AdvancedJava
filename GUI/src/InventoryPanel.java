
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTable;

public class InventoryPanel extends JPanel {
	
	public InventoryPanel() {
		super();
		this.setSize(new Dimension(400 , 200));
		//initialize();
		initializeData();
		setLayout(new GridLayout());
		setVisible(true);
	}
	
	private void initializeData() {
		Object[][] data =  		
			{
			{"Apples" , new Double(0.99)},
			{"Bananas" , new Double(0.56)},
			{"Bread" , new Double(1.99)},
			{"Peanut Butter" , new Double(2.50)}
			};
		String[] columns = {"Name" , "Price"};
		JTable table = new JTable(data , columns);
		add(table);
		
	}
	
	private void initialize() {
		JButton button = new JButton("foo");
		add(button);
		JButton button2 = new JButton("bar");
		add(button2);
		JButton button3 = new JButton("baz");
		add(button3);
	}
	
}
