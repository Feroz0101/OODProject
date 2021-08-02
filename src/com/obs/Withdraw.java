package com.obs;
public class Withdraw {
   public void draw(int WD)
   {
            if (WD!=0)
            {
                CheckBalance.ammount=CheckBalance.ammount-WD;
                System.out.println("\n\t\t-----Withdraw Successful-------");

            }
            else
            {
                System.out.println("\n\t\t==== Nothing Update ====");
            }
       System.out.println("\n\t\tYour Update Main Balance:" +CheckBalance.ammount);
   }

}
