package com.company.Menu;


import com.company.Models.ChocolateCake;
import com.company.Models.Customer;
import com.company.Models.OperaCake;
import com.company.Models.PrincessCake;
import com.company.Observer.VdControl;
import com.company.SalesManager.SalesManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    PrincessMenu princessMenu = new PrincessMenu();
    OperaMenu operaMenu = new OperaMenu();
    ChocolateMenu chocolateMenu = new ChocolateMenu();
    List<SalesManager> orderHistory = new ArrayList<SalesManager>();
    String name;

    static int id = 0;



    public void Start() {
        boolean continueMenu = true;
        while (continueMenu) {
        System.out.println("Enter your name : ");
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();

            System.out.println("Please choose one : ");
            System.out.println("1- Princess Cake");
            System.out.println("2- Opera Cake");
            System.out.println("3- Chocolate Cake");
            System.out.println("\nEnter number ex 1 ");
            Scanner ChooseCake = new Scanner(System.in);
            String number = ChooseCake.nextLine();
            switch (number) {
                case "1":
                    NewOrder("Princess");
                    break;
                case "2":
                    NewOrder("opera");
                    break;
                case "3":
                    NewOrder("chocolate");

                    break;
                default:
                    System.out.println("Input Fail!");

            }
        }
    }



    public void NewOrder(String CakeName){
        VdControl vdControl = new VdControl();
        PrincessCake princessCake = new PrincessCake();
        OperaCake operaCake = new OperaCake();
        ChocolateCake chocolateCake = new ChocolateCake();
        SalesManager salesManager;
        Customer customer = new Customer();
        customer.setId(++id);
        customer.setName(name);
        switch (CakeName.toLowerCase()){
            case "princess":
                princessCake.addPropertyChangeListener(vdControl);
                princessCake.setCakeStatus("Order -> Princess");
                princessMenu.PrincessCakeBaseStepsPrint();
                princessMenu.PrincessCakeBaseStepsProcess(princessCake);
                salesManager = new SalesManager(customer.getId(),customer.getName(),princessCake.getId(),princessCake.getName());
                orderHistory.add(salesManager);
                break;
            case "opera":
                operaCake.addPropertyChangeListener(vdControl);
                operaCake.setCakeStatus("Order -> Opera");
                operaMenu.OperaCakeBaseStepsPrint();
                operaMenu.OperaCakeBaseStepsProcess(operaCake);
                salesManager = new SalesManager(customer.getId(),customer.getName(),operaCake.getId(),operaCake.getName());
                orderHistory.add(salesManager);
                break;
            case "chocolate":
                chocolateCake.addPropertyChangeListener(vdControl);
                chocolateCake.setCakeStatus("Order -> Chocolate");
                chocolateMenu.ChocolateCakeBaseStepsPrint();
                chocolateMenu.ChocolateCakeBaseStepsProcess(chocolateCake);
                salesManager = new SalesManager(customer.getId(),customer.getName(),chocolateCake.getId(),chocolateCake.getName());
                orderHistory.add(salesManager);
                break;
            default:
                System.out.println("Something Wrong");
                break;
        }
        for (SalesManager salesManager1 : orderHistory){
            System.out.println(salesManager1);
        }
    }



}