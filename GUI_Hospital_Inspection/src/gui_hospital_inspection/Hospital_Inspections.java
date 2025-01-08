/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui_hospital_inspection;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lab_services_student
 */
public class Hospital_Inspections extends javax.swing.JFrame {

    /**
     * Creates new form Hospital_Inspections
     */
    public Hospital_Inspections() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        HospitalNameInput = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        HospitalLocationInput = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ComboBox = new javax.swing.JComboBox<>();
        ButtonSave = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        ButtonPrint = new javax.swing.JButton();
        ButtonClear = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MenuItemExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        MenuItemSave = new javax.swing.JMenuItem();
        MenuItemPrint = new javax.swing.JMenuItem();
        MenuItemClear = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Hospital Name:");

        HospitalNameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HospitalNameInputActionPerformed(evt);
            }
        });

        jLabel2.setText("Hospital Location:");

        HospitalLocationInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HospitalLocationInputActionPerformed(evt);
            }
        });

        jLabel3.setText("Years since inspection:");

        ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 Year", "2 Years", "3 Years", "4 Years", "5 Years" }));

        ButtonSave.setText("SAVE");
        ButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSaveActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jList1);

        ButtonPrint.setText("PRINT");
        ButtonPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonPrintActionPerformed(evt);
            }
        });

        ButtonClear.setText("CLEAR");
        ButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonClearActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        MenuItemExit.setText("Exit");
        MenuItemExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemExitActionPerformed(evt);
            }
        });
        jMenu1.add(MenuItemExit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Tools");

        MenuItemSave.setText("Save");
        MenuItemSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemSaveActionPerformed(evt);
            }
        });
        jMenu2.add(MenuItemSave);

        MenuItemPrint.setText("Print");
        MenuItemPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemPrintActionPerformed(evt);
            }
        });
        jMenu2.add(MenuItemPrint);

        MenuItemClear.setText("Clear");
        MenuItemClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemClearActionPerformed(evt);
            }
        });
        jMenu2.add(MenuItemClear);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(HospitalLocationInput, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(70, 70, 70)
                                    .addComponent(HospitalNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(ButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(ButtonPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(ButtonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(HospitalNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HospitalLocationInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(ButtonSave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonPrint)
                    .addComponent(ButtonClear))
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HospitalNameInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HospitalNameInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HospitalNameInputActionPerformed

    private void HospitalLocationInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HospitalLocationInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HospitalLocationInputActionPerformed

    private void MenuItemExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemExitActionPerformed
System.exit(0);
    }//GEN-LAST:event_MenuItemExitActionPerformed

    private void ButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSaveActionPerformed
         Save();
    }//GEN-LAST:event_ButtonSaveActionPerformed

    private void MenuItemSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemSaveActionPerformed
      Save();
    }//GEN-LAST:event_MenuItemSaveActionPerformed

    private void ButtonPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonPrintActionPerformed
       Print();
    }//GEN-LAST:event_ButtonPrintActionPerformed

    private void MenuItemPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemPrintActionPerformed
       Print();
    }//GEN-LAST:event_MenuItemPrintActionPerformed

    private void ButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonClearActionPerformed
        Clear();
    }//GEN-LAST:event_ButtonClearActionPerformed

    private void MenuItemClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemClearActionPerformed
       Clear();
    }//GEN-LAST:event_MenuItemClearActionPerformed

  private void Save() {
    BufferedReader br = null; // Used to read the existing file content
    int entryCount = 0; // Counts the current number of entries in the file
    
    try {
        // Check the current number of inspection entries in the file
        File savefile = new File("text.txt");
        if (savefile.exists()) { // If the file exists, read its content
            br = new BufferedReader(new FileReader(savefile));
            String line;
            // Loop through each line in the file
            while ((line = br.readLine()) != null) {
                // Count lines that start with "Hospital Name:" to determine the number of entries
                if (line.startsWith("Hospital Name:")) {
                    entryCount++;
                }
            }
        }

        // Display an error message if there are already 5 entries
        if (entryCount >= 5) {
            JOptionPane.showMessageDialog(null, "Maximum inspection count has been reached!");
            return; // Exit the method if the limit is reached
        }

        // Proceed with saving if the limit has not been reached
        String HospitalName = this.HospitalNameInput.getText(); // Get hospital name input
        String Location = this.HospitalLocationInput.getText(); // Get hospital location input
        
        FileWriter fw = new FileWriter(savefile.getAbsoluteFile(), true); // Open file in append mode
        BufferedWriter bw = new BufferedWriter(fw);
        
        // Write the details of the new inspection entry to the file
        bw.write("Hospital Name: " + HospitalName);
        bw.newLine();
        bw.write("Hospital Location: " + Location);
        bw.newLine();
        bw.write("Years Since Inspection: " + this.ComboBox.getSelectedItem());
        bw.newLine();
        bw.write("*******************************");
        bw.newLine();
        bw.close(); // Close the BufferedWriter after writing
        
    } catch (IOException e) {
        // Display an error message if there's an issue with saving
        JOptionPane.showMessageDialog(null, "There is an error in saving your text file.");
    } finally {
        try {
            if (br != null) {
                br.close(); // Close BufferedReader if it was opened
            }
        } catch (IOException e) {
            System.out.println("Error closing the BufferedReader: " + e.toString());
        }
    }
}

private void Clear() {
    // Clear the text fields for hospital name and location
    this.HospitalNameInput.setText("");
    this.HospitalLocationInput.setText("");
    
    // Clear the list displayed in jList1
    DefaultListModel listModel = new DefaultListModel();
    listModel.clear();
    this.jList1.setModel(listModel); // Set the cleared model to jList1
}

private void Print() {
    BufferedReader br = null; // Used to read file content for printing
    DefaultListModel<String> listProducts = new DefaultListModel<>(); // Model to hold file content for jList1 display
    
    try {
        String currentLine;
        br = new BufferedReader(new FileReader("text.txt")); // Open the file to read
        
        // Read each line from the file and add it to the list model
        while ((currentLine = br.readLine()) != null) {
            listProducts.addElement(currentLine); // Add line to the list model
        }
        
        // Set the model to jList1 to display the file content
        this.jList1.setModel(listProducts);
        
    } catch (IOException e) {
        // Display an error message if there's an issue reading the file
        System.out.println("The following error has occurred: " + e.toString());
    } finally {
        try {
            if (br != null) {
                br.close(); // Close BufferedReader if it was opened
            }
        } catch (IOException e) {
            System.out.println("Error closing the BufferedReader: " + e.toString());
        }
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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Hospital_Inspections.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hospital_Inspections.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hospital_Inspections.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hospital_Inspections.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hospital_Inspections().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonClear;
    private javax.swing.JButton ButtonPrint;
    private javax.swing.JButton ButtonSave;
    private javax.swing.JComboBox<String> ComboBox;
    private javax.swing.JTextField HospitalLocationInput;
    private javax.swing.JTextField HospitalNameInput;
    private javax.swing.JMenuItem MenuItemClear;
    private javax.swing.JMenuItem MenuItemExit;
    private javax.swing.JMenuItem MenuItemPrint;
    private javax.swing.JMenuItem MenuItemSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList<String> jList1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
