package com.company.Command.PrincessCakeCommand;

import com.company.Command.CakesCommand;
import com.company.Command.PrincessCakeCommand.PrincessCakeStages;
import com.company.Models.PrincessCake;

public class StageSix implements CakesCommand {
    private PrincessCakeStages princessCakeStages = new PrincessCakeStages();
    private PrincessCake princessCake;

    public StageSix(PrincessCake princessCake){
        this.princessCake = princessCake;
    }

    @Override
    public void execute() {
        princessCake.setWhippedCream(true);
        princessCakeStages.StageSix();
    }
}
