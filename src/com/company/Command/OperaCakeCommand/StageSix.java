package com.company.Command.OperaCakeCommand;


import com.company.Command.CakesCommand;
import com.company.Models.OperaCake;

public class StageSix implements CakesCommand {

    private OperaCakeStages operaCakeStages = new OperaCakeStages();
    private OperaCake operaCake;

    public StageSix(OperaCake operaCake){
        this.operaCake = operaCake;
    }

    @Override
    public void execute() {
        operaCakeStages.StageSix();
    }
}
