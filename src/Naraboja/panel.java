package Naraboja;


import javax.swing.JPanel;

public abstract class panel extends JPanel{
	
	public panel(){	
		setBounds(250,10,1250,750);
		setVisible(true);
		setLayout(null);
		setVisible(false);
	}
	
	
	abstract void addTextarea();
	abstract void addLabel();
	abstract void addButton();
	abstract void addCombobox();
	abstract void addTextfield();
	
}
