package com.obs;
public class deposit {
    public void add(int plus)
    {

        if (plus!=0){
            CheckBalance.ammount=CheckBalance.ammount+plus;
            System.out.println("\n\t\t-----Deposit Successful-------");
        }else
        {
            System.out.println("\n\t\t==== Nothing Update ====");
        }
        System.out.println("\n\t\tYour Update Main Balance:"+CheckBalance.ammount);


    }
}
