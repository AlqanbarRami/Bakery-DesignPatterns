package com.company.Menu;

import com.company.Builder.PrincessBuilder;
import com.company.Command.CakePipeline;
import com.company.Command.PrincessCakeCommand.StageEight;
import com.company.Command.PrincessCakeCommand.StageNine;
import com.company.Command.PrincessCakeCommand.StageSeven;
import com.company.Command.PrincessCakeCommand.StageSix;
import com.company.Models.PrincessCake;

import java.util.Scanner;

public class PrincessMenu  {


    public void PrincessCakeBaseStepsProcess(PrincessCake princessCake) {
        PrincessBuilder princessBuilder = new PrincessBuilder();
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
                        System.out.println(princessBuilder.BringCakeBase());
                        i++;
                        break;
                    case 2:
                        System.out.println(princessBuilder.SpreadVanillaCream());
                        i++;
                        break;
                    case 3:
                        System.out.println(princessBuilder.PutSecondCakeBase());
                        i++;
                        break;
                    case 4:
                        System.out.println(princessBuilder.SpreadSecondVanillaCream());
                        i++;
                        break;
                    case 5:
                        System.out.println(princessBuilder.PutThirdCakeBase());
                        System.out.println(princessBuilder.PrincessCakeBuild());
                        i++;
                        PrincessCakeBaseFinalStepsPrint();
                        PrincessCakeBaseFinalStepsProcess(princessCake);
                        continueMenu = false;
                        break;
                    default:
                        System.out.println("Input Fail!");

                }
            } else if (number == 6) {
                System.out.println(princessBuilder.BringCakeBase());
                System.out.println(princessBuilder.SpreadVanillaCream());
                System.out.println(princessBuilder.PutSecondCakeBase());
                System.out.println(princessBuilder.SpreadSecondVanillaCream());
                System.out.println(princessBuilder.PutThirdCakeBase());
                System.out.println(princessBuilder.PrincessCakeBuild());
                PrincessCakeBaseFinalStepsPrint();
                PrincessCakeBaseFinalStepsProcess(princessCake);
                continueMenu = false;
            } else if(number < i){
                System.out.println("Already Done!");
            }
        }

    }
    public void PrincessCakeBaseFinalStepsProcess( PrincessCake princessCake){
        CakePipeline cakePipeline =  new CakePipeline();
        boolean continueMenu = true;
        int i = 6;
        while (continueMenu) {
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            if (number != i && number != 10) {
                System.out.println("Please Stage By Stage Or Quick Access");
            } else if (number == i) {
                switch (number) {
                    case 6:
                        cakePipeline.PlaceCommand(new StageSix(princessCake));
                        cakePipeline.execute();
                        i++;
                        break;
                    case 7:
                        cakePipeline.PlaceCommand(new StageSeven(princessCake));
                        cakePipeline.execute();
                        i++;
                        break;

                    case 8:
                        cakePipeline.PlaceCommand(new StageEight(princessCake));
                        cakePipeline.execute();
                        i++;
                        break;

                    case 9:
                        cakePipeline.PlaceCommand(new StageNine(princessCake));
                        cakePipeline.execute();
                        i++;
                        continueMenu= false;
                        break;
                    default:
                        System.out.println("Input Fail!");

                }
            } else if (number == 10) {
                cakePipeline.PlaceCommand(new StageSix(princessCake));
                cakePipeline.PlaceCommand(new StageSeven(princessCake));
                cakePipeline.PlaceCommand(new StageEight(princessCake));
                cakePipeline.PlaceCommand(new StageNine(princessCake));
                cakePipeline.execute();
                continueMenu = false;

            }
        }
    }
    public void PrincessCakeBaseStepsPrint(){
        System.out.println("1- Bring a Cake Base");
        System.out.println("2- Spreading a layer of vanilla cream");
        System.out.println("3- Add Second Cake Base");
        System.out.println("4- Spread another layer of vanilla cream");
        System.out.println("5- Add Third Cake Base");
        System.out.println("6- Quick Access : All steps are ready!");
        System.out.println("Enter a number ex 3");
    }

    public void PrincessCakeBaseFinalStepsPrint(){
        System.out.println("6- Spread whipped cream on the cake so that it has a dome shape");
        System.out.println("7- Put the marzipan lid on the cake (green)");
        System.out.println("8- Garnish with marzipan rose");
        System.out.println("9- Powder Sugar Over The Cake");
        System.out.println("10- Quick Access : All steps are ready!");
    }
}
