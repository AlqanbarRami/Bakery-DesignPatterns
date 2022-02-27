package com.company.Command.PrincessCakeCommand;

import com.company.Command.CakesCommand;
import com.company.Command.PrincessCakeCommand.PrincessCakeStages;
import com.company.Models.PrincessCake;

public class StageNine implements CakesCommand {
    private PrincessCakeStages princessCakeStages = new PrincessCakeStages();
    private PrincessCake princessCake;

    public StageNine(PrincessCake princessCake){
        this.princessCake = princessCake;
    }

    @Override
    public void execute() {
        princessCakeStages.StageNine();
        princessCake.setCakeStatus("Done");
    }
}
