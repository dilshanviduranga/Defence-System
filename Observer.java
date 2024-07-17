/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package defencesystem;

/**
 *
 * @author Don
 */
public interface Observer {
    public void areaclear();
    public void textSend(String x);
    public void pass(Observer controller);
    public void positionAction(int value);
    
    

}
