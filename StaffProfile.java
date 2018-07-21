package minorproject;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.*;

import javax.swing.*;
/**
 *
 * @author pravinewa
 */
public class StaffProfile extends JFrame {
	static String LoginID;

	public StaffProfile() {
        ProfilePanel = new JPanel();
        TitlePanel = new JPanel();
        AMLabel = new JLabel();
        SLabel = new JLabel();
        StaffIdLabel = new JLabel();
        StaffNameLabel = new JLabel();
        AddressLabel = new JLabel();
        ContactNumberLabel = new JLabel();
        EmailIdLabel = new JLabel();
        IRDLabel = new JLabel();
        GenderLabel = new JLabel();
        StaffIdShow = new JLabel();
        StaffNameShow = new JLabel();
        GenderShow = new JLabel();
        AddressShow = new JLabel();
        ContactNumberShow = new JLabel();
        EmailIdShow = new JLabel();
        IRDShow = new JLabel();
        ShiftLabel = new JLabel();
        ShiftShow = new JLabel();
        BackButton = new JButton();
        
    }
    private void close()
    {
        WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }

    public void initComponents(String LoginID1) {

    	LoginID = LoginID1;    	
    	
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setFocusCycleRoot(false);
        setPreferredSize(new java.awt.Dimension(850, 700));
        setResizable(false);

        ProfilePanel.setBackground(new java.awt.Color(255, 255, 255));

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

        StaffIdLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        StaffIdLabel.setText("Staff Id");

        StaffNameLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        StaffNameLabel.setText("Staff Name");

        AddressLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AddressLabel.setText("Address");

        ContactNumberLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ContactNumberLabel.setText("Contact Number");

        EmailIdLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EmailIdLabel.setText("Email Id");

        IRDLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        IRDLabel.setText("Id Registered Date");

        GenderLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        GenderLabel.setText("Gender");

        StaffIdShow.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        StaffIdShow.setText("Null");

        StaffNameShow.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        StaffNameShow.setText("Null");

        GenderShow.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        GenderShow.setText("Null");

        AddressShow.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        AddressShow.setText("Null");

        ContactNumberShow.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ContactNumberShow.setText("Null");

        EmailIdShow.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        EmailIdShow.setText("Null");

        IRDShow.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        IRDShow.setText("Null");

        ShiftLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ShiftLabel.setText("Shift");

        ShiftShow.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ShiftShow.setText("Null");
        
        try
        {
        	Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/minorproject","root","");
            String sql = "SELECT staffid, staffname, gender, address, contactnumber, emailid, idregistereddate, shift FROM staffdetails WHERE staffid='"+LoginID+"'";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while(rs.next())
            {
                 StaffIdShow.setText(rs.getString("staffid"));
                 StaffNameShow.setText(rs.getString("staffname"));
                 GenderShow.setText(rs.getString("gender"));
                 AddressShow.setText(rs.getString("address"));
                 ContactNumberShow.setText(rs.getString("contactnumber"));
                 EmailIdShow.setText(rs.getString("emailid"));
                 IRDShow.setText(rs.getString("idregistereddate"));
                 ShiftShow.setText(rs.getString("shift"));
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

        GroupLayout ProfilePanelLayout = new GroupLayout(ProfilePanel);
        ProfilePanel.setLayout(ProfilePanelLayout);
        ProfilePanelLayout.setHorizontalGroup(
            ProfilePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(TitlePanel, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(ProfilePanelLayout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addGroup(ProfilePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(StaffIdLabel)
                    .addComponent(StaffNameLabel)
                    .addComponent(GenderLabel)
                    .addComponent(AddressLabel)
                    .addComponent(ContactNumberLabel)
                    .addComponent(EmailIdLabel)
                    .addComponent(IRDLabel)
                    .addComponent(ShiftLabel))
                .addGap(125, 125, 125)
                .addGroup(ProfilePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(ShiftShow, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                    .addComponent(IRDShow, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                    .addComponent(EmailIdShow, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                    .addComponent(ContactNumberShow, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddressShow, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                    .addComponent(GenderShow, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                    .addComponent(StaffNameShow, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                    .addComponent(StaffIdShow, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(GroupLayout.Alignment.TRAILING, ProfilePanelLayout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BackButton)
                .addGap(96, 96, 96))
        );
        ProfilePanelLayout.setVerticalGroup(
            ProfilePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(ProfilePanelLayout.createSequentialGroup()
                .addComponent(TitlePanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116)
                .addGroup(ProfilePanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(StaffIdLabel)
                    .addComponent(StaffIdShow))
                .addGap(18, 18, 18)
                .addGroup(ProfilePanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(StaffNameLabel)
                    .addComponent(StaffNameShow))
                .addGap(18, 18, 18)
                .addGroup(ProfilePanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(GenderLabel)
                    .addComponent(GenderShow))
                .addGap(18, 18, 18)
                .addGroup(ProfilePanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(AddressLabel)
                    .addComponent(AddressShow))
                .addGap(18, 18, 18)
                .addGroup(ProfilePanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(ContactNumberLabel)
                    .addComponent(ContactNumberShow))
                .addGap(18, 18, 18)
                .addGroup(ProfilePanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(EmailIdLabel)
                    .addComponent(EmailIdShow))
                .addGap(18, 18, 18)
                .addGroup(ProfilePanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(IRDLabel)
                    .addComponent(IRDShow))
                .addGap(18, 18, 18)
                .addGroup(ProfilePanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(ShiftLabel)
                    .addComponent(ShiftShow))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addComponent(BackButton)
                .addGap(102, 102, 102))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(ProfilePanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(ProfilePanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        StaffPanel ps = new StaffPanel();
        ps.initComponents(LoginID);
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
            java.util.logging.Logger.getLogger(StaffProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StaffProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StaffProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StaffProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
            java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StaffProfile().setVisible(true);
            }
        });
    }

    private JLabel AMLabel;
    private JLabel AddressLabel;
    private JLabel AddressShow;
    private JButton BackButton;
    private JLabel ContactNumberLabel;
    private JLabel ContactNumberShow;
    private JLabel EmailIdLabel;
    private JLabel EmailIdShow;
    private JLabel GenderLabel;
    private JLabel GenderShow;
    private JLabel IRDLabel;
    private JLabel IRDShow;
    private JPanel ProfilePanel;
    private JLabel SLabel;
    private JLabel ShiftLabel;
    private JLabel ShiftShow;
    private JLabel StaffIdLabel;
    private JLabel StaffIdShow;
    private JLabel StaffNameLabel;
    private JLabel StaffNameShow;
    private JPanel TitlePanel;
    // End of variables declaration                   
}
