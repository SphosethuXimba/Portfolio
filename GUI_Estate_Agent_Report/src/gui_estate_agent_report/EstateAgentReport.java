/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui_estate_agent_report;

import javax.swing.DefaultListModel;

/**
 *
 * @author lab_services_student
 */
public class EstateAgentReport extends javax.swing.JFrame {

    /**
     * Creates new form EstateAgentReport
     */
    public EstateAgentReport() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        List = new javax.swing.JList<>();
        jComboBox1 = new javax.swing.JComboBox<>();
        AgentName = new javax.swing.JTextField();
        PropertyPrice = new javax.swing.JTextField();
        Commission = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        ExitMenu = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        ProcessMenu = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        ClearMenu = new javax.swing.JMenuItem();
        SaveMenu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("AGENT LOCATION:");

        jLabel2.setText("ESTATE AGENT NAME:");

        jLabel3.setText("PROPERTY PRICE:");

        jLabel4.setText("COMMISSION PERCENTAGE:");

        jLabel5.setText("ESTATE AGENT REPORT:");

        jScrollPane1.setViewportView(List);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cape Town", "Durban", "Pretoria" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        AgentName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgentNameActionPerformed(evt);
            }
        });

        ExitMenu.setText("File");

        jMenuItem4.setText("Exit");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        ExitMenu.add(jMenuItem4);

        jMenuBar1.add(ExitMenu);

        ProcessMenu.setText("Tools");

        jMenuItem1.setText("Process Report");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        ProcessMenu.add(jMenuItem1);

        ClearMenu.setText("Clear");
        ClearMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearMenuActionPerformed(evt);
            }
        });
        ProcessMenu.add(ClearMenu);

        SaveMenu.setText("Save Report");
        SaveMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveMenuActionPerformed(evt);
            }
        });
        ProcessMenu.add(SaveMenu);

        jMenuBar1.add(ProcessMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jComboBox1, 0, 213, Short.MAX_VALUE)
                            .addComponent(AgentName)
                            .addComponent(PropertyPrice)
                            .addComponent(Commission))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(AgentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(PropertyPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Commission, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
     
            String AgentName = this.AgentName.getText();
          double PropertyPrice = Double.parseDouble(this.PropertyPrice.getText());
          double Commission = Double.parseDouble(this.Commission.getText());
          double AgentCommssion = PropertyPrice * (Commission/100);
          
         DefaultListModel listModel = new DefaultListModel();
        listModel.addElement("AGENT LOCATION: " + this.jComboBox1.getSelectedItem());
        listModel.addElement("AGENT NAME: " + AgentName);
        listModel.addElement("PROPERTY PRICE: R" + PropertyPrice);
        listModel.addElement("COMMISSION PERCENTAGE: " + Commission + "%");
        listModel.addElement("CALCULATED COMMISSION: " + AgentCommssion);
        this.List.setModel(listModel);
         
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void ClearMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearMenuActionPerformed
         this.AgentName.setText("");
         this.PropertyPrice.setText("");
         this.Commission.setText("");
          DefaultListModel listModel = new DefaultListModel();
         listModel.clear();
         this.List.setModel(listModel);
        
    }//GEN-LAST:event_ClearMenuActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
         System.exit(0);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void AgentNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgentNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AgentNameActionPerformed

    private void SaveMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SaveMenuActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(EstateAgentReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EstateAgentReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EstateAgentReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EstateAgentReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EstateAgentReport().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AgentName;
    private javax.swing.JMenuItem ClearMenu;
    private javax.swing.JTextField Commission;
    private javax.swing.JMenu ExitMenu;
    private javax.swing.JList<String> List;
    private javax.swing.JMenu ProcessMenu;
    private javax.swing.JTextField PropertyPrice;
    private javax.swing.JMenuItem SaveMenu;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
