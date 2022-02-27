package com.company.Menu;

import com.company.Builder.ChocolateBuilder;
import com.company.Command.CakePipeline;
import com.company.Command.ChocolateCakeCommand.StageEight;
import com.company.Command.ChocolateCakeCommand.StageSeven;
import com.company.Command.ChocolateCakeCommand.StageSix;
import com.company.Models.ChocolateCake;


import java.util.Scanner;

public class ChocolateMenu {
    public void ChocolateCakeBaseStepsProcess(ChocolateCake chocolateCake) {
        ChocolateBuilder chocolateBuilder = new ChocolateBuilder();
        boolean continueMenu = true;
        int i = 1;
        while (continueMenu) {
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            if (number > i && number != 6) {
                System.out.println("Please Stage By Stage Or Quick Access");
            } else if (number == i) {
                switch (number) {
                    case 1:
                        System.out.println(chocolateBuilder.BringChocolateCakeBase());
                        i++;
                        break;
                    case 2:
                        System.out.println(chocolateBuilder.SpreadRaspberryMousse());
                        i++;
                        break;
                    case 3:
                        System.out.println(chocolateBuilder.PutSecondChocolateCakeBase());
                        i++;
                        break;
                    case 4:
                        System.out.println(chocolateBuilder.SpreadSecondRaspberryMousse());
                        i++;
                        break;
                    case 5:
                        System.out.println(chocolateBuilder.PutThirdChocolateCakeBase());
                        System.out.println(chocolateBuilder.ChocolateCakeBuild());
                        i++;
                        ChocolateCakeBaseFinalStepsPrint();
                        ChocolateCakeBaseFinalStepsProcess(chocolateCake);
                        continueMenu = false;
                        break;
                    default:
                        System.out.println("Input Fail!");

                }
            } else if (number == 6) {
                System.out.println(chocolateBuilder.BringChocolateCakeBase());
                System.out.println(chocolateBuilder.SpreadRaspberryMousse());
                System.out.println(chocolateBuilder.PutSecondChocolateCakeBase());
                System.out.println(chocolateBuilder.SpreadSecondRaspberryMousse());
                System.out.println(chocolateBuilder.PutThirdChocolateCakeBase());
                System.out.println(chocolateBuilder.ChocolateCakeBuild());
                ChocolateCakeBaseFinalStepsPrint();
                ChocolateCakeBaseFinalStepsProcess(chocolateCake);
                continueMenu = false;
            } else if(number < i){
                System.out.println("Already Done!");
            }
        }

    }
    public void ChocolateCakeBaseFinalStepsProcess(ChocolateCake chocolateCake){
        CakePipeline cakePipeline =  new CakePipeline();
        boolean continueMenu = true;
        int i = 6;
        while (continueMenu) {
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            if (number != i && number != 9) {
                System.out.println("Please Stage By Stage Or Quick Access");
            } else if (number == i) {
                switch (number) {
                    case 6:
                        cakePipeline.PlaceCommand(new StageSix(chocolateCake));
                        cakePipeline.execute();
                        i++;
                        break;
                    case 7:
                        cakePipeline.PlaceCommand(new StageSeven(chocolateCake));
                        cakePipeline.execute();
                        i++;
                        break;
                    case 8:
                        cakePipeline.PlaceCommand(new StageEight(chocolateCake));
                        cakePipeline.execute();
                        continueMenu = false;
                        i++;
                        break;
                    default:
                        System.out.println("Input Fail!");

                }
            } else if (number == 9) {
                cakePipeline.PlaceCommand(new StageSix(chocolateCake));
                cakePipeline.PlaceCommand(new StageSeven(chocolateCake));
                cakePipeline.PlaceCommand(new StageEight(chocolateCake));
                cakePipeline.execute();
                continueMenu = false;

            }
        }
    }
    public void ChocolateCakeBaseStepsPrint(){
        System.out.println("1- Bring a Cake Base");
        System.out.println("2- Spreading a layer of Raspberry Mousse");
        System.out.println("3- Add Second Chocolate Cake Base");
        System.out.println("4- Spreading another layer of Raspberry Mousse");
        System.out.println("5- Add Third Chocolate Cake Base");
        System.out.println("6- Quick Access : All steps are ready!");
        System.out.println("Enter a number ex 3");
    }

    public void ChocolateCakeBaseFinalStepsPrint(){
        System.out.println("6- Fill the cake with chocolate buttercream");
        System.out.println("7- Pour chocolate ganache on the cake");
        System.out.println("8- Garnish with raspberries");
        System.out.println("9- Quick Access : All steps are ready!");
    }
}
