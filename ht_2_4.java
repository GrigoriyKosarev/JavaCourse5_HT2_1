/**
 * Created by admin on 10.11.2016.
 */
public class ht_2_4 {

    public static void main(String[] args) {

        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

        String ownerName = "Oww";
        int withdrawal = 100;

        fund(balances, ownerNames, ownerName, withdrawal);

    }

    public static void fund(int[] balances, String[] ownerNames, String ownerName, int withdrawal){

        for (int i = 0; i < (ownerNames.length); i++ ){
            if (ownerNames[i].equals(ownerName)) {
                int balance = balances[i]+withdrawal;
                System.out.println(ownerName + " " + balance);
                balances[i] = balance;
            }
        }

    }
}
