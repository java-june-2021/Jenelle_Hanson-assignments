import java.util.Random;
public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount();
        BankAccount bankAccount2 = new BankAccount();

        bankAccount1.myAcct(1000, 5000);
        bankAccount1.depositChecking(9000);
        bankAccount1.withdraw(500);

        bankAccount2.myAcct(10676, 20564);
        bankAccount2.depositSaving(1546);
        bankAccount2.withdraw(20000);
    }
}
