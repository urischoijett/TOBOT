import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class UserIO extends JFrame{
	private JPanel startPanel;
	
	public UserIO(){
		setResizable(false);
		setSize(new Dimension(800, 600));	
		
		startPanel = new JPanel(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		setContentPane(startPanel);
		
		//Contents of startPanel
		JLabel header = new JLabel("Start a tournament!");
		
		
		
		
		//setVisible(true);
	}
	
	
	
};
