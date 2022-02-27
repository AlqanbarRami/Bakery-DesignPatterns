package com.company.Models;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class PrincessCake {

    private int id = 1;
    private String name = "princess";
    private boolean[] cakeBase = new boolean[3];
    private boolean whippedCream;
    private boolean[] vanillaCream = new boolean[2];
    private boolean greenMarzipanLid;
    private boolean marzipanRose;
    private boolean powderSugar;
    private String cakeStatus ;
    private PropertyChangeSupport propertyChangeSupport;

    public PrincessCake(){
        this.propertyChangeSupport = new PropertyChangeSupport(this);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener){
        this.propertyChangeSupport.addPropertyChangeListener(listener);
    }

    public String getCakeStatus() {
        return cakeStatus;
    }

    public void setCakeStatus(String Status) {
        String oldStatus = "";
            oldStatus = this.cakeStatus;
            this.cakeStatus = Status;
            this.propertyChangeSupport.firePropertyChange("Order Status", oldStatus, this.cakeStatus);
    }

    public boolean isWhippedCream() {
        return whippedCream;
    }

    public void setWhippedCream(boolean whippedCream) {
        this.whippedCream = whippedCream;
    }

    public boolean isGreenMarzipanLid() {
        return greenMarzipanLid;
    }

    public void setGreenMarzipanLid(boolean greenMarzipanLid) {
        this.greenMarzipanLid = greenMarzipanLid;
    }

    public boolean isMarzipanRose() {
        return marzipanRose;
    }

    public void setMarzipanRose(boolean marzipanRose) {
        this.marzipanRose = marzipanRose;
    }

    public boolean isPowderSugar() {
        return powderSugar;
    }

    public void setPowderSugar(boolean powderSugar) {
        this.powderSugar = powderSugar;
    }

    public boolean[] getCakeBase() {
        return cakeBase;
    }

    public void setCakeBase(int position,boolean cakeBase) {
        this.cakeBase[position] = cakeBase;
    }

    public boolean[] getVanillaCream() {
        return vanillaCream;
    }

    public void setVanillaCream(int position, boolean vanillaCream) {
        this.vanillaCream[position] = vanillaCream;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
