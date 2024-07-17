/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package defencesystem;

import java.util.ArrayList;

/**
 *
 * @author Don
 */
public class MainController extends javax.swing.JFrame implements Observer,TankActions,HelicopterActions,SubmarineActions,Counter{
    private Observer helicopter;
    private Observer tank;
    private Observer submarine;
    private static MainController maincontroller;
    private int HeliSoldierCount;
    private int HeliAmmoCount;
    private int TankSoldierCount;
    private int TankAmmoCount;
    private int SubmarineSoldierCount;
    private int SubmarineAmmoCount;
    
    
    
    private ArrayList<Observer>Observerlist;
    
   
    @Override
    public void HeliHeight(int height){
        jSliderHeliHeight.setValue(height);
    }
    
    @Override
    public void SoldierCount(int count , Observer vehi){
        if(vehi==helicopter){
            HeliSoldierCount = count;
        }else if(vehi==tank){
            TankSoldierCount = count;
        }else if(vehi==submarine){
            SubmarineSoldierCount = count;
        }
        count = HeliSoldierCount+TankSoldierCount+SubmarineSoldierCount;
        jSpinnerSoldierCount.setValue(count);
    }
    
    @Override
    public void AmmoCount(int count , Observer vehi){
        if(vehi==helicopter){
            HeliAmmoCount = count;
        }else if(vehi==tank){
            TankAmmoCount = count;
        }else if(vehi==submarine){
            SubmarineAmmoCount = count;
        }
        count = HeliAmmoCount+TankAmmoCount+SubmarineAmmoCount;
        jSpinnerAmmoCount.setValue(count);
        
    }
    @Override
    public void pass(Observer controller){
        Observerlist = Observable.getArray();
        helicopter = Observerlist.get(0);
        tank = Observerlist.get(1);
        submarine = Observerlist.get(2);
        for(Observer a : Observerlist){
            System.out.println(a);
        }
    }
    
    @Override
    public void textSend(String msg){
        System.out.println("MAin controller send");
        txtChat.append(msg+"\n");
    }
    @Override
    public void areaclear(){
        System.out.println("ABC");
    }
    
    @Override
    public void positionAction(int value){
        
    }
    
    @Override
    public void TankDistance(int distance){
        jSlider1.setValue(distance);
    }
    
    @Override
    public void submarineOxi(int oxy) {
        jSliderSubDeep.setValue(oxy);
    }
    
    //public MainController(Observer h1 , Observer t1 , Observer s1) {
    public MainController(){   
//        helicopter = h1;
//        tank = t1;
//        submarine = s1;
        initComponents();
        setVisible(true);
//        txtChat.setEditable(false);
    }
    
    public static MainController getMainController(){
        if(maincontroller==null){
            maincontroller = new MainController();
        }
        return maincontroller;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        checkboxAreaClear = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtChat = new javax.swing.JTextArea();
        btnSend = new javax.swing.JButton();
        jSpinnerSoldierCount = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        lblAmmoCount = new javax.swing.JLabel();
        jSpinnerAmmoCount = new javax.swing.JSpinner();
        jSliderHeliHeight = new javax.swing.JSlider();
        jSlider1 = new javax.swing.JSlider();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSliderSubDeep = new javax.swing.JSlider();
        lblSubdeep = new javax.swing.JLabel();
        jSlider2 = new javax.swing.JSlider();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main Controller");
        setAlwaysOnTop(true);

        checkboxAreaClear.setText("Area Clear");
        checkboxAreaClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkboxAreaClearActionPerformed(evt);
            }
        });

        txtChat.setColumns(20);
        txtChat.setRows(5);
        jScrollPane1.setViewportView(txtChat);

        btnSend.setText("Send");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        jSpinnerSoldierCount.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinnerSoldierCountStateChanged(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Soldier Count");

        lblAmmoCount.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblAmmoCount.setText("Ammo Count");

        jSliderHeliHeight.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jSliderHeliHeight.setMajorTickSpacing(3000);
        jSliderHeliHeight.setMaximum(15000);
        jSliderHeliHeight.setMinorTickSpacing(3000);
        jSliderHeliHeight.setOrientation(javax.swing.JSlider.VERTICAL);
        jSliderHeliHeight.setPaintLabels(true);
        jSliderHeliHeight.setPaintTicks(true);

        jSlider1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jSlider1.setMajorTickSpacing(3000);
        jSlider1.setMaximum(15000);
        jSlider1.setMinorTickSpacing(3000);
        jSlider1.setOrientation(javax.swing.JSlider.VERTICAL);
        jSlider1.setPaintLabels(true);
        jSlider1.setPaintTicks(true);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Height(ft)");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Distance(tank)");

        jSliderSubDeep.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jSliderSubDeep.setMajorTickSpacing(20);
        jSliderSubDeep.setMinorTickSpacing(3000);
        jSliderSubDeep.setOrientation(javax.swing.JSlider.VERTICAL);
        jSliderSubDeep.setPaintLabels(true);
        jSliderSubDeep.setPaintTicks(true);

        lblSubdeep.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblSubdeep.setText("Oxigen(submarine)");

        jSlider2.setMajorTickSpacing(20);
        jSlider2.setMinorTickSpacing(10);
        jSlider2.setPaintLabels(true);
        jSlider2.setPaintTicks(true);
        jSlider2.setSnapToTicks(true);
        jSlider2.setValue(0);
        jSlider2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider2StateChanged(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Position");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap(471, Short.MAX_VALUE)
                        .addComponent(lblSubdeep)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel3))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(lblAmmoCount))
                                        .addGap(45, 45, 45)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jSpinnerAmmoCount, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jSpinnerSoldierCount, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(44, 44, 44)
                                        .addComponent(checkboxAreaClear, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jSlider2, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(101, 101, 101)
                        .addComponent(jSliderSubDeep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)
                        .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSliderHeliHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btnSend)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSubdeep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSliderSubDeep, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSliderHeliHeight, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                            .addComponent(jSlider1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(260, 260, 260))
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(checkboxAreaClear)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jSpinnerSoldierCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAmmoCount)
                    .addComponent(jSpinnerAmmoCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addComponent(jLabel4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSlider2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(112, 112, 112))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSend)
                        .addGap(161, 161, 161))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkboxAreaClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkboxAreaClearActionPerformed
//        helicopter.areaclear();
//        tank.areaclear();
//        submarine.areaclear();
        for(Observer ob: Observerlist){
            ob.areaclear();
        }
        
    }//GEN-LAST:event_checkboxAreaClearActionPerformed

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        String msg ="General -";
        txtChat.append("\n");
        String text = txtChat.getText();
        String[] lines = text.split("\n");
        msg += lines[lines.length-1];
//        helicopter.textSend(msg);
//        tank.textSend(msg);
//        submarine.textSend(msg);
        for(Observer ob: Observerlist){
            System.out.println(ob);
            ob.textSend(msg);
            System.out.println(msg);
        }
    }//GEN-LAST:event_btnSendActionPerformed

    private void jSpinnerSoldierCountStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinnerSoldierCountStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jSpinnerSoldierCountStateChanged

    private void jSlider2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider2StateChanged
        int value = jSlider2.getValue();
        for(Observer ob : Observerlist){
            ob.positionAction(value);
        }
    }//GEN-LAST:event_jSlider2StateChanged

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(MainController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(MainController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(MainController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(MainController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new MainController().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSend;
    private javax.swing.JCheckBox checkboxAreaClear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JSlider jSlider2;
    private javax.swing.JSlider jSliderHeliHeight;
    private javax.swing.JSlider jSliderSubDeep;
    private javax.swing.JSpinner jSpinnerAmmoCount;
    private javax.swing.JSpinner jSpinnerSoldierCount;
    private javax.swing.JLabel lblAmmoCount;
    private javax.swing.JLabel lblSubdeep;
    private javax.swing.JTextArea txtChat;
    // End of variables declaration//GEN-END:variables

    
}
