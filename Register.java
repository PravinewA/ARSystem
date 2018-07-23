package minorproject;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.sql.*;
import java.util.regex.*;
import javax.swing.*;
/**
 *
 * @author pravinewa
 */
public class Register extends JFrame {
    Connection conn = null;
    PreparedStatement pstmt = null;
    static String LoginID;

     public Register() {
        GenderbuttonGroup = new ButtonGroup();
        RegisterPanel = new JPanel();
        TitlePanel = new JPanel();
        AMLabel = new JLabel();
        SLabel = new JLabel();
        Register2Panel = new JPanel();
        TabbedPane = new JTabbedPane();
        OwnerScrollPane = new JScrollPane();
        OwnerPanel = new JPanel();
        OwnerNameLabel = new JLabel();
        IdentityMarkTextField = new JTextField();
        OwnerNameTextField = new JTextField();
        GenderLabel = new JLabel();
        IdentityMarkLabel = new JLabel();
        ZoneLabel = new JLabel();
        MunicipalityTextField = new JTextField();
        OccupationLabel = new JLabel();
        MunicipalityLabel = new JLabel();
        CitizenshipNumberLabel = new JLabel();
        ToleLabel = new JLabel();
        PassportNumberLabel = new JLabel();
        ContactNumberLabel = new JLabel();
        OccupationTextField = new JTextField();
        ToleTextField = new JTextField();
        CitizenshipNumberTextField = new JTextField();
        ContactNumberTextField = new JTextField();
        PassportNumberTextField = new JTextField();
        RegistrationDateLabel = new JLabel();
        DistrictLabel = new JLabel();
        WardNumberLabel = new JLabel();
        HouseNumberLabel = new JLabel();
        EmailLabel = new JLabel();
        WardNumberTextField = new JTextField();
        HouseNumberTextField = new JTextField();
        DateofBirthLabel = new JLabel();
        EmailTextField = new JTextField();
        EducationLabel = new JLabel();
        CIDLabel = new JLabel();
        PIDLabel = new JLabel();
        EducationTextField = new JTextField();
        MaleRadioButton = new JRadioButton();
        FemaleRadioButton = new JRadioButton();
        CIDComboBox = new JComboBox<>();
        PIDComboBox = new JComboBox<>();
        DistrictComboBox = new JComboBox<>();
        ZoneComboBox = new JComboBox<>();
        Redmark15 = new JLabel();
        Redmark16 = new JLabel();
        Redmark17 = new JLabel();
        Redmark18 = new JLabel();
        Redmark19 = new JLabel();
        Redmark20 = new JLabel();
        Redmark21 = new JLabel();
        Redmark22 = new JLabel();
        Redmark23 = new JLabel();
        Redmark24 = new JLabel();
        Redmark25 = new JLabel();
        Redmark26 = new JLabel();
        Redmark27 = new JLabel();
        Redmark28 = new JLabel();
        ShowValidationOfOwnerName = new JLabel();
        ShowValidationOfCID = new JLabel();
        ShowValidationOfCitizenshipNumber = new JLabel();
        ShowValidationOfZone = new JLabel();
        ShowValidationOfMunicipality = new JLabel();
        ShowValidationOfDistrict = new JLabel();
        ShowValidationOfWardNumber = new JLabel();
        ShowValidationOfTole = new JLabel();
        ShowValidationOfHouseNumber = new JLabel();
        ShowValidationOfContactNumber = new JLabel();
        ShowValidationOfIdentityMark = new JLabel();
        ShowValidationOfRDate = new JLabel();
        ShowValidationOfBDate = new JLabel();
        ShowValidationOfPassportNumber = new JLabel();
        ShowValidationOfPID = new JLabel();
        ShowValidationOfEmail = new JLabel();
        ShowValidationOfEducation = new JLabel();
        ShowValidationOfOccupation = new JLabel();
        RDateChooser = new com.toedter.calendar.JDateChooser();
        BDateChooser = new com.toedter.calendar.JDateChooser();
        VehicleScrollPane = new JScrollPane();
        VehiclePanel = new JPanel();
        VehicleNumberLabel = new JLabel();
        CompanyNameLabel = new JLabel();
        CompanyNameTextField = new JTextField();
        VehicleNumberTextField = new JTextField();
        VehicleTypeLabel = new JLabel();
        ModelNumberTextField = new JTextField();
        ModelNumberLabel = new JLabel();
        VehicleColorLabel = new JLabel();
        EngineNumberLabel = new JLabel();
        DisplacementLabel = new JLabel();
        MaximumTorqueLabel = new JLabel();
        NoofGearsLabel = new JLabel();
        VehicleColorTextField = new JTextField();
        DisplacementTextField = new JTextField();
        EngineNumberTextField = new JTextField();
        MaximumTorqueTextField = new JTextField();
        FuelTypeLabel = new JLabel();
        EngineDescriptionLabel = new JLabel();
        MaximumPowerLabel = new JLabel();
        NoofSeatsLabel = new JLabel();
        FuelTankCapacityLabel = new JLabel();
        EngineDescriptionTextField = new JTextField();
        MaximumPowerTextField = new JTextField();
        NoofSeatsTextField = new JTextField();
        FuelTankCapacityTextField = new JTextField();
        FuelTypeComboBox = new JComboBox<>();
        NoofGearsComboBox = new JComboBox<>();
        VehicleTypeComboBox = new JComboBox<>();
        SubmitButton = new JButton();
        TickCheckBox = new JCheckBox();
        Redmark1 = new JLabel();
        Redmark2 = new JLabel();
        Redmark3 = new JLabel();
        Redmark4 = new JLabel();
        Redmark5 = new JLabel();
        Redmark6 = new JLabel();
        Remark7 = new JLabel();
        Redmark8 = new JLabel();
        Redmark9 = new JLabel();
        Redmark10 = new JLabel();
        Redmark11 = new JLabel();
        Redmark12 = new JLabel();
        Redmark13 = new JLabel();
        Redmark14 = new JLabel();
        ShowValidationOfCompanyName = new JLabel();
        ShowValidationOfVehicleNumber = new JLabel();
        ShowValidationOfVehicleType = new JLabel();
        ShowValidationOfModelNumber = new JLabel();
        ShowValidationOfFuelType = new JLabel();
        ShowValidationOfVehicleColor = new JLabel();
        ShowValidationOfDisplacement = new JLabel();
        ShowValidationOfMaximumPower = new JLabel();
        ShowValidationOfMaximumTorque = new JLabel();
        ShowValidationOfNoofSeats = new JLabel();
        ShowValidationOfNoofGears = new JLabel();
        ShowValidationOfFuelTankCapacity = new JLabel();
        ShowValidationOfEngineNumber = new JLabel();
        ShowValidationOfEngineDescription = new JLabel();
        MenuBar = new JMenuBar();
        FileMenu = new JMenu();
        HomeMenuItem = new JMenuItem();
        LogOutMenuItem = new JMenuItem();
    }
    private void close()
    {
        WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }

