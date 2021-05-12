/**
 * Main.Java
 * This is a user registration swing application
 * @author RaeeceSamuels (217283764)
 * Date: 11 May 2021
 */
package za.ac.cput.schoolapplication;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


    public class Main extends JFrame implements ActionListener {
    private JLabel lblTitle;
    private JComboBox cboTitle;
    private JLabel lblErrorTitle;
    
    private JLabel lblFirstName;
    private JTextField txtFirstName;
    private JLabel lblErrorFirstName;
    
    private JLabel lblLastName;
    private JTextField txtLastName;
    private JLabel lblErrorLastName;
    
    private JLabel lblGender;
    private JPanel panelGender;
    private JRadioButton radMale;
    private JRadioButton radFemale;
    private JRadioButton radOther;
    private JLabel lblErrorGender;
    
    private JLabel lblCity;
    private JTextField txtCity;
    private JLabel lblErrorCity;
    
    private JLabel lblSuburb;
    private JTextField txtSuburb;
    private JLabel lblErrorSuburb;
    
    private JLabel lblPrimarySchool;
    private JTextField txtPrimarySchool;
    private JLabel lblErrorPrimarySchool;
    
    private JLabel lblSecondarySchool;
    private JComboBox cboSecondarySchool;
    private JLabel lblErrorSecondarySchool;
    
    private JButton btnProceed;
    private JButton btnClear;
    private JButton btnExit;
    private final ButtonGroup genderButtonGroup;
    
   
    
    
    
    @SuppressWarnings("LeakingThisInConstructor")
    public Main(){
        
        JFrame frame = new JFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(500, 500);
            frame.add(lblTitle);
            frame.add(lblFirstName);
            frame.add(lblLastName);
            frame.add(lblGender);
            frame.add(lblCity);
            frame.add(lblSuburb);
            frame.add(lblPrimarySchool);
            frame.add(lblSecondarySchool);
            frame.add(btnProceed);
            frame.add(btnClear);
            frame.add(btnExit);
            frame.pack();
            
        //this constructor is where we will initialize our instance variables
        lblTitle = new JLabel("Title: ");
        String listOfTitles[] = {"Dr", "Miss","Mister", "Mrs", "Prof"};
        /*cboTitle.additem("Dr");
        cboTitle.additem("Miss");
        cboTitle.additem("Mister");
        cboTitle.additem("Mrs");
        cboTitle.additem("Prof");
        */
        lblErrorTitle = new JLabel("*required");
        lblErrorTitle.setForeground(Color.red);
        lblErrorTitle.setVisible(false);
        
        lblFirstName = new JLabel("First Name");
        txtFirstName = new JTextField(15);
        lblErrorFirstName = new JLabel("*required");
        lblErrorFirstName.setForeground(Color.red);
        lblErrorFirstName.setVisible(false);
        
        lblLastName = new JLabel("Last Name");
        txtLastName = new JTextField(15);
        lblErrorLastName = new JLabel("*required");
        lblErrorLastName.setForeground(Color.red);
        lblErrorLastName.setVisible(false);
        
        lblGender = new JLabel("Gender: ");
        panelGender = new JPanel();
        radFemale = new JRadioButton("Female");
        radMale = new JRadioButton("Male");
        radOther = new JRadioButton("Other");
        genderButtonGroup= new ButtonGroup();
        genderButtonGroup.add(radFemale);
        genderButtonGroup.add(radMale);
        panelGender.setLayout(new GridLayout(1, 2));
        panelGender.add(radFemale);
        panelGender.add(radMale);
        panelGender.add(radOther);
        lblErrorGender = new JLabel("*required");
        lblErrorGender.setForeground(Color.red);
        lblErrorGender.setVisible(false);
        
        lblCity = new JLabel("City: ");
        txtCity = new JTextField(15);
        lblErrorCity = new JLabel("*valid email required");
        lblErrorCity.setForeground(Color.red);
        lblErrorCity.setVisible(false);
        
        lblSuburb = new JLabel("City: ");
        txtSuburb = new JTextField(15);
        lblErrorSuburb = new JLabel("*valid email required");
        lblErrorSuburb.setForeground(Color.red);
        lblErrorSuburb.setVisible(false);
        
        lblPrimarySchool = new JLabel("Primary School Attended: ");
        txtPrimarySchool = new JTextField(30);
        lblErrorPrimarySchool = new JLabel("*required");
        lblErrorFirstName.setForeground(Color.red);
        lblErrorFirstName.setVisible(false);
        
        lblSecondarySchool = new JLabel("High School: ");
        String listOfSecondarySchools[] = {"Boland College", "Hottentots-Holland High School","Strand High School", "Gordon High School", "Eersteriver Secondary High School"};
        /*cboSecondarySchool.additem("Boland College");
        cboSecondarySchool.additem("Hottentots-Holland High School");
        cboSecondarySchool.additem("Strand High School");
        cboSecondarySchool.additem("Gordon High School");
        cboSecondarySchool.additem("Eersteriver Secondary High School");
        */
        
        btnProceed = new JButton("Save");
        btnClear = new JButton("Clear");
        btnExit = new JButton("Exit");
        
        
        
        btnProceed.addActionListener(this);
        btnClear.addActionListener(this);
        btnExit.addActionListener(this);
        
        frame.setVisible(true);
        
    }
    
    public void setGUI(){
        // this will place all GUI components on the Frame gridLayout 9 columns
        this.setLayout(null);
        
        
        this.add(lblTitle);
        this.add(cboTitle);
        this.add(lblErrorTitle);
        
        this.add(lblFirstName);
        this.add(txtFirstName);
        this.add(lblErrorFirstName);
        
        this.add(lblLastName);
        this.add(txtLastName);
        this.add(lblErrorLastName);
        
        this.add(lblGender);
        this.add(panelGender);
        this.add(lblErrorGender);
        
        this.add(lblCity);
        this.add(txtCity);
        this.add(lblErrorCity);
        
        this.add(lblSuburb);
        this.add(txtSuburb);
        this.add(lblErrorSuburb);
        
        this.add(lblPrimarySchool);
        this.add(txtPrimarySchool);
        this.add(lblErrorPrimarySchool);
        
        this.add(lblSecondarySchool);
        this.add(cboSecondarySchool);
        this.add(lblErrorSecondarySchool);
        
        this.add(btnProceed);
        this.add(btnClear);
        this.add(btnExit);
        
        
        
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
         
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnProceed) {
            
             JOptionPane.showMessageDialog(null,"Your application was Successful");
            
        } else if(e.getSource() == btnClear) {
           
        lblTitle = new JLabel("Title: ");
        lblFirstName = new JLabel("First Name");
        lblLastName = new JLabel("Last Name");
        lblGender = new JLabel("Gender: ");
        lblCity = new JLabel("City: ");
        lblPrimarySchool = new JLabel("Primary School Attended: ");
        lblSecondarySchool = new JLabel("High School: ");
        
        
        
        
    
        } if(e.getSource() == btnExit) {
        System.exit(0);
        } 
    }
        public static void main(String[] args) {
            new Main().setGUI();
            
        }
      

    }
    
    

    
