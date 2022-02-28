package com.company.Command.PrincessCakeCommand;

import com.company.Command.CakesCommand;
import com.company.Models.PrincessCake;

public class StageNine implements CakesCommand {
    private PrincessCakeStages princessCakeStages = new PrincessCakeStages();
    private PrincessCake princessCake;

    public StageNine(PrincessCake princessCake){
        this.princessCake = princessCake;
    }

    @Override
    public void execute() {
        princessCake.setPowderSugar(true);
        princessCakeStages.StageNine();
        princessCake.setCakeStatus("Done");
    }
}
