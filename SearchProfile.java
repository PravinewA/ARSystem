package minorproject;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.*;
/**
 *
 * @author pravinewa
 */
public class SearchProfile extends JFrame {
	static String vehicleno;
    
	public SearchProfile() {
    	ProfilePanel = new JPanel();
        TitlePanel = new JPanel();
        AMLabel = new JLabel();
        SLabel = new JLabel();
        SearchProfileScrollPane = new JScrollPane();
        DetailsPanel = new JPanel();
        OwnerNameLabel = new JLabel();
        GenderLabel = new JLabel();
        OccupationLabel = new JLabel();
        CitizenshipNumberLabel = new JLabel();
        PassportNumberLabel = new JLabel();
        IdentityMarkLabel = new JLabel();
        ZoneLabel = new JLabel();
        MunicipalityLabel = new JLabel();
        ToleLabel = new JLabel();
        ContactNumberLabel = new JLabel();
        CompanyNameLabel = new JLabel();
        VehicleTypeLabel = new JLabel();
        VehicleColorLabel = new JLabel();
        EngineNumberLabel = new JLabel();
        DisplacementLabel = new JLabel();
        MaximumTorqueLabel = new JLabel();
        NoofGearsLabel = new JLabel();
        RegistrationDateLabel = new JLabel();
        DateofBirthLabel = new JLabel();
        EducationLabel = new JLabel();
        CIDLabel = new JLabel();
        PIDLabel = new JLabel();
        DistrictLabel = new JLabel();
        WardNumberLabel = new JLabel();
        HouseNumberLabel = new JLabel();
        EmailLabel = new JLabel();
        VehicleNumberLabel = new JLabel();
        ModelNumberLabel = new JLabel();
        FuelTypeLabel = new JLabel();
        EngineDescriptionLabel = new JLabel();
        MaximumPowerLabel = new JLabel();
        NoofSeatsLabel = new JLabel();
        FuelTankCapacityLabel = new JLabel();
        OwnerNameShow = new JLabel();
        GenderShow = new JLabel();
        OccupationShow = new JLabel();
        CitizenshipNumberShow = new JLabel();
        PassportNumberShow = new JLabel();
        IdentityMarkShow = new JLabel();
        ZoneShow = new JLabel();
        ToleShow = new JLabel();
        MunicipalityShow = new JLabel();
        ContactNumberShow = new JLabel();
        VehicleTypeShow = new JLabel();
        VehicleColorShow = new JLabel();
        CompanyNameShow = new JLabel();
        EngineNumberShow = new JLabel();
        DisplacementShow = new JLabel();
        MaximumTorqueShow = new JLabel();
        NoofGearsShow = new JLabel();
        VehicleNumberShow = new JLabel();
        ModelNumberShow = new JLabel();
        FuelTypeShow = new JLabel();
        EngineDescriptionShow = new JLabel();
        MaximumPowerShow = new JLabel();
        NoofSeatsShow = new JLabel();
        FuelTankCapacityShow = new JLabel();
        DistrictShow = new JLabel();
        WardNumberShow = new JLabel();
        HouseNumberShow = new JLabel();
        EmailShow = new JLabel();
        RegistrationDateShow = new JLabel();
        DateofBirthShow = new JLabel();
        EducationShow = new JLabel();
        CIDShow = new JLabel();
        PIDShow = new JLabel();
        AgeLabel = new JLabel();
        AgeShow = new JLabel();
        BackButton = new JButton();

    }
    private void close()
    {
        WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }

    public void initComponents(String vehicleno1) {
    	
    	vehicleno = vehicleno1;
    	System.out.println(vehicleno);
        
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(850, 700));
        setResizable(false);

        ProfilePanel.setBackground(new java.awt.Color(255, 255, 255));
        ProfilePanel.setPreferredSize(new java.awt.Dimension(850, 850));

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
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        SearchProfileScrollPane.setBorder(null);
        SearchProfileScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        SearchProfileScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        SearchProfileScrollPane.setPreferredSize(new java.awt.Dimension(800, 750));

        DetailsPanel.setBackground(new java.awt.Color(255, 255, 255));

        OwnerNameLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        OwnerNameLabel.setText("Owner Name");

        GenderLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        GenderLabel.setText("Gender");

        OccupationLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        OccupationLabel.setText("Occupation");

        CitizenshipNumberLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CitizenshipNumberLabel.setText("Citizenship Number");

        PassportNumberLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        PassportNumberLabel.setText("Passport Number");

        IdentityMarkLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        IdentityMarkLabel.setText("Identity Mark");

        ZoneLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ZoneLabel.setText("Zone");

        MunicipalityLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MunicipalityLabel.setText("Municipality");

        ToleLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ToleLabel.setText("Tole");

        ContactNumberLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ContactNumberLabel.setText("Contact Number");

        CompanyNameLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CompanyNameLabel.setText("Company Name");

        VehicleTypeLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        VehicleTypeLabel.setText("Vehicle Type");

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

        RegistrationDateLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        RegistrationDateLabel.setText("Registration Date");

        DateofBirthLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        DateofBirthLabel.setText("Date of Birth");

        EducationLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        EducationLabel.setText("Education");

        CIDLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CIDLabel.setText("Citizenship issue District");

        PIDLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        PIDLabel.setText("Passport issue District");

        DistrictLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        DistrictLabel.setText("District");

        WardNumberLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        WardNumberLabel.setText("Ward Number");

        HouseNumberLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        HouseNumberLabel.setText("House Number");

        EmailLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        EmailLabel.setText("Email");

        VehicleNumberLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        VehicleNumberLabel.setText("Vehicle Number");

        ModelNumberLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ModelNumberLabel.setText("Model Number");

        FuelTypeLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        FuelTypeLabel.setText("Fuel Type");

        EngineDescriptionLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        EngineDescriptionLabel.setText("Engine Description");

        MaximumPowerLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MaximumPowerLabel.setText("Maximun Power");

        NoofSeatsLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        NoofSeatsLabel.setText("No of Seats");

        FuelTankCapacityLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        FuelTankCapacityLabel.setText("Fuel Tank Capacity");

        OwnerNameShow.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        OwnerNameShow.setText("Null");

        GenderShow.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        GenderShow.setText("Null");

        OccupationShow.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        OccupationShow.setText("Null");

        CitizenshipNumberShow.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CitizenshipNumberShow.setText("Null");

        PassportNumberShow.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        PassportNumberShow.setText("Null");

        IdentityMarkShow.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        IdentityMarkShow.setText("Null");

        ZoneShow.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ZoneShow.setText("Null");

        ToleShow.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ToleShow.setText("Null");

        MunicipalityShow.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MunicipalityShow.setText("Null");

        ContactNumberShow.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ContactNumberShow.setText("Null");

        VehicleTypeShow.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        VehicleTypeShow.setText("Null");

        VehicleColorShow.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        VehicleColorShow.setText("Null");

        CompanyNameShow.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CompanyNameShow.setText("Null");

        EngineNumberShow.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        EngineNumberShow.setText("Null");

        DisplacementShow.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        DisplacementShow.setText("Null");

        MaximumTorqueShow.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MaximumTorqueShow.setText("Null");

        NoofGearsShow.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        NoofGearsShow.setText("Null");

        VehicleNumberShow.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        VehicleNumberShow.setText("Null");

        ModelNumberShow.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ModelNumberShow.setText("Null");

        FuelTypeShow.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        FuelTypeShow.setText("Null");

        EngineDescriptionShow.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        EngineDescriptionShow.setText("Null");

        MaximumPowerShow.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MaximumPowerShow.setText("Null");

        NoofSeatsShow.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        NoofSeatsShow.setText("Null");

        FuelTankCapacityShow.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        FuelTankCapacityShow.setText("Null");

        DistrictShow.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        DistrictShow.setText("Null");

        WardNumberShow.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        WardNumberShow.setText("Null");

        HouseNumberShow.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        HouseNumberShow.setText("Null");

        EmailShow.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        EmailShow.setText("Null");

        RegistrationDateShow.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        RegistrationDateShow.setText("Null");

        DateofBirthShow.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        DateofBirthShow.setText("Null");

        EducationShow.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        EducationShow.setText("Null");

        CIDShow.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CIDShow.setText("Null");

        PIDShow.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        PIDShow.setText("Null");

        AgeLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        AgeLabel.setText("Age");

        AgeShow.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        AgeShow.setText("Null");
        
