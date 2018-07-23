package minorproject;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.*;
import java.util.regex.*;
import javax.swing.*;

/**
 *
 * @author pravinewa
 */
public class StaffLogin extends JFrame {

    public StaffLogin() {
        initComponents();
    }
    private void close()
    {
        WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }

    private void initComponents() {

        LoginFrame = new JPanel();
        TitlePanel = new JPanel();
        AMLabel = new JLabel();
        SLabel = new JLabel();
        StaffIdTextField = new JTextField();
        StaffIdLabel = new JLabel();
        PasswordLabel = new JLabel();
        SubmitButton = new JButton();
        PasswordField = new JPasswordField();
        ShowValidationOfStaffId = new JLabel();
        ShowValidationOfPassword = new JLabel();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        LoginFrame.setBackground(new java.awt.Color(255, 255, 255));

        TitlePanel.setBackground(new java.awt.Color(153, 51, 255));

        AMLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        AMLabel.setForeground(new java.awt.Color(255, 255, 255));
        AMLabel.setText("Automobile Registration");

        SLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        SLabel.setForeground(new java.awt.Color(255, 153, 0));
        SLabel.setText("System");

        GroupLayout TitlePanelLayout = new GroupLayout(TitlePanel);
        TitlePanel.setLayout(TitlePanelLayout);
        TitlePanelLayout.setHorizontalGroup(
            TitlePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(TitlePanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(AMLabel)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SLabel)
                .addContainerGap(32, Short.MAX_VALUE))
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

        StaffIdTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                StaffIdTextFieldKeyPressed(evt);
            }
        });

        StaffIdLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        StaffIdLabel.setText("Staff Id");

        PasswordLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        PasswordLabel.setText("Password");

        SubmitButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        SubmitButton.setText("Login");
        SubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButtonActionPerformed(evt);
            }
        });

        PasswordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PasswordFieldKeyPressed(evt);
            }
        });

        ShowValidationOfStaffId.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        ShowValidationOfStaffId.setForeground(new java.awt.Color(255, 0, 0));

        ShowValidationOfPassword.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        ShowValidationOfPassword.setForeground(new java.awt.Color(255, 0, 0));

        GroupLayout LoginFrameLayout = new GroupLayout(LoginFrame);
        LoginFrame.setLayout(LoginFrameLayout);
        LoginFrameLayout.setHorizontalGroup(
            LoginFrameLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(TitlePanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(GroupLayout.Alignment.TRAILING, LoginFrameLayout.createSequentialGroup()
                .addGroup(LoginFrameLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addGroup(LoginFrameLayout.createSequentialGroup()
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SubmitButton))
                    .addGroup(LoginFrameLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(LoginFrameLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(StaffIdLabel)
                            .addComponent(PasswordLabel))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(LoginFrameLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(ShowValidationOfStaffId, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(StaffIdTextField)
                            .addComponent(PasswordField)
                            .addComponent(ShowValidationOfPassword, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE))))
                .addGap(38, 38, 38))
        );
        LoginFrameLayout.setVerticalGroup(
            LoginFrameLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(LoginFrameLayout.createSequentialGroup()
                .addComponent(TitlePanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(LoginFrameLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(StaffIdTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(StaffIdLabel))
                .addGap(1, 1, 1)
                .addComponent(ShowValidationOfStaffId)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(LoginFrameLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(PasswordLabel)
                    .addComponent(PasswordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ShowValidationOfPassword)
                .addGap(36, 36, 36)
                .addComponent(SubmitButton)
                .addGap(0, 259, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(LoginFrame, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(LoginFrame, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }
    
    private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/minorproject","root","");
            String sql = "SELECT staffid, password FROM staffdetails WHERE staffid=? and password=?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            
            String LoginID = StaffIdTextField.getText();
            String Password = PasswordField.getText();
            
            if(LoginID.equals(""))
            {
                JOptionPane.showMessageDialog(null,"Id Field is Empty");
            }
            if(Password.equals(""))
            {
                JOptionPane.showMessageDialog(null,"Password Field is Empty");
            }
            pstmt.setString(1,LoginID);
            pstmt.setString(2,Password);
            ResultSet rs = pstmt.executeQuery();
            if(rs.next())
            {
                 StaffPanel SP = new StaffPanel();
                 SP.initComponents(LoginID);
                 close();
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Invalid StaffID and Password","Access Denied",JOptionPane.ERROR_MESSAGE);
            }
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        
    }                                            

    private void StaffIdTextFieldKeyPressed(java.awt.event.KeyEvent evt) {                                            
        String PATTERN = "^[a-z]{0,4}[0-9]{0,4}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(StaffIdTextField.getText());
        if(!match.matches())
        {
            ShowValidationOfStaffId.setText("Naming is incorrect!");
            StaffIdTextField.setForeground(Color.red);
        }
        if(match.matches())
        {
            ShowValidationOfStaffId.setText(null);
            StaffIdTextField.setForeground(Color.black);
        }
        if(StaffIdTextField.getText().equals("")){
            ShowValidationOfStaffId.setText(null);
            StaffIdTextField.setForeground(Color.black);
        }
    }                                           

    private void PasswordFieldKeyPressed(java.awt.event.KeyEvent evt) {                                         
        String PATTERN = "^[a-zA-Z0-9]{2,15}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(PasswordField.getText());
        if(!match.matches())
        {
            ShowValidationOfPassword.setText("Naming is incorrect!");
            PasswordField.setForeground(Color.red);
        }
        if(match.matches())
        {
            ShowValidationOfPassword.setText(null);
            PasswordField.setForeground(Color.black);
        }
        if(PasswordField.getText().equals("")){
            ShowValidationOfPassword.setText(null);
            PasswordField.setForeground(Color.black);
        }
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
            java.util.logging.Logger.getLogger(StaffLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StaffLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StaffLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StaffLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StaffLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private JLabel AMLabel;
    private JPanel LoginFrame;
    private JPasswordField PasswordField;
    private JLabel PasswordLabel;
    private JLabel SLabel;
    private JLabel ShowValidationOfPassword;
    private JLabel ShowValidationOfStaffId;
    private JLabel StaffIdLabel;
    private JTextField StaffIdTextField;
    private JButton SubmitButton;
    private JPanel TitlePanel;
    // End of variables declaration                   
}
