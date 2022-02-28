package com.company.Menu;

import com.company.Builder.PrincessBuilder;
import com.company.Command.CakePipeline;
import com.company.Command.PrincessCakeCommand.StageEight;
import com.company.Command.PrincessCakeCommand.StageNine;
import com.company.Command.PrincessCakeCommand.StageSeven;
import com.company.Command.PrincessCakeCommand.StageSix;
import com.company.Models.PrincessCake;

import java.util.concurrent.TimeUnit;


public class PrincessMenu  {


    public void PrincessCakeBaseStepsProcess(PrincessCake princessCake) throws InterruptedException {
        PrincessBuilder princessBuilder = new PrincessBuilder();
                        princessBuilder.BringCakeBase(princessCake);
                        princessBuilder.SpreadVanillaCream(princessCake);
                        princessBuilder.PutSecondCakeBase(princessCake);
                        princessBuilder.SpreadSecondVanillaCream(princessCake);
                        princessBuilder.PutThirdCakeBase(princessCake);
                        princessBuilder.PrincessCakeBuild();
                        TimeUnit.SECONDS.sleep(2);
                        PrincessCakeBaseFinalStepsProcess(princessCake);
    }

    public void PrincessCakeBaseFinalStepsProcess( PrincessCake princessCake) throws InterruptedException {
        CakePipeline cakePipeline =  new CakePipeline();
                cakePipeline.PlaceCommand(new StageSix(princessCake));
                cakePipeline.PlaceCommand(new StageSeven(princessCake));
                cakePipeline.PlaceCommand(new StageEight(princessCake));
                cakePipeline.PlaceCommand(new StageNine(princessCake));
                cakePipeline.execute();
                TimeUnit.SECONDS.sleep(2);

                //This is just to show you now we have just one object , Variables Status after the order
                System.out.println(princessCake);
     }

}