        try
        {
        	Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/minorproject","root","");
            String sql = "SELECT * FROM userdetails WHERE vehiclenumber='"+vehicleno+"'";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while(rs.next())
            {
                 OwnerNameShow.setText(rs.getString("ownername"));
                 RegistrationDateShow.setText(rs.getString("registrationdate"));
                 GenderShow.setText(rs.getString("gender"));
                 DateofBirthShow.setText(rs.getString("dateofbirth"));
                 OccupationShow.setText(rs.getString("occupation"));
                 EducationShow.setText(rs.getString("education"));
                 CitizenshipNumberShow.setText(rs.getString("citizenshipnumber"));
                 CIDShow.setText(rs.getString("citiissdis"));
                 PassportNumberShow.setText(rs.getString("passportnumber"));
                 PIDShow.setText(rs.getString("passissdis"));
                 IdentityMarkShow.setText(rs.getString("identitymark"));
                 ZoneShow.setText(rs.getString("zone"));
                 DistrictShow.setText(rs.getString("district"));
                 MunicipalityShow.setText(rs.getString("municipality"));
                 WardNumberShow.setText(rs.getString("wardnumber"));
                 ToleShow.setText(rs.getString("tole"));
                 HouseNumberShow.setText(rs.getString("housenumber"));
                 ContactNumberShow.setText(rs.getString("contactnumber"));
                 EmailShow.setText(rs.getString("emailid"));
                 CompanyNameShow.setText(rs.getString("companyname"));
                 VehicleNumberShow.setText(rs.getString("vehiclenumber"));
                 VehicleTypeShow.setText(rs.getString("vehicletype"));
                 ModelNumberShow.setText(rs.getString("modelnumber"));
                 VehicleColorShow.setText(rs.getString("vehiclecolor"));
                 FuelTypeShow.setText(rs.getString("fueltype"));
                 EngineNumberShow.setText(rs.getString("enginenumber"));
                 EngineDescriptionShow.setText(rs.getString("enginedesc"));
                 DisplacementShow.setText(rs.getString("displacement"));
                 MaximumPowerShow.setText(rs.getString("maxpower"));
                 MaximumTorqueShow.setText(rs.getString("maxtorque"));
                 NoofSeatsShow.setText(rs.getString("noofseats"));
                 NoofGearsShow.setText(rs.getString("noofgears"));
                 FuelTankCapacityShow.setText(rs.getString("fueltank"));
                 
                 
            }
            
        	
        }catch(Exception e)
        {
        	JOptionPane.showMessageDialog(null,e);
        }
        
