/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex5_2;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 *
 * @author jjsoc
 */
public class LiveScoreBean {
    private String scoreLine;
    
    public static final String PROP_SOMEDATA = "someData";
    
    public String getSomeData() {
        return scoreLine;
    }
    
    
    public void setSomeData(String scoreLine) {
        String oldSomeData = this.scoreLine;
        this.scoreLine = scoreLine;
        propertyChangeSupport.firePropertyChange(PROP_SOMEDATA, oldSomeData, scoreLine);
    }
    
    private transient final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }
}
