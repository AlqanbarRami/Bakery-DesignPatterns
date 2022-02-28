package com.company.Builder;

import com.company.Models.PrincessCake;
import com.company.Observer.VdControl;

public class PrincessBuilder   {


    private boolean[] stages = new boolean[5];
    private PrincessCake princessCake = new PrincessCake();
    VdControl vdControl = new VdControl();



    public PrincessBuilder BringCakeBase() {
        princessCake.addPropertyChangeListener(vdControl);
        princessCake.setCakeStatus("Order -> PrincessCake");
        princessCake.setCakeBase(0, true);
        stages[0] = true;
        System.out.println("Done : The First Cake Base is Ready!");
        return this;
    }

    public PrincessBuilder SpreadVanillaCream() {
        princessCake.setVanillaCream(0, true);
        stages[1] = true;
        System.out.println("Done : Spreading a layer of vanilla cream");
        return this;
    }

    public PrincessBuilder PutSecondCakeBase() {
        princessCake.setCakeBase(1, true);
        stages[2] = true;
        System.out.println("Done : Added Second Cake Base");
        return this;
    }

    public PrincessBuilder SpreadSecondVanillaCream() {
        princessCake.setVanillaCream(1, true);
        stages[3] = true;
        System.out.println("Done : Spreading another layer of vanilla cream");
        return this;
    }


    public PrincessBuilder PutThirdCakeBase() {
        princessCake.setCakeBase(2, true);
        stages[4] = true;
        System.out.println("Done : Added Third Cake Base");
        return this;
    }

    public PrincessCake PrincessCakeBuild() {
        for (boolean stage : stages) {
            if (!stage) {
                System.out.println("Some Stage is missing");
                return null;
            }
        }
        System.out.println("Base of the cake is ready!");
        return princessCake;
    }

}
