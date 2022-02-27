package com.company.Command.ChocolateCakeCommand;

import com.company.Command.CakesCommand;
import com.company.Models.ChocolateCake;

public class StageSeven implements CakesCommand {
    private ChocolateCakeStages chocolateCakeStages = new ChocolateCakeStages();
    private ChocolateCake chocolateCake ;

    public StageSeven(ChocolateCake chocolateCake){
        this.chocolateCake = chocolateCake;
    }

    @Override
    public void execute() {
        chocolateCakeStages.StageSeven();
    }
}
