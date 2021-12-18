package Naraboja;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class areaPanel extends panel {

	   private JTextField areaField;
	   private JTextField countryArea;
	   private JTextField koreaArea;
	   private JComboBox countryBox;
	   private areaGraph areaGraph;
	   CountryInfo db = new CountryInfo();
	   
	public areaPanel(boolean b){
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
		 JLabel selectLabel = new JLabel("Country");
		 selectLabel.setFont(new Font("Lucida Grande", Font.BOLD, 21));
		 selectLabel.setBounds(22, 18, 137, 37);
		 add(selectLabel);
	      
	      
	}

	@Override
	void addButton() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void addCombobox() {
		// TODO Auto-generated method stub
		countryBox = new JComboBox(db.getCountry());
	    countryBox.setFont(new Font("Lucida Grande", Font.PLAIN, 21));
	    countryBox.setBounds(118, 19, 194, 37);
	    countryBox.setBackground(Color.WHITE);
	    
	    add(countryBox);
	    areaGraph = new areaGraph();
	    areaGraph.setBackground(Color.LIGHT_GRAY);
	   	areaGraph.setBounds(20, 60, 1200, 700);
        add(areaGraph);
	    
	    countryBox.addActionListener(new ActionListener() { // AreaPanel ComboBox
	         public void actionPerformed(ActionEvent e) {
	            String country = countryBox.getSelectedItem().toString();
	            
	            
	            try {
	               int koreaarea = 100000;
	               int area = db.getNumInfo(country,"¸éÀû");
	               areaGraph.setScores(koreaarea, area);
	               areaGraph.setCountry(country);
	               
	               int a = koreaarea/area ;
	               int b = area/koreaarea;
	               
	               DecimalFormat df = new DecimalFormat("#.##");
	               
	               String s1 = String.valueOf(koreaarea);
	               String s2 = String.valueOf(area);
	               
	               float c = Float.parseFloat(s1);
	               float d = Float.parseFloat(s2);
	               
	               String area1 = "Korea is about "+df.format(c/d)+" bigger than "+ country;
            	   String area2 = country+ " is about "+df.format(d/c)+" bigger than Korea";
            	   
            	   
	               if(koreaarea>area) {
	            	   areaField.setText(area1);
	            	   }
	               else {
	            	   areaField.setText(area2);
	               }
	               koreaArea.setText("koreaarea : 100000");
	               countryArea.setText("area : " + area);
	               areaGraph.repaint();
	            }
	            catch(Exception exc) {
	            	
	            }
	         }
	      });      
	}

	@Override
	void addTextfield() {
		// TODO Auto-generated method stub
		areaField = new JTextField();
		areaField.setFont(new Font("Lucida Grande", Font.BOLD, 22));
		areaField.setBounds(653, 77, 566, 179);
		add(areaField);
		areaField.setColumns(10);
		
		countryArea = new JTextField();
		countryArea.setBackground(Color.WHITE);
		countryArea.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		countryArea.setBounds(109, 464, 282, 37);
		add(countryArea);
		countryArea.setColumns(10);
	      
		koreaArea = new JTextField();
		koreaArea.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		koreaArea.setColumns(10);
		koreaArea.setBounds(109, 148, 282, 37);
		add(koreaArea);
	}
	
	
}
