/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex5_2;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 *
 * @author jjsoc
 */
public class Subscriber implements PropertyChangeListener{

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
         System.out.println("live result: " + evt.getNewValue());
    }
    
}