    public void initComponents(String LoginID1) {

        LoginID = LoginID1;
        setVisible(true);

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        RegisterPanel.setBackground(new java.awt.Color(255, 255, 255));

        TitlePanel.setBackground(new java.awt.Color(153, 51, 255));

        AMLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        AMLabel.setForeground(new java.awt.Color(255, 255, 255));
        AMLabel.setText("Automobile Registration");

        SLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        SLabel.setForeground(new java.awt.Color(255, 153, 0));
        SLabel.setText("System");

        GroupLayout TitlePanelLayout = new GroupLayout(TitlePanel);
        TitlePanel.setLayout(TitlePanelLayout);
        TitlePanelLayout.setHorizontalGroup(
            TitlePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(TitlePanelLayout.createSequentialGroup()
                .addGap(225, 225, 225)
                .addComponent(AMLabel)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SLabel)
                .addContainerGap(241, Short.MAX_VALUE))
        );
        TitlePanelLayout.setVerticalGroup(
            TitlePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(TitlePanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(TitlePanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(AMLabel)
                    .addComponent(SLabel))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        Register2Panel.setBackground(new java.awt.Color(255, 255, 255));

        TabbedPane.setBackground(new java.awt.Color(255, 255, 255));

        OwnerScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        OwnerScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        OwnerPanel.setBackground(new java.awt.Color(255, 255, 255));

        OwnerNameLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        OwnerNameLabel.setText("Owner Name");

        IdentityMarkTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                IdentityMarkTextFieldKeyPressed(evt);
            }
        });

        OwnerNameTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                OwnerNameTextFieldKeyPressed(evt);
            }
        });

        GenderLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        GenderLabel.setText("Gender");

        IdentityMarkLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        IdentityMarkLabel.setText("Identity Mark");

        ZoneLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ZoneLabel.setText("Zone");

        MunicipalityTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                MunicipalityTextFieldKeyPressed(evt);
            }
        });

        OccupationLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        OccupationLabel.setText("Occupation");

        MunicipalityLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MunicipalityLabel.setText("Municipality");

        CitizenshipNumberLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CitizenshipNumberLabel.setText("Citizenship Number");

        ToleLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ToleLabel.setText("Tole");

        PassportNumberLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        PassportNumberLabel.setText("Passport Number");

        ContactNumberLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ContactNumberLabel.setText("Contact Number");

        OccupationTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                OccupationTextFieldKeyPressed(evt);
            }
        });

        ToleTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ToleTextFieldKeyPressed(evt);
            }
        });

        CitizenshipNumberTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CitizenshipNumberTextFieldKeyPressed(evt);
            }
        });

        ContactNumberTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ContactNumberTextFieldKeyPressed(evt);
            }
        });

        PassportNumberTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PassportNumberTextFieldKeyPressed(evt);
            }
        });

        RegistrationDateLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        RegistrationDateLabel.setText("Registration Date");

        DistrictLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        DistrictLabel.setText("District");

        WardNumberLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        WardNumberLabel.setText("Ward Number");

        HouseNumberLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        HouseNumberLabel.setText("House Number");

        EmailLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        EmailLabel.setText("Email ");

        WardNumberTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                WardNumberTextFieldKeyPressed(evt);
            }
        });

        HouseNumberTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                HouseNumberTextFieldKeyPressed(evt);
            }
        });

        DateofBirthLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        DateofBirthLabel.setText("Date of Birth");

        EmailTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                EmailTextFieldKeyPressed(evt);
            }
        });

        EducationLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        EducationLabel.setText("Education");

        CIDLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CIDLabel.setText("Citizenship issue District");

        PIDLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        PIDLabel.setText("Passport issue District");

        EducationTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                EducationTextFieldKeyPressed(evt);
            }
        });

        MaleRadioButton.setBackground(new java.awt.Color(255, 255, 255));
        GenderbuttonGroup.add(MaleRadioButton);
        MaleRadioButton.setSelected(true);
        MaleRadioButton.setText("Male");

        FemaleRadioButton.setBackground(new java.awt.Color(255, 255, 255));
        GenderbuttonGroup.add(FemaleRadioButton);
        FemaleRadioButton.setText("Female");

        CIDComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Choose issue District", "Achham", "Arghakhanchi", "Baglung", "Baitadi", "Bajhang", "Bajura", "Banke", "Bara", "Bardiya", "Bhaktapur", "Bhojpur", "Chitwan", "Dadeldhura", "Dailekh", "Dang", "Darchula", "Dhading", "Dhankuta", "Dhanusa", "Dholkha", "Dolpa", "Doti", "Gorkha", "Gulmi", "Humla", "Ilam", "Jajarkot", "Jhapa", "Jumla", "Kailali", "Kalikot", "Kanchanpur", "Kapilvastu", "Kaski", "Kathmandu", "Kavrepalanchok", "Khotang", "Lalitpur", "Lamjung", "Mahottari", "Makwanpur", "Manang", "Morang", "Mugu", "Mustang", "Myagdi", "Nawalparasi", "Nuwakot", "Okhaldhunga", "Palpa", "Panchthar", "Parbat", "Parsa", "Pyuthan", "Ramechhap", "Rasuwa", "Rautahat", "Rolpa", "Rukum", "Rupandehi", "Salyan", "Sankhuwasabha", "Saptari", "Sarlahi", "Sindhuli", "Sindhupalchok", "Siraha", "Solukhumbu", "Sunsari", "Surkhet", "Syangja", "Tanahu", "Taplejung", "Terhathum", "Udayapur" }));

        PIDComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Choose issue District", "Achham", "Arghakhanchi", "Baglung", "Baitadi", "Bajhang", "Bajura", "Banke", "Bara", "Bardiya", "Bhaktapur", "Bhojpur", "Chitwan", "Dadeldhura", "Dailekh", "Dang", "Darchula", "Dhading", "Dhankuta", "Dhanusa", "Dholkha", "Dolpa", "Doti", "Gorkha", "Gulmi", "Humla", "Ilam", "Jajarkot", "Jhapa", "Jumla", "Kailali", "Kalikot", "Kanchanpur", "Kapilvastu", "Kaski", "Kathmandu", "Kavrepalanchok", "Khotang", "Lalitpur", "Lamjung", "Mahottari", "Makwanpur", "Manang", "Morang", "Mugu", "Mustang", "Myagdi", "Nawalparasi", "Nuwakot", "Okhaldhunga", "Palpa", "Panchthar", "Parbat", "Parsa", "Pyuthan", "Ramechhap", "Rasuwa", "Rautahat", "Rolpa", "Rukum", "Rupandehi", "Salyan", "Sankhuwasabha", "Saptari", "Sarlahi", "Sindhuli", "Sindhupalchok", "Siraha", "Solukhumbu", "Sunsari", "Surkhet", "Syangja", "Tanahu", "Taplejung", "Terhathum", "Udayapur" }));

        DistrictComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Choose District", "Achham", "Arghakhanchi", "Baglung", "Baitadi", "Bajhang", "Bajura", "Banke", "Bara", "Bardiya", "Bhaktapur", "Bhojpur", "Chitwan", "Dadeldhura", "Dailekh", "Dang", "Darchula", "Dhading", "Dhankuta", "Dhanusa", "Dholkha", "Dolpa", "Doti", "Gorkha", "Gulmi", "Humla", "Ilam", "Jajarkot", "Jhapa", "Jumla", "Kailali", "Kalikot", "Kanchanpur", "Kapilvastu", "Kaski", "Kathmandu", "Kavrepalanchok", "Khotang", "Lalitpur", "Lamjung", "Mahottari", "Makwanpur", "Manang", "Morang", "Mugu", "Mustang", "Myagdi", "Nawalparasi", "Nuwakot", "Okhaldhunga", "Palpa", "Panchthar", "Parbat", "Parsa", "Pyuthan", "Ramechhap", "Rasuwa", "Rautahat", "Rolpa", "Rukum", "Rupandehi", "Salyan", "Sankhuwasabha", "Saptari", "Sarlahi", "Sindhuli", "Sindhupalchok", "Siraha", "Solukhumbu", "Sunsari", "Surkhet", "Syangja", "Tanahu", "Taplejung", "Terhathum", "Udayapur" }));

        ZoneComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Choose Zone", "Bagmati", "Bheri", "Dhawalagiri", "Gandaki", "Janakpur", "Karnali", "Koshi", "Lumbini", "Mahakali", "Mechi", "Narayani", "Rapti", "Sagarmatha", "Seti" }));

        Redmark15.setForeground(new java.awt.Color(255, 0, 0));
        Redmark15.setText("*");

        Redmark16.setForeground(new java.awt.Color(255, 0, 0));
        Redmark16.setText("*");

        Redmark17.setForeground(new java.awt.Color(255, 0, 0));
        Redmark17.setText("*");

        Redmark18.setForeground(new java.awt.Color(255, 0, 0));
        Redmark18.setText("*");

        Redmark19.setForeground(new java.awt.Color(255, 0, 0));
        Redmark19.setText("*");

        Redmark20.setForeground(new java.awt.Color(255, 0, 0));
        Redmark20.setText("*");

        Redmark21.setForeground(new java.awt.Color(255, 0, 0));
        Redmark21.setText("*");

        Redmark22.setForeground(new java.awt.Color(255, 0, 0));
        Redmark22.setText("*");

        Redmark23.setForeground(new java.awt.Color(255, 0, 0));
        Redmark23.setText("*");

        Redmark24.setForeground(new java.awt.Color(255, 0, 0));
        Redmark24.setText("*");

        Redmark25.setForeground(new java.awt.Color(255, 0, 0));
        Redmark25.setText("*");

        Redmark26.setForeground(new java.awt.Color(255, 0, 0));
        Redmark26.setText("*");

        Redmark27.setForeground(new java.awt.Color(255, 0, 0));
        Redmark27.setText("*");

        Redmark28.setForeground(new java.awt.Color(255, 0, 0));
        Redmark28.setText("*");

        ShowValidationOfOwnerName.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        ShowValidationOfOwnerName.setForeground(new java.awt.Color(255, 0, 0));

        ShowValidationOfCID.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        ShowValidationOfCID.setForeground(new java.awt.Color(255, 0, 0));

        ShowValidationOfCitizenshipNumber.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        ShowValidationOfCitizenshipNumber.setForeground(new java.awt.Color(255, 0, 0));

        ShowValidationOfZone.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        ShowValidationOfZone.setForeground(new java.awt.Color(255, 0, 0));

        ShowValidationOfMunicipality.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        ShowValidationOfMunicipality.setForeground(new java.awt.Color(255, 0, 0));

        ShowValidationOfDistrict.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        ShowValidationOfDistrict.setForeground(new java.awt.Color(255, 0, 0));

        ShowValidationOfWardNumber.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        ShowValidationOfWardNumber.setForeground(new java.awt.Color(255, 0, 0));

        ShowValidationOfTole.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        ShowValidationOfTole.setForeground(new java.awt.Color(255, 0, 0));

        ShowValidationOfHouseNumber.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        ShowValidationOfHouseNumber.setForeground(new java.awt.Color(255, 0, 0));

        ShowValidationOfContactNumber.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        ShowValidationOfContactNumber.setForeground(new java.awt.Color(255, 0, 0));

        ShowValidationOfIdentityMark.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        ShowValidationOfIdentityMark.setForeground(new java.awt.Color(255, 0, 0));

        ShowValidationOfRDate.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        ShowValidationOfRDate.setForeground(new java.awt.Color(255, 0, 0));

        ShowValidationOfBDate.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        ShowValidationOfBDate.setForeground(new java.awt.Color(255, 0, 0));

        ShowValidationOfPassportNumber.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        ShowValidationOfPassportNumber.setForeground(new java.awt.Color(255, 0, 0));

        ShowValidationOfPID.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        ShowValidationOfPID.setForeground(new java.awt.Color(255, 0, 0));

        ShowValidationOfEmail.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        ShowValidationOfEmail.setForeground(new java.awt.Color(255, 0, 0));

        ShowValidationOfEducation.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        ShowValidationOfEducation.setForeground(new java.awt.Color(255, 0, 0));

        ShowValidationOfOccupation.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        ShowValidationOfOccupation.setForeground(new java.awt.Color(255, 0, 0));

        RDateChooser.setBackground(new java.awt.Color(255, 255, 255));
        RDateChooser.setDateFormatString("yyyy-M-dd\n");

        BDateChooser.setBackground(new java.awt.Color(255, 255, 255));
        BDateChooser.setDateFormatString("yyyy-M-dd\n");

        GroupLayout OwnerPanelLayout = new GroupLayout(OwnerPanel);
        OwnerPanel.setLayout(OwnerPanelLayout);
        OwnerPanelLayout.setHorizontalGroup(
            OwnerPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(OwnerPanelLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(OwnerPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(OwnerPanelLayout.createSequentialGroup()
                        .addComponent(GenderLabel)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Redmark16, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
                    .addGroup(OwnerPanelLayout.createSequentialGroup()
                        .addComponent(OwnerNameLabel)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Redmark15, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
                    .addComponent(OccupationLabel)
                    .addComponent(PassportNumberLabel)
                    .addGroup(OwnerPanelLayout.createSequentialGroup()
                        .addComponent(IdentityMarkLabel)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Redmark19, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
                    .addGroup(OwnerPanelLayout.createSequentialGroup()
                        .addComponent(ZoneLabel)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Redmark22, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
                    .addGroup(OwnerPanelLayout.createSequentialGroup()
                        .addComponent(MunicipalityLabel)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Redmark23, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
                    .addGroup(OwnerPanelLayout.createSequentialGroup()
                        .addComponent(ContactNumberLabel)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Redmark25, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
                    .addGroup(OwnerPanelLayout.createSequentialGroup()
                        .addComponent(ToleLabel)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Redmark24, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
                    .addGroup(OwnerPanelLayout.createSequentialGroup()
                        .addComponent(CitizenshipNumberLabel)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Redmark17, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addGroup(OwnerPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(OwnerPanelLayout.createSequentialGroup()
                        .addComponent(IdentityMarkTextField, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(OwnerPanelLayout.createSequentialGroup()
                        .addGroup(OwnerPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(OwnerPanelLayout.createSequentialGroup()
                                .addGroup(OwnerPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addGroup(OwnerPanelLayout.createSequentialGroup()
                                        .addGroup(OwnerPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                            .addComponent(ShowValidationOfOwnerName, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                                            .addGroup(OwnerPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                .addComponent(PassportNumberTextField, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                                .addComponent(CitizenshipNumberTextField, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                                .addComponent(OccupationTextField, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                                .addComponent(OwnerNameTextField, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                                .addComponent(ToleTextField, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                                .addComponent(MunicipalityTextField, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                                .addComponent(ContactNumberTextField, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                                .addGroup(OwnerPanelLayout.createSequentialGroup()
                                                    .addComponent(MaleRadioButton)
                                                    .addGap(34, 34, 34)
                                                    .addComponent(FemaleRadioButton))
                                                .addComponent(ZoneComboBox, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(ShowValidationOfZone, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ShowValidationOfTole, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))
                                        .addGap(56, 56, 56)
                                        .addGroup(OwnerPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                            .addComponent(PIDLabel)
                                            .addGroup(OwnerPanelLayout.createSequentialGroup()
                                                .addComponent(RegistrationDateLabel)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Redmark20, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
                                            .addGroup(OwnerPanelLayout.createSequentialGroup()
                                                .addComponent(DateofBirthLabel)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Redmark21, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
                                            .addComponent(EducationLabel)
                                            .addComponent(CIDLabel)
                                            .addGroup(OwnerPanelLayout.createSequentialGroup()
                                                .addComponent(DistrictLabel)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Redmark26, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
                                            .addGroup(OwnerPanelLayout.createSequentialGroup()
                                                .addComponent(HouseNumberLabel)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Redmark28, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
                                            .addComponent(EmailLabel)
                                            .addGroup(OwnerPanelLayout.createSequentialGroup()
                                                .addComponent(WardNumberLabel)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Redmark27, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Redmark18, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
                                    .addComponent(ShowValidationOfOccupation, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(OwnerPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ShowValidationOfCID, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(EducationTextField, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(WardNumberTextField, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(HouseNumberTextField, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(EmailTextField, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(CIDComboBox, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(PIDComboBox, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(DistrictComboBox, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ShowValidationOfDistrict, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(ShowValidationOfWardNumber, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(ShowValidationOfHouseNumber, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(ShowValidationOfRDate, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(ShowValidationOfBDate, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(ShowValidationOfEducation, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(RDateChooser, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BDateChooser, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(OwnerPanelLayout.createSequentialGroup()
                                .addGroup(OwnerPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(ShowValidationOfPassportNumber, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ShowValidationOfIdentityMark, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ShowValidationOfContactNumber, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ShowValidationOfMunicipality, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ShowValidationOfCitizenshipNumber, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))
                                .addGroup(OwnerPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addGroup(OwnerPanelLayout.createSequentialGroup()
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ShowValidationOfPID, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(OwnerPanelLayout.createSequentialGroup()
                                        .addGap(216, 216, 216)
                                        .addComponent(ShowValidationOfEmail, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(46, 46, 46))))
        );
        OwnerPanelLayout.setVerticalGroup(
            OwnerPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(OwnerPanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(OwnerPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addGroup(OwnerPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(OwnerNameLabel)
                        .addComponent(OwnerNameTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(RegistrationDateLabel)
                        .addComponent(Redmark15)
                        .addComponent(Redmark20))
                    .addComponent(RDateChooser, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(OwnerPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(ShowValidationOfOwnerName)
                    .addComponent(ShowValidationOfBDate))
                .addGap(6, 6, 6)
                .addGroup(OwnerPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addGroup(OwnerPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(GenderLabel)
                        .addComponent(DateofBirthLabel)
                        .addComponent(MaleRadioButton)
                        .addComponent(FemaleRadioButton)
                        .addComponent(Redmark16)
                        .addComponent(Redmark21))
                    .addComponent(BDateChooser, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ShowValidationOfRDate)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(OwnerPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(EducationTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(EducationLabel)
                    .addComponent(OccupationLabel)
                    .addComponent(OccupationTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(OwnerPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(ShowValidationOfEducation)
                    .addComponent(ShowValidationOfOccupation))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(OwnerPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(CitizenshipNumberLabel)
                    .addComponent(CitizenshipNumberTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(CIDLabel)
                    .addComponent(CIDComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(Redmark17)
                    .addComponent(Redmark18))
                .addGap(1, 1, 1)
                .addGroup(OwnerPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(ShowValidationOfCitizenshipNumber)
                    .addComponent(ShowValidationOfCID))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(OwnerPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(PIDLabel)
                    .addComponent(PassportNumberTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(PassportNumberLabel)
                    .addComponent(PIDComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(OwnerPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(ShowValidationOfPassportNumber)
                    .addComponent(ShowValidationOfPID))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(OwnerPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(IdentityMarkTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(IdentityMarkLabel)
                    .addComponent(Redmark19))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ShowValidationOfIdentityMark)
                .addGap(64, 64, 64)
                .addGroup(OwnerPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(ZoneLabel)
                    .addComponent(DistrictLabel)
                    .addComponent(DistrictComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(ZoneComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(Redmark22)
                    .addComponent(Redmark26))
                .addGap(2, 2, 2)
                .addGroup(OwnerPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(ShowValidationOfZone)
                    .addComponent(ShowValidationOfDistrict))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(OwnerPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(MunicipalityTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(MunicipalityLabel)
                    .addComponent(WardNumberLabel)
                    .addComponent(WardNumberTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(Redmark23)
                    .addComponent(Redmark27))
                .addGap(1, 1, 1)
                .addGroup(OwnerPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(ShowValidationOfMunicipality)
                    .addComponent(ShowValidationOfWardNumber))
                .addGap(7, 7, 7)
                .addGroup(OwnerPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(ToleLabel)
                    .addComponent(ToleTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(HouseNumberLabel)
                    .addComponent(HouseNumberTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(Redmark24)
                    .addComponent(Redmark28))
                .addGap(1, 1, 1)
                .addGroup(OwnerPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(ShowValidationOfTole)
                    .addComponent(ShowValidationOfHouseNumber))
                .addGap(7, 7, 7)
                .addGroup(OwnerPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(ContactNumberLabel)
                    .addComponent(ContactNumberTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(EmailLabel)
                    .addComponent(EmailTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(Redmark25))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(OwnerPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(ShowValidationOfContactNumber)
                    .addComponent(ShowValidationOfEmail))
                .addContainerGap(190, Short.MAX_VALUE))
        );

        OwnerScrollPane.setViewportView(OwnerPanel);

        TabbedPane.addTab("Owner Details", OwnerScrollPane);

        VehicleScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        VehicleScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        VehiclePanel.setBackground(new java.awt.Color(255, 255, 255));

        VehicleNumberLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        VehicleNumberLabel.setText("Vehicle Number");

        CompanyNameLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CompanyNameLabel.setText("Company Name");

        CompanyNameTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CompanyNameTextFieldKeyPressed(evt);
            }
        });

        VehicleNumberTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                VehicleNumberTextFieldKeyPressed(evt);
            }
        });

        VehicleTypeLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        VehicleTypeLabel.setText("Vehicle Type");

        ModelNumberTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ModelNumberTextFieldKeyPressed(evt);
            }
        });

        ModelNumberLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ModelNumberLabel.setText("Model Number");

        VehicleColorLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        VehicleColorLabel.setText("Vehicle Color");

        EngineNumberLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        EngineNumberLabel.setText("Engine Number");

        DisplacementLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        DisplacementLabel.setText("Displacement/CC");

        MaximumTorqueLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MaximumTorqueLabel.setText("Maximum Torque");

        NoofGearsLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        NoofGearsLabel.setText("Number of Gears");

        VehicleColorTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                VehicleColorTextFieldKeyPressed(evt);
            }
        });

        DisplacementTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                DisplacementTextFieldKeyPressed(evt);
            }
        });

        EngineNumberTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                EngineNumberTextFieldKeyPressed(evt);
            }
        });

        MaximumTorqueTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                MaximumTorqueTextFieldKeyPressed(evt);
            }
        });

        FuelTypeLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        FuelTypeLabel.setText("Fuel Type");

        EngineDescriptionLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        EngineDescriptionLabel.setText("Engine Description");

        MaximumPowerLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MaximumPowerLabel.setText("Maximum Power");

        NoofSeatsLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        NoofSeatsLabel.setText("Number of Seats");

        FuelTankCapacityLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        FuelTankCapacityLabel.setText("Fuel Tank Capacity");

        EngineDescriptionTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                EngineDescriptionTextFieldKeyPressed(evt);
            }
        });

        MaximumPowerTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                MaximumPowerTextFieldKeyPressed(evt);
            }
        });

        NoofSeatsTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                NoofSeatsTextFieldKeyPressed(evt);
            }
        });

        FuelTankCapacityTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                FuelTankCapacityTextFieldKeyPressed(evt);
            }
        });

        FuelTypeComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Choose Fuel Type", "Petrol", "Diesel" }));

        NoofGearsComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Choose No of Gears", "1", "2", "3", "4", "5", "6" }));

        VehicleTypeComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Choose Vehicle Type", "Scooty", "Bike", "Car" }));

        SubmitButton.setText("Submit");
        SubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButtonActionPerformed(evt);
            }
        });

        TickCheckBox.setText("Fill all the details and tick the Checkbox.");

        Redmark1.setForeground(new java.awt.Color(255, 0, 0));
        Redmark1.setText("*");

        Redmark2.setForeground(new java.awt.Color(255, 0, 0));
        Redmark2.setText("*");

        Redmark3.setForeground(new java.awt.Color(255, 0, 0));
        Redmark3.setText("*");

        Redmark4.setForeground(new java.awt.Color(255, 0, 0));
        Redmark4.setText("*");

        Redmark5.setForeground(new java.awt.Color(255, 0, 0));
        Redmark5.setText("*");

        Redmark6.setForeground(new java.awt.Color(255, 0, 0));
        Redmark6.setText("*");

        Remark7.setForeground(new java.awt.Color(255, 0, 0));
        Remark7.setText("*");

        Redmark8.setForeground(new java.awt.Color(255, 0, 0));
        Redmark8.setText("*");

        Redmark9.setForeground(new java.awt.Color(255, 0, 0));
        Redmark9.setText("*");

        Redmark10.setForeground(new java.awt.Color(255, 0, 0));
        Redmark10.setText("*");

        Redmark11.setForeground(new java.awt.Color(255, 0, 0));
        Redmark11.setText("*");

        Redmark12.setForeground(new java.awt.Color(255, 0, 0));
        Redmark12.setText("*");

        Redmark13.setForeground(new java.awt.Color(255, 0, 0));
        Redmark13.setText("*");

        Redmark14.setForeground(new java.awt.Color(255, 0, 0));
        Redmark14.setText("*");

        ShowValidationOfCompanyName.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        ShowValidationOfCompanyName.setForeground(new java.awt.Color(255, 0, 0));

        ShowValidationOfVehicleNumber.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        ShowValidationOfVehicleNumber.setForeground(new java.awt.Color(255, 0, 0));

        ShowValidationOfVehicleType.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        ShowValidationOfVehicleType.setForeground(new java.awt.Color(255, 0, 0));

        ShowValidationOfModelNumber.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        ShowValidationOfModelNumber.setForeground(new java.awt.Color(255, 0, 0));

        ShowValidationOfFuelType.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        ShowValidationOfFuelType.setForeground(new java.awt.Color(255, 0, 0));

        ShowValidationOfVehicleColor.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        ShowValidationOfVehicleColor.setForeground(new java.awt.Color(255, 0, 0));

        ShowValidationOfDisplacement.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        ShowValidationOfDisplacement.setForeground(new java.awt.Color(255, 0, 0));

        ShowValidationOfMaximumPower.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        ShowValidationOfMaximumPower.setForeground(new java.awt.Color(255, 0, 0));

        ShowValidationOfMaximumTorque.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        ShowValidationOfMaximumTorque.setForeground(new java.awt.Color(255, 0, 0));

        ShowValidationOfNoofSeats.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        ShowValidationOfNoofSeats.setForeground(new java.awt.Color(255, 0, 0));

        ShowValidationOfNoofGears.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        ShowValidationOfNoofGears.setForeground(new java.awt.Color(255, 0, 0));

        ShowValidationOfFuelTankCapacity.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        ShowValidationOfFuelTankCapacity.setForeground(new java.awt.Color(255, 0, 0));

        ShowValidationOfEngineNumber.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        ShowValidationOfEngineNumber.setForeground(new java.awt.Color(255, 0, 0));

        ShowValidationOfEngineDescription.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        ShowValidationOfEngineDescription.setForeground(new java.awt.Color(255, 0, 0));

        GroupLayout VehiclePanelLayout = new GroupLayout(VehiclePanel);
        VehiclePanel.setLayout(VehiclePanelLayout);
        VehiclePanelLayout.setHorizontalGroup(
            VehiclePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, VehiclePanelLayout.createSequentialGroup()
                .addGroup(VehiclePanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addGroup(VehiclePanelLayout.createSequentialGroup()
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SubmitButton))
                    .addGroup(VehiclePanelLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(VehiclePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(VehiclePanelLayout.createSequentialGroup()
                                .addComponent(TickCheckBox)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(VehiclePanelLayout.createSequentialGroup()
                                .addGroup(VehiclePanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addComponent(ShowValidationOfCompanyName, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ShowValidationOfVehicleType, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ShowValidationOfVehicleColor, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                                    .addGroup(VehiclePanelLayout.createSequentialGroup()
                                        .addGroup(VehiclePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                            .addGroup(VehiclePanelLayout.createSequentialGroup()
                                                .addComponent(VehicleTypeLabel)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Redmark2, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
                                            .addGroup(VehiclePanelLayout.createSequentialGroup()
                                                .addComponent(VehicleColorLabel)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Redmark3, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
                                            .addGroup(VehiclePanelLayout.createSequentialGroup()
                                                .addComponent(NoofGearsLabel)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Remark7, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
                                            .addGroup(VehiclePanelLayout.createSequentialGroup()
                                                .addComponent(CompanyNameLabel)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Redmark1))
                                            .addGroup(VehiclePanelLayout.createSequentialGroup()
                                                .addComponent(EngineNumberLabel)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Redmark4, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
                                            .addGroup(VehiclePanelLayout.createSequentialGroup()
                                                .addComponent(DisplacementLabel)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Redmark5, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
                                            .addGroup(VehiclePanelLayout.createSequentialGroup()
                                                .addComponent(MaximumTorqueLabel)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Redmark6, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)))
                                        .addGap(15, 15, 15)
                                        .addGroup(VehiclePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                            .addComponent(ShowValidationOfDisplacement, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                                            .addGroup(VehiclePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                .addComponent(CompanyNameTextField, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                                .addComponent(VehicleColorTextField, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                                .addComponent(DisplacementTextField, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                                .addComponent(EngineNumberTextField, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                                .addComponent(MaximumTorqueTextField, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                                .addComponent(NoofGearsComboBox, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(VehicleTypeComboBox, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(ShowValidationOfMaximumTorque, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ShowValidationOfNoofGears, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ShowValidationOfEngineNumber, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))))
                                .addGroup(VehiclePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addGroup(VehiclePanelLayout.createSequentialGroup()
                                        .addGap(56, 56, 56)
                                        .addGroup(VehiclePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                            .addGroup(GroupLayout.Alignment.TRAILING, VehiclePanelLayout.createSequentialGroup()
                                                .addComponent(NoofSeatsLabel)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Redmark13, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(NoofSeatsTextField, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))
                                            .addGroup(GroupLayout.Alignment.TRAILING, VehiclePanelLayout.createSequentialGroup()
                                                .addComponent(MaximumPowerLabel)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Redmark12, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(MaximumPowerTextField, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))
                                            .addGroup(GroupLayout.Alignment.TRAILING, VehiclePanelLayout.createSequentialGroup()
                                                .addComponent(EngineDescriptionLabel)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Redmark11, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(EngineDescriptionTextField, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))
                                            .addGroup(VehiclePanelLayout.createSequentialGroup()
                                                .addComponent(VehicleNumberLabel)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Redmark8, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(VehicleNumberTextField, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))
                                            .addGroup(VehiclePanelLayout.createSequentialGroup()
                                                .addComponent(FuelTankCapacityLabel)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Redmark14, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                                .addComponent(FuelTankCapacityTextField, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))
                                            .addGroup(GroupLayout.Alignment.TRAILING, VehiclePanelLayout.createSequentialGroup()
                                                .addGroup(VehiclePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                    .addGroup(VehiclePanelLayout.createSequentialGroup()
                                                        .addComponent(ModelNumberLabel)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(Redmark9, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(VehiclePanelLayout.createSequentialGroup()
                                                        .addComponent(FuelTypeLabel)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(Redmark10, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                                                .addGroup(VehiclePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                    .addComponent(ShowValidationOfVehicleNumber, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(VehiclePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(ModelNumberTextField, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                                        .addComponent(FuelTypeComboBox, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                    .addComponent(ShowValidationOfFuelType, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(GroupLayout.Alignment.TRAILING, VehiclePanelLayout.createSequentialGroup()
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(VehiclePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                            .addComponent(ShowValidationOfModelNumber, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ShowValidationOfMaximumPower, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ShowValidationOfNoofSeats, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ShowValidationOfFuelTankCapacity, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ShowValidationOfEngineDescription, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))))))))
                .addGap(47, 47, 47))
        );
        VehiclePanelLayout.setVerticalGroup(
            VehiclePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(VehiclePanelLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(VehiclePanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(CompanyNameLabel)
                    .addComponent(CompanyNameTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(VehicleNumberLabel)
                    .addComponent(VehicleNumberTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(Redmark1)
                    .addComponent(Redmark8))
                .addGap(1, 1, 1)
                .addGroup(VehiclePanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(ShowValidationOfCompanyName)
                    .addComponent(ShowValidationOfVehicleNumber))
                .addGap(4, 4, 4)
                .addGroup(VehiclePanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(VehicleTypeLabel)
                    .addComponent(ModelNumberTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(ModelNumberLabel)
                    .addComponent(VehicleTypeComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(Redmark2)
                    .addComponent(Redmark9))
                .addGap(2, 2, 2)
                .addGroup(VehiclePanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(ShowValidationOfVehicleType)
                    .addComponent(ShowValidationOfModelNumber))
                .addGap(3, 3, 3)
                .addGroup(VehiclePanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(VehicleColorLabel)
                    .addComponent(VehicleColorTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(FuelTypeLabel)
                    .addComponent(FuelTypeComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(Redmark3)
                    .addComponent(Redmark10))
                .addGap(3, 3, 3)
                .addGroup(VehiclePanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(ShowValidationOfFuelType)
                    .addComponent(ShowValidationOfVehicleColor))
                .addGap(2, 2, 2)
                .addGroup(VehiclePanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(EngineNumberLabel)
                    .addComponent(EngineNumberTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(EngineDescriptionLabel)
                    .addComponent(EngineDescriptionTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(Redmark4)
                    .addComponent(Redmark11))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(VehiclePanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(ShowValidationOfEngineNumber)
                    .addComponent(ShowValidationOfEngineDescription))
                .addGap(2, 2, 2)
                .addGroup(VehiclePanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(DisplacementLabel)
                    .addComponent(DisplacementTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(MaximumPowerLabel)
                    .addComponent(MaximumPowerTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(Redmark5)
                    .addComponent(Redmark12))
                .addGap(1, 1, 1)
                .addGroup(VehiclePanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(ShowValidationOfDisplacement)
                    .addComponent(ShowValidationOfMaximumPower))
                .addGap(4, 4, 4)
                .addGroup(VehiclePanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(MaximumTorqueLabel)
                    .addComponent(MaximumTorqueTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(NoofSeatsLabel)
                    .addComponent(NoofSeatsTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(Redmark6)
                    .addComponent(Redmark13))
                .addGap(2, 2, 2)
                .addGroup(VehiclePanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(ShowValidationOfMaximumTorque)
                    .addComponent(ShowValidationOfNoofSeats))
                .addGap(3, 3, 3)
                .addGroup(VehiclePanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(NoofGearsLabel)
                    .addComponent(FuelTankCapacityLabel)
                    .addComponent(FuelTankCapacityTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(NoofGearsComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(Remark7)
                    .addComponent(Redmark14))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(VehiclePanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(ShowValidationOfNoofGears)
                    .addComponent(ShowValidationOfFuelTankCapacity))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 188, Short.MAX_VALUE)
                .addComponent(TickCheckBox)
                .addGap(20, 20, 20)
                .addComponent(SubmitButton)
                .addGap(85, 85, 85))
        );

        VehicleScrollPane.setViewportView(VehiclePanel);

        TabbedPane.addTab("Vehicle Details", VehicleScrollPane);

        GroupLayout Register2PanelLayout = new GroupLayout(Register2Panel);
        Register2Panel.setLayout(Register2PanelLayout);
        Register2PanelLayout.setHorizontalGroup(
            Register2PanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(TabbedPane, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        Register2PanelLayout.setVerticalGroup(
            Register2PanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(TabbedPane)
        );

        GroupLayout RegisterPanelLayout = new GroupLayout(RegisterPanel);
        RegisterPanel.setLayout(RegisterPanelLayout);
        RegisterPanelLayout.setHorizontalGroup(
            RegisterPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(TitlePanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Register2Panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        RegisterPanelLayout.setVerticalGroup(
            RegisterPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(RegisterPanelLayout.createSequentialGroup()
                .addComponent(TitlePanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Register2Panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        FileMenu.setText("File");

        HomeMenuItem.setText("Home");
        HomeMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeMenuItemActionPerformed(evt);
            }
        });
        FileMenu.add(HomeMenuItem);

        LogOutMenuItem.setText("Log Out");
        LogOutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutMenuItemActionPerformed(evt);
            }
        });
        FileMenu.add(LogOutMenuItem);

        MenuBar.add(FileMenu);

        setJMenuBar(MenuBar);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(RegisterPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(RegisterPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        if(TickCheckBox.isSelected())
        {
        try{
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/minorproject","root","");
        pstmt = conn.prepareStatement("INSERT INTO userdetails VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        //-----------------------------------------------------------------------------------------------//
        String OwnerName = OwnerNameTextField.getText();
        String RDate = ((JTextField)RDateChooser.getDateEditor().getUiComponent()).getText();
        System.out.println(RDate);
        String gender;
        if(MaleRadioButton.isSelected())
        {
            gender = MaleRadioButton.getText();
        }
        else
        {
            gender = FemaleRadioButton.getText();
        }
        String BDate = ((JTextField)BDateChooser.getDateEditor().getUiComponent()).getText();
        String Occupation = OccupationTextField.getText();
        String Education = EducationTextField.getText();
        String CitizenshipNumber= CitizenshipNumberTextField.getText();
        String CID = CIDComboBox.getSelectedItem().toString();
        String PassportNumber = PassportNumberTextField.getText();
        String PID = PIDComboBox.getSelectedItem().toString();
        String IdentityMark = IdentityMarkTextField.getText();
        String Zone = ZoneComboBox.getSelectedItem().toString();
        String District = DistrictComboBox.getSelectedItem().toString();
        String Municipality = MunicipalityTextField.getText();
        String WardNumber = WardNumberTextField.getText();        
        String Tole = ToleTextField.getText();        
        String HouseNumber = HouseNumberTextField.getText();
        String ContactNumber = ContactNumberTextField.getText();
        String Email = EmailTextField.getText();
        String CompanyName = CompanyNameTextField.getText();
        String VehicleNumber = VehicleNumberTextField.getText();
        String VehicleType = VehicleTypeComboBox.getSelectedItem().toString();
        String ModelNumber = ModelNumberTextField.getText();
        String VehicleColor = VehicleColorTextField.getText();
        String FuelType = FuelTypeComboBox.getSelectedItem().toString();
        String EngineNumber = EngineNumberTextField.getText();
        String EngineDescription = EngineDescriptionTextField.getText();
        String Displacement = DisplacementTextField.getText();
        String MaximumPower = MaximumPowerTextField.getText();
        String MaximumTorque = MaximumTorqueTextField.getText();
        String NoofSeats = NoofSeatsTextField.getText();
        String NoofGears = NoofGearsComboBox.getSelectedItem().toString();
        String FuelTankCapacity = FuelTankCapacityTextField.getText();
        
        //-----------------------------------------------------------------------------------------------//
        
        if(OwnerName.equals(""))
        {
            JOptionPane.showMessageDialog(null,"Owner Name is Required");
        }
        if(RDate.equals(""))
        {
            JOptionPane.showMessageDialog(null,"Registration Date is Required");
        }
        if(gender.equals(""))
        {
            JOptionPane.showMessageDialog(null,"Gender is Required");
        }
        if(BDate.equals(""))
        {
            JOptionPane.showMessageDialog(null,"Birth of Date is Required");
        }
        if(Occupation.equals(""))
        {
            Occupation = "Empty";
        }
        if(Education.equals(""))
        {
            Education = "Empty";
        }
        if(CitizenshipNumber.equals(""))
        {
            JOptionPane.showMessageDialog(null,"Citizenship Number is Required");
        }
        if(CID.equals("Choose issue District"))
        {
            JOptionPane.showMessageDialog(null,"Citizenship issue District is Required");
        }
        if(PassportNumber.equals(""))
        {
            PassportNumber = "Empty";
        }
        if(PID.equals("Choose issue District"))
        {
            PID = "Empty";
        }
        if(IdentityMark.equals(""))
        {
            JOptionPane.showMessageDialog(null,"Identity Mark is Required");
        }
        if(Zone.equals("Choose Zone"))
        {
            JOptionPane.showMessageDialog(null,"Zone is Required");
        }
        if(District.equals("Choose District"))
        {
            JOptionPane.showMessageDialog(null,"District is Required");
        }
        if(Municipality.equals(""))
        {
            JOptionPane.showMessageDialog(null,"Municipality is Required");
        }
        if(WardNumber.equals(""))
        {
            JOptionPane.showMessageDialog(null,"Ward Number is Required");
        }
        if(Tole.equals(""))
        {
            JOptionPane.showMessageDialog(null,"Tole is Required");
        }
        if(HouseNumber.equals(""))
        {
            JOptionPane.showMessageDialog(null,"House Number is Required");
        }
        if(ContactNumber.equals(""))
        {
            JOptionPane.showMessageDialog(null,"Contact Number is Required");
        }
        if(Email.equals(""))
        {
            Email = "Empty";
        }
        if(CompanyName.equals(""))
        {
            JOptionPane.showMessageDialog(null,"Company Name is Required");
        }
        if(VehicleNumber.equals(""))
        {
            JOptionPane.showMessageDialog(null,"Vehicle Number is Required");
        }
        if(VehicleType.equals("Choose Vehicle Type"))
        {
            JOptionPane.showMessageDialog(null,"Vehicle Type is Required");
        }
        if(ModelNumber.equals(""))
        {
            JOptionPane.showMessageDialog(null,"Model Number is Required");
        }
        if(VehicleColor.equals(""))
        {
            JOptionPane.showMessageDialog(null,"Vehicle Color is Required");
        }
        if(FuelType.equals("Choose Fuel Type"))
        {
            JOptionPane.showMessageDialog(null,"Fuel Type is Required");
        }
        if(EngineNumber.equals(""))
        {
            JOptionPane.showMessageDialog(null,"Engine Number is Required");
        }
        if(EngineDescription.equals(""))
        {
            JOptionPane.showMessageDialog(null,"Engine Description is Required");
        }
        if(Displacement.equals(""))
        {
            JOptionPane.showMessageDialog(null,"Displacement is Required");
        }
        if(MaximumPower.equals(""))
        {
            JOptionPane.showMessageDialog(null,"Maximum Power is Required");
        }
        if(MaximumTorque.equals(""))
        {
            JOptionPane.showMessageDialog(null,"Maximum Torque is Required");
        }
        if(NoofSeats.equals(""))
        {
            JOptionPane.showMessageDialog(null,"Number of Seats is Required");
        }
        if(NoofGears.equals("Choose No of Gears"))
        {
            JOptionPane.showMessageDialog(null,"Number of Gears is Required");
        }
        if(FuelTankCapacity.equals(""))
        {
            JOptionPane.showMessageDialog(null,"Fuel Tank Capacity is Required");
        }
                
        //-----------------------------------------------------------------------------------------------//
                
        pstmt.setString(1,OwnerName);
        pstmt.setString(2,RDate);
        pstmt.setString(3,gender);
        pstmt.setString(4,BDate);
        pstmt.setString(5,Occupation);
        pstmt.setString(6,Education);
        pstmt.setString(7,CitizenshipNumber);
        pstmt.setString(8,CID);
        pstmt.setString(9,PassportNumber);
        pstmt.setString(10,PID);
        pstmt.setString(11,IdentityMark);
        pstmt.setString(12,Zone);
        pstmt.setString(13,District);
        pstmt.setString(14,Municipality);
        pstmt.setString(15,WardNumber);
        pstmt.setString(16,Tole);
        pstmt.setString(17,HouseNumber);
        pstmt.setString(18,ContactNumber);
        pstmt.setString(19,Email);
        pstmt.setString(20,CompanyName);
        pstmt.setString(21,VehicleNumber);
        pstmt.setString(22,VehicleType);
        pstmt.setString(23,ModelNumber);
        pstmt.setString(24,VehicleColor);
        pstmt.setString(25,FuelType);
        pstmt.setString(26,EngineNumber);
        pstmt.setString(27,EngineDescription);
        pstmt.setString(28,Displacement);
        pstmt.setString(29,MaximumPower);
        pstmt.setString(30,MaximumTorque);
        pstmt.setString(31,NoofSeats);
        pstmt.setString(32,NoofGears);
        pstmt.setString(33,FuelTankCapacity);
        
        pstmt.executeUpdate();

        JOptionPane.showMessageDialog(null,"Inserted Succesfully");
        StaffPanel SP = new StaffPanel();
        SP.initComponents(LoginID);
        close();
        
        conn.close();
        
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        }else{
            JOptionPane.showMessageDialog(null,"Please fill all the fields and tick Checkbox");
            TickCheckBox.setSelected(false);
        }
    }                                            


    private void HomeMenuItemActionPerformed(java.awt.event.ActionEvent evt) {                                             
        StaffPanel SP = new StaffPanel();
        SP.initComponents(LoginID);
        close();
    }                                            

    private void LogOutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {                                               
        StaffLogin SL = new StaffLogin();
        SL.setVisible(true);
        close();
    }                                              

    private void OwnerNameTextFieldKeyPressed(java.awt.event.KeyEvent evt) {                                              
        String PATTERN = "^[a-zA-Z]{2,30}[ ][a-zA-Z]{2,30}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(OwnerNameTextField.getText());
        if(!match.matches())
        {
            ShowValidationOfOwnerName.setText("Naming is incorrect!");
            OwnerNameTextField.setForeground(Color.red);
        }
        if(match.matches())
        {
            ShowValidationOfOwnerName.setText(null);
            OwnerNameTextField.setForeground(Color.black);
        }
        if(OwnerNameTextField.getText().equals("")){
            ShowValidationOfOwnerName.setText(null);
            OwnerNameTextField.setForeground(Color.black);
        }
    }                                             

    private void CitizenshipNumberTextFieldKeyPressed(java.awt.event.KeyEvent evt) {                                                      
        String PATTERN = "^[0-9]{0,25}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(CitizenshipNumberTextField.getText());
        if(!match.matches())
        {
            ShowValidationOfCitizenshipNumber.setText("Citizenship Number is incorrect!");
            CitizenshipNumberTextField.setForeground(Color.red);
        }
        if(match.matches())
        {
            ShowValidationOfCitizenshipNumber.setText(null);
            CitizenshipNumberTextField.setForeground(Color.black);
        }
        if(CitizenshipNumberTextField.getText().equals("")){
            ShowValidationOfCitizenshipNumber.setText(null);
            CitizenshipNumberTextField.setForeground(Color.black);
        }
    }                                                     

    private void IdentityMarkTextFieldKeyPressed(java.awt.event.KeyEvent evt) {                                                 
        String PATTERN = "^[a-zA-Z]{2,30}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(IdentityMarkTextField.getText());
        if(!match.matches())
        {
            ShowValidationOfIdentityMark.setText("Naming is incorrect!");
            IdentityMarkTextField.setForeground(Color.red);
        }
        if(match.matches())
        {
            ShowValidationOfIdentityMark.setText(null);
            IdentityMarkTextField.setForeground(Color.black);
        }
        if(IdentityMarkTextField.getText().equals("")){
            ShowValidationOfIdentityMark.setText(null);
            IdentityMarkTextField.setForeground(Color.black);
        }
    }                                                

    private void MunicipalityTextFieldKeyPressed(java.awt.event.KeyEvent evt) {                                                 
        String PATTERN = "^[a-zA-Z]{2,25}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(MunicipalityTextField.getText());
        if(!match.matches())
        {
            ShowValidationOfMunicipality.setText("Naming is incorrect!");
            MunicipalityTextField.setForeground(Color.red);
        }
        if(match.matches())
        {
            ShowValidationOfMunicipality.setText(null);
            MunicipalityTextField.setForeground(Color.black);
        }
        if(MunicipalityTextField.getText().equals("")){
            ShowValidationOfMunicipality.setText(null);
            MunicipalityTextField.setForeground(Color.black);
        }
    }                                                

    private void WardNumberTextFieldKeyPressed(java.awt.event.KeyEvent evt) {                                               
        String PATTERN = "^[0-9]{0,10}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(WardNumberTextField.getText());
        if(!match.matches())
        {
            ShowValidationOfWardNumber.setText("Ward Number is incorrect!");
            WardNumberTextField.setForeground(Color.red);
        }
        if(match.matches())
        {
            ShowValidationOfWardNumber.setText(null);
            WardNumberTextField.setForeground(Color.black);
        }
        if(WardNumberTextField.getText().equals("")){
            ShowValidationOfWardNumber.setText(null);
            WardNumberTextField.setForeground(Color.black);
        }
    }                                              

    private void ToleTextFieldKeyPressed(java.awt.event.KeyEvent evt) {                                         
        String PATTERN = "^[a-zA-Z]{2,30}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(ToleTextField.getText());
        if(!match.matches())
        {
            ShowValidationOfTole.setText("Naming is incorrect!");
            ToleTextField.setForeground(Color.red);
        }
        if(match.matches())
        {
            ShowValidationOfTole.setText(null);
            ToleTextField.setForeground(Color.black);
        }
        if(ToleTextField.getText().equals("")){
            ShowValidationOfTole.setText(null);
            ToleTextField.setForeground(Color.black);
        }
    }                                        

    private void HouseNumberTextFieldKeyPressed(java.awt.event.KeyEvent evt) {                                                
        String PATTERN = "^[0-9]{0,10}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(HouseNumberTextField.getText());
        if(!match.matches())
        {
            ShowValidationOfHouseNumber.setText("House Number is incorrect!");
            HouseNumberTextField.setForeground(Color.red);
        }
        if(match.matches())
        {
            ShowValidationOfHouseNumber.setText(null);
            HouseNumberTextField.setForeground(Color.black);
        }
        if(HouseNumberTextField.getText().equals("")){
            ShowValidationOfHouseNumber.setText(null);
            HouseNumberTextField.setForeground(Color.black);
        }
    }                                               

    private void ContactNumberTextFieldKeyPressed(java.awt.event.KeyEvent evt) {                                                  
        String PATTERN = "^[0-9]{0,15}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(ContactNumberTextField.getText());
        if(!match.matches())
        {
            ShowValidationOfContactNumber.setText("Contact Number is incorrect!");
            ContactNumberTextField.setForeground(Color.red);
        }
        if(match.matches())
        {
            ShowValidationOfContactNumber.setText(null);
            ContactNumberTextField.setForeground(Color.black);
        }
        if(ContactNumberTextField.getText().equals("")){
            ShowValidationOfContactNumber.setText(null);
            ContactNumberTextField.setForeground(Color.black);
        }
    }                                                 

    private void EmailTextFieldKeyPressed(java.awt.event.KeyEvent evt) {                                          
        String PATTERN = "^[a-zA-Z0-9]{0,30}[@][a-zA-Z0-9]{0,10}[.][a-zA-Z]{0,10}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(EmailTextField.getText());
        if(!match.matches())
        {
            ShowValidationOfEmail.setText("Email Id is incorrect!");
            EmailTextField.setForeground(Color.red);
        }
        if(match.matches())
        {
            ShowValidationOfEmail.setText(null);
            EmailTextField.setForeground(Color.black);
        }
        if(EmailTextField.getText().equals("")){
            ShowValidationOfEmail.setText(null);
            EmailTextField.setForeground(Color.black);
        }
    }                                         

    private void PassportNumberTextFieldKeyPressed(java.awt.event.KeyEvent evt) {                                                   
        String PATTERN = "^[0-9]{0,25}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(PassportNumberTextField.getText());
        if(!match.matches())
        {
            ShowValidationOfPassportNumber.setText("Passport Number is incorrect!");
            PassportNumberTextField.setForeground(Color.red);
        }
        if(match.matches())
        {
            ShowValidationOfPassportNumber.setText(null);
            PassportNumberTextField.setForeground(Color.black);
        }
        if(PassportNumberTextField.getText().equals("")){
            ShowValidationOfPassportNumber.setText(null);
            PassportNumberTextField.setForeground(Color.black);
        }
    }                                                  

    private void OccupationTextFieldKeyPressed(java.awt.event.KeyEvent evt) {                                               
        String PATTERN = "^[a-zA-Z]{2,25}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(OccupationTextField.getText());
        if(!match.matches())
        {
            ShowValidationOfOccupation.setText("Naming is incorrect!");
            OccupationTextField.setForeground(Color.red);
        }
        if(match.matches())
        {
            ShowValidationOfOccupation.setText(null);
            OccupationTextField.setForeground(Color.black);
        }
        if(OccupationTextField.getText().equals("")){
            ShowValidationOfOccupation.setText(null);
            OccupationTextField.setForeground(Color.black);
        }
    }                                              

    private void EducationTextFieldKeyPressed(java.awt.event.KeyEvent evt) {                                              
        String PATTERN = "^[a-zA-Z]{2,25}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(EducationTextField.getText());
        if(!match.matches())
        {
            ShowValidationOfEducation.setText("Naming is incorrect!");
            EducationTextField.setForeground(Color.red);
        }
        if(match.matches())
        {
            ShowValidationOfEducation.setText(null);
            EducationTextField.setForeground(Color.black);
        }
        if(EducationTextField.getText().equals("")){
            ShowValidationOfEducation.setText(null);
            EducationTextField.setForeground(Color.black);
        }
    }                                             

    private void CompanyNameTextFieldKeyPressed(java.awt.event.KeyEvent evt) {                                                
        String PATTERN = "^[a-zA-Z]{2,30}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(CompanyNameTextField.getText());
        if(!match.matches())
        {
            ShowValidationOfCompanyName.setText("Naming is incorrect!");
            CompanyNameTextField.setForeground(Color.red);
        }
        if(match.matches())
        {
            ShowValidationOfCompanyName.setText(null);
            CompanyNameTextField.setForeground(Color.black);
        }
        if(CompanyNameTextField.getText().equals("")){
            ShowValidationOfCompanyName.setText(null);
            CompanyNameTextField.setForeground(Color.black);
        }
    }                                               

    private void VehicleNumberTextFieldKeyPressed(java.awt.event.KeyEvent evt) {                                                  
        String PATTERN = "^[a-zA-Z]{0,3}[ ][0-9]{0,2}[ ][a-zA-Z]{0,3}[ ][0-9]{0,4}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(VehicleNumberTextField.getText());
        if(!match.matches())
        {
            ShowValidationOfVehicleNumber.setText("Numbering is incorrect!");
            VehicleNumberTextField.setForeground(Color.red);
        }
        if(match.matches())
        {
            ShowValidationOfVehicleNumber.setText(null);
            VehicleNumberTextField.setForeground(Color.black);
        }
        if(VehicleNumberTextField.getText().equals("")){
            ShowValidationOfVehicleNumber.setText(null);
            VehicleNumberTextField.setForeground(Color.black);
        }
    }                                                 

    private void ModelNumberTextFieldKeyPressed(java.awt.event.KeyEvent evt) {                                                
        String PATTERN = "^[0-9]{0,15}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(ModelNumberTextField.getText());
        if(!match.matches())
        {
            ShowValidationOfModelNumber.setText("Numbering is incorrect!");
            ModelNumberTextField.setForeground(Color.red);
        }
        if(match.matches())
        {
            ShowValidationOfModelNumber.setText(null);
            ModelNumberTextField.setForeground(Color.black);
        }
        if(ModelNumberTextField.getText().equals("")){
            ShowValidationOfModelNumber.setText(null);
            ModelNumberTextField.setForeground(Color.black);
        }
    }                                               

    private void VehicleColorTextFieldKeyPressed(java.awt.event.KeyEvent evt) {                                                 
        String PATTERN = "^[a-zA-Z]{2,30}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(VehicleColorTextField.getText());
        if(!match.matches())
        {
            ShowValidationOfVehicleColor.setText("Naming is incorrect!");
            VehicleColorTextField.setForeground(Color.red);
        }
        if(match.matches())
        {
            ShowValidationOfVehicleColor.setText(null);
            VehicleColorTextField.setForeground(Color.black);
        }
        if(VehicleColorTextField.getText().equals("")){
            ShowValidationOfVehicleColor.setText(null);
            VehicleColorTextField.setForeground(Color.black);
        }
    }                                                

    private void EngineNumberTextFieldKeyPressed(java.awt.event.KeyEvent evt) {                                                 
        String PATTERN = "^[0-9]{0,15}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(EngineNumberTextField.getText());
        if(!match.matches())
        {
            ShowValidationOfEngineNumber.setText("Contact Number is incorrect!");
            EngineNumberTextField.setForeground(Color.red);
        }
        if(match.matches())
        {
            ShowValidationOfEngineNumber.setText(null);
            EngineNumberTextField.setForeground(Color.black);
        }
        if(EngineNumberTextField.getText().equals("")){
            ShowValidationOfEngineNumber.setText(null);
            EngineNumberTextField.setForeground(Color.black);
        }
    }                                                

    private void EngineDescriptionTextFieldKeyPressed(java.awt.event.KeyEvent evt) {                                                      
        String PATTERN = "^[a-zA-Z]{0,30}[ ][a-zA-Z]{0,30}[ ][a-zA-Z]{0,30}[ ][a-zA-Z]{0,30}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(EngineDescriptionTextField.getText());
        if(!match.matches())
        {
            ShowValidationOfEngineDescription.setText("Naming is incorrect!");
            EngineDescriptionTextField.setForeground(Color.red);
        }
        if(match.matches())
        {
            ShowValidationOfEngineDescription.setText(null);
            EngineDescriptionTextField.setForeground(Color.black);
        }
        if(EngineDescriptionTextField.getText().equals("")){
            ShowValidationOfEngineDescription.setText(null);
            EngineDescriptionTextField.setForeground(Color.black);
        }
    }                                                     

    private void DisplacementTextFieldKeyPressed(java.awt.event.KeyEvent evt) {                                                 
        String PATTERN = "^[0-9]{0,4}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(DisplacementTextField.getText());
        if(!match.matches())
        {
            ShowValidationOfDisplacement.setText("Contact Number is incorrect!");
            DisplacementTextField.setForeground(Color.red);
        }
        if(match.matches())
        {
            ShowValidationOfDisplacement.setText(null);
            DisplacementTextField.setForeground(Color.black);
        }
        if(DisplacementTextField.getText().equals("")){
            ShowValidationOfDisplacement.setText(null);
            DisplacementTextField.setForeground(Color.black);
        }
    }                                                

    private void MaximumPowerTextFieldKeyPressed(java.awt.event.KeyEvent evt) {                                                 
        String PATTERN = "^[0-9]{0,4}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(MaximumPowerTextField.getText());
        if(!match.matches())
        {
            ShowValidationOfMaximumPower.setText("Numbering is incorrect!");
            MaximumPowerTextField.setForeground(Color.red);
        }
        if(match.matches())
        {
            ShowValidationOfMaximumPower.setText(null);
            MaximumPowerTextField.setForeground(Color.black);
        }
        if(MaximumPowerTextField.getText().equals("")){
            ShowValidationOfMaximumPower.setText(null);
            MaximumPowerTextField.setForeground(Color.black);
        }
    }                                                

    private void MaximumTorqueTextFieldKeyPressed(java.awt.event.KeyEvent evt) {                                                  
        String PATTERN = "^[0-9]{0,4}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(MaximumTorqueTextField.getText());
        if(!match.matches())
        {
            ShowValidationOfMaximumTorque.setText("Numbering is incorrect!");
            MaximumTorqueTextField.setForeground(Color.red);
        }
        if(match.matches())
        {
            ShowValidationOfMaximumTorque.setText(null);
            MaximumTorqueTextField.setForeground(Color.black);
        }
        if(MaximumTorqueTextField.getText().equals("")){
            ShowValidationOfMaximumTorque.setText(null);
            MaximumTorqueTextField.setForeground(Color.black);
        }
    }                                                 

    private void NoofSeatsTextFieldKeyPressed(java.awt.event.KeyEvent evt) {                                              
        String PATTERN = "^[0-9]{0,2}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(NoofSeatsTextField.getText());
        if(!match.matches())
        {
            ShowValidationOfNoofSeats.setText("No of Seats is incorrect!");
            NoofSeatsTextField.setForeground(Color.red);
        }
        if(match.matches())
        {
            ShowValidationOfNoofSeats.setText(null);
            NoofSeatsTextField.setForeground(Color.black);
        }
        if(NoofSeatsTextField.getText().equals("")){
            ShowValidationOfNoofSeats.setText(null);
            NoofSeatsTextField.setForeground(Color.black);
        }
    }                                             

    private void FuelTankCapacityTextFieldKeyPressed(java.awt.event.KeyEvent evt) {                                                     
        String PATTERN = "^[0-9]{0,3}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(FuelTankCapacityTextField.getText());
        if(!match.matches())
        {
            ShowValidationOfFuelTankCapacity.setText("Numbering is incorrect!");
            FuelTankCapacityTextField.setForeground(Color.red);
        }
        if(match.matches())
        {
            ShowValidationOfFuelTankCapacity.setText(null);
            FuelTankCapacityTextField.setForeground(Color.black);
        }
        if(FuelTankCapacityTextField.getText().equals("")){
            ShowValidationOfFuelTankCapacity.setText(null);
            FuelTankCapacityTextField.setForeground(Color.black);
        }
    }                                                    

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private JLabel AMLabel;
    private com.toedter.calendar.JDateChooser BDateChooser;
    private JComboBox<String> CIDComboBox;
    private JLabel CIDLabel;
    private JLabel CitizenshipNumberLabel;
    private JTextField CitizenshipNumberTextField;
    private JLabel CompanyNameLabel;
    private JTextField CompanyNameTextField;
    private JLabel ContactNumberLabel;
    private JTextField ContactNumberTextField;
    private JLabel DateofBirthLabel;
    private JLabel DisplacementLabel;
    private JTextField DisplacementTextField;
    private JComboBox<String> DistrictComboBox;
    private JLabel DistrictLabel;
    private JLabel EducationLabel;
    private JTextField EducationTextField;
    private JLabel EmailLabel;
    private JTextField EmailTextField;
    private JLabel EngineDescriptionLabel;
    private JTextField EngineDescriptionTextField;
    private JLabel EngineNumberLabel;
    private JTextField EngineNumberTextField;
    private JRadioButton FemaleRadioButton;
    private JMenu FileMenu;
    private JLabel FuelTankCapacityLabel;
    private JTextField FuelTankCapacityTextField;
    private JComboBox<String> FuelTypeComboBox;
    private JLabel FuelTypeLabel;
    private JLabel GenderLabel;
    private ButtonGroup GenderbuttonGroup;
    private JMenuItem HomeMenuItem;
    private JLabel HouseNumberLabel;
    private JTextField HouseNumberTextField;
    private JLabel IdentityMarkLabel;
    private JTextField IdentityMarkTextField;
    private JMenuItem LogOutMenuItem;
    private JRadioButton MaleRadioButton;
    private JLabel MaximumPowerLabel;
    private JTextField MaximumPowerTextField;
    private JLabel MaximumTorqueLabel;
    private JTextField MaximumTorqueTextField;
    private JMenuBar MenuBar;
    private JLabel ModelNumberLabel;
    private JTextField ModelNumberTextField;
    private JLabel MunicipalityLabel;
    private JTextField MunicipalityTextField;
    private JComboBox<String> NoofGearsComboBox;
    private JLabel NoofGearsLabel;
    private JLabel NoofSeatsLabel;
    private JTextField NoofSeatsTextField;
    private JLabel OccupationLabel;
    private JTextField OccupationTextField;
    private JLabel OwnerNameLabel;
    private JTextField OwnerNameTextField;
    private JPanel OwnerPanel;
    private JScrollPane OwnerScrollPane;
    private JComboBox<String> PIDComboBox;
    private JLabel PIDLabel;
    private JLabel PassportNumberLabel;
    private JTextField PassportNumberTextField;
    private com.toedter.calendar.JDateChooser RDateChooser;
    private JLabel Redmark1;
    private JLabel Redmark10;
    private JLabel Redmark11;
    private JLabel Redmark12;
    private JLabel Redmark13;
    private JLabel Redmark14;
    private JLabel Redmark15;
    private JLabel Redmark16;
    private JLabel Redmark17;
    private JLabel Redmark18;
    private JLabel Redmark19;
    private JLabel Redmark2;
    private JLabel Redmark20;
    private JLabel Redmark21;
    private JLabel Redmark22;
    private JLabel Redmark23;
    private JLabel Redmark24;
    private JLabel Redmark25;
    private JLabel Redmark26;
    private JLabel Redmark27;
    private JLabel Redmark28;
    private JLabel Redmark3;
    private JLabel Redmark4;
    private JLabel Redmark5;
    private JLabel Redmark6;
    private JLabel Redmark8;
    private JLabel Redmark9;
    private JPanel Register2Panel;
    private JPanel RegisterPanel;
    private JLabel RegistrationDateLabel;
    private JLabel Remark7;
    private JLabel SLabel;
    private JLabel ShowValidationOfBDate;
    private JLabel ShowValidationOfCID;
    private JLabel ShowValidationOfCitizenshipNumber;
    private JLabel ShowValidationOfCompanyName;
    private JLabel ShowValidationOfContactNumber;
    private JLabel ShowValidationOfDisplacement;
    private JLabel ShowValidationOfDistrict;
    private JLabel ShowValidationOfEducation;
    private JLabel ShowValidationOfEmail;
    private JLabel ShowValidationOfEngineDescription;
    private JLabel ShowValidationOfEngineNumber;
    private JLabel ShowValidationOfFuelTankCapacity;
    private JLabel ShowValidationOfFuelType;
    private JLabel ShowValidationOfHouseNumber;
    private JLabel ShowValidationOfIdentityMark;
    private JLabel ShowValidationOfMaximumPower;
    private JLabel ShowValidationOfMaximumTorque;
    private JLabel ShowValidationOfModelNumber;
    private JLabel ShowValidationOfMunicipality;
    private JLabel ShowValidationOfNoofGears;
    private JLabel ShowValidationOfNoofSeats;
    private JLabel ShowValidationOfOccupation;
    private JLabel ShowValidationOfOwnerName;
    private JLabel ShowValidationOfPID;
    private JLabel ShowValidationOfPassportNumber;
    private JLabel ShowValidationOfRDate;
    private JLabel ShowValidationOfTole;
    private JLabel ShowValidationOfVehicleColor;
    private JLabel ShowValidationOfVehicleNumber;
    private JLabel ShowValidationOfVehicleType;
    private JLabel ShowValidationOfWardNumber;
    private JLabel ShowValidationOfZone;
    private JButton SubmitButton;
    private JTabbedPane TabbedPane;
    private JCheckBox TickCheckBox;
    private JPanel TitlePanel;
    private JLabel ToleLabel;
    private JTextField ToleTextField;
    private JLabel VehicleColorLabel;
    private JTextField VehicleColorTextField;
    private JLabel VehicleNumberLabel;
    private JTextField VehicleNumberTextField;
    private JPanel VehiclePanel;
    private JScrollPane VehicleScrollPane;
    private JComboBox<String> VehicleTypeComboBox;
    private JLabel VehicleTypeLabel;
    private JLabel WardNumberLabel;
    private JTextField WardNumberTextField;
    private JComboBox<String> ZoneComboBox;
    private JLabel ZoneLabel;
    // End of variables declaration                   
}
