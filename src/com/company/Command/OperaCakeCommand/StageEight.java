package com.company.Command.OperaCakeCommand;

import com.company.Command.CakesCommand;
import com.company.Command.PrincessCakeCommand.PrincessCakeStages;
import com.company.Models.OperaCake;

public class StageEight implements CakesCommand {

    private OperaCakeStages operaCakeStages = new OperaCakeStages();
    private OperaCake operaCake;

    public StageEight(OperaCake operaCake){
        this.operaCake = operaCake;
    }

    @Override
    public void execute() {
        operaCakeStages.StageEight();
    }
}
