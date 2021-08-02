package com.obs;
public class Transfer {
    public void trans(int TM){
        if(TM !=0)
        {
            CheckBalance.ammount=CheckBalance.ammount-TM;
            System.out.println("\n\t\t-----Transfer Successful-------");

        }
        else
        {
            System.out.println("\n\t\t==== Nothing Update ====");
        }
        System.out.println("\n\t\tYour Update Main Balance:" +CheckBalance.ammount);
    }
}
