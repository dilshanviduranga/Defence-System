/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package defencesystem;


public class Submarine extends javax.swing.JFrame implements Observer{
    private Observer maincontroller;
    private String pass = "Area Not Cleared!";
    private Boolean position=false;


    public Submarine() {
        initComponents();
        setVisible(true);
        jTextAreaChat.setEditable(false);
        btnShoot.setEnabled(false);
        btnTomhawk.setEnabled(false);
        btnTrident.setEnabled(false);
        btnSonar.setEnabled(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAreaClear = new javax.swing.JLabel();
        jSpinnerSoldierCount = new javax.swing.JSpinner();
        jSpinnerAmmoCount = new javax.swing.JSpinner();
        lblAreaClear1 = new javax.swing.JLabel();
        lblAreaClear2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaChat = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jTextFieldSender = new javax.swing.JTextField();
        jSlider1 = new javax.swing.JSlider();
        jSliderOxigen = new javax.swing.JSlider();
        lblAreaClear3 = new javax.swing.JLabel();
        lblAreaClear4 = new javax.swing.JLabel();
        btnShoot = new javax.swing.JButton();
        btnTrident = new javax.swing.JButton();
        btnSonar = new javax.swing.JButton();
        btnTomhawk = new javax.swing.JButton();
        jCheckBoxPosition = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Submarine");

        lblAreaClear.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblAreaClear.setText("Area Not Cleared");

        jSpinnerSoldierCount.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinnerSoldierCountStateChanged(evt);
            }
        });

        jSpinnerAmmoCount.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinnerAmmoCountStateChanged(evt);
            }
        });

        lblAreaClear1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblAreaClear1.setText("Soldier Count");

        lblAreaClear2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblAreaClear2.setText("Ammo Count");

        jTextAreaChat.setColumns(20);
        jTextAreaChat.setRows(5);
        jScrollPane1.setViewportView(jTextAreaChat);

        jButton2.setText("Send");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextFieldSender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSenderActionPerformed(evt);
            }
        });

        jSlider1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jSlider1.setMajorTickSpacing(20);
        jSlider1.setMinorTickSpacing(20);
        jSlider1.setOrientation(javax.swing.JSlider.VERTICAL);
        jSlider1.setPaintLabels(true);
        jSlider1.setPaintTicks(true);
        jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider1StateChanged(evt);
            }
        });

        jSliderOxigen.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jSliderOxigen.setMajorTickSpacing(20);
        jSliderOxigen.setMinorTickSpacing(20);
        jSliderOxigen.setOrientation(javax.swing.JSlider.VERTICAL);
        jSliderOxigen.setPaintLabels(true);
        jSliderOxigen.setPaintTicks(true);
        jSliderOxigen.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSliderOxigenStateChanged(evt);
            }
        });

        lblAreaClear3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblAreaClear3.setText("Energy");

        lblAreaClear4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblAreaClear4.setText("Oxigen");

        btnShoot.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnShoot.setText("Shoot");
        btnShoot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShootActionPerformed(evt);
            }
        });

        btnTrident.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTrident.setText("Trident-2 Missile");
        btnTrident.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTridentActionPerformed(evt);
            }
        });

        btnSonar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSonar.setText("Sonar Operation");
        btnSonar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSonarActionPerformed(evt);
            }
        });

        btnTomhawk.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTomhawk.setText("Tomhawk Missile");
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jTextFieldSender, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(14, 14, 14)
                                    .addComponent(lblAreaClear, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnShoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnTomhawk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnTrident, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnSonar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 185, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCheckBoxPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblAreaClear1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblAreaClear2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSpinnerAmmoCount, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinnerSoldierCount, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(63, 63, 63)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSlider1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAreaClear3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAreaClear4)
                    .addComponent(jSliderOxigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblAreaClear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSonar)
                    .addComponent(btnShoot))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnTomhawk)
                        .addGap(53, 53, 53)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldSender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnTrident)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBoxPosition)))
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAreaClear1)
                            .addComponent(jSpinnerSoldierCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAreaClear2)
                            .addComponent(jSpinnerAmmoCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAreaClear3)
                            .addComponent(lblAreaClear4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSliderOxigen, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
                            .addComponent(jSlider1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String msg = "Submarine -";
        msg += jTextFieldSender.getText();
        System.out.println(msg);
        jTextFieldSender.setText(null);
        jTextAreaChat.append(msg+"\n");
        maincontroller.textSend(msg);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextFieldSenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSenderActionPerformed
        
    }//GEN-LAST:event_jTextFieldSenderActionPerformed

    private void jSpinnerSoldierCountStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinnerSoldierCountStateChanged
        int value = (Integer)jSpinnerSoldierCount.getValue();
        Counter c1 = (Counter)maincontroller;
        c1.SoldierCount(value, this);
    }//GEN-LAST:event_jSpinnerSoldierCountStateChanged

    private void jSpinnerAmmoCountStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinnerAmmoCountStateChanged
        int value = (Integer)jSpinnerAmmoCount.getValue();
        Counter c1 = (Counter)maincontroller;
        c1.AmmoCount(value, this);
    }//GEN-LAST:event_jSpinnerAmmoCountStateChanged

    private void jSliderOxigenStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSliderOxigenStateChanged
        int value = (Integer)jSliderOxigen.getValue();
        SubmarineActions s1 = (SubmarineActions)maincontroller;
        s1.submarineOxi(value);
    }//GEN-LAST:event_jSliderOxigenStateChanged

    private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider1StateChanged
        
    }//GEN-LAST:event_jSlider1StateChanged

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
        
        }else{
            position = true;
        }
    }//GEN-LAST:event_jCheckBoxPositionActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnShoot;
    private javax.swing.JButton btnSonar;
    private javax.swing.JButton btnTomhawk;
    private javax.swing.JButton btnTrident;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBoxPosition;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JSlider jSliderOxigen;
    private javax.swing.JSpinner jSpinnerAmmoCount;
    private javax.swing.JSpinner jSpinnerSoldierCount;
    private javax.swing.JTextArea jTextAreaChat;
    private javax.swing.JTextField jTextFieldSender;
    private javax.swing.JLabel lblAreaClear;
    private javax.swing.JLabel lblAreaClear1;
    private javax.swing.JLabel lblAreaClear2;
    private javax.swing.JLabel lblAreaClear3;
    private javax.swing.JLabel lblAreaClear4;
    // End of variables declaration//GEN-END:variables

    @Override
    public void areaclear() {
        if(pass.equals("Area Not Cleared!")){
            pass = "Area Cleared!";
        }else{
            pass = "Area Not Cleared!";
        }
        lblAreaClear.setText(pass);
    }

    @Override
    public void textSend(String x) {
        jTextAreaChat.append(x+"\n");
    }


    @Override
    public void pass(Observer controller){
        System.out.println("Submarine here...");
        maincontroller = MainController.getMainController();
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
            if(value>75){
                btnTrident.setEnabled(true);
            }else{
                btnTrident.setEnabled(false);
            }
        }
    }
    
    
    
}
