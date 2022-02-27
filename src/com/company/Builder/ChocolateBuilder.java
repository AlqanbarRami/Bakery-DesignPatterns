package com.company.Builder;

import com.company.Models.ChocolateCake;

import java.util.ArrayList;
import java.util.List;

public class ChocolateBuilder {
    ChocolateCake chocolateCake = new ChocolateCake();
    private boolean[] stages= new boolean[5];
    public String BringChocolateCakeBase(){
        chocolateCake.setChocolateCakeBase(0,true);
        stages[0] = true;
        return "Done : Cake Base is Ready!";
    }

    public String SpreadRaspberryMousse(){
        chocolateCake.setRaspberryMousse(0,true);
        stages[1] = true;
        return "Done : Spreading a layer of Raspberry Mousse";
    }

    public String PutSecondChocolateCakeBase(){
        chocolateCake.setChocolateCakeBase(1,true);
        stages[2] = true;
        return "Done : Added Second Chocolate Cake Base";
    }

    public String SpreadSecondRaspberryMousse(){
        chocolateCake.setRaspberryMousse(1,true);
        stages[3] = true;
        return "Done : Spreading another layer of Raspberry Mousse";
    }

    public String PutThirdChocolateCakeBase(){
        chocolateCake.setChocolateCakeBase(2,true);
        stages[4] = true;
        return "Done : Added Third Chocolate Cake Base";
    }

    public String ChocolateCakeBuild(){
        for (boolean stage : stages) {
            if (!stage) {
                return "Some Stage is missing";
            }
        }
        return  "Base of the cake is ready!";
    }
}
