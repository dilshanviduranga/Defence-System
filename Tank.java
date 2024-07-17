/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package defencesystem;


public class Tank extends javax.swing.JFrame implements Observer,TankActions{
    private Observer maincontroller;
    private String pass = "Area Not Cleared!";
    private Boolean position = false;
    
    
    @Override
    public void pass(Observer controller){
        System.out.println("Tank here...");
        maincontroller = MainController.getMainController();
    }
    
    
    
    @Override
    public void textSend(String msg) {
        txtAreaChat.append(msg+"\n");
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
            if(value>25){
                btnSonar.setEnabled(true);
            }else{
                btnSonar.setEnabled(false);
            }
            if(value>50){
                btnTomhawk.setEnabled(true);
            }else{
                btnTomhawk.setEnabled(false);
            }
            if(value>70){
                btnTrident.setEnabled(true);
            }else{
                btnTrident.setEnabled(false);
            }
        }
    }

    public Tank() {
        initComponents();
        setVisible(true);
        txtAreaChat.setEditable(false);
            btnShoot.setEnabled(false);
            btnTomhawk.setEnabled(false);
            btnSonar.setEnabled(false);
            btnTrident.setEnabled(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAreaclear = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaChat = new javax.swing.JTextArea();
        txtFieldSender = new javax.swing.JTextField();
        btnSend = new javax.swing.JButton();
        jSliderDistance = new javax.swing.JSlider();
        jSpinnerSoldierCount = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSpinnerAmmoCount = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        btnShoot = new javax.swing.JButton();
        btnTrident = new javax.swing.JButton();
        btnSonar = new javax.swing.JButton();
        btnTomhawk = new javax.swing.JButton();
        jCheckBoxPosition = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tank");

        lblAreaclear.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblAreaclear.setText("Area Not Cleared");

        txtAreaChat.setColumns(20);
        txtAreaChat.setRows(5);
        jScrollPane1.setViewportView(txtAreaChat);

        btnSend.setText("Send");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        jSliderDistance.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jSliderDistance.setMajorTickSpacing(3000);
        jSliderDistance.setMaximum(15000);
        jSliderDistance.setMinorTickSpacing(3000);
        jSliderDistance.setOrientation(javax.swing.JSlider.VERTICAL);
        jSliderDistance.setPaintLabels(true);
        jSliderDistance.setPaintTicks(true);
        jSliderDistance.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSliderDistanceStateChanged(evt);
            }
        });

        jSpinnerSoldierCount.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinnerSoldierCountStateChanged(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Soldier Count");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Ammo Count");

        jSpinnerAmmoCount.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinnerAmmoCountStateChanged(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Distance");

        btnShoot.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnShoot.setText("Shoot");
        btnShoot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShootActionPerformed(evt);
            }
        });

        btnTrident.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTrident.setText("Rotate Shooting");
        btnTrident.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTridentActionPerformed(evt);
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
        btnTomhawk.setText("Redar Operation");
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
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAreaclear)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtFieldSender, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jSpinnerSoldierCount, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jSpinnerAmmoCount, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnShoot, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnSonar)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 5, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnTomhawk)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnTrident, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(188, 188, 188))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jCheckBoxPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(114, 114, 114)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSliderDistance, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(110, 110, 110))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSliderDistance, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(109, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jSpinnerSoldierCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jSpinnerAmmoCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnShoot)
                                    .addComponent(btnSonar))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnTrident)
                                    .addComponent(btnTomhawk))
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBoxPosition)
                                .addGap(24, 24, 24)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(lblAreaclear)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFieldSender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        String msg = "Tank - ";
        msg += txtFieldSender.getText();
        txtFieldSender.setText(null);
        txtAreaChat.append(msg+"\n");
        maincontroller.textSend(msg);
    }//GEN-LAST:event_btnSendActionPerformed

    private void jSpinnerSoldierCountStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinnerSoldierCountStateChanged
        int count = (Integer)jSpinnerSoldierCount.getValue();
        Counter c1 = (Counter)maincontroller;
        c1.SoldierCount(count, this);
    }//GEN-LAST:event_jSpinnerSoldierCountStateChanged

    private void jSpinnerAmmoCountStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinnerAmmoCountStateChanged
        int count = (Integer)jSpinnerAmmoCount.getValue();
        Counter c1 = (Counter)maincontroller;
        c1.AmmoCount(count, this);
    }//GEN-LAST:event_jSpinnerAmmoCountStateChanged

    private void jSliderDistanceStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSliderDistanceStateChanged
        int distance = jSliderDistance.getValue();
        TankActions a = (TankActions)maincontroller;
        a.TankDistance(distance);
    }//GEN-LAST:event_jSliderDistanceStateChanged

    private void btnShootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShootActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnShootActionPerformed

    private void btnTridentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTridentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTridentActionPerformed

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
            btnTrident.setEnabled(false);
        }else{
            position = true;
        }
    }//GEN-LAST:event_jCheckBoxPositionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSend;
    private javax.swing.JButton btnShoot;
    private javax.swing.JButton btnSonar;
    private javax.swing.JButton btnTomhawk;
    private javax.swing.JButton btnTrident;
    private javax.swing.JCheckBox jCheckBoxPosition;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSliderDistance;
    private javax.swing.JSpinner jSpinnerAmmoCount;
    private javax.swing.JSpinner jSpinnerSoldierCount;
    private javax.swing.JLabel lblAreaclear;
    private javax.swing.JTextArea txtAreaChat;
    private javax.swing.JTextField txtFieldSender;
    // End of variables declaration//GEN-END:variables

    @Override
    public void TankDistance(int distance) {
        
    }
}
