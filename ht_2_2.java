/**
 * Created by Ruslan on 10.11.2016.
 */
public class ht_2_2 {
    public static void main(String[] args) {

        double balance = 100;
        double withdrawal = 10;
        double comission = 5;

        withdrawal(balance, withdrawal, comission);

        balance = 100;
        withdrawal = 99;

        withdrawal(balance, withdrawal, comission);

    }

    public static void withdrawal(double balance, double withdrawal, double comission){

        double comissionPrice = (withdrawal/100*comission);
        double ballanceToWithdrawal = withdrawal + comissionPrice;

        if (ballanceToWithdrawal <= balance){
            System.out.println("OK " + comissionPrice + " " + (balance-ballanceToWithdrawal));
        }
        else {
            System.out.println("NO");
        }

    }
}
