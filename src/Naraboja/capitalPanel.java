package Naraboja;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class capitalPanel extends panel {

	 private JTextField koreaCp;
	 private JTextField areaCp;
	 private JTextField cparea;
	 private JComboBox capitalBox;
	 
	 CountryInfo db = new CountryInfo();
	 
	public capitalPanel(boolean b){
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
		JLabel countLabel = new JLabel("Country");
	    countLabel.setFont(new Font("Lucida Grande", Font.BOLD, 21));
	    countLabel.setBounds(23, 18, 137, 37);
	    add(countLabel);
	      
	}

	@Override
	void addButton() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void addCombobox() {
		// TODO Auto-generated method stub
		 capitalBox = new JComboBox(db.getCountry());
		 capitalBox.setFont(new Font("Lucida Grande", Font.PLAIN, 21));
		 capitalBox.setBounds(118, 18, 194, 37);
		 capitalBox.setBackground(Color.WHITE);
		 add(capitalBox);
		 
		 capitalGraph capGraph = new capitalGraph();
         capGraph.setBackground(Color.LIGHT_GRAY);
         capGraph.setBounds(20,60,1200,700);
            
         add(capGraph);
         
		 capitalBox.addActionListener(new ActionListener() { // Capital Population Area
	         public void actionPerformed(ActionEvent e) {
	            int koreapopulation = 10000000;
	            String country = capitalBox.getSelectedItem().toString(); // country from combobox
	            String capital = db.getCapital(country); // country's capital city 
	            int population = db.getNumInfo(country,"수도인구"); // capital's population
	            
	          
	            try {
	               
	               capGraph.setScores(koreapopulation,population);
	               capGraph.setCountry(country);
	               koreaCp.setText("서울 : 10000000");
	               areaCp.setText(capital+" : "+population);

	               if(population!=0) {
	            	   
	                  int a = koreapopulation/population;
	                  int b = population/koreapopulation;
	                  
	                  DecimalFormat df = new DecimalFormat("#.##");
	                  
	                  String s1 = String.valueOf(koreapopulation);
	                  String s2 = String.valueOf(population);
	                  
	                  float c = Float.parseFloat(s1);
	                  float d = Float.parseFloat(s2);
	                 
	                  String cpa1 = "Korea is about "+df.format(c/d)+" more than "+ country;
                	  String cpa2 = country+ " is about "+df.format(d/c)+" more than Korea";
                	  
	                  if(a==1||b==1) {
	                	  if(koreapopulation>population) cparea.setText(cpa1);
	                      else cparea.setText(cpa2);
	                  }
	                  else {
	                	  if(koreapopulation>population) cparea.setText(cpa1);
	                      else cparea.setText(cpa2);
	                  }
	         
	               }
	               
	               capGraph.repaint();
	            }
	            catch(Exception exc) {
	              
	            }
	         }
	      });
	}

	@Override
	void addTextfield() {
		// TODO Auto-generated method stub
		 koreaCp = new JTextField();
	      koreaCp.setBackground(Color.WHITE);
	      koreaCp.setFont(new Font("Lucida Grande", Font.BOLD, 20));
	      koreaCp.setBounds(118, 120, 219, 26);
	      add(koreaCp);
	      koreaCp.setColumns(10);
	      
	      areaCp = new JTextField();
	      areaCp.setBackground(Color.WHITE);
	      areaCp.setFont(new Font("Lucida Grande", Font.BOLD, 20));
	      areaCp.setColumns(10);
	      areaCp.setBounds(118, 372, 235, 26);
	      add(areaCp);
	      
	      cparea = new JTextField();
	      cparea.setFont(new Font("Lucida Grande", Font.BOLD, 20));
	      cparea.setColumns(10);
	      cparea.setBackground(Color.WHITE);
	      cparea.setBounds(667, 120, 510, 26);
	      add(cparea);
	      
	   
	      
	}
}
