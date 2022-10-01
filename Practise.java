package automationbootcamp.java.sejal;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class Practise implements ActionListener {
	
	public JFrame mainFrame;
	public JButton addNewRecordButton;
	public JButton readButton;
	public JButton updateButton;
	public JButton deleteButton;
	public JButton homeButton;
	
	public JLabel nameLabel;
	public JLabel empIdLabel;
	public JLabel ageLabel;
	public JLabel genderLabel;
	public JLabel startDateLabel;
	public JLabel levelLabel;
	public JLabel teamInfoLabel;
	public JLabel positionTitleLabel;
	public JLabel cellPhoneNumberLabel;
	public JLabel emailIdLabel;
	public JLabel photoLabel;
	
	public JTextField nameTxt;
	public JTextField empIdTxt;
	public JTextField empAgeTxt;
	public JTextField empGenderRadio;
	public JTextField empStartDateTxt;
	public JTextField empLevelTxt;
	public JTextField teamInfoTxt;
	public JTextField positionTitleTxt;
	public JTextField cellPhoneTxt;
	public JTextField empEmailIDTxt;
	public JTextField uploadEmpPhotoText;
	
	public JButton saveButton;
	public JButton cancelButton;
	
	public JTable table;
	public JScrollPane scrollPane;
	
	
	private Practise() {
		mainFrame = new JFrame("Human Resource Application");	
		
		homeButton = new JButton("HOME BUTTON");
		addNewRecordButton = new JButton("CREATE");
		readButton = new JButton("VIEW");
		updateButton = new JButton("UPDATE");
		deleteButton = new JButton("DELETE");
		
		nameLabel = new JLabel("ENTER EMPLOYEE NAME");
		empIdLabel = new JLabel("ENTER EMPLOYEE Id");
		ageLabel = new JLabel("ENTER EMPLOYEE Age");
		genderLabel = new JLabel("ENTER EMPLOYEE Gender");
		startDateLabel = new JLabel("ENTER EMPLOYEE Start Date");
		levelLabel = new JLabel("ENTER EMPLOYEE Level");
		teamInfoLabel = new JLabel("ENTER EMPLOYEE Team Info Label");
		positionTitleLabel = new JLabel("ENTER EMPLOYEE position title label");
		cellPhoneNumberLabel = new JLabel("ENTER EMPLOYEE cell phone number");
		emailIdLabel = new JLabel("ENTER EMPLOYEE email id");
		photoLabel = new JLabel("ENTER EMPLOYEE photo");		
		
		nameTxt = new JTextField();
		empIdTxt = new JTextField();
		empAgeTxt = new JTextField();
		empGenderRadio = new JTextField();
		empStartDateTxt = new JTextField();
		empLevelTxt = new JTextField();
		teamInfoTxt = new JTextField();
		positionTitleTxt = new JTextField();
		cellPhoneTxt = new JTextField();
		empEmailIDTxt = new JTextField();
		uploadEmpPhotoText = new JTextField();		
		
		saveButton = new JButton("SAVE");
		cancelButton = new JButton("CANCEL");
		
		
		String data[][]={ {"101","Amit","670000"},    
                {"102","Jai","780000"},    
                {"101","Sachin","700000"}};    
		String column[]={"ID","NAME","SALARY"}; 
		table = new JTable(data,column);
		scrollPane = new JScrollPane(table);
		
	}
	
	public void frames() {
		// mainFrame = new JFrame("Human Resource Application");
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();		
		mainFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		mainFrame.setBackground(Color.LIGHT_GRAY);		
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setLayout(null);
		mainFrame.setVisible(true);
	}
	
	public void buttons() {
		
		//homeButton = new JButton("HOME BUTTON");
		//addNewRecordButton = new JButton("ADD NEW RECORD");
		
		homeButton.setBounds(60, 60, 180, 30);
		homeButton.setBackground(Color.green);
		homeButton.addActionListener(this);
		homeButton.setVisible(true);
		mainFrame.add(homeButton);
		
		addNewRecordButton.setBounds(260, 60, 180, 30);
		addNewRecordButton.setBackground(Color.green);
		addNewRecordButton.addActionListener(this);
		addNewRecordButton.setVisible(true);		
		mainFrame.add(addNewRecordButton);
		
		readButton.setBounds(460, 60, 180, 30);
		readButton.setBackground(Color.green);
		readButton.addActionListener(this);
		readButton.setVisible(true);		
		mainFrame.add(readButton);
		
		updateButton.setBounds(660, 60, 180, 30);
		updateButton.setBackground(Color.green);
		updateButton.addActionListener(this);
		updateButton.setVisible(true);		
		mainFrame.add(updateButton);
		
		deleteButton.setBounds(860, 60, 180, 30);
		deleteButton.setBackground(Color.green);
		deleteButton.addActionListener(this);
		deleteButton.setVisible(true);		
		mainFrame.add(deleteButton);
		
		
	}
	
	public void addRecords() {		
		System.out.println("Inside Add method");
		
		nameLabel.setBounds(60, 100, 210, 30);
		nameLabel.setVisible(false);
		mainFrame.add(nameLabel);
		
		empIdLabel.setBounds(60, 140, 210, 30);
		empIdLabel.setVisible(false);
		mainFrame.add(empIdLabel);
		
		ageLabel.setBounds(60, 180, 210, 30);
		ageLabel.setVisible(false);
		mainFrame.add(ageLabel);
		
		genderLabel.setBounds(60, 220, 210, 30);
		genderLabel.setVisible(false);
		mainFrame.add(genderLabel);
		
		startDateLabel.setBounds(60, 260, 210, 30);
		startDateLabel.setVisible(false);
		mainFrame.add(startDateLabel);
		
		levelLabel.setBounds(60, 300, 210, 30);
		levelLabel.setVisible(false);
		mainFrame.add(levelLabel);
		
		teamInfoLabel.setBounds(60, 340, 210, 30);
		teamInfoLabel.setVisible(false);
		mainFrame.add(teamInfoLabel);
		
		positionTitleLabel.setBounds(60, 380, 210, 30);
		positionTitleLabel.setVisible(false);
		mainFrame.add(positionTitleLabel);
		
		cellPhoneNumberLabel.setBounds(60, 420, 210, 30);
		cellPhoneNumberLabel.setVisible(false);
		mainFrame.add(cellPhoneNumberLabel);
		
		emailIdLabel.setBounds(60, 460, 210, 30);
		emailIdLabel.setVisible(false);
		mainFrame.add(emailIdLabel);
		
		photoLabel.setBounds(60, 500, 210, 30);
		photoLabel.setVisible(false);
		mainFrame.add(photoLabel);
		
		////////////////////////////////////////////////////////////////////
		
		nameTxt.setBounds(280, 100, 200, 30);
		nameTxt.setVisible(false);
		mainFrame.add(nameTxt);
		
		empIdTxt.setBounds(280, 140, 200, 30);
		empIdTxt.setVisible(false);
		mainFrame.add(empIdTxt);
		
		empAgeTxt.setBounds(280, 180, 200, 30);
		empAgeTxt.setVisible(false);
		mainFrame.add(empAgeTxt);
		
		empGenderRadio.setBounds(280, 220, 200, 30);
		empGenderRadio.setVisible(false);
		mainFrame.add(empGenderRadio);
		
		empStartDateTxt.setBounds(280, 260, 200, 30);
		empStartDateTxt.setVisible(false);
		mainFrame.add(empStartDateTxt);
		
		empLevelTxt.setBounds(280, 300, 200, 30);
		empLevelTxt.setVisible(false);
		mainFrame.add(empLevelTxt);
		
		teamInfoTxt.setBounds(280, 340, 200, 30);
		teamInfoTxt.setVisible(false);
		mainFrame.add(teamInfoTxt);
		
		positionTitleTxt.setBounds(280, 380, 200, 30);
		positionTitleTxt.setVisible(false);
		mainFrame.add(positionTitleTxt);
		
		cellPhoneTxt.setBounds(280, 420, 200, 30);
		cellPhoneTxt.setVisible(false);
		mainFrame.add(cellPhoneTxt);
		
		empEmailIDTxt.setBounds(280, 460, 200, 30);
		empEmailIDTxt.setVisible(false);
		mainFrame.add(empEmailIDTxt);
		
		uploadEmpPhotoText.setBounds(280, 500, 200, 30);
		uploadEmpPhotoText.setVisible(false);
		mainFrame.add(uploadEmpPhotoText);
		
		
		
		///////////////////////////////////////////////////////////////////
		
		saveButton.setBounds(280, 540, 80, 30);
		saveButton.setVisible(false);
		saveButton.addActionListener(this);
		mainFrame.add(saveButton);
		
		cancelButton.setBounds(400, 540, 80, 30);		
		cancelButton.setVisible(false);
		cancelButton.addActionListener(this);			
		mainFrame.add(cancelButton);		
		
	}
	
	public void readRecords() {
		table.setPreferredScrollableViewportSize(new Dimension(450,63));
		table.setFillsViewportHeight(true);
		//table.setBounds(60, 100, 800, 100);
		table.add(scrollPane);
		table.setVisible(true);
		mainFrame.add(table);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==addNewRecordButton) {
			System.out.println("EVENTS");
			nameLabel.setVisible(true);
			empIdLabel.setVisible(true);
			ageLabel.setVisible(true);
			genderLabel.setVisible(true);
			startDateLabel.setVisible(true);
			levelLabel.setVisible(true);
			teamInfoLabel.setVisible(true);
			positionTitleLabel.setVisible(true);
			cellPhoneNumberLabel.setVisible(true);
			emailIdLabel.setVisible(true);
			photoLabel.setVisible(true);
			
			///////////////////////////////////////////////////
			
			nameTxt.setVisible(true);
			empIdTxt.setVisible(true);
			empAgeTxt.setVisible(true);
			empGenderRadio.setVisible(true);
			empStartDateTxt.setVisible(true);
			empLevelTxt.setVisible(true);
			teamInfoTxt.setVisible(true);
			positionTitleTxt.setVisible(true);
			cellPhoneTxt.setVisible(true);
			empEmailIDTxt.setVisible(true);
			uploadEmpPhotoText.setVisible(true);
			
			/////////////////////////////////////////////////////
			
			saveButton.setVisible(true);
			cancelButton.setVisible(true);
		}
		
		else if(e.getSource()==homeButton) {
			nameLabel.setVisible(false);
			empIdLabel.setVisible(false);
			ageLabel.setVisible(false);
			genderLabel.setVisible(false);
			startDateLabel.setVisible(false);
			levelLabel.setVisible(false);
			teamInfoLabel.setVisible(false);
			positionTitleLabel.setVisible(false);
			cellPhoneNumberLabel.setVisible(false);
			emailIdLabel.setVisible(false);
			photoLabel.setVisible(false);
			
			////////////////////////////////////////
			
			nameTxt.setVisible(false);
			empIdTxt.setVisible(false);
			empAgeTxt.setVisible(false);
			empGenderRadio.setVisible(false);
			empStartDateTxt.setVisible(false);
			empLevelTxt.setVisible(false);
			teamInfoTxt.setVisible(false);
			positionTitleTxt.setVisible(false);
			cellPhoneTxt.setVisible(false);
			empEmailIDTxt.setVisible(false);
			uploadEmpPhotoText.setVisible(false);
			
			///////////////////////////////////////
			
			saveButton.setVisible(false);
			cancelButton.setVisible(false);
		}
		
		else if(e.getSource()==readButton) {
			nameLabel.setVisible(false);
			empIdLabel.setVisible(false);
			ageLabel.setVisible(false);
			genderLabel.setVisible(false);
			startDateLabel.setVisible(false);
			levelLabel.setVisible(false);
			teamInfoLabel.setVisible(false);
			positionTitleLabel.setVisible(false);
			cellPhoneNumberLabel.setVisible(false);
			emailIdLabel.setVisible(false);
			photoLabel.setVisible(false);
			
			///////////////////////////////////////
			
			nameTxt.setVisible(false);
			empIdTxt.setVisible(false);
			empAgeTxt.setVisible(false);
			empGenderRadio.setVisible(false);
			empStartDateTxt.setVisible(false);
			empLevelTxt.setVisible(false);
			teamInfoTxt.setVisible(false);
			positionTitleTxt.setVisible(false);
			cellPhoneTxt.setVisible(false);
			empEmailIDTxt.setVisible(false);
			uploadEmpPhotoText.setVisible(false);
			
			//////////////////////////////////
			saveButton.setVisible(false);
			cancelButton.setVisible(false);
			
			///
			table.setVisible(true);
		}
		
		else if(e.getSource()==updateButton) {
			nameLabel.setVisible(false);
			empIdLabel.setVisible(false);
			ageLabel.setVisible(false);
			genderLabel.setVisible(false);
			startDateLabel.setVisible(false);
			levelLabel.setVisible(false);
			teamInfoLabel.setVisible(false);
			positionTitleLabel.setVisible(false);
			cellPhoneNumberLabel.setVisible(false);
			emailIdLabel.setVisible(false);
			photoLabel.setVisible(false);
			
			/////////////////////////////////////////////
			
			nameTxt.setVisible(false);
			empIdTxt.setVisible(false);
			empAgeTxt.setVisible(false);
			empGenderRadio.setVisible(false);
			empStartDateTxt.setVisible(false);
			empLevelTxt.setVisible(false);
			teamInfoTxt.setVisible(false);
			positionTitleTxt.setVisible(false);
			cellPhoneTxt.setVisible(false);
			empEmailIDTxt.setVisible(false);
			uploadEmpPhotoText.setVisible(false);
			
			/////////////////////////////////////////////
			saveButton.setVisible(false);
			cancelButton.setVisible(false);
		}
		
		else if(e.getSource()==deleteButton) {
			nameLabel.setVisible(false);
			empIdLabel.setVisible(false);
			ageLabel.setVisible(false);
			genderLabel.setVisible(false);
			startDateLabel.setVisible(false);
			levelLabel.setVisible(false);
			teamInfoLabel.setVisible(false);
			positionTitleLabel.setVisible(false);
			cellPhoneNumberLabel.setVisible(false);
			emailIdLabel.setVisible(false);
			photoLabel.setVisible(false);
			
			////////////////////////////////////////////
			
			nameTxt.setVisible(false);
			empIdTxt.setVisible(false);
			empAgeTxt.setVisible(false);
			empGenderRadio.setVisible(false);
			empStartDateTxt.setVisible(false);
			empLevelTxt.setVisible(false);
			teamInfoTxt.setVisible(false);
			positionTitleTxt.setVisible(false);
			cellPhoneTxt.setVisible(false);
			empEmailIDTxt.setVisible(false);
			uploadEmpPhotoText.setVisible(false);
			
			///////////////////////////////////////////
			saveButton.setVisible(false);
			cancelButton.setVisible(false);
		}		
	}
	
	
	public static void main(String[] args) {
		Practise one = new Practise();
		one.frames();		
		one.buttons();
		one.addRecords();
	}

	
}
