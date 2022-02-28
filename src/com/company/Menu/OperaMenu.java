package com.company.Menu;

import com.company.Builder.OperaBuilder;
import com.company.Command.CakePipeline;
import com.company.Command.OperaCakeCommand.StageEight;
import com.company.Command.OperaCakeCommand.StageNine;
import com.company.Command.OperaCakeCommand.StageSeven;
import com.company.Command.OperaCakeCommand.StageSix;
import com.company.Models.OperaCake;


import java.util.concurrent.TimeUnit;

public class OperaMenu {

    public void OperaCakeBaseStepsProcess(OperaCake operaCake) throws InterruptedException {
        OperaBuilder operaBuilder = new OperaBuilder();
                operaBuilder.BringCakeBase(operaCake);
                operaBuilder.SpreadVanillaCream(operaCake);
                operaBuilder.PutSecondCakeBase(operaCake);
                operaBuilder.SpreadRaspberryJam(operaCake);
                operaBuilder.PutThirdCakeBase(operaCake);
                operaBuilder.PrincessCakeBuild();
                TimeUnit.SECONDS.sleep(2);
                OperaCakeBaseFinalStepsProcess(operaCake);


    }
    public void OperaCakeBaseFinalStepsProcess(OperaCake operaCake) throws InterruptedException {
        CakePipeline cakePipeline =  new CakePipeline();
                cakePipeline.PlaceCommand(new StageSix(operaCake));
                cakePipeline.PlaceCommand(new StageSeven(operaCake));
                cakePipeline.PlaceCommand(new StageEight(operaCake));
                cakePipeline.PlaceCommand(new StageNine(operaCake));
                cakePipeline.execute();
                TimeUnit.SECONDS.sleep(2);

                //This is just to show you now we have just one object , Variables Status after the order
                System.out.println(operaCake);
             }

}
