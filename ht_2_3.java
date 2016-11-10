/**
 * Created by admin on 10.11.2016.
 */
public class ht_2_3 {

    public static void main(String[] args) {

        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
        double comission = 5;

        String ownerName = "Ann";
        double withdrawal = 100;
        withdraw(balances, ownerNames, ownerName, withdrawal, comission);

        ownerName = "Oww";
        withdrawal = 490;
        withdraw(balances, ownerNames, ownerName, withdrawal, comission);

    }

    public static void withdraw(int[] balances, String[] ownerNames, String ownerName, double withdrawal, double comission){

        double comissionPrice = (withdrawal/100*comission);
        double ballanceToWithdrawal = withdrawal + comissionPrice;

        for (int i = 0; i < (ownerNames.length); i++ ){
            if (ownerNames[i] == ownerName) {
                int balance = balances[i];
                if (ballanceToWithdrawal <= balance)
                    System.out.println(ownerName + " " + withdrawal + " " +(balance-ballanceToWithdrawal));
                else
                    System.out.println(ownerName + " NO");
            }
        }

    }

}


