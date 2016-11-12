/**
 * Created by admin on 10.11.2016.
 */
public class ht_2_3 {

    public static void main(String[] args) {

        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
        int comission = 5;

        String ownerName = "Ann";
        int withdrawal = 100;
        withdraw(balances, ownerNames, ownerName, withdrawal, comission);

        balances = new int[]{1200, 250, 2000, 500, 3200};
        ownerName = "Oww";
        withdrawal = 490;
        withdraw(balances, ownerNames, ownerName, withdrawal, comission);

    }

    public static void withdraw(int[] balances, String[] ownerNames, String ownerName, int withdrawal, int comission){

        int comissionPrice = (withdrawal/100*comission);
        int ballanceToWithdrawal = withdrawal + comissionPrice;

        for (int i = 0; i < (ownerNames.length); i++ ){
            if (ownerNames[i].endsWith(ownerName)) {
                int balance = balances[i];
                if (ballanceToWithdrawal <= balance){
                    System.out.println(ownerName + " " + withdrawal + " " +(balance-ballanceToWithdrawal));
                    balances[i] = balance-ballanceToWithdrawal;
                }
                else
                    System.out.println(ownerName + " NO");
            }
        }

    }

}


