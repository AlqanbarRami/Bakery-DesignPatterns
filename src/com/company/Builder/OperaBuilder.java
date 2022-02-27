package com.company.Builder;

import com.company.Models.OperaCake;

public class OperaBuilder implements SharedStages{

    OperaCake operaCake = new OperaCake();
    private boolean[] stages= new boolean[5];


    @Override
    public String BringCakeBase(){
        operaCake.setCakeBase(0, true);
        stages[0] = true;
        return "Done : Cake Base is Ready!";
    }
    @Override
    public String SpreadVanillaCream(){
        operaCake.setVanillaCream(true);
        stages[1] = true;

        return "Done : Spreading a layer of vanilla cream";
    }
    @Override
    public String PutSecondCakeBase(){
        operaCake.setCakeBase(1,true);
        stages[2] = true;
        return "Done : Added Second Cake Base";
    }

    public String SpreadRaspberryJam(){
        operaCake.setRaspberryJam(true);
        stages[3] = true;
        return "Done : Spreading a layer of raspberry Jam";
    }

    @Override
    public String PutThirdCakeBase(){
        operaCake.setCakeBase(2,true);
        stages[4] = true;
        return "Done : Added Third Cake Base";
    }

    public String PrincessCakeBuild(){
        for (boolean stage : stages) {
            if (!stage) {
                return "Some Stage is missing";
            }
        }
      return  "Base of the cake is ready!";
    }
}
