package Naraboja;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import java.awt.event.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;




public class MainFrame {

   private JFrame frame;

   
   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               MainFrame window = new MainFrame();
               window.frame.setVisible(true);
            } catch (Exception e) {
               e.printStackTrace();
            }
         }
      });
   }

   /**
    * Create the application.
    */
   public MainFrame() {
      initialize();
   }

   /**
    * Initialize the contents of the frame.
    */
   private void initialize() {
      
      Create_CSV create = new Create_CSV();
      
      create.createTable();
      
      frame = new JFrame();
      frame.setBounds(100, 100, 450, 300);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(1500,800);
      frame.getContentPane().setLayout(null);
      
      guidePanel guideP = new guidePanel(true);  
      frame.getContentPane().add(guideP);
   
      geoPanel geoP = new geoPanel(false); 
      frame.getContentPane().add(geoP);
      
      areaPanel areaP = new areaPanel(false);   
      frame.getContentPane().add(areaP);
       
      capitalPanel capitalP = new capitalPanel(false);
      frame.getContentPane().add(capitalP);
      
      JButton guideButton = new JButton("Guide");
      guideButton.setFont(new Font("Lucida Grande", Font.BOLD, 48));
      guideButton.setBounds(0, 6, 246, 116);
      frame.getContentPane().add(guideButton);
      guideButton.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
              areaP.setVisible(false);
              geoP.setVisible(false);
              capitalP.setVisible(false);
              guideP.setVisible(true);

           }
        });
      
      JButton populationButton = new JButton("<html>Capital<br />Population</html>");
      populationButton.setFont(new Font("Lucida Grande", Font.BOLD, 32));
      populationButton.setBounds(0, 122, 246, 185);
      frame.getContentPane().add(populationButton);
      populationButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            areaP.setVisible(false);
            geoP.setVisible(false);
            capitalP.setVisible(true);
            guideP.setVisible(false);
         }
      });
      
      JButton areaButton = new JButton("Area");
      areaButton.setFont(new Font("Lucida Grande", Font.BOLD, 32));
      areaButton.setBounds(0, 307, 246, 172);
      frame.getContentPane().add(areaButton);
      areaButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            areaP.setVisible(true);
            geoP.setVisible(false);
            capitalP.setVisible(false);
            guideP.setVisible(false);
         }
      });
      
      JButton geoculButton = new JButton("<html>Geography<br />Culture</html>");
      geoculButton.setFont(new Font("Lucida Grande", Font.BOLD, 32));
      geoculButton.setBounds(0, 478, 246, 179);
      frame.getContentPane().add(geoculButton);
      geoculButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            areaP.setVisible(false);
            geoP.setVisible(true);
            capitalP.setVisible(false);
            guideP.setVisible(false);

         }
      });
      
      JButton csvButton = new JButton("CSV OUT");
      csvButton.setFont(new Font("Lucida Grande", Font.BOLD, 28));
      csvButton.setBounds(0, 656, 246, 116);
      frame.getContentPane().add(csvButton);
      csvButton.addActionListener(new ActionListener(){
    	  public void actionPerformed(ActionEvent e) {
    		String s = "csv 파일이 만들어졌습니다! "+"\n"+"버튼을 누르시면 종료합니다";
    		JOptionPane.showMessageDialog(frame, s);
    		create.csvOut();
    		create.dropTable();
    		frame.dispose();
    	  } 	  
   });

      guideButton.setBackground(Color.LIGHT_GRAY);
      populationButton.setBackground(Color.LIGHT_GRAY);
      areaButton.setBackground(Color.LIGHT_GRAY);
      geoculButton.setBackground(Color.LIGHT_GRAY);
      csvButton.setBackground(Color.LIGHT_GRAY);


      
   }
}