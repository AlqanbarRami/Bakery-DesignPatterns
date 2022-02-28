package com.company.Models;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.Arrays;

public class OperaCake {

    private int id = 2;
    private String name = "opera";
    private boolean[] cakeBase = new boolean[3];
    private boolean whippedCream;
    private boolean vanillaCream;
    private boolean raspberryJam;
    private boolean pinkMarzipanLid;
    private boolean marzipanRose;
    private boolean powderSugar;
    private String cakeStatus ;
    private PropertyChangeSupport propertyChangeSupport;

    public OperaCake(){
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

    public boolean[] getCakeBase() {
        return cakeBase;
    }

    public void setCakeBase(int position,boolean cakeBase) {
        this.cakeBase[position] = cakeBase;
    }

    public boolean isWhippedCream() {
        return whippedCream;
    }

    public void setWhippedCream(boolean whippedCream) {
        this.whippedCream = whippedCream;
    }

    public boolean isVanillaCream() {
        return vanillaCream;
    }

    public void setVanillaCream(boolean vanillaCream) {
        this.vanillaCream = vanillaCream;
    }

    public boolean isRaspberryJam() {
        return raspberryJam;
    }

    public void setRaspberryJam(boolean raspberryJam) {
        this.raspberryJam = raspberryJam;
    }

    public boolean isPinkMarzipanLid() {
        return pinkMarzipanLid;
    }

    public void setPinkMarzipanLid(boolean pinkMarzipanLid) {
        this.pinkMarzipanLid = pinkMarzipanLid;
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

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "OperaCake{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cakeBase=" + Arrays.toString(cakeBase) +
                ", whippedCream=" + whippedCream +
                ", vanillaCream=" + vanillaCream +
                ", raspberryJam=" + raspberryJam +
                ", pinkMarzipanLid=" + pinkMarzipanLid +
                ", marzipanRose=" + marzipanRose +
                ", powderSugar=" + powderSugar +
                ", cakeStatus='" + cakeStatus + '\'' +
                '}';
    }
}
