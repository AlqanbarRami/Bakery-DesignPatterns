package com.company.Builder;

import com.company.Models.ChocolateCake;



public class ChocolateBuilder {

    private boolean[] stages= new boolean[5];

    public void BringChocolateCakeBase(ChocolateCake chocolateCake){
        chocolateCake.setChocolateCakeBase(0,true);
        stages[0] = true;
        System.out.println("Done : Cake Base is Ready!");
    }

    public void SpreadRaspberryMousse(ChocolateCake chocolateCake){
        chocolateCake.setRaspberryMousse(0,true);
        stages[1] = true;
        System.out.println("Done : Spreading a layer of Raspberry Mousse");
    }

    public void PutSecondChocolateCakeBase(ChocolateCake chocolateCake){
        chocolateCake.setChocolateCakeBase(1,true);
        stages[2] = true;
        System.out.println("Done : Added Second Chocolate Cake Base");
    }

    public void SpreadSecondRaspberryMousse(ChocolateCake chocolateCake){
        chocolateCake.setRaspberryMousse(1,true);
        stages[3] = true;
        System.out.println("Done : Spreading another layer of Raspberry Mousse");
    }

    public void PutThirdChocolateCakeBase(ChocolateCake chocolateCake){
        chocolateCake.setChocolateCakeBase(2,true);
        stages[4] = true;
        System.out.println("Done : Added Third Chocolate Cake Base");
    }

    public void ChocolateCakeBuild(){
        for (boolean stage : stages) {
            if (!stage) {
                System.out.println("Some Stage is missing");
            }
        }
        System.out.println("Base of the cake is ready!");
    }
}
