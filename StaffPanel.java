package minorproject;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.*;
/**
 *
 * @author pravinewa
 */
public class StaffPanel extends JFrame {
	static String LoginID;
    public StaffPanel() {
        StaffWelcomePanel = new JPanel();
        TitlePanel = new JPanel();
        AMLabel = new JLabel();
        SLabel = new JLabel();
        WelcomeLabel = new JLabel();
        IdLabel = new JLabel();
        NewRegisterButton = new JButton();
        SearchDetailsButton = new JButton();
        MenuBar = new JMenuBar();
        FileMenu = new JMenu();
        ProfileMenuItem = new JMenuItem();
        LogoutMenuItem = new JMenuItem();

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

        StaffWelcomePanel.setBackground(new java.awt.Color(255, 255, 255));

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

        WelcomeLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        WelcomeLabel.setText("Welcome");

        IdLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        IdLabel.setText(LoginID);

        NewRegisterButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        NewRegisterButton.setText("New Register");
        NewRegisterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewRegisterButtonActionPerformed(evt);
            }
        });

        SearchDetailsButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        SearchDetailsButton.setText("Search Details");
        SearchDetailsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchDetailsButtonActionPerformed(evt);
            }
        });

        GroupLayout StaffWelcomePanelLayout = new GroupLayout(StaffWelcomePanel);
        StaffWelcomePanel.setLayout(StaffWelcomePanelLayout);
        StaffWelcomePanelLayout.setHorizontalGroup(
            StaffWelcomePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(TitlePanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(GroupLayout.Alignment.TRAILING, StaffWelcomePanelLayout.createSequentialGroup()
                .addGroup(StaffWelcomePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(StaffWelcomePanelLayout.createSequentialGroup()
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(WelcomeLabel)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(StaffWelcomePanelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(NewRegisterButton, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(StaffWelcomePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(StaffWelcomePanelLayout.createSequentialGroup()
                        .addComponent(IdLabel)
                        .addGap(123, 123, 123))
                    .addGroup(GroupLayout.Alignment.TRAILING, StaffWelcomePanelLayout.createSequentialGroup()
                        .addComponent(SearchDetailsButton, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))))
        );
        StaffWelcomePanelLayout.setVerticalGroup(
            StaffWelcomePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(StaffWelcomePanelLayout.createSequentialGroup()
                .addComponent(TitlePanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(StaffWelcomePanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(WelcomeLabel)
                    .addComponent(IdLabel))
                .addGap(122, 122, 122)
                .addGroup(StaffWelcomePanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(NewRegisterButton, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchDetailsButton, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
                .addGap(0, 202, Short.MAX_VALUE))
        );

        FileMenu.setText("File");

        ProfileMenuItem.setText("Profile");
        ProfileMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProfileMenuItemActionPerformed(evt);
            }
        });
        FileMenu.add(ProfileMenuItem);

        LogoutMenuItem.setText("Log Out");
        LogoutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutMenuItemActionPerformed(evt);
            }
        });
        FileMenu.add(LogoutMenuItem);

        MenuBar.add(FileMenu);

        setJMenuBar(MenuBar);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(StaffWelcomePanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(StaffWelcomePanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void NewRegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        Register Reg = new Register();
        Reg.initComponents(LoginID);
        close();
    }                                                 

    private void SearchDetailsButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        SearchDetails SD = new SearchDetails();
        SD.initComponents(LoginID);
        close();
    }                                                   

    private void ProfileMenuItemActionPerformed(java.awt.event.ActionEvent evt) {                                                
        StaffProfile SP = new StaffProfile();
        SP.initComponents(LoginID);
        close();
    }                                               

    private void LogoutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {                                               
        StaffLogin SL = new StaffLogin();
        SL.setVisible(true);
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
            java.util.logging.Logger.getLogger(StaffPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StaffPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StaffPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StaffPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StaffPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private JLabel AMLabel;
    private JMenu FileMenu;
    private JLabel IdLabel;
    private JMenuItem LogoutMenuItem;
    private JMenuBar MenuBar;
    private JButton NewRegisterButton;
    private JMenuItem ProfileMenuItem;
    private JLabel SLabel;
    private JButton SearchDetailsButton;
    private JPanel StaffWelcomePanel;
    private JPanel TitlePanel;
    private JLabel WelcomeLabel;
    // End of variables declaration                   
}
