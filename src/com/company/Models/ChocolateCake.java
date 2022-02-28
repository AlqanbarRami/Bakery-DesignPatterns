package com.company.Models;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.Arrays;

public class ChocolateCake {

    private int id = 3;
    private String name = "chocolate";
    private boolean[] chocolateCakeBase = new boolean[3];
    private boolean chocolateButtercream;
    private boolean[] raspberryMousse = new boolean[2];
    private boolean raspberry;
    private boolean chocolateGanache;
    private String cakeStatus ;
    private PropertyChangeSupport propertyChangeSupport;

    public ChocolateCake(){
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

    public boolean[] getChocolateCakeBase() {
        return chocolateCakeBase;
    }

    public void setChocolateCakeBase(int position, boolean chocolateCakeBase) {
        this.chocolateCakeBase[position] = chocolateCakeBase;
    }

    public boolean isChocolateButtercream() {
        return chocolateButtercream;
    }

    public void setChocolateButtercream(boolean chocolateButtercream) {
        this.chocolateButtercream = chocolateButtercream;
    }

    public boolean[] getRaspberryMousse() {
        return raspberryMousse;
    }

    public void setRaspberryMousse(int position, boolean raspberryMousse) {
        this.raspberryMousse[position] = raspberryMousse;
    }

    public boolean isRaspberry() {
        return raspberry;
    }

    public void setRaspberry(boolean raspberry) {
        this.raspberry = raspberry;
    }

    public boolean isChocolateGanache() {
        return chocolateGanache;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setChocolateGanache(boolean chocolateGanache) {
        this.chocolateGanache = chocolateGanache;
    }

    @Override
    public String toString() {
        return "ChocolateCake{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", chocolateCakeBase=" + Arrays.toString(chocolateCakeBase) +
                ", chocolateButtercream=" + chocolateButtercream +
                ", raspberryMousse=" + Arrays.toString(raspberryMousse) +
                ", raspberry=" + raspberry +
                ", chocolateGanache=" + chocolateGanache +
                ", cakeStatus='" + cakeStatus + '\'' +
                '}';
    }
}
