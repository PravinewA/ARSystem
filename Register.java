package minorproject;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author pravinewa
 */
public class Register extends JFrame {
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
        RDateFormattedTextField = new JFormattedTextField();
        BDateFormattedTextField = new JFormattedTextField();
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

        GenderLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        GenderLabel.setText("Gender");

        IdentityMarkLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        IdentityMarkLabel.setText("Identity Mark");

        ZoneLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ZoneLabel.setText("Zone");

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

        DateofBirthLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        DateofBirthLabel.setText("Date of Birth");

        EducationLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        EducationLabel.setText("Education");

        CIDLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CIDLabel.setText("Citizenship issue District");

        PIDLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        PIDLabel.setText("Passport issue District");

        MaleRadioButton.setBackground(new java.awt.Color(255, 255, 255));
        GenderbuttonGroup.add(MaleRadioButton);
        MaleRadioButton.setText("Male");

        FemaleRadioButton.setBackground(new java.awt.Color(255, 255, 255));
        GenderbuttonGroup.add(FemaleRadioButton);
        FemaleRadioButton.setText("Female");

        CIDComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Achham", "Arghakhanchi", "Baglung", "Baitadi", "Bajhang", "Bajura", "Banke", "Bara", "Bardiya", "Bhaktapur", "Bhojpur", "Chitwan", "Dadeldhura", "Dailekh", "Dang", "Darchula", "Dhading", "Dhankuta", "Dhanusa", "Dholkha", "Dolpa", "Doti", "Gorkha", "Gulmi", "Humla", "Ilam", "Jajarkot", "Jhapa", "Jumla", "Kailali", "Kalikot", "Kanchanpur", "Kapilvastu", "Kaski", "Kathmandu", "Kavrepalanchok", "Khotang", "Lalitpur", "Lamjung", "Mahottari", "Makwanpur", "Manang", "Morang", "Mugu", "Mustang", "Myagdi", "Nawalparasi", "Nuwakot", "Okhaldhunga", "Palpa", "Panchthar", "Parbat", "Parsa", "Pyuthan", "Ramechhap", "Rasuwa", "Rautahat", "Rolpa", "Rukum", "Rupandehi", "Salyan", "Sankhuwasabha", "Saptari", "Sarlahi", "Sindhuli", "Sindhupalchok", "Siraha", "Solukhumbu", "Sunsari", "Surkhet", "Syangja", "Tanahu", "Taplejung", "Terhathum", "Udayapur" }));

        PIDComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Achham", "Arghakhanchi", "Baglung", "Baitadi", "Bajhang", "Bajura", "Banke", "Bara", "Bardiya", "Bhaktapur", "Bhojpur", "Chitwan", "Dadeldhura", "Dailekh", "Dang", "Darchula", "Dhading", "Dhankuta", "Dhanusa", "Dholkha", "Dolpa", "Doti", "Gorkha", "Gulmi", "Humla", "Ilam", "Jajarkot", "Jhapa", "Jumla", "Kailali", "Kalikot", "Kanchanpur", "Kapilvastu", "Kaski", "Kathmandu", "Kavrepalanchok", "Khotang", "Lalitpur", "Lamjung", "Mahottari", "Makwanpur", "Manang", "Morang", "Mugu", "Mustang", "Myagdi", "Nawalparasi", "Nuwakot", "Okhaldhunga", "Palpa", "Panchthar", "Parbat", "Parsa", "Pyuthan", "Ramechhap", "Rasuwa", "Rautahat", "Rolpa", "Rukum", "Rupandehi", "Salyan", "Sankhuwasabha", "Saptari", "Sarlahi", "Sindhuli", "Sindhupalchok", "Siraha", "Solukhumbu", "Sunsari", "Surkhet", "Syangja", "Tanahu", "Taplejung", "Terhathum", "Udayapur" }));

        DistrictComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Achham", "Arghakhanchi", "Baglung", "Baitadi", "Bajhang", "Bajura", "Banke", "Bara", "Bardiya", "Bhaktapur", "Bhojpur", "Chitwan", "Dadeldhura", "Dailekh", "Dang", "Darchula", "Dhading", "Dhankuta", "Dhanusa", "Dholkha", "Dolpa", "Doti", "Gorkha", "Gulmi", "Humla", "Ilam", "Jajarkot", "Jhapa", "Jumla", "Kailali", "Kalikot", "Kanchanpur", "Kapilvastu", "Kaski", "Kathmandu", "Kavrepalanchok", "Khotang", "Lalitpur", "Lamjung", "Mahottari", "Makwanpur", "Manang", "Morang", "Mugu", "Mustang", "Myagdi", "Nawalparasi", "Nuwakot", "Okhaldhunga", "Palpa", "Panchthar", "Parbat", "Parsa", "Pyuthan", "Ramechhap", "Rasuwa", "Rautahat", "Rolpa", "Rukum", "Rupandehi", "Salyan", "Sankhuwasabha", "Saptari", "Sarlahi", "Sindhuli", "Sindhupalchok", "Siraha", "Solukhumbu", "Sunsari", "Surkhet", "Syangja", "Tanahu", "Taplejung", "Terhathum", "Udayapur" }));

        ZoneComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Bagmati", "Bheri", "Dhawalagiri", "Gandaki", "Janakpur", "Karnali", "Koshi", "Lumbini", "Mahakali", "Mechi", "Narayani", "Rapti", "Sagarmatha", "Seti" }));

        RDateFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy-M-dd"))));
        RDateFormattedTextField.setText("YYYY-M-DD");

        BDateFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy-M-dd"))));
        BDateFormattedTextField.setText("YYYY-M-DD");

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
                                .addComponent(WardNumberLabel)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Redmark27, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
                            .addGroup(OwnerPanelLayout.createSequentialGroup()
                                .addComponent(HouseNumberLabel)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Redmark28, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
                            .addComponent(EmailLabel))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Redmark18, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(OwnerPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(EducationTextField, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(WardNumberTextField, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(HouseNumberTextField, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(EmailTextField, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(CIDComboBox, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PIDComboBox, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DistrictComboBox, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(RDateFormattedTextField)
                            .addComponent(BDateFormattedTextField))
                        .addGap(46, 46, 46))))
        );
        OwnerPanelLayout.setVerticalGroup(
            OwnerPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(OwnerPanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(OwnerPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(OwnerNameLabel)
                    .addComponent(OwnerNameTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(RegistrationDateLabel)
                    .addComponent(RDateFormattedTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(Redmark15)
                    .addComponent(Redmark20))
                .addGap(18, 18, 18)
                .addGroup(OwnerPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(GenderLabel)
                    .addComponent(DateofBirthLabel)
                    .addComponent(MaleRadioButton)
                    .addComponent(FemaleRadioButton)
                    .addComponent(BDateFormattedTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(Redmark16)
                    .addComponent(Redmark21))
                .addGap(18, 18, 18)
                .addGroup(OwnerPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(EducationTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(EducationLabel)
                    .addComponent(OccupationLabel)
                    .addComponent(OccupationTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(OwnerPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(CitizenshipNumberLabel)
                    .addComponent(CitizenshipNumberTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(CIDLabel)
                    .addComponent(CIDComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(Redmark17)
                    .addComponent(Redmark18))
                .addGap(18, 18, 18)
                .addGroup(OwnerPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(PIDLabel)
                    .addComponent(PassportNumberTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(PassportNumberLabel)
                    .addComponent(PIDComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(OwnerPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(IdentityMarkTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(IdentityMarkLabel)
                    .addComponent(Redmark19))
                .addGap(84, 84, 84)
                .addGroup(OwnerPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(ZoneLabel)
                    .addComponent(DistrictLabel)
                    .addComponent(DistrictComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(ZoneComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(Redmark22)
                    .addComponent(Redmark26))
                .addGap(18, 18, 18)
                .addGroup(OwnerPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(MunicipalityTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(MunicipalityLabel)
                    .addComponent(WardNumberLabel)
                    .addComponent(WardNumberTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(Redmark23)
                    .addComponent(Redmark27))
                .addGap(18, 18, 18)
                .addGroup(OwnerPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(ToleLabel)
                    .addComponent(ToleTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(HouseNumberLabel)
                    .addComponent(HouseNumberTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(Redmark24)
                    .addComponent(Redmark28))
                .addGap(18, 18, 18)
                .addGroup(OwnerPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(ContactNumberLabel)
                    .addComponent(ContactNumberTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(EmailLabel)
                    .addComponent(EmailTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(Redmark25))
                .addContainerGap(92, Short.MAX_VALUE))
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

        VehicleTypeLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        VehicleTypeLabel.setText("Vehicle Type");

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
        NoofGearsLabel.setText("No of Gears");

        FuelTypeLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        FuelTypeLabel.setText("Fuel Type");

        EngineDescriptionLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        EngineDescriptionLabel.setText("Engine Description");

        MaximumPowerLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MaximumPowerLabel.setText("Maximum Power");

        NoofSeatsLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        NoofSeatsLabel.setText("No of Seats");

        FuelTankCapacityLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        FuelTankCapacityLabel.setText("Fuel Tank Capacity");

        FuelTypeComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Petrol", "Diesel" }));

        NoofGearsComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6" }));

        VehicleTypeComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Scooty", "Bike", "Car" }));

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
                                .addGroup(VehiclePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addComponent(CompanyNameTextField, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(VehicleColorTextField, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(DisplacementTextField, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(EngineNumberTextField, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(MaximumTorqueTextField, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(NoofGearsComboBox, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(VehicleTypeComboBox, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                                        .addGroup(VehiclePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                            .addComponent(ModelNumberTextField, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                            .addComponent(FuelTypeComboBox, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(VehiclePanelLayout.createSequentialGroup()
                                        .addComponent(FuelTankCapacityLabel)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Redmark14, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(FuelTankCapacityTextField, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))))
                            .addGroup(VehiclePanelLayout.createSequentialGroup()
                                .addComponent(TickCheckBox)
                                .addGap(0, 0, Short.MAX_VALUE)))))
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
                .addGap(18, 18, 18)
                .addGroup(VehiclePanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(VehicleTypeLabel)
                    .addComponent(ModelNumberTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(ModelNumberLabel)
                    .addComponent(VehicleTypeComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(Redmark2)
                    .addComponent(Redmark9))
                .addGap(18, 18, 18)
                .addGroup(VehiclePanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(VehicleColorLabel)
                    .addComponent(VehicleColorTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(FuelTypeLabel)
                    .addComponent(FuelTypeComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(Redmark3)
                    .addComponent(Redmark10))
                .addGap(18, 18, 18)
                .addGroup(VehiclePanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(EngineNumberLabel)
                    .addComponent(EngineNumberTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(EngineDescriptionLabel)
                    .addComponent(EngineDescriptionTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(Redmark4)
                    .addComponent(Redmark11))
                .addGap(18, 18, 18)
                .addGroup(VehiclePanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(DisplacementLabel)
                    .addComponent(DisplacementTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(MaximumPowerLabel)
                    .addComponent(MaximumPowerTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(Redmark5)
                    .addComponent(Redmark12))
                .addGap(18, 18, 18)
                .addGroup(VehiclePanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(MaximumTorqueLabel)
                    .addComponent(MaximumTorqueTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(NoofSeatsLabel)
                    .addComponent(NoofSeatsTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(Redmark6)
                    .addComponent(Redmark13))
                .addGap(18, 18, 18)
                .addGroup(VehiclePanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(NoofGearsLabel)
                    .addComponent(FuelTankCapacityLabel)
                    .addComponent(FuelTankCapacityTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(NoofGearsComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(Remark7)
                    .addComponent(Redmark14))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
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
            .addComponent(TabbedPane, GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE)
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
    }
    private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        if(TickCheckBox.isSelected())
        {
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/minorproject","root","");
        PreparedStatement pstmt = conn.prepareStatement("INSERT INTO userdetails VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        pstmt.setString(1,OwnerNameTextField.getText());
        pstmt.setString(2,RDateFormattedTextField.getText());
        String gender;
        if(MaleRadioButton.isSelected())
        {
            gender = MaleRadioButton.getText();
        }
        else
        {
            gender = FemaleRadioButton.getText();
        }
        pstmt.setString(3,gender);
        pstmt.setString(4,BDateFormattedTextField.getText());
        pstmt.setString(5,OccupationTextField.getText());
        pstmt.setString(6,EducationTextField.getText());
        pstmt.setString(7,CitizenshipNumberTextField.getText());
        pstmt.setString(8,CIDComboBox.getSelectedItem().toString());
        pstmt.setString(9,PassportNumberTextField.getText());
        pstmt.setString(10,PIDComboBox.getSelectedItem().toString());
        pstmt.setString(11,IdentityMarkTextField.getText());
        pstmt.setString(12,ZoneComboBox.getSelectedItem().toString());
        pstmt.setString(13,DistrictComboBox.getSelectedItem().toString());
        pstmt.setString(14,MunicipalityTextField.getText());
        pstmt.setString(15,WardNumberTextField.getText());
        pstmt.setString(16,ToleTextField.getText());
        pstmt.setString(17,HouseNumberTextField.getText());
        pstmt.setString(18,ContactNumberTextField.getText());
        pstmt.setString(19,EmailTextField.getText());
        pstmt.setString(20,CompanyNameTextField.getText());
        pstmt.setString(21,VehicleNumberTextField.getText());
        pstmt.setString(22,VehicleTypeComboBox.getSelectedItem().toString());
        pstmt.setString(23,ModelNumberTextField.getText());
        pstmt.setString(24,VehicleColorTextField.getText());
        pstmt.setString(25,FuelTypeComboBox.getSelectedItem().toString());
        pstmt.setString(26,EngineNumberTextField.getText());
        pstmt.setString(27,EngineDescriptionTextField.getText());
        pstmt.setString(28,DisplacementTextField.getText());
        pstmt.setString(29,MaximumPowerTextField.getText());
        pstmt.setString(30,MaximumTorqueTextField.getText());
        pstmt.setString(31,NoofSeatsTextField.getText());
        pstmt.setString(32,NoofGearsComboBox.getSelectedItem().toString());
        pstmt.setString(33,FuelTankCapacityTextField.getText());
        
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
    	}
        else
        {
        	JOptionPane.showMessageDialog(null, "Tick the checkbox to submit");
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

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    private JLabel AMLabel;
    private JFormattedTextField BDateFormattedTextField;
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
    private JFormattedTextField RDateFormattedTextField;
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
