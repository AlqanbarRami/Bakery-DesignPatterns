package com.company.Builder;

import com.company.Models.OperaCake;
import com.company.Observer.VdControl;

public class OperaBuilder {

    private boolean[] stages= new boolean[5];
    private OperaCake operaCake = new OperaCake();
    VdControl vdControl = new VdControl();


    public OperaBuilder BringCakeBase(){
        operaCake.addPropertyChangeListener(vdControl);
        operaCake.setCakeStatus("Order -> OperaCake");
        operaCake.setCakeBase(0, true);
        stages[0] = true;
        System.out.println("Done : Cake Base is Ready!");
        return this;
    }

    public OperaBuilder SpreadVanillaCream(){
        operaCake.setVanillaCream(true);
        stages[1] = true;
        System.out.println("Done : Spreading a layer of vanilla cream");
        return this;
    }

    public OperaBuilder PutSecondCakeBase(){
        operaCake.setCakeBase(1,true);
        stages[2] = true;
        System.out.println("Done : Added Second Cake Base");
        return this;
    }

    public OperaBuilder SpreadRaspberryJam(){
        operaCake.setRaspberryJam(true);
        stages[3] = true;
        System.out.println("Done : Spreading a layer of raspberry Jam");
        return this;
    }


    public OperaBuilder PutThirdCakeBase(){
        operaCake.setCakeBase(2,true);
        stages[4] = true;
        System.out.println("Done : Added Third Cake Base");
        return this;
    }

    public OperaCake PrincessCakeBuild(){
        for (boolean stage : stages) {
            if (!stage) {
                System.out.println("Some Stage is missing");
                return null;
            }
        }
      System.out.println("Base of the cake is ready!");
        return operaCake;
    }
}
