package com.company.Menu;

import com.company.Builder.ChocolateBuilder;
import com.company.Command.CakePipeline;
import com.company.Command.ChocolateCakeCommand.StageEight;
import com.company.Command.ChocolateCakeCommand.StageSeven;
import com.company.Command.ChocolateCakeCommand.StageSix;
import com.company.Models.ChocolateCake;

import java.util.concurrent.TimeUnit;


public class ChocolateMenu {
    public ChocolateCake ChocolateCakeBaseStepsProcess() throws InterruptedException {
        ChocolateBuilder chocolateBuilder = new ChocolateBuilder();
        chocolateBuilder.BringChocolateCakeBase();
        chocolateBuilder.SpreadRaspberryMousse();
        chocolateBuilder.PutSecondChocolateCakeBase();
        chocolateBuilder.SpreadSecondRaspberryMousse();
        chocolateBuilder.PutThirdChocolateCakeBase();
        ChocolateCake chocolateCake = chocolateBuilder.ChocolateCakeBuild();
        TimeUnit.SECONDS.sleep(2);
        return chocolateCake;

    }
    public void ChocolateCakeBaseFinalStepsProcess(ChocolateCake chocolateCake) throws InterruptedException {
        CakePipeline cakePipeline =  new CakePipeline();
                cakePipeline.PlaceCommand(new StageSix(chocolateCake));
                cakePipeline.PlaceCommand(new StageSeven(chocolateCake));
                cakePipeline.PlaceCommand(new StageEight(chocolateCake));
                cakePipeline.execute();
                TimeUnit.SECONDS.sleep(2);

            }

}
