package minorproject;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;
/**
 *
 * @author pravinewa
 */
public class SearchDetails extends JFrame {
		static String LoginID;
    public SearchDetails() {
        initComponents();
        show_user();
    }
    private void close()
    {
        WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }
    public ArrayList<User> userList(String ValToSearch)
    {
        ArrayList<User> userList = new ArrayList<User>();
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/minorproject","root","");
            String query = "SELECT vehiclenumber, companyname, ownername, vehicletype, municipality, contactnumber, registrationdate FROM userdetails WHERE CONCAT(`vehiclenumber`, `companyname`) LIKE '%"+ValToSearch+"%'";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            User user;
            while(rs.next())
            {
                user = new User(rs.getString("vehiclenumber"), rs.getString("companyname"), rs.getString("ownername"), rs.getString("vehicletype"), rs.getString("municipality"), rs.getString("contactnumber"), rs.getString("registrationdate"));
                userList.add(user);
                
            }
            
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        return userList;
    }
    public void show_user()
    {

        ArrayList<User> list = userList(SearchTextField.getText());
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{"Vehicle Number", "Company Name", "Owner Name", "Vehicle Type", "Municipality", "Contact Number", "Registration Date"});
        Object[] row = new Object[7];
        for(int i = 0; i<list.size();i++)
        {
            row[0] = list.get(i).getvehiclenumber();
            row[1] = list.get(i).getownername();
            row[2] = list.get(i).getcompanyname();
            row[3] = list.get(i).getvehicletype();
            row[4] = list.get(i).getmunicipality();
            row[5] = list.get(i).getcontactnumber();
            row[6] = list.get(i).getregistrationdate();            
            model.addRow(row);
        }
        SearchTable.setModel(model);
    }
    public void initComponents(String LoginID1) {
    	
    	LoginID = LoginID1;
    	setVisible(true);
    }
    
    private void initComponents() {

        SearchPanel = new JPanel();
        TitlePanel = new JPanel();
        AMLabel = new JLabel();
        SLabel = new JLabel();
        SearchTextField = new JTextField();
        SearchButton = new JButton();
        jScrollPane1 = new JScrollPane();
        SearchTable = new JTable();
        EVNLabel = new JLabel();
        MenuBar = new JMenuBar();
        FileMenu = new JMenu();
        HomeMenuItem = new JMenuItem();
        LogOutMenuItem = new JMenuItem();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(850, 700));
        setResizable(false);

        SearchPanel.setBackground(new java.awt.Color(255, 255, 255));

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
                .addGap(233, 233, 233)
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

        SearchTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        SearchButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SearchButton.setText("Search");
        SearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButtonActionPerformed(evt);
            }
        });

        SearchTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vehicle Number", "Owner Name", "Company Name", "Vehicle Type", "Address", "Contact Number", "Registration Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        SearchTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(SearchTable);
        if (SearchTable.getColumnModel().getColumnCount() > 0) {
            SearchTable.getColumnModel().getColumn(0).setResizable(false);
            SearchTable.getColumnModel().getColumn(1).setResizable(false);
            SearchTable.getColumnModel().getColumn(2).setResizable(false);
            SearchTable.getColumnModel().getColumn(3).setResizable(false);
            SearchTable.getColumnModel().getColumn(4).setResizable(false);
            SearchTable.getColumnModel().getColumn(5).setResizable(false);
            SearchTable.getColumnModel().getColumn(6).setResizable(false);
        }

        EVNLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        EVNLabel.setText("Enter Vehicle Number");

        GroupLayout SearchPanelLayout = new GroupLayout(SearchPanel);
        SearchPanel.setLayout(SearchPanelLayout);
        SearchPanelLayout.setHorizontalGroup(
            SearchPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(TitlePanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(SearchPanelLayout.createSequentialGroup()
                .addGroup(SearchPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(SearchPanelLayout.createSequentialGroup()
                        .addGap(292, 292, 292)
                        .addComponent(SearchTextField, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(SearchButton))
                    .addGroup(SearchPanelLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 755, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
            .addGroup(GroupLayout.Alignment.TRAILING, SearchPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(EVNLabel)
                .addGap(323, 323, 323))
        );
        SearchPanelLayout.setVerticalGroup(
            SearchPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(SearchPanelLayout.createSequentialGroup()
                .addComponent(TitlePanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(EVNLabel)
                .addGap(18, 18, 18)
                .addGroup(SearchPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(SearchTextField, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchButton, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
                .addContainerGap())
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
            .addComponent(SearchPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(SearchPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }

    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
    	show_user();
    }                                            

    private void SearchTableMouseClicked(java.awt.event.MouseEvent evt) {                                         
        int index = SearchTable.getSelectedRow();
        TableModel model = SearchTable.getModel();
        String vehicleno = model.getValueAt(index, 0).toString();
        System.out.println(vehicleno);
    	SearchProfile SP = new SearchProfile();
        SP.initComponents(vehicleno);
        close();
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

    public static void main(String args[]) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SearchDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private JLabel AMLabel;
    private JLabel EVNLabel;
    private JMenu FileMenu;
    private JMenuItem HomeMenuItem;
    private JMenuItem LogOutMenuItem;
    private JMenuBar MenuBar;
    private JLabel SLabel;
    private JButton SearchButton;
    private JPanel SearchPanel;
    private JTable SearchTable;
    private JTextField SearchTextField;
    private JPanel TitlePanel;
    private JScrollPane jScrollPane1;
    // End of variables declaration                   
}
