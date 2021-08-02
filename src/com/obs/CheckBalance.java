package com.obs;

public class CheckBalance {
    private int mainBlance=10000;
    public static int ammount;
    public void Balance()
    {
        ammount = mainBlance;
        System.out.println("\n\t\t------Check Balance------\n");
        System.out.println("\n\t\t\tYour Total Balance is");
        System.out.println("\n\t\t\t==> "+this.mainBlance);

    }

}
