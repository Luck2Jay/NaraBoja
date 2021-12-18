package Naraboja;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JTextArea;

public class guidePanel extends panel{
	
	public guidePanel(boolean b) {
		super();
		addTextarea();
		addLabel();
		addButton();
		addCombobox();
		addTextfield();
		setvisible(b);
	}

	void addTextarea() {
		
	      JTextArea txtrPopArea = new JTextArea();
	      txtrPopArea.setText("1. Choose Country");
	      txtrPopArea.setFont(new Font("Lucida Grande", Font.PLAIN, 28));
	      txtrPopArea.setBounds(55, 248, 325, 63);
	      add(txtrPopArea);
	      
	      JTextArea txtrCheckKorea = new JTextArea();
	      txtrCheckKorea.setText("2. Check Korea");
	      txtrCheckKorea.setFont(new Font("Lucida Grande", Font.PLAIN, 28));
	      txtrCheckKorea.setBounds(55, 378, 325, 63);
	      add(txtrCheckKorea);
	      
	      JTextArea txtrCheckAnother = new JTextArea();
	      txtrCheckAnother.setText("3. Check other Country");
	      txtrCheckAnother.setFont(new Font("Lucida Grande", Font.PLAIN, 28));
	      txtrCheckAnother.setBounds(55, 504, 325, 63);
	      add(txtrCheckAnother);
	      
	      JTextArea txtrReapeat = new JTextArea();
	      txtrReapeat.setText("Compare Both Country");
	      txtrReapeat.setFont(new Font("Lucida Grande", Font.PLAIN, 28));
	      txtrReapeat.setBounds(55, 629, 325, 63);
	      add(txtrReapeat);
	      
	      JTextArea txtrChooseCountry = new JTextArea();
	      txtrChooseCountry.setText("1. Choose Country");
	      txtrChooseCountry.setFont(new Font("Lucida Grande", Font.PLAIN, 28));
	      txtrChooseCountry.setBounds(496, 248, 325, 63);
	      add(txtrChooseCountry);
	      
	      JTextArea txtrCheckGeo = new JTextArea();
	      txtrCheckGeo.setText("2. Check Geo Info\n");
	      txtrCheckGeo.setFont(new Font("Lucida Grande", Font.PLAIN, 28));
	      txtrCheckGeo.setBounds(496, 378, 325, 63);
	      add(txtrCheckGeo);
	      
	      JTextArea txtrCheckCulture = new JTextArea();
	      txtrCheckCulture.setText("3. Check Culture Info\n");
	      txtrCheckCulture.setFont(new Font("Lucida Grande", Font.PLAIN, 28));
	      txtrCheckCulture.setBounds(496, 504, 325, 63);
	      add(txtrCheckCulture);
	      
	      JTextArea txtrCompareBothInfo = new JTextArea();
	      txtrCompareBothInfo.setText("Compare Both Info\n");
	      txtrCompareBothInfo.setFont(new Font("Lucida Grande", Font.PLAIN, 28));
	      txtrCompareBothInfo.setBounds(496, 629, 325, 63);
	      add(txtrCompareBothInfo);
	      
	      JTextArea txtrPressCsvOut = new JTextArea();
	      txtrPressCsvOut.setText("1. Press CSV OUT");
	      txtrPressCsvOut.setFont(new Font("Lucida Grande", Font.PLAIN, 28));
	      txtrPressCsvOut.setBounds(945, 248, 245, 63);
	      add(txtrPressCsvOut);
	      
	      JTextArea txtrCheckFile = new JTextArea();
	      txtrCheckFile.setText("2. Check File");
	      txtrCheckFile.setFont(new Font("Lucida Grande", Font.PLAIN, 28));
	      txtrCheckFile.setBounds(945, 378, 245, 63);
	      add(txtrCheckFile);
	}
	
	
	 void addLabel() {
		
		JLabel guideLabel = new JLabel("How to Use");
	    guideLabel.setFont(new Font("Lucida Grande", Font.BOLD, 42));
	    guideLabel.setBounds(25, 23, 366, 80);
	    add(guideLabel);
	      
	    JLabel popareaLabel = new JLabel("Population & Area");
	    popareaLabel.setFont(new Font("Lucida Grande", Font.BOLD, 36));
	    popareaLabel.setBounds(45, 183, 414, 44);
	    add(popareaLabel);
	      
	    JLabel geoculLabel = new JLabel("Geography & Culture");
	    geoculLabel.setFont(new Font("Lucida Grande", Font.BOLD, 36));
	    geoculLabel.setBounds(460, 183, 414, 44);
	    add(geoculLabel);
	      
	    JLabel csvLabel = new JLabel("CSV OUT");
	    csvLabel.setFont(new Font("Lucida Grande", Font.BOLD, 36));
	    csvLabel.setBounds(985, 183, 414, 44);
	    add(csvLabel);
	      
	      
	}
	
	private void setvisible(boolean b) {
		setVisible(b);
	}


	@Override
	void addButton() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void addCombobox() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void addTextfield() {
		// TODO Auto-generated method stub
		
	}
}
	