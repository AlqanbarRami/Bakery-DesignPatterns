package com.company.Command.ChocolateCakeCommand;

import com.company.Command.CakesCommand;
import com.company.Models.ChocolateCake;

public class StageSix implements CakesCommand {

    private ChocolateCakeStages chocolateCakeStages = new ChocolateCakeStages();
    private ChocolateCake chocolateCake ;

    public StageSix(ChocolateCake chocolateCake){
        this.chocolateCake = chocolateCake;
    }


    @Override
    public void execute() {
        chocolateCake.setChocolateButtercream(true);
        chocolateCakeStages.StageSix();
    }
}
