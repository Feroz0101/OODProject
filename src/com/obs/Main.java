package com.obs;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\n\t\t---Welcome TO Online Banking System---");
        System.out.print("Enter Your Name:");
        String Name=input.nextLine();
        System.out.print("Enter Your Pin Number:");
        int Pin=input.nextInt();
        System.out.println("\t\t------------------");
        System.out.println("\t\tLog In Successful");
        System.out.println("\t\t------------------");
        System.out.println("\n\t\tWelcome "+Name);

        int be;
        do {
            System.out.println("\t\t****Our Features: ****");
            System.out.println("\t\t1.Check Balance");
            System.out.println("\t\t2. Deposit Money");
            System.out.println("\t\t3. Withdraw Money");
            System.out.println("\t\t4. Transfer Money");
            System.out.println("\t\t5. Exit");
            System.out.print("==> Choose Any:");
            int num=input.nextInt();

            switch (num) {
                case 1:
                    CheckBalance New1 = new CheckBalance();

                    New1.Balance();


                    break;
                case 2:
                    deposit New2 = new deposit();
                    depositView New02 =new depositView();
                    System.out.println("-----Deposit Money-------");
                    System.out.print("Enter Your Deposit Money:");
                    int plus=input.nextInt();
                    New02.add(plus);


                    break;

                case 3:
                    Withdraw New3 = new Withdraw();
                    System.out.println("-----Withdraw Money-------");
                    System.out.print("Enter Amount  Your Withdraw Money:");
                    int WD=input.nextInt();
                    New3.draw(WD);
                    break;
                case 4:
                    Transfer New4 = new Transfer();
                    System.out.println("-----Transfer Money-------");
                    System.out.print("Enter Amount  Your Transfer Money:");
                    int TM=input.nextInt();
                    New4.trans(TM);
                    break;
                case 5:
                    System.out.println("You Choose Exit\tThank You");
                    break;
                default:
                    System.out.println("Try Again");
            }
            System.out.println("Are You Go to Back(1) or Exit(0): ");
             be = input.nextInt();

        }while(be==1);

    }
}
