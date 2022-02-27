package com.company.Builder;

import com.company.Models.PrincessCake;

public class PrincessBuilder implements SharedStages {

    private PrincessCake princessCake = new PrincessCake();
    private boolean[] stages = new boolean[5];

    @Override
    public String BringCakeBase() {
        princessCake.setCakeBase(0, true);
        stages[0] = true;
        return "Done : The First Cake Base is Ready!";
    }

    @Override
    public String SpreadVanillaCream() {
        princessCake.setVanillaCream(0, true);
        stages[1] = true;
        return "Done : Spreading a layer of vanilla cream";
    }

    @Override
    public String PutSecondCakeBase() {
        princessCake.setCakeBase(1, true);
        stages[2] = true;
        return "Done : Added Second Cake Base";
    }

    public String SpreadSecondVanillaCream() {
        princessCake.setVanillaCream(1, true);
        stages[3] = true;
        return "Done : Spreading another layer of vanilla cream";
    }

    @Override
    public String PutThirdCakeBase() {
        princessCake.setCakeBase(2, true);
        stages[4] = true;
        return "Done : Added Third Cake Base";
    }

    public String PrincessCakeBuild() {
        for (boolean stage : stages) {
            if (!stage) {
                return "Some Stage is missing";
            }
        }
        return  "Base of the cake is ready!";
    }

}
