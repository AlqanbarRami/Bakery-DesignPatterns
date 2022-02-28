package com.company.Builder;

import com.company.Models.ChocolateCake;
import com.company.Observer.VdControl;


public class ChocolateBuilder {

    private boolean[] stages= new boolean[5];
    private ChocolateCake chocolateCake = new ChocolateCake();
    VdControl vdControl = new VdControl();

    public ChocolateBuilder BringChocolateCakeBase(){
        chocolateCake.addPropertyChangeListener(vdControl);
        chocolateCake.setCakeStatus("Order -> ChocolateCake");
        chocolateCake.setChocolateCakeBase(0,true);
        stages[0] = true;
        System.out.println("Done : Cake Base is Ready!");
        return this;
    }

    public ChocolateBuilder SpreadRaspberryMousse(){
        chocolateCake.setRaspberryMousse(0,true);
        stages[1] = true;
        System.out.println("Done : Spreading a layer of Raspberry Mousse");
        return this;
    }

    public ChocolateBuilder PutSecondChocolateCakeBase(){
        chocolateCake.setChocolateCakeBase(1,true);
        stages[2] = true;
        System.out.println("Done : Added Second Chocolate Cake Base");
        return this;
    }

    public ChocolateBuilder SpreadSecondRaspberryMousse(){
        chocolateCake.setRaspberryMousse(1,true);
        stages[3] = true;
        System.out.println("Done : Spreading another layer of Raspberry Mousse");
        return this;
    }

    public ChocolateBuilder PutThirdChocolateCakeBase(){
        chocolateCake.setChocolateCakeBase(2,true);
        stages[4] = true;
        System.out.println("Done : Added Third Chocolate Cake Base");
        return this;
    }

    public ChocolateCake ChocolateCakeBuild(){
        for (boolean stage : stages) {
            if (!stage) {
                System.out.println("Some Stage is missing");
                return null;
            }
        }
        System.out.println("Base of the cake is ready!");
        return chocolateCake;
    }
}
