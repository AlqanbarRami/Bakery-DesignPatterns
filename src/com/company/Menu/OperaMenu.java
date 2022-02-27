package com.company.Menu;

import com.company.Builder.OperaBuilder;
import com.company.Command.CakePipeline;
import com.company.Command.OperaCakeCommand.StageEight;
import com.company.Command.OperaCakeCommand.StageNine;
import com.company.Command.OperaCakeCommand.StageSeven;
import com.company.Command.OperaCakeCommand.StageSix;
import com.company.Models.OperaCake;


import java.util.Scanner;

public class OperaMenu {

    public void OperaCakeBaseStepsProcess(OperaCake operaCake) {
        OperaBuilder operaBuilder = new OperaBuilder();
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
                        System.out.println(operaBuilder.BringCakeBase());
                        i++;
                        break;
                    case 2:
                        System.out.println(operaBuilder.SpreadVanillaCream());
                        i++;
                        break;
                    case 3:
                        System.out.println(operaBuilder.PutSecondCakeBase());
                        i++;
                        break;
                    case 4:
                        System.out.println(operaBuilder.SpreadRaspberryJam());
                        i++;
                        break;
                    case 5:
                        System.out.println(operaBuilder.PutThirdCakeBase());
                        System.out.println(operaBuilder.PrincessCakeBuild());
                        i++;
                        OperaCakeBaseFinalStepsPrint();
                        OperaCakeBaseFinalStepsProcess(operaCake);
                        continueMenu = false;
                        break;
                    default:
                        System.out.println("Input Fail!");

                }
            } else if (number == 6) {
                System.out.println(operaBuilder.BringCakeBase());
                System.out.println(operaBuilder.SpreadVanillaCream());
                System.out.println(operaBuilder.PutSecondCakeBase());
                System.out.println(operaBuilder.SpreadRaspberryJam());
                System.out.println(operaBuilder.PutThirdCakeBase());
                System.out.println(operaBuilder.PrincessCakeBuild());
                OperaCakeBaseFinalStepsPrint();
                OperaCakeBaseFinalStepsProcess(operaCake);
                continueMenu = false;
            } else if(number < i){
                System.out.println("Already Done!");
            }
        }

    }
    public void OperaCakeBaseFinalStepsProcess(OperaCake operaCake){
        CakePipeline cakePipeline =  new CakePipeline();
        int i = 6;
        boolean continueMenu = true;
        while (continueMenu) {
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            if (number != i && number != 10) {
                System.out.println("Please Stage By Stage Or Quick Access");
            } else if (number == i) {
                switch (number) {
                    case 6:
                        cakePipeline.PlaceCommand(new StageSix(operaCake));
                        cakePipeline.execute();
                        i++;
                        break;
                    case 7:
                        cakePipeline.PlaceCommand(new StageSeven(operaCake));
                        cakePipeline.execute();
                        i++;
                        break;
                    case 8:
                        cakePipeline.PlaceCommand(new StageEight(operaCake));
                        cakePipeline.execute();
                        i++;
                        break;
                    case 9:
                        cakePipeline.PlaceCommand(new StageNine(operaCake));
                        cakePipeline.execute();
                        i++;
                        continueMenu =false;
                        break;
                    default:
                        System.out.println("Input Fail!");

                }
            } else if (number == 10) {
                cakePipeline.PlaceCommand(new StageSix(operaCake));
                cakePipeline.PlaceCommand(new StageSeven(operaCake));
                cakePipeline.PlaceCommand(new StageEight(operaCake));
                cakePipeline.PlaceCommand(new StageNine(operaCake));
                cakePipeline.execute();
                continueMenu = false;

            }
        }
    }
    public void OperaCakeBaseStepsPrint(){
        System.out.println("1- Bring a Cake Base");
        System.out.println("2- Spreading a layer of vanilla cream");
        System.out.println("3- Add Second Cake Base");
        System.out.println("4- Spread a layer of raspberry Jam");
        System.out.println("5- Add Third Cake Base");
        System.out.println("6- Quick Access : All steps are ready!");
        System.out.println("Enter a number ex 3");
    }

    public void OperaCakeBaseFinalStepsPrint(){
        System.out.println("6- Spread whipped cream on the cake so that it has a dome shape");
        System.out.println("7- Put the marzipan lid on the cake (Pink)");
        System.out.println("8- Garnish with marzipan rose");
        System.out.println("9- Powder Sugar Over The Cake");
        System.out.println("10- Quick Access : All steps are ready!");
    }
}
