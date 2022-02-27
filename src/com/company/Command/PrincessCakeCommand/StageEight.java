package com.company.Command.PrincessCakeCommand;

import com.company.Command.CakesCommand;
import com.company.Models.PrincessCake;


public class StageEight  implements CakesCommand {
    private PrincessCakeStages princessCakeStages = new PrincessCakeStages();
    private PrincessCake princessCake;

    public StageEight(PrincessCake princessCake){
        this.princessCake = princessCake;
    }

    @Override
    public void execute() {
        princessCakeStages.StageEight();
    }
}
