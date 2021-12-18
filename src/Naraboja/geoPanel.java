package Naraboja;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class geoPanel extends panel {

	CountryInfo db = new CountryInfo();
	
	private JLabel countryLabel;
	private JLabel culInfor;
	private JLabel geoInfor;
	private JTextArea cultureField;
	private JTextArea geoField;
	private JComboBox cultureBox;
	
	public geoPanel(boolean b) {
		super();
		addTextarea();
		addLabel();
		addButton();
		addCombobox();
		addTextfield();
		setvisible(b);
		}

	private void setvisible(boolean b) {
		setVisible(b);
	}

	
	@Override
	void addTextarea() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void addLabel() {
		// TODO Auto-generated method stub
		countryLabel = new JLabel("Country");
	    countryLabel.setFont(new Font("굴림", Font.BOLD, 32));
	    countryLabel.setBounds(44, 58, 216, 52);
	    add(countryLabel);
	      
	    culInfor = new JLabel("문화정보");
	    culInfor.setFont(new Font("굴림", Font.BOLD, 20));
	    culInfor.setBounds(206, 189, 99, 24);
	    add(culInfor);
	      
	    geoInfor = new JLabel("지리정보");
	    geoInfor.setFont(new Font("굴림", Font.BOLD, 20));
	    geoInfor.setBounds(782, 189, 99, 24);
	    add(geoInfor);
	      
	}

	@Override
	void addButton() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void addCombobox() {
		// TODO Auto-generated method stub
		  cultureBox = new JComboBox(db.getCountry());
	      cultureBox.setFont(new Font("Lucida Grande", Font.PLAIN, 21));
	      cultureBox.setBounds(200, 58, 240, 45);
	      cultureBox.setBackground(Color.WHITE);
	      
	      add(cultureBox);
	      cultureBox.addActionListener(new ActionListener() { // AreaPanel ComboBox
	          public void actionPerformed(ActionEvent e) {
	             
	             String country = cultureBox.getSelectedItem().toString();
	             System.out.println(country);
	             
	             String loc = db.getTextInfo(country,"위치");
	             String cli = db.getTextInfo(country,"기후");
	             String maincity = db.getTextInfo(country,"주요도시");
	             String rel = db.getTextInfo(country,"종교");
	             String pre = db.getTextInfo(country,"언론");
	             String lang = db.getTextInfo(country,"언어");
	             
	             
	             try {
	                
	                String geo = "\n\n"+"위치: "+loc+"\n\n\n\n"+"기후 : "+cli+"\n\n\n\n"+"주요 도시 : "+maincity;
	                geoField.setText(geo);
	                geoField.setLineWrap(true);
	             
	                String culture = "\n\n"+"종교 : "+rel+"\n\n\n\n"+"언론 : "+pre+"\n\n\n\n"+"주요 언어 : "+lang;
	                cultureField.setText(culture);
	                cultureField.setLineWrap(true);
	                
	                
	             }
	             catch(Exception exc) {
	                System.out.println("Change your Selection");
	             }
	          }
	       });      
	}

	@Override
	void addTextfield() {
		// TODO Auto-generated method stub
		cultureField = new JTextArea();
	      cultureField.setFont(new Font("굴림", Font.PLAIN, 18));
	      cultureField.setBounds(57, 229, 414, 467);
	      add(cultureField);
	      cultureField.setColumns(10);
	      
	      geoField = new JTextArea();
	      geoField.setFont(new Font("굴림", Font.PLAIN, 18));
	      geoField.setColumns(10);
	      geoField.setBounds(624, 229, 414, 467);
	      add(geoField);
	      setVisible(false);
	      
		
	}

}
