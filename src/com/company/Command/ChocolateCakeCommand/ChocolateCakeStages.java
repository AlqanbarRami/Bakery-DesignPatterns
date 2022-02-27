package com.company.Command.ChocolateCakeCommand;

import com.company.Models.ChocolateCake;
import com.company.Models.OperaCake;

public class ChocolateCakeStages {
    private ChocolateCake chocolateCake = new ChocolateCake();

    public void StageSix(){
        chocolateCake.setChocolateButtercream(true);
        System.out.println("Done : Fill the cake with chocolate buttercream");
    }

    public void StageSeven(){
        chocolateCake.setChocolateGanache(true);
        System.out.println("Done : Pour chocolate ganache on the cake.");
    }

    public void StageEight(){
        chocolateCake.setRaspberry(true);
        System.out.println("Done : Garnish with raspberries");
    }
}
