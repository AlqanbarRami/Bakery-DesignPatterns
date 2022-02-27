package com.company.Observer;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class VdControl implements PropertyChangeListener {
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println("New Event " + evt.getPropertyName() + " : " + evt.getNewValue());
    }
}
