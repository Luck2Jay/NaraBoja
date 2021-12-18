package Naraboja;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class capitalGraph extends JPanel {

	int koreapopulation, population;
	 String country;
	 
	    public void paint(Graphics g){
	        g.clearRect(0,0,getWidth(),getHeight());
	        g.drawLine(50,100,50,600);
	        for(int a = 1 ;a<24;a++)
	        {
	            g.drawString(a *10 +"",50+a*50,600);
	            g.drawLine(50+a*50,50 , 50+a*50,600);
	        }
	        g.drawLine(50,20,50,250);
	      
	        g.setColor(Color.BLACK);
	        if (koreapopulation>0) {
	        	g.drawString("´ëÇÑ¹Î±¹",0,150);
	        	g.setColor(Color.BLUE);
	            g.fillRect(50,150,(koreapopulation/20000),50);
	            g.setColor(Color.BLACK);
	            
	        }
	        if(population>0) {
	        	g.drawString(country,0,450);
	        	g.setColor(Color.BLUE);
	        	if(population/koreapopulation>2) {
	        		g.fillRect(50,450,700,50);
	            	g.setColor(Color.ORANGE);
	            	g.fillRect(750,450,200,50);
	            	g.setColor(Color.BLUE);
	            	g.fillRect(950,450,200,50);
	            	g.setColor(Color.BLACK);
	            	g.drawString("Bar overs Graph",800,475);
	        	}
	        	else {
	        		g.fillRect(50,450,(population/20000),50);
	        	}
	            g.setColor(Color.BLACK);
	        }
	      } 
	    
	    void setScores(int koreapopulation, int population)
	    {
	        this.koreapopulation = koreapopulation;
	        this.population = population;
	       
	    }
	    void setCountry(String a)
	    {
	        this.country = a;
	   
	       
	    }
}
