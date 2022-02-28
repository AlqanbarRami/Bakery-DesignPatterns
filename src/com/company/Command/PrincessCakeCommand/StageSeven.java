package com.company.Command.PrincessCakeCommand;

import com.company.Command.CakesCommand;
import com.company.Command.PrincessCakeCommand.PrincessCakeStages;
import com.company.Models.PrincessCake;

public class StageSeven  implements CakesCommand {
    private PrincessCakeStages princessCakeStages = new PrincessCakeStages();
    private PrincessCake princessCake;

    public StageSeven(PrincessCake princessCake){
        this.princessCake = princessCake;
    }

    @Override
    public void execute() {
        princessCake.setGreenMarzipanLid(true);
        princessCakeStages.StageSeven();
    }
}