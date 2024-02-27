package clona;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
      
    	
    	Masina pors = new Porsche();
    	
    	Masina nouaunspe = new _911(pors);
    	Masina taycan = new Taycan(pors);
    	Masina macan = new Macan(pors);
    	Masina cayenne = new Cayenne(pors);
    	
    	/////////////////////////////////////////////////////////
    	
    	Masina fer = new Ferrari();
    	
    	Masina laferrari = new LaFerrari(fer);
    	Masina purosangue = new Purosangue(fer);
    	Masina patruopt = new _488(fer);
    	
    	
       ///////////////////////////////////////////////////////////
    	
    	Masina dodge = new Dodge();
    	
    	Masina chal = new Challenger(dodge);
    	Masina charg = new Charger(dodge);
    	
    	
    	//////////////////////////////////////////////////////////
    	
    	Masina toyota = new Toyota();
    	
    	Masina yaris = new Yaris(toyota);
    	Masina rav = new RAV4(toyota);
    	Masina supra = new Supra(toyota);
    	
    	
    	
    	////////////////////////////////////////////////////////////////////////////////////////////////
    	////////////////////////////////////////////////////////////////////////////////////////////////
    	
    	
    	
    	
    	            
    	            JFrame frame = new JFrame("Fereastra Principala");
	    	        frame.setSize(1200, 800);
	    	          
    	           
    	            JPanel panel = new JPanel();
    	            
	    	            panel.setLayout(null);
	    	            panel.setBackground(Color.CYAN);
	
	    	            
	    	            JLabel textu = new JLabel("Bine ati venit in cadrul fabricii de masini !");
	    	            
	    	            textu.setHorizontalAlignment(JLabel.CENTER);
	    	            textu.setVerticalAlignment(JLabel.CENTER);
	    	            
	    	            Font originalFont = textu.getFont();
	    	            Font bigBoldFont = originalFont.deriveFont(originalFont.getSize() * 2.5f).deriveFont(Font.BOLD);
	    	            textu.setFont(bigBoldFont);
	    	            textu.setBounds(270, 210, 700, 200);
	
	    	            
	    	            JButton nextButton = new JButton("Catre pagina urmatoare");
	    	            nextButton.setBounds(500, 400, 200, 80); 
	    	            
	    	              
	
	    	            
	    	            panel.add(textu);
	    	            panel.add(nextButton);

    	            
	    	            
    	            frame.add(panel);

    	            
    	            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	    	            int centerX = (int) (screenSize.getWidth() - frame.getWidth()) / 2;
	    	            int centerY = (int) (screenSize.getHeight() - frame.getHeight()) / 2;
	    	            frame.setLocation(centerX, centerY);

    	            frame.setVisible(true);
    	            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	            
    	            
    	

    	 							////////////////////////////////// ----------------------------------------
    	 
    	 
    	 nextButton.addActionListener(new ActionListener() {
    		 
    		 
             
             public void actionPerformed(ActionEvent e) {
            	 
	            	 frame.dispose();
	                 
	            	 JFrame frame = new JFrame("Selectia Brandului");
	                 frame.setSize(1200, 800);

	                 JPanel panel = new JPanel();
	                 panel.setLayout(null);
	                 panel.setBackground(Color.CYAN);

	                 JLabel textu = new JLabel("Selectati marca dorita : ");
	                 textu.setHorizontalAlignment(JLabel.CENTER);
	                 textu.setVerticalAlignment(JLabel.CENTER);

	                 Font originalFont = textu.getFont();
	                 Font bigBoldFont = originalFont.deriveFont(originalFont.getSize() * 2.5f).deriveFont(Font.BOLD);
	                 textu.setFont(bigBoldFont);
	                 textu.setBounds(270, 210, 700, 200);

	                 String[] options = {"Porsche", "Ferrari", "Toyota", "Dodge"};
	                 JComboBox<String> comboBox = new JComboBox<>(options);
	                 comboBox.setBounds(500, 400, 200, 30);
	                 
	                 ////////

	                 comboBox.addActionListener(new ActionListener() {
	                     
	                     public void actionPerformed(ActionEvent e) {
	                    	 
	                         String selectedOption = (String) comboBox.getSelectedItem();
	                         
	                         
	                         
	                         
	                         
	                         
	                         
	                         if(selectedOption == "Porsche")
	                         {
	                        	 frame.dispose();
	                        	 
	                        	 JFrame frame_porsche = new JFrame("Porsche Model Selector");
	                        	 frame_porsche.setSize(1200, 800);
	                        	 
		                        	 JPanel panel = new JPanel();
		        	                 panel.setLayout(null);
		        	                 panel.setBackground(Color.CYAN);
		        	                 
		        	                 JLabel textu = new JLabel("Selectati modelul dorit : ");
		        	                 textu.setHorizontalAlignment(JLabel.CENTER);
		        	                 textu.setVerticalAlignment(JLabel.CENTER);
		        	                 
		        	                 Font originalFont = textu.getFont();
		        	                 Font bigBoldFont = originalFont.deriveFont(originalFont.getSize() * 2.5f).deriveFont(Font.BOLD);
		        	                 textu.setFont(bigBoldFont);
		        	                 textu.setBounds(270, 210, 700, 200);
		                        	 
		                      
		        	                 String[] options = {"911", "Cayenne", "Macan", "Taycan"};
		        	                 JComboBox<String> comboBox = new JComboBox<>(options);
		        	                 comboBox.setBounds(500, 400, 200, 30);
		        	                 
		        	                 
		        	                 
		        	                 
		        	                 
		        	                 
				        	                 comboBox.addActionListener(new ActionListener() {
				        	                     
				        	                     public void actionPerformed(ActionEvent e) {
				        	                    	 
				        	                         String selectedOption = (String) comboBox.getSelectedItem();
				        	                 
				        	                         
				        	                         
				        	                         
				        	                 
				        	                         if(selectedOption == "911")
				        	                         {
				        	                        	 
				        	                        	 frame_porsche.dispose();
				        	                        	 JFrame frameul = new JFrame("Porsche 911");
				        	                        	 frameul.setSize(1200, 800);
				        	                        	 
				        	                        	 
				        	                        	 JPanel panel = new JPanel();
				    		        	                 panel.setLayout(null);
				    		        	                 panel.setBackground(Color.CYAN);
				    		        	                 
				    		        	                 
				    		        	                 
					    		        	                 JLabel textul = new JLabel(" 911 ");
					    		        	                 
					    		        	                 Font originalFont = textul.getFont();
					    		        	                 Font bigBoldFont = originalFont.deriveFont(originalFont.getSize() * 2.5f).deriveFont(Font.BOLD);
					    		        	                 textul.setFont(bigBoldFont);
					    		        	                 textul.setBounds(545, 25, 300, 100);
					    		        	                 
					    		        	                 
					    		        	                 
					    		        	                 JTextField field1 = new JTextField();
					    		        	                 field1.setBounds(300,200,300,50);
					    		        	                 field1.setEditable(false);
					    		        	                 
					    		        	                 String clasa911 = nouaunspe.modelMasina();
					    		        	                 field1.setText(clasa911);
					    		        	                 
					    		        	                 
					    		        	                 JLabel clasa = new JLabel("Clasa Masina");
					    		        	                 clasa.setBounds(75,180,150,75);
				    		        	                 
				    		        	                 
				    		        	                 
				    		        	                 panel.add(clasa);
				    		        	                 panel.add(textul);
				    		        	                 panel.add(field1);
				    		        	                 
				    		        	                 
				    		        	                 Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
				    		        	                 int centerX = (int) (screenSize.getWidth() - frameul.getWidth()) / 2;
				    		        	                 int centerY = (int) (screenSize.getHeight() - frameul.getHeight()) / 2;
				    		        	                 frameul.setLocation(centerX, centerY);
				        	                        	 
				        	                        	 
				        	                        	 frameul.add(panel);
				        	                        	 frameul.setVisible(true);
				        	        	                 frameul.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				        	        	                 
				        	                         }
				        	                 
				        	                         
				        	                         
				        	                         
				        	                 
				        	                         if(selectedOption == "Cayenne")
				        	                         {
				        	                        	 
				        	                        	 frame_porsche.dispose();
				        	                        	 JFrame frameul = new JFrame("Porsche Cayenne");
				        	                        	 frameul.setSize(1200, 800);
				        	                        	 
				        	                        	 
				        	                        	 JPanel panel = new JPanel();
				    		        	                 panel.setLayout(null);
				    		        	                 panel.setBackground(Color.CYAN);
				    		        	                 
				    		        	                 
				    		        	                 
					    		        	                 JLabel textul = new JLabel(" Cayenne ");
					    		        	                 
					    		        	                 Font originalFont = textul.getFont();
					    		        	                 Font bigBoldFont = originalFont.deriveFont(originalFont.getSize() * 2.5f).deriveFont(Font.BOLD);
					    		        	                 textul.setFont(bigBoldFont);
					    		        	                 textul.setBounds(545, 25, 300, 100);
					    		        	                 
					    		        	                 
					    		        	                 
					    		        	                 JTextField field1 = new JTextField();
					    		        	                 field1.setBounds(300,200,300,50);
					    		        	                 field1.setEditable(false);
					    		        	                 
					    		        	                 String clasacayenne = cayenne.modelMasina();
					    		        	                 field1.setText(clasacayenne);
					    		        	                 
					    		        	                 
					    		        	                 JLabel clasa = new JLabel("Clasa Masina");
					    		        	                 clasa.setBounds(75,180,150,75);
				    		        	                 
				    		        	                 
				    		        	                 
				    		        	                 panel.add(clasa);
				    		        	                 panel.add(textul);
				    		        	                 panel.add(field1);
				    		        	                 
				    		        	                 
				    		        	                 
				    		        	                 
				    		        	                 Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
				    		        	                 int centerX = (int) (screenSize.getWidth() - frameul.getWidth()) / 2;
				    		        	                 int centerY = (int) (screenSize.getHeight() - frameul.getHeight()) / 2;
				    		        	                 frameul.setLocation(centerX, centerY);
				        	                        	 
				        	                        	 
				        	                        	 frameul.add(panel);
				        	                        	 frameul.setVisible(true);
				        	        	                 frameul.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				        	                        	     	
				        	                         }
				        	                         
				        	                         
				        	                         
				        	                         
				        	                         
				        	                         if(selectedOption == "Macan")
				        	                         {
				        	                        	 
				        	                        	 frame_porsche.dispose();
				        	                        	 JFrame frameul = new JFrame("Porsche Macan");
				        	                        	 frameul.setSize(1200, 800);
				        	                        	 
				        	                        	 
				        	                        	 JPanel panel = new JPanel();
				    		        	                 panel.setLayout(null);
				    		        	                 panel.setBackground(Color.CYAN);
				    		        	                 
				    		        	                 
				    		        	                 
					    		        	                 JLabel textul = new JLabel(" Macan ");
					    		        	                 
					    		        	                 Font originalFont = textul.getFont();
					    		        	                 Font bigBoldFont = originalFont.deriveFont(originalFont.getSize() * 2.5f).deriveFont(Font.BOLD);
					    		        	                 textul.setFont(bigBoldFont);
					    		        	                 textul.setBounds(545, 25, 300, 100);
					    		        	                 
					    		        	                 
					    		        	                 
					    		        	                 JTextField field1 = new JTextField();
					    		        	                 field1.setBounds(300,200,300,50);
					    		        	                 field1.setEditable(false);
					    		        	                 
					    		        	                 String clasamacan = macan.modelMasina();
					    		        	                 field1.setText(clasamacan);
					    		        	                 
					    		        	                 
					    		        	                 JLabel clasa = new JLabel("Clasa Masina");
					    		        	                 clasa.setBounds(75,180,150,75);
				    		        	                 
				    		        	                 
				    		        	                 
				    		        	                 panel.add(clasa);
				    		        	                 panel.add(textul);
				    		        	                 panel.add(field1);
				    		        	                 
				    		        	                 
				    		        	                 
				    		        	                 
				    		        	                 Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
				    		        	                 int centerX = (int) (screenSize.getWidth() - frameul.getWidth()) / 2;
				    		        	                 int centerY = (int) (screenSize.getHeight() - frameul.getHeight()) / 2;
				    		        	                 frameul.setLocation(centerX, centerY);
				        	                        	 
				        	                        	 
				        	                        	 frameul.add(panel);
				        	                        	 frameul.setVisible(true);
				        	        	                 frameul.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				        	                        	 
				        	                        	 
				        	                         }
				        	                         
				        	                         
				        	                         
				        	                         
				        	                         
				        	                         if(selectedOption == "Taycan")
				        	                         {
				        	                        	 
				        	                        	 frame_porsche.dispose();
				        	                        	 JFrame frameul = new JFrame("Porsche Taycan");
				        	                        	 frameul.setSize(1200, 800);
				        	                        	 
				        	                        	 
				        	                        	 JPanel panel = new JPanel();
				    		        	                 panel.setLayout(null);
				    		        	                 panel.setBackground(Color.CYAN);
				    		        	                 
				    		        	                 
				    		        	                 
					    		        	                 JLabel textul = new JLabel(" Taycan ");
					    		        	                 
					    		        	                 Font originalFont = textul.getFont();
					    		        	                 Font bigBoldFont = originalFont.deriveFont(originalFont.getSize() * 2.5f).deriveFont(Font.BOLD);
					    		        	                 textul.setFont(bigBoldFont);
					    		        	                 textul.setBounds(545, 25, 300, 100);
					    		        	                 
					    		        	                 
					    		        	                 
					    		        	                 JTextField field1 = new JTextField();
					    		        	                 field1.setBounds(300,200,300,50);
					    		        	                 field1.setEditable(false);
					    		        	                 
					    		        	                 String clasataycan = taycan.modelMasina();
					    		        	                 field1.setText(clasataycan);
					    		        	                 
					    		        	                 
					    		        	                 JLabel clasa = new JLabel("Clasa Masina");
					    		        	                 clasa.setBounds(75,180,150,75);
				    		        	                 
				    		        	                 
				    		        	                 
				    		        	                 panel.add(clasa);
				    		        	                 panel.add(textul);
				    		        	                 panel.add(field1);
				    		        	                 
				    		        	                 
				    		        	                 
				    		        	                 Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
				    		        	                 int centerX = (int) (screenSize.getWidth() - frameul.getWidth()) / 2;
				    		        	                 int centerY = (int) (screenSize.getHeight() - frameul.getHeight()) / 2;
				    		        	                 frameul.setLocation(centerX, centerY);
				        	                        	 
				        	                        	 
				        	                        	 frameul.add(panel);
				        	                        	 frameul.setVisible(true);
				        	        	                 frameul.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				        	                        	 
				        	                         }
				        	                         
				        	                 
				        	                 
				        	                     }
				        	                 });
		        	                 
		        	                 
		        	                 
		        	                 
		        	                 
		        	                 panel.add(textu);
		        	                 panel.add(comboBox);
		        	                 
		        	                 Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		        	                 int centerX = (int) (screenSize.getWidth() - frame_porsche.getWidth()) / 2;
		        	                 int centerY = (int) (screenSize.getHeight() - frame_porsche.getHeight()) / 2;
		        	                 frame_porsche.setLocation(centerX, centerY);
		        	                 
	        	                 frame_porsche.add(panel);
	                        	 frame_porsche.setVisible(true);
	        	                 frame_porsche.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	                        	 
	                         }
	                         
	                         
	                         
	                         
	                         
	                         
	                         if(selectedOption == "Toyota")
	                         {
	                        	 	frame.dispose();

	                        	 JFrame frame_toyota = new JFrame("Toyota Model Selector");
	                        	 frame_toyota.setSize(1200, 800);
	                        	 
		                        	 JPanel panel = new JPanel();
		        	                 panel.setLayout(null);
		        	                 panel.setBackground(Color.CYAN);
		        	                 
		        	                 JLabel textu = new JLabel("Selectati modelul dorit : ");
		        	                 textu.setHorizontalAlignment(JLabel.CENTER);
		        	                 textu.setVerticalAlignment(JLabel.CENTER);
		        	                 
		        	                 Font originalFont = textu.getFont();
		        	                 Font bigBoldFont = originalFont.deriveFont(originalFont.getSize() * 2.5f).deriveFont(Font.BOLD);
		        	                 textu.setFont(bigBoldFont);
		        	                 textu.setBounds(270, 210, 700, 200);
		                        	 
		                      
		        	                 String[] options = {"RAV4", "Supra", "Yaris"};
		        	                 JComboBox<String> comboBox = new JComboBox<>(options);
		        	                 comboBox.setBounds(500, 400, 200, 30);
		        	                 
		        	                 
		        	                 
		        	                 
		        	                 
				        	                 
				        	                 comboBox.addActionListener(new ActionListener() {
				        	                     
				        	                     public void actionPerformed(ActionEvent e) {
				        	                    	 
				        	                         String selectedOption = (String) comboBox.getSelectedItem();
				        	                 
				        	                         
				        	                         
				        	                         
				        	                 
				        	                         if(selectedOption == "RAV4")
				        	                         {
				        	                        	 
				        	                        	 frame_toyota.dispose();
				        	                        	 JFrame frameul = new JFrame("Toyota RAV4");
				        	                        	 frameul.setSize(1200, 800);
				        	                        	 
				        	                        	 
				        	                        	 JPanel panel = new JPanel();
				    		        	                 panel.setLayout(null);
				    		        	                 panel.setBackground(Color.CYAN);
				    		        	                 
				    		        	                 
				    		        	                 
					    		        	                 JLabel textul = new JLabel(" RAV4 ");
					    		        	                 
					    		        	                 Font originalFont = textul.getFont();
					    		        	                 Font bigBoldFont = originalFont.deriveFont(originalFont.getSize() * 2.5f).deriveFont(Font.BOLD);
					    		        	                 textul.setFont(bigBoldFont);
					    		        	                 textul.setBounds(545, 25, 300, 100);
					    		        	                 
					    		        	                 
					    		        	                 
					    		        	                 JTextField field1 = new JTextField();
					    		        	                 field1.setBounds(300,200,300,50);
					    		        	                 field1.setEditable(false);
					    		        	                 
					    		        	                 String clasarav4 = rav.modelMasina();
					    		        	                 field1.setText(clasarav4);
					    		        	                 
					    		        	                 
					    		        	                 JLabel clasa = new JLabel("Clasa Masina");
					    		        	                 clasa.setBounds(75,180,150,75);
				    		        	                 
				    		        	                 
				    		        	                 
				    		        	                 panel.add(clasa);
				    		        	                 panel.add(textul);
				    		        	                 panel.add(field1);
				    		        	                 
				    		        	                 
				    		        	                 
				    		        	                 
				    		        	                 
				    		        	                 Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
				    		        	                 int centerX = (int) (screenSize.getWidth() - frameul.getWidth()) / 2;
				    		        	                 int centerY = (int) (screenSize.getHeight() - frameul.getHeight()) / 2;
				    		        	                 frameul.setLocation(centerX, centerY);
				        	                        	 
				        	                        	 
				        	                        	 frameul.add(panel);
				        	                        	 frameul.setVisible(true);
				        	        	                 frameul.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				        	                        	 
				        	                         }
				        	                 
				        	                         
				        	                         
				        	                         
				        	                 
				        	                         if(selectedOption == "Supra")
				        	                         {
				        	                        	 
				        	                        	 frame_toyota.dispose();
				        	                        	 JFrame frameul = new JFrame("Toyota Supra");
				        	                        	 frameul.setSize(1200, 800);
				        	                        	 
				        	                        	 
				        	                        	 JPanel panel = new JPanel();
				    		        	                 panel.setLayout(null);
				    		        	                 panel.setBackground(Color.CYAN);
				    		        	                 
				    		        	                 
				    		        	                 
					    		        	                 JLabel textul = new JLabel(" Supra ");
					    		        	                 
					    		        	                 Font originalFont = textul.getFont();
					    		        	                 Font bigBoldFont = originalFont.deriveFont(originalFont.getSize() * 2.5f).deriveFont(Font.BOLD);
					    		        	                 textul.setFont(bigBoldFont);
					    		        	                 textul.setBounds(545, 25, 300, 100);
					    		        	                 
					    		        	                 
					    		        	                 
					    		        	                 JTextField field1 = new JTextField();
					    		        	                 field1.setBounds(300,200,300,50);
					    		        	                 field1.setEditable(false);
					    		        	                 
					    		        	                 String clasasupra = supra.modelMasina();
					    		        	                 field1.setText(clasasupra);
					    		        	                 
					    		        	                 
					    		        	                 JLabel clasa = new JLabel("Clasa Masina");
					    		        	                 clasa.setBounds(75,180,150,75);
				    		        	                 
				    		        	                 
				    		        	                 
				    		        	                 panel.add(clasa);
				    		        	                 panel.add(textul);
				    		        	                 panel.add(field1);
				    		        	                 
				    		        	                 
				    		        	                 
				    		        	                 
				    		        	                 Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
				    		        	                 int centerX = (int) (screenSize.getWidth() - frameul.getWidth()) / 2;
				    		        	                 int centerY = (int) (screenSize.getHeight() - frameul.getHeight()) / 2;
				    		        	                 frameul.setLocation(centerX, centerY);
				        	                        	 
				        	                        	 
				        	                        	 frameul.add(panel);
				        	                        	 frameul.setVisible(true);
				        	        	                 frameul.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				        	                        	 
				        	                         }
				        	                         
				        	                         
				        	                         
				        	                         
				        	                         
				        	                         if(selectedOption == "Yaris")
				        	                         {
				        	                        	 
				        	                        	 frame_toyota.dispose();
				        	                        	 JFrame frameul = new JFrame("Toyota Yaris");
				        	                        	 frameul.setSize(1200, 800);
				        	                        	 
				        	                        	 
				        	                        	 JPanel panel = new JPanel();
				    		        	                 panel.setLayout(null);
				    		        	                 panel.setBackground(Color.CYAN);
				    		        	                 
				    		        	                 
				    		        	                 
					    		        	                 JLabel textul = new JLabel(" Yaris ");
					    		        	                 
					    		        	                 Font originalFont = textul.getFont();
					    		        	                 Font bigBoldFont = originalFont.deriveFont(originalFont.getSize() * 2.5f).deriveFont(Font.BOLD);
					    		        	                 textul.setFont(bigBoldFont);
					    		        	                 textul.setBounds(545, 25, 300, 100);
					    		        	                 
					    		        	                 
					    		        	                 
					    		        	                 JTextField field1 = new JTextField();
					    		        	                 field1.setBounds(300,200,300,50);
					    		        	                 field1.setEditable(false);
					    		        	                 
					    		        	                 String clasayaris = yaris.modelMasina();
					    		        	                 field1.setText(clasayaris);
					    		        	                 
					    		        	                 
					    		        	                 JLabel clasa = new JLabel("Clasa Masina");
					    		        	                 clasa.setBounds(75,180,150,75);
				    		        	                 
				    		        	                 
				    		        	                 
				    		        	                 panel.add(clasa);
				    		        	                 panel.add(textul);
				    		        	                 panel.add(field1);
				    		        	                 
				    		        	                 
				    		        	                 
				    		        	                 
				    		        	                 Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
				    		        	                 int centerX = (int) (screenSize.getWidth() - frameul.getWidth()) / 2;
				    		        	                 int centerY = (int) (screenSize.getHeight() - frameul.getHeight()) / 2;
				    		        	                 frameul.setLocation(centerX, centerY);
				        	                        	 
				        	                        	 
				        	                        	 frameul.add(panel);
				        	                        	 frameul.setVisible(true);
				        	        	                 frameul.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				        	                        	 
				        	                         }
				        	                         
				        	                         
				        	                         
				        	                         
				        	                    
				        	                         
				        	                 
				        	                 
				        	                     }
				        	                 });
				        	                 
				        	                 
		        	                 
		        	                 
		        	                 
		        	                 
		        	                 
		        	                 
		        	                 
		        	                 
		        	                 
		        	                 panel.add(textu);
		        	                 panel.add(comboBox);
		        	                 
		        	                 Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		        	                 int centerX = (int) (screenSize.getWidth() - frame_toyota.getWidth()) / 2;
		        	                 int centerY = (int) (screenSize.getHeight() - frame_toyota.getHeight()) / 2;
		        	                 frame_toyota.setLocation(centerX, centerY); 
		        	                 
		        	                 
	        	                 frame_toyota.add(panel);
	                        	 frame_toyota.setVisible(true);
	        	                 frame_toyota.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	                        	 
	                         }
	                         
	                         
	                         
	                         
	                         
	                         if(selectedOption == "Ferrari")
	                         {
	                        	 frame.dispose();
	                        	 JFrame frame_ferrari = new JFrame("Ferrari Model Selector");
	                        	 frame_ferrari.setSize(1200, 800);
	                        	 
		                        	 JPanel panel = new JPanel();
		        	                 panel.setLayout(null);
		        	                 panel.setBackground(Color.CYAN);
		        	                 
		        	                 JLabel textu = new JLabel("Selectati modelul dorit : ");
		        	                 textu.setHorizontalAlignment(JLabel.CENTER);
		        	                 textu.setVerticalAlignment(JLabel.CENTER);
		        	                 
		        	                 Font originalFont = textu.getFont();
		        	                 Font bigBoldFont = originalFont.deriveFont(originalFont.getSize() * 2.5f).deriveFont(Font.BOLD);
		        	                 textu.setFont(bigBoldFont);
		        	                 textu.setBounds(270, 210, 700, 200);
		                        	 
		                      
		        	                 String[] options = {"Purosangue", "488", "LaFerrari"};
		        	                 JComboBox<String> comboBox = new JComboBox<>(options);
		        	                 comboBox.setBounds(500, 400, 200, 30);
		        	                 
		        	                 
		        	                 
		        	                 
		        	                 
				        	                 comboBox.addActionListener(new ActionListener() {
				        	                     
				        	                     public void actionPerformed(ActionEvent e) {
				        	                    	 
				        	                         String selectedOption = (String) comboBox.getSelectedItem();
				        	                 
				        	                         
				        	                         
				        	                         
				        	                 
				        	                         if(selectedOption == "Purosangue")
				        	                         {
				        	                        	 
				        	                        	 frame_ferrari.dispose();
				        	                        	 JFrame frameul = new JFrame("Ferrari Purosangue");
				        	                        	 frameul.setSize(1200, 800);
				        	                        	 
				        	                        	 
				        	                        	 JPanel panel = new JPanel();
				    		        	                 panel.setLayout(null);
				    		        	                 panel.setBackground(Color.CYAN);
				    		        	                 
				    		        	                 
				    		        	                 
					    		        	                 JLabel textul = new JLabel(" Purosangue ");
					    		        	                 
					    		        	                 Font originalFont = textul.getFont();
					    		        	                 Font bigBoldFont = originalFont.deriveFont(originalFont.getSize() * 2.5f).deriveFont(Font.BOLD);
					    		        	                 textul.setFont(bigBoldFont);
					    		        	                 textul.setBounds(545, 25, 300, 100);
					    		        	                 
					    		        	                 
					    		        	                 
					    		        	                 JTextField field1 = new JTextField();
					    		        	                 field1.setBounds(300,200,300,50);
					    		        	                 field1.setEditable(false);
					    		        	                 
					    		        	                 String clasapuro = purosangue.modelMasina();
					    		        	                 field1.setText(clasapuro);
					    		        	                 
					    		        	                 
					    		        	                 JLabel clasa = new JLabel("Clasa Masina");
					    		        	                 clasa.setBounds(75,180,150,75);
				    		        	                 
				    		        	                 
				    		        	                 
				    		        	                 panel.add(clasa);
				    		        	                 panel.add(textul);
				    		        	                 panel.add(field1);
				    		        	                 
				    		        	                 
				    		        	                 
				    		        	                 Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
				    		        	                 int centerX = (int) (screenSize.getWidth() - frameul.getWidth()) / 2;
				    		        	                 int centerY = (int) (screenSize.getHeight() - frameul.getHeight()) / 2;
				    		        	                 frameul.setLocation(centerX, centerY);
				        	                        	 
				        	                        	 
				        	                        	 frameul.add(panel);
				        	                        	 frameul.setVisible(true);
				        	        	                 frameul.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				        	                        	 
				        	                         }
				        	                 
				        	                         
				        	                         
				        	                         
				        	                 
				        	                         if(selectedOption == "488")
				        	                         {
				        	                        	 
				        	                        	 frame_ferrari.dispose();
				        	                        	 JFrame frameul = new JFrame("Ferrari 488");
				        	                        	 frameul.setSize(1200, 800);
				        	                        	 
				        	                        	 
				        	                        	 JPanel panel = new JPanel();
				    		        	                 panel.setLayout(null);
				    		        	                 panel.setBackground(Color.CYAN);
				    		        	                 
				    		        	                 
				    		        	                 
					    		        	                 JLabel textul = new JLabel(" 488 ");
					    		        	                 
					    		        	                 Font originalFont = textul.getFont();
					    		        	                 Font bigBoldFont = originalFont.deriveFont(originalFont.getSize() * 2.5f).deriveFont(Font.BOLD);
					    		        	                 textul.setFont(bigBoldFont);
					    		        	                 textul.setBounds(545, 25, 300, 100);
					    		        	                 
					    		        	                 
					    		        	                 
					    		        	                 JTextField field1 = new JTextField();
					    		        	                 field1.setBounds(300,200,300,50);
					    		        	                 field1.setEditable(false);
					    		        	                 
					    		        	                 String clasa488 = patruopt.modelMasina();
					    		        	                 field1.setText(clasa488);
					    		        	                 
					    		        	                 
					    		        	                 JLabel clasa = new JLabel("Clasa Masina");
					    		        	                 clasa.setBounds(75,180,150,75);
				    		        	                 
				    		        	                 
				    		        	                 
				    		        	                 panel.add(clasa);
				    		        	                 panel.add(textul);
				    		        	                 panel.add(field1);
				    		        	                 
				    		        	                 
				    		        	                 
				    		        	                 Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
				    		        	                 int centerX = (int) (screenSize.getWidth() - frameul.getWidth()) / 2;
				    		        	                 int centerY = (int) (screenSize.getHeight() - frameul.getHeight()) / 2;
				    		        	                 frameul.setLocation(centerX, centerY);
				        	                        	 
				        	                        	 
				        	                        	 frameul.add(panel);
				        	                        	 frameul.setVisible(true);
				        	        	                 frameul.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				        	                        	 
				        	                         }
				        	                         
				        	                         
				        	                         
				        	                         
				        	                         
				        	                         if(selectedOption == "LaFerrari")
				        	                         {
				        	                        	 
				        	                        	 frame_ferrari.dispose();
				        	                        	 JFrame frameul = new JFrame("Porsche LaFerrari");
				        	                        	 frameul.setSize(1200, 800);
				        	                        	 
				        	                        	 
				        	                        	 JPanel panel = new JPanel();
				    		        	                 panel.setLayout(null);
				    		        	                 panel.setBackground(Color.CYAN);
				    		        	                 
				    		        	                 
				    		        	                 
					    		        	                 JLabel textul = new JLabel(" LaFerrari ");
					    		        	                 
					    		        	                 Font originalFont = textul.getFont();
					    		        	                 Font bigBoldFont = originalFont.deriveFont(originalFont.getSize() * 2.5f).deriveFont(Font.BOLD);
					    		        	                 textul.setFont(bigBoldFont);
					    		        	                 textul.setBounds(545, 25, 300, 100);
					    		        	                 
					    		        	                 
					    		        	                 
					    		        	                 JTextField field1 = new JTextField();
					    		        	                 field1.setBounds(300,200,300,50);
					    		        	                 field1.setEditable(false);
					    		        	                 
					    		        	                 String clasalf = laferrari.modelMasina();
					    		        	                 field1.setText(clasalf);
					    		        	                 
					    		        	                 
					    		        	                 JLabel clasa = new JLabel("Clasa Masina");
					    		        	                 clasa.setBounds(75,180,150,75);
				    		        	                 
				    		        	                 
				    		        	                 
				    		        	                 panel.add(clasa);
				    		        	                 panel.add(textul);
				    		        	                 panel.add(field1);
				    		        	                 
				    		        	                 
				    		        	                 
				    		        	                 
				    		        	                 Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
				    		        	                 int centerX = (int) (screenSize.getWidth() - frameul.getWidth()) / 2;
				    		        	                 int centerY = (int) (screenSize.getHeight() - frameul.getHeight()) / 2;
				    		        	                 frameul.setLocation(centerX, centerY);
				        	                        	 
				        	                        	 
				        	                        	 frameul.add(panel);
				        	                        	 frameul.setVisible(true);
				        	        	                 frameul.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				        	                        	 
				        	                         }
				        	                         
				        	                         
				        	                         
				        	                    
				        	                 
				        	                 
				        	                     }
				        	                 });
				        	                 
		        	                 
		        	                 
		        	                 
		        	                 
		        	                 
		        	                 
		        	                 
		        	                 
		        	                 
		        	                 
		        	                 
		        	                 panel.add(textu);
		        	                 panel.add(comboBox);
		        	                 
		        	                 
		        	                 Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		        	                 int centerX = (int) (screenSize.getWidth() - frame_ferrari.getWidth()) / 2;
		        	                 int centerY = (int) (screenSize.getHeight() - frame_ferrari.getHeight()) / 2;
		        	                 frame_ferrari.setLocation(centerX, centerY);
		        	                 
	        	                 frame_ferrari.add(panel);
	                        	 frame_ferrari.setVisible(true);
	        	                 frame_ferrari.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	                         }
	                         
	                         
	                         
	                         
	                         
	                         if(selectedOption == "Dodge")
	                         {
	                        	 frame.dispose();
	                        	 JFrame frame_dodge = new JFrame("Dodge Model Selector");
	                        	 frame_dodge.setSize(1200, 800);
	                        	 
		                        	 JPanel panel = new JPanel();
		        	                 panel.setLayout(null);
		        	                 panel.setBackground(Color.CYAN);
		        	                 
		        	                 JLabel textu = new JLabel("Selectati modelul dorit : ");
		        	                 textu.setHorizontalAlignment(JLabel.CENTER);
		        	                 textu.setVerticalAlignment(JLabel.CENTER);
		        	                 
		        	                 Font originalFont = textu.getFont();
		        	                 Font bigBoldFont = originalFont.deriveFont(originalFont.getSize() * 2.5f).deriveFont(Font.BOLD);
		        	                 textu.setFont(bigBoldFont);
		        	                 textu.setBounds(270, 210, 700, 200);
		                        	 
		                      
		        	                 String[] options = {"Challenger", "Charger"};
		        	                 JComboBox<String> comboBox = new JComboBox<>(options);
		        	                 comboBox.setBounds(500, 400, 200, 30);
		        	                 
		        	                 
		        	                 
		        	                 
				        	                 comboBox.addActionListener(new ActionListener() {
				        	                     
				        	                     public void actionPerformed(ActionEvent e) {
				        	                    	 
				        	                         String selectedOption = (String) comboBox.getSelectedItem();
				        	                 
				        	                         
				        	                         
				        	                         
				        	                 
				        	                         if(selectedOption == "Challenger")
				        	                         {
				        	                        	 
				        	                        	 frame_dodge.dispose();
				        	                        	 JFrame frameul = new JFrame("Dodge Challenger");
				        	                        	 frameul.setSize(1200, 800);
				        	                        	 
				        	                        	 
				        	                        	 JPanel panel = new JPanel();
				    		        	                 panel.setLayout(null);
				    		        	                 panel.setBackground(Color.CYAN);
				    		        	                 
				    		        	                 
				    		        	                 
					    		        	                 JLabel textul = new JLabel(" Challenger ");
					    		        	                 
					    		        	                 Font originalFont = textul.getFont();
					    		        	                 Font bigBoldFont = originalFont.deriveFont(originalFont.getSize() * 2.5f).deriveFont(Font.BOLD);
					    		        	                 textul.setFont(bigBoldFont);
					    		        	                 textul.setBounds(545, 25, 300, 100);
					    		        	                 
					    		        	                 
					    		        	                 
					    		        	                 JTextField field1 = new JTextField();
					    		        	                 field1.setBounds(300,200,300,50);
					    		        	                 field1.setEditable(false);
					    		        	                 
					    		        	                 String clasachal = chal.modelMasina();
					    		        	                 field1.setText(clasachal);
					    		        	                 
					    		        	                 
					    		        	                 JLabel clasa = new JLabel("Clasa Masina");
					    		        	                 clasa.setBounds(75,180,150,75);
				    		        	                 
				    		        	                 
				    		        	                 
				    		        	                 panel.add(clasa);
				    		        	                 panel.add(textul);
				    		        	                 panel.add(field1);
				    		        	                 
				    		        	                 
				    		        	                 Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
				    		        	                 int centerX = (int) (screenSize.getWidth() - frameul.getWidth()) / 2;
				    		        	                 int centerY = (int) (screenSize.getHeight() - frameul.getHeight()) / 2;
				    		        	                 frameul.setLocation(centerX, centerY);
				        	                        	 
				        	                        	 
				        	                        	 frameul.add(panel);
				        	                        	 frameul.setVisible(true);
				        	        	                 frameul.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				        	                        	 
				        	                         }
				        	                 
				        	                         
				        	                         
				        	                         
				        	                 
				        	                         if(selectedOption == "Charger")
				        	                         {
				        	                        	 
				        	                        	 frame_dodge.dispose();
				        	                        	 JFrame frameul = new JFrame("Dodge Charger");
				        	                        	 frameul.setSize(1200, 800);
				        	                        	 
				        	                        	 
				        	                        	 JPanel panel = new JPanel();
				    		        	                 panel.setLayout(null);
				    		        	                 panel.setBackground(Color.CYAN);
				    		        	                 
				    		        	                 
				    		        	                 
					    		        	                 JLabel textul = new JLabel(" Charger ");
					    		        	                 
					    		        	                 Font originalFont = textul.getFont();
					    		        	                 Font bigBoldFont = originalFont.deriveFont(originalFont.getSize() * 2.5f).deriveFont(Font.BOLD);
					    		        	                 textul.setFont(bigBoldFont);
					    		        	                 textul.setBounds(545, 25, 300, 100);
					    		        	                 
					    		        	                 
					    		        	                 
					    		        	                 JTextField field1 = new JTextField();
					    		        	                 field1.setBounds(300,200,300,50);
					    		        	                 field1.setEditable(false);
					    		        	                 
					    		        	                 String clasacharg = charg.modelMasina();
					    		        	                 field1.setText(clasacharg);
					    		        	                 
					    		        	                 
					    		        	                 JLabel clasa = new JLabel("Clasa Masina");
					    		        	                 clasa.setBounds(75,180,150,75);
				    		        	                 
				    		        	                 
				    		        	                 
				    		        	                 panel.add(clasa);
				    		        	                 panel.add(textul);
				    		        	                 panel.add(field1);
				    		        	                 
				    		        	                 
				    		        	                 
				    		        	                 Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
				    		        	                 int centerX = (int) (screenSize.getWidth() - frameul.getWidth()) / 2;
				    		        	                 int centerY = (int) (screenSize.getHeight() - frameul.getHeight()) / 2;
				    		        	                 frameul.setLocation(centerX, centerY);
				        	                        	 
				        	                        	 
				        	                        	 frameul.add(panel);
				        	                        	 frameul.setVisible(true);
				        	        	                 frameul.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				        	                        	 
				        	                         }
				        	                         
				        	                         
				        	                         
				        	                       
				        	                         
				        	                 
				        	                 
				        	                     }
				        	                 });
		        	                 
		        	                 
		        	                 
		        	                 
		        	                 
		        	                 
		        	                 
		        	                 
		        	                 
		        	                 
		        	                 
		        	                 panel.add(textu);
		        	                 panel.add(comboBox);
		        	                 
		        	                 Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		        	                 int centerX = (int) (screenSize.getWidth() - frame_dodge.getWidth()) / 2;
		        	                 int centerY = (int) (screenSize.getHeight() - frame_dodge.getHeight()) / 2;
		        	                 frame_dodge.setLocation(centerX, centerY);
		        	                 
		        	                 
	        	                 frame_dodge.add(panel);
	                        	 frame_dodge.setVisible(true);
	        	                 frame_dodge.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	                        	 
	                         }
	                         
	                         
	                         
	                         
	                         
	                         
	                         
	                         
	                         
	                     }
	                 });
	                 
	                 
	                 
	                 ////////
	                 
	                 
	                 panel.add(textu);
	                 panel.add(comboBox);

	                 frame.add(panel);

	                 Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	                 int centerX = (int) (screenSize.getWidth() - frame.getWidth()) / 2;
	                 int centerY = (int) (screenSize.getHeight() - frame.getHeight()) / 2;
	                 frame.setLocation(centerX, centerY);

	                 frame.setVisible(true);
	                 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	                 
	                 
					                 
	             	
             }
         });
    	
    	 						////////////////////////////////// --------------------------------------
    	
}
}
