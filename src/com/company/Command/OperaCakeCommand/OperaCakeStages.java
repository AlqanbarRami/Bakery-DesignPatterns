package com.company.Command.OperaCakeCommand;

import com.company.Models.OperaCake;

public class OperaCakeStages {
    private OperaCake operaCake = new OperaCake();

    public void StageSix(){
        operaCake.setWhippedCream(true);
        System.out.println("Done : Spread whipped cream on the cake so that it has a dome shape");
    }

    public void StageSeven(){
        operaCake.setMarzipanRose(true);
        System.out.println("Done : Put the marzipan lid on the cake (pink)");
    }

    public void StageEight(){
        operaCake.setMarzipanRose(true);
        System.out.println("Done : Garnish with marzipan rose");
    }

    public void StageNine(){
        operaCake.setPowderSugar(true);
        System.out.println("Done : Powder Sugar Over The Cake");
    }

}
