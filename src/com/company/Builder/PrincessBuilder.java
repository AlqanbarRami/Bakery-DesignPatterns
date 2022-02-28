package com.company.Builder;

import com.company.Models.PrincessCake;

public class PrincessBuilder   {


    private boolean[] stages = new boolean[5];


    public void BringCakeBase(PrincessCake princessCake) {
        princessCake.setCakeBase(0, true);
        stages[0] = true;
        System.out.println("Done : The First Cake Base is Ready!");
    }

    public void SpreadVanillaCream(PrincessCake princessCake) {
        princessCake.setVanillaCream(0, true);
        stages[1] = true;
        System.out.println("Done : Spreading a layer of vanilla cream");
    }

    public void PutSecondCakeBase(PrincessCake princessCake) {
        princessCake.setCakeBase(1, true);
        stages[2] = true;
        System.out.println("Done : Added Second Cake Base");
    }

    public void SpreadSecondVanillaCream(PrincessCake princessCake) {
        princessCake.setVanillaCream(1, true);
        stages[3] = true;
        System.out.println("Done : Spreading another layer of vanilla cream");
    }


    public void PutThirdCakeBase(PrincessCake princessCake) {
        princessCake.setCakeBase(2, true);
        stages[4] = true;
        System.out.println("Done : Added Third Cake Base");
    }

    public void PrincessCakeBuild() {
        for (boolean stage : stages) {
            if (!stage) {
                System.out.println("Some Stage is missing");
            }
        }
        System.out.println("Base of the cake is ready!");

    }

}
