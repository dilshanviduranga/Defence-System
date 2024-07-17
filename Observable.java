/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package defencesystem;
import java.util.*;

public class Observable {
    private Observer maincontroller;

    private static ArrayList<Observer>ObserverList;

    public Observable() {
        Observable.ObserverList = new ArrayList<>();
    }
    
    public void addObserver(Observer ob){
        ObserverList.add(ob);
    }
    
    public void allAdded(){
        for(Observer ob : ObserverList){
            ob.pass(maincontroller );
        }
        MainController m = MainController.getMainController();
        m.pass(maincontroller);
    }
    
    public void addMainController(Observer controller){
        maincontroller = controller;
    }
    
    public static ArrayList<Observer> getArray(){
        return ObserverList;
    }


    
}
