package com.company.Command.OperaCakeCommand;

import com.company.Command.CakesCommand;
import com.company.Models.OperaCake;

public class StageNine implements CakesCommand {
    private OperaCakeStages operaCakeStages = new OperaCakeStages();
    private OperaCake operaCake;

    public StageNine(OperaCake operaCake){
        this.operaCake = operaCake;
    }

    @Override
    public void execute() {
        operaCakeStages.StageNine();
        operaCake.setCakeStatus("Done");
    }
}
