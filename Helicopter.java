/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package defencesystem;

/**
 *
 * @author Don
 */
public class Helicopter extends javax.swing.JFrame implements Observer{
    private String pass = "Area Not Cleared!";
    private Observer maincontroller;
    private Boolean position = false;
    
    
    
    
    @Override
    public void pass(Observer controller){
        System.out.println("Helicopter here...");
        maincontroller = MainController.getMainController();
    }
    
    @Override
    public void textSend(String msg) {
        txtareaChat.append(msg+"\n");
    }
    
    @Override
    public void areaclear(){
        if(pass.equals("Area Not Cleared!")){
            pass = "Area Cleared!";
        }else{
            pass = "Area Not Cleared!";
        }
        lblAreaclear.setText(pass);
    }
    
    @Override
    public void positionAction(int value){
        if(position==true){
            if(value>0){
                btnShoot.setEnabled(true);
            }else{
                btnShoot.setEnabled(false);
            }
            if(value>45){
                btnSonar.setEnabled(true);
            }else{
                btnSonar.setEnabled(false);
            }
            if(value>70){
                btnTomhawk.setEnabled(true);
            }else{
                btnTomhawk.setEnabled(false);
            }
        }
    }

    
    public Helicopter() {
        initComponents();
        setVisible(true);
        txtareaChat.setEditable(false);
        btnShoot.setEnabled(false);
        btnTomhawk.setEnabled(false);
        btnSonar.setEnabled(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAreaclear = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtareaChat = new javax.swing.JTextArea();
        txtfieldSender = new javax.swing.JTextField();
        btnSend = new javax.swing.JButton();
        jsliderHeight = new javax.swing.JSlider();
        lblHeight = new javax.swing.JLabel();
        jSpinnerSoldierCount = new javax.swing.JSpinner();
        lblSoldierCount = new javax.swing.JLabel();
        lblAmmoCount = new javax.swing.JLabel();
        jSpinnerAmmoCount = new javax.swing.JSpinner();
        btnShoot = new javax.swing.JButton();
        btnSonar = new javax.swing.JButton();
        btnTomhawk = new javax.swing.JButton();
        jCheckBoxPosition = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Helicopter");

        lblAreaclear.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblAreaclear.setText("Area Not Cleared");

        txtareaChat.setColumns(20);
        txtareaChat.setRows(5);
        jScrollPane1.setViewportView(txtareaChat);

        btnSend.setText("Send");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        jsliderHeight.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jsliderHeight.setMajorTickSpacing(3000);
        jsliderHeight.setMaximum(15000);
        jsliderHeight.setMinorTickSpacing(3000);
        jsliderHeight.setOrientation(javax.swing.JSlider.VERTICAL);
        jsliderHeight.setPaintLabels(true);
        jsliderHeight.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jsliderHeightStateChanged(evt);
            }
        });

        lblHeight.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblHeight.setText("Height(ft)");

        jSpinnerSoldierCount.addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                jSpinnerSoldierCountHierarchyChanged(evt);
            }
        });
        jSpinnerSoldierCount.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinnerSoldierCountStateChanged(evt);
            }
        });

        lblSoldierCount.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblSoldierCount.setText("Soldier Count");

        lblAmmoCount.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblAmmoCount.setText("Ammo Count");

        jSpinnerAmmoCount.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinnerAmmoCountStateChanged(evt);
            }
        });

        btnShoot.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnShoot.setText("Shoot");
        btnShoot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShootActionPerformed(evt);
            }
        });

        btnSonar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSonar.setText("Missile Operation");
        btnSonar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSonarActionPerformed(evt);
            }
        });

        btnTomhawk.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTomhawk.setText("Laser Operation");
        btnTomhawk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTomhawkActionPerformed(evt);
            }
        });

        jCheckBoxPosition.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jCheckBoxPosition.setText("Position");
        jCheckBoxPosition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxPositionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAmmoCount, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jSpinnerAmmoCount, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(352, 352, 352))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSoldierCount, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jSpinnerSoldierCount, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97))))
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAreaclear)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(btnShoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnTomhawk, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE))
                                        .addGap(30, 30, 30)
                                        .addComponent(btnSonar))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(txtfieldSender, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnSend))
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jCheckBoxPosition)
                                .addGap(106, 106, 106)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jsliderHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(24, 24, 24))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblHeight)
                        .addGap(55, 55, 55)
                        .addComponent(jsliderHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(lblAreaclear))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(111, 111, 111)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jSpinnerSoldierCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblSoldierCount))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblAmmoCount)
                                    .addComponent(jSpinnerAmmoCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnShoot)
                            .addComponent(btnSonar))
                        .addGap(18, 18, 18)
                        .addComponent(btnTomhawk)
                        .addGap(5, 5, 5)
                        .addComponent(jCheckBoxPosition)
                        .addGap(56, 56, 56)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtfieldSender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSend))))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        String msg = "Helicopter - ";
        msg += txtfieldSender.getText();
        txtfieldSender.setText(null);
        txtareaChat.append(msg+"\n");
        maincontroller.textSend(msg);
        
    }//GEN-LAST:event_btnSendActionPerformed

    private void jSpinnerSoldierCountStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinnerSoldierCountStateChanged
        int num = (Integer)jSpinnerSoldierCount.getValue();
        Counter c1 = (Counter)maincontroller;
        c1.SoldierCount(num , this);
        
    }//GEN-LAST:event_jSpinnerSoldierCountStateChanged

    private void jSpinnerSoldierCountHierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_jSpinnerSoldierCountHierarchyChanged
        
    }//GEN-LAST:event_jSpinnerSoldierCountHierarchyChanged

    private void jSpinnerAmmoCountStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinnerAmmoCountStateChanged
        int num = (Integer)jSpinnerAmmoCount.getValue();
        Counter c1 = (Counter)maincontroller;
        c1.AmmoCount(num , this);
    }//GEN-LAST:event_jSpinnerAmmoCountStateChanged

    private void jsliderHeightStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jsliderHeightStateChanged
        int height = jsliderHeight.getValue();
        HelicopterActions ev = (HelicopterActions)maincontroller;
        ev.HeliHeight(height);
    }//GEN-LAST:event_jsliderHeightStateChanged

    private void btnShootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShootActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnShootActionPerformed

    private void btnSonarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSonarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSonarActionPerformed

    private void btnTomhawkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTomhawkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTomhawkActionPerformed

    private void jCheckBoxPositionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxPositionActionPerformed
        if(position==true){
            position=false;
            btnShoot.setEnabled(false);
            btnTomhawk.setEnabled(false);
            btnSonar.setEnabled(false);
        
        }else{
            position = true;
        }
    }//GEN-LAST:event_jCheckBoxPositionActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSend;
    private javax.swing.JButton btnShoot;
    private javax.swing.JButton btnSonar;
    private javax.swing.JButton btnTomhawk;
    private javax.swing.JCheckBox jCheckBoxPosition;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinnerAmmoCount;
    private javax.swing.JSpinner jSpinnerSoldierCount;
    private javax.swing.JSlider jsliderHeight;
    private javax.swing.JLabel lblAmmoCount;
    private javax.swing.JLabel lblAreaclear;
    private javax.swing.JLabel lblHeight;
    private javax.swing.JLabel lblSoldierCount;
    private javax.swing.JTextArea txtareaChat;
    private javax.swing.JTextField txtfieldSender;
    // End of variables declaration//GEN-END:variables

    

    


}