        setVisible(true);

        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        GroupLayout DetailsPanelLayout = new GroupLayout(DetailsPanel);
        DetailsPanel.setLayout(DetailsPanelLayout);
        DetailsPanelLayout.setHorizontalGroup(
            DetailsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(DetailsPanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(DetailsPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(BackButton)
                    .addGroup(DetailsPanelLayout.createSequentialGroup()
                        .addGroup(DetailsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(DetailsPanelLayout.createSequentialGroup()
                                .addGroup(DetailsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(OwnerNameLabel)
                                    .addComponent(GenderLabel)
                                    .addComponent(OccupationLabel)
                                    .addComponent(CitizenshipNumberLabel)
                                    .addComponent(PassportNumberLabel)
                                    .addComponent(ZoneLabel)
                                    .addComponent(MunicipalityLabel)
                                    .addComponent(ToleLabel)
                                    .addComponent(ContactNumberLabel)
                                    .addComponent(CompanyNameLabel)
                                    .addComponent(VehicleTypeLabel)
                                    .addComponent(VehicleColorLabel)
                                    .addComponent(EngineNumberLabel)
                                    .addComponent(DisplacementLabel)
                                    .addComponent(MaximumTorqueLabel)
                                    .addComponent(NoofGearsLabel))
                                .addGap(45, 45, 45)
                                .addGroup(DetailsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(NoofGearsShow, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(MaximumTorqueShow, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DisplacementShow, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(EngineNumberShow, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(VehicleColorShow, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(VehicleTypeShow, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ContactNumberShow, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ToleShow, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ZoneShow, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PassportNumberShow, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CitizenshipNumberShow, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(OccupationShow, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(GenderShow, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(OwnerNameShow, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(IdentityMarkShow, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(MunicipalityShow, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CompanyNameShow, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)))
                            .addComponent(IdentityMarkLabel))
                        .addGap(40, 40, 40)
                        .addGroup(DetailsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(VehicleNumberLabel)
                            .addComponent(ModelNumberLabel)
                            .addComponent(FuelTypeLabel)
                            .addComponent(EngineDescriptionLabel)
                            .addComponent(MaximumPowerLabel)
                            .addComponent(NoofSeatsLabel)
                            .addComponent(FuelTankCapacityLabel)
                            .addComponent(DistrictLabel)
                            .addComponent(WardNumberLabel)
                            .addComponent(HouseNumberLabel)
                            .addComponent(EmailLabel)
                            .addComponent(RegistrationDateLabel)
                            .addComponent(DateofBirthLabel)
                            .addComponent(EducationLabel)
                            .addComponent(CIDLabel)
                            .addComponent(PIDLabel)
                            .addComponent(AgeLabel))
                        .addGap(45, 45, 45)
                        .addGroup(DetailsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(AgeShow, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                            .addComponent(PIDShow, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                            .addComponent(CIDShow, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                            .addComponent(EducationShow, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                            .addComponent(DateofBirthShow, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                            .addComponent(RegistrationDateShow, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                            .addComponent(EmailShow, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                            .addComponent(HouseNumberShow, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                            .addComponent(WardNumberShow, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                            .addComponent(DistrictShow, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                            .addComponent(FuelTankCapacityShow, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                            .addComponent(NoofSeatsShow, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                            .addComponent(MaximumPowerShow, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                            .addComponent(EngineDescriptionShow, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                            .addComponent(FuelTypeShow, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                            .addComponent(ModelNumberShow, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                            .addComponent(VehicleNumberShow, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(129, Short.MAX_VALUE))
        );
        DetailsPanelLayout.setVerticalGroup(
            DetailsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(DetailsPanelLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(DetailsPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(OwnerNameLabel)
                    .addComponent(RegistrationDateLabel)
                    .addComponent(OwnerNameShow)
                    .addComponent(RegistrationDateShow))
                .addGap(18, 18, 18)
                .addGroup(DetailsPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(GenderLabel)
                    .addComponent(DateofBirthLabel)
                    .addComponent(GenderShow)
                    .addComponent(DateofBirthShow))
                .addGap(18, 18, 18)
                .addGroup(DetailsPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(OccupationLabel)
                    .addComponent(EducationLabel)
                    .addComponent(OccupationShow)
                    .addComponent(EducationShow))
                .addGap(18, 18, 18)
                .addGroup(DetailsPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(CitizenshipNumberLabel)
                    .addComponent(CIDLabel)
                    .addComponent(CitizenshipNumberShow)
                    .addComponent(CIDShow))
                .addGap(18, 18, 18)
                .addGroup(DetailsPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(PassportNumberLabel)
                    .addComponent(PIDLabel)
                    .addComponent(PassportNumberShow)
                    .addComponent(PIDShow))
                .addGap(18, 18, 18)
                .addGroup(DetailsPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(IdentityMarkLabel)
                    .addComponent(IdentityMarkShow)
                    .addComponent(AgeLabel)
                    .addComponent(AgeShow))
                .addGap(43, 43, 43)
                .addGroup(DetailsPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(ZoneLabel)
                    .addComponent(DistrictLabel)
                    .addComponent(ZoneShow)
                    .addComponent(DistrictShow))
                .addGap(18, 18, 18)
                .addGroup(DetailsPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(MunicipalityLabel)
                    .addComponent(WardNumberLabel)
                    .addComponent(MunicipalityShow)
                    .addComponent(WardNumberShow))
                .addGap(18, 18, 18)
                .addGroup(DetailsPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(ToleLabel)
                    .addComponent(HouseNumberLabel)
                    .addComponent(ToleShow)
                    .addComponent(HouseNumberShow))
                .addGap(18, 18, 18)
                .addGroup(DetailsPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(ContactNumberLabel)
                    .addComponent(EmailLabel)
                    .addComponent(ContactNumberShow)
                    .addComponent(EmailShow))
                .addGap(49, 49, 49)
                .addGroup(DetailsPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(CompanyNameLabel)
                    .addComponent(VehicleNumberLabel)
                    .addComponent(CompanyNameShow)
                    .addComponent(VehicleNumberShow))
                .addGap(18, 18, 18)
                .addGroup(DetailsPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(VehicleTypeLabel)
                    .addComponent(ModelNumberLabel)
                    .addComponent(VehicleTypeShow)
                    .addComponent(ModelNumberShow))
                .addGap(18, 18, 18)
                .addGroup(DetailsPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(VehicleColorLabel)
                    .addComponent(FuelTypeLabel)
                    .addComponent(VehicleColorShow)
                    .addComponent(FuelTypeShow))
                .addGap(18, 18, 18)
                .addGroup(DetailsPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(EngineNumberLabel)
                    .addComponent(EngineDescriptionLabel)
                    .addComponent(EngineNumberShow)
                    .addComponent(EngineDescriptionShow))
                .addGap(18, 18, 18)
                .addGroup(DetailsPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(DisplacementLabel)
                    .addComponent(MaximumPowerLabel)
                    .addComponent(DisplacementShow)
                    .addComponent(MaximumPowerShow))
                .addGap(18, 18, 18)
                .addGroup(DetailsPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(MaximumTorqueLabel)
                    .addComponent(NoofSeatsLabel)
                    .addComponent(MaximumTorqueShow)
                    .addComponent(NoofSeatsShow))
                .addGap(18, 18, 18)
                .addGroup(DetailsPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(NoofGearsLabel)
                    .addComponent(FuelTankCapacityLabel)
                    .addComponent(NoofGearsShow)
                    .addComponent(FuelTankCapacityShow))
                .addGap(36, 36, 36)
                .addComponent(BackButton)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        SearchProfileScrollPane.setViewportView(DetailsPanel);

        GroupLayout ProfilePanelLayout = new GroupLayout(ProfilePanel);
        ProfilePanel.setLayout(ProfilePanelLayout);
        ProfilePanelLayout.setHorizontalGroup(
            ProfilePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(TitlePanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(SearchProfileScrollPane, GroupLayout.DEFAULT_SIZE, 850, Short.MAX_VALUE)
        );
        ProfilePanelLayout.setVerticalGroup(
            ProfilePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(ProfilePanelLayout.createSequentialGroup()
                .addComponent(TitlePanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SearchProfileScrollPane, GroupLayout.DEFAULT_SIZE, 619, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(ProfilePanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(ProfilePanel, GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }
    
    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        SearchDetails Sde = new SearchDetails();
        Sde.setVisible(true);
        close();
    }                                          

    public static void main(String args[]) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SearchProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchProfile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private JLabel AMLabel;
    private JLabel AgeLabel;
    private JLabel AgeShow;
    private JButton BackButton;
    private JLabel CIDLabel;
    private JLabel CIDShow;
    private JLabel CitizenshipNumberLabel;
    private JLabel CitizenshipNumberShow;
    private JLabel CompanyNameLabel;
    private JLabel CompanyNameShow;
    private JLabel ContactNumberLabel;
    private JLabel ContactNumberShow;
    private JLabel DateofBirthLabel;
    private JLabel DateofBirthShow;
    private JPanel DetailsPanel;
    private JLabel DisplacementLabel;
    private JLabel DisplacementShow;
    private JLabel DistrictLabel;
    private JLabel DistrictShow;
    private JLabel EducationLabel;
    private JLabel EducationShow;
    private JLabel EmailLabel;
    private JLabel EmailShow;
    private JLabel EngineDescriptionLabel;
    private JLabel EngineDescriptionShow;
    private JLabel EngineNumberLabel;
    private JLabel EngineNumberShow;
    private JLabel FuelTankCapacityLabel;
    private JLabel FuelTankCapacityShow;
    private JLabel FuelTypeLabel;
    private JLabel FuelTypeShow;
    private JLabel GenderLabel;
    private JLabel GenderShow;
    private JLabel HouseNumberLabel;
    private JLabel HouseNumberShow;
    private JLabel IdentityMarkLabel;
    private JLabel IdentityMarkShow;
    private JLabel MaximumPowerLabel;
    private JLabel MaximumPowerShow;
    private JLabel MaximumTorqueLabel;
    private JLabel MaximumTorqueShow;
    private JLabel ModelNumberLabel;
    private JLabel ModelNumberShow;
    private JLabel MunicipalityLabel;
    private JLabel MunicipalityShow;
    private JLabel NoofGearsLabel;
    private JLabel NoofGearsShow;
    private JLabel NoofSeatsLabel;
    private JLabel NoofSeatsShow;
    private JLabel OccupationLabel;
    private JLabel OccupationShow;
    private JLabel OwnerNameLabel;
    private JLabel OwnerNameShow;
    private JLabel PIDLabel;
    private JLabel PIDShow;
    private JLabel PassportNumberLabel;
    private JLabel PassportNumberShow;
    private JPanel ProfilePanel;
    private JLabel RegistrationDateLabel;
    private JLabel RegistrationDateShow;
    private JLabel SLabel;
    private JScrollPane SearchProfileScrollPane;
    private JPanel TitlePanel;
    private JLabel ToleLabel;
    private JLabel ToleShow;
    private JLabel VehicleColorLabel;
    private JLabel VehicleColorShow;
    private JLabel VehicleNumberLabel;
    private JLabel VehicleNumberShow;
    private JLabel VehicleTypeLabel;
    private JLabel VehicleTypeShow;
    private JLabel WardNumberLabel;
    private JLabel WardNumberShow;
    private JLabel ZoneLabel;
    private JLabel ZoneShow;
    // End of variables declaration                   
}
