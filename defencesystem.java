/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package defencesystem;


public class defencesystem {
    public static void main(String args[]){
        
        Observable ob = new Observable();
        Observer h1 = new Helicopter();
        Observer t1 = new Tank();
        Observer s1 = new Submarine();
        MainController mm = MainController.getMainController();
        
        ob.addObserver(h1);
        ob.addObserver(t1);
        ob.addObserver(s1);
        ob.allAdded();
        
    }
    
}
