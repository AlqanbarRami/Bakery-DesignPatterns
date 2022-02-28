package com.company.Menu;

import com.company.Builder.ChocolateBuilder;
import com.company.Command.CakePipeline;
import com.company.Command.ChocolateCakeCommand.StageEight;
import com.company.Command.ChocolateCakeCommand.StageSeven;
import com.company.Command.ChocolateCakeCommand.StageSix;
import com.company.Models.ChocolateCake;

import java.util.concurrent.TimeUnit;


public class ChocolateMenu {
    public void ChocolateCakeBaseStepsProcess(ChocolateCake chocolateCake) throws InterruptedException {
        ChocolateBuilder chocolateBuilder = new ChocolateBuilder();
        chocolateBuilder.BringChocolateCakeBase(chocolateCake);
        chocolateBuilder.SpreadRaspberryMousse(chocolateCake);
        chocolateBuilder.PutSecondChocolateCakeBase(chocolateCake);
        chocolateBuilder.SpreadSecondRaspberryMousse(chocolateCake);
        chocolateBuilder.PutThirdChocolateCakeBase(chocolateCake);
        chocolateBuilder.ChocolateCakeBuild();
        TimeUnit.SECONDS.sleep(2);
        ChocolateCakeBaseFinalStepsProcess(chocolateCake);

    }
    public void ChocolateCakeBaseFinalStepsProcess(ChocolateCake chocolateCake) throws InterruptedException {
        CakePipeline cakePipeline =  new CakePipeline();
                cakePipeline.PlaceCommand(new StageSix(chocolateCake));
                cakePipeline.PlaceCommand(new StageSeven(chocolateCake));
                cakePipeline.PlaceCommand(new StageEight(chocolateCake));
                cakePipeline.execute();
                TimeUnit.SECONDS.sleep(2);

               //This is just to show you now we have just one object , Variables Status after the order
                System.out.println(chocolateCake);

            }

}
