package com.company.Builder;

import com.company.Models.OperaCake;

public class OperaBuilder {

    private boolean[] stages= new boolean[5];


    public void BringCakeBase(OperaCake operaCake){
        operaCake.setCakeBase(0, true);
        stages[0] = true;
        System.out.println("Done : Cake Base is Ready!");
    }

    public void SpreadVanillaCream(OperaCake operaCake){
        operaCake.setVanillaCream(true);
        stages[1] = true;
        System.out.println("Done : Spreading a layer of vanilla cream");
    }

    public void PutSecondCakeBase(OperaCake operaCake){
        operaCake.setCakeBase(1,true);
        stages[2] = true;
        System.out.println("Done : Added Second Cake Base");
    }

    public void SpreadRaspberryJam(OperaCake operaCake){
        operaCake.setRaspberryJam(true);
        stages[3] = true;
        System.out.println("Done : Spreading a layer of raspberry Jam");
    }


    public void PutThirdCakeBase(OperaCake operaCake){
        operaCake.setCakeBase(2,true);
        stages[4] = true;
        System.out.println("Done : Added Third Cake Base");
    }

    public void PrincessCakeBuild(){
        for (boolean stage : stages) {
            if (!stage) {
                System.out.println("Some Stage is missing");
            }
        }
      System.out.println("Base of the cake is ready!");
    }
}
