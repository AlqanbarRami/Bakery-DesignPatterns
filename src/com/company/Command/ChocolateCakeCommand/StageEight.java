package com.company.Command.ChocolateCakeCommand;

import com.company.Command.CakesCommand;
import com.company.Command.OperaCakeCommand.OperaCakeStages;
import com.company.Models.ChocolateCake;

public class StageEight implements CakesCommand {

    private ChocolateCakeStages chocolateCakeStages = new ChocolateCakeStages();
    private ChocolateCake chocolateCake ;

    public StageEight(ChocolateCake chocolateCake){
        this.chocolateCake = chocolateCake;
    }

    @Override
    public void execute() {
        chocolateCake.setRaspberry(true);
        chocolateCakeStages.StageEight();
        chocolateCake.setCakeStatus("Done");
    }
}
