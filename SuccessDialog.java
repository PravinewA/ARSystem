package com.gces.project;

import javax.swing.*;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;

public class SuccessDialog extends JDialog {

    public SuccessDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
        private void close()
    {
        WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }

    private void initComponents() {

        jPanel1 = new JPanel();
        OkButton = new JButton();
        MessageLabel = new JLabel();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setOpacity(0.9F);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(1, 50, 67));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        OkButton.setBackground(new java.awt.Color(250, 250, 250));
        OkButton.setText("Ok");
        OkButton.setBorderPainted(false);
        OkButton.setFocusPainted(false);
        OkButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        
        OkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OkButtonActionPerformed(evt);
            }
        });
        OkButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                OkButtonKeyPressed(evt);
            }
        });
        
        jPanel1.add(OkButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 90, 30));

        MessageLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        MessageLabel.setForeground(new java.awt.Color(255, 255, 255));
        MessageLabel.setText("Succesfully Stored to Database");
        jPanel1.add(MessageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 160));

        pack();
        setLocationRelativeTo(null);
    }                        

    private void OkButtonActionPerformed(java.awt.event.ActionEvent evt) {                                         
        this.dispose();
    }                                        

    private void OkButtonKeyPressed(java.awt.event.KeyEvent evt) {                                       
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
        	this.dispose();
        }
    }

    public static void main(String args[]) {
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SuccessDialog dialog = new SuccessDialog(new JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    private JLabel MessageLabel;
    private JButton OkButton;
    private JPanel jPanel1;
}
