import java.util.Random;
public class BankAccount {
    protected String accountNum;
    private double checkingBal;
    private double savingBal;
    protected static int numOfAcctCreated;
    protected static double totalAmtInBank;
    
    private String createRandomNum() {
        Random rand = new Random();
        String finalAcctNum = "";
        for(int i = 0; i < 10; i++){
            int randomNum = rand.nextInt(10);
            finalAcctNum += Integer.toString(randomNum);
        }
        System.out.println("Account Number: " + finalAcctNum);
        return finalAcctNum;
    }

    //constructor
    public void myAcct(double checkingBal, double savingBal) {
        this.accountNum = createRandomNum();
        this.checkingBal = checkingBal;
        this.savingBal = savingBal;
        numOfAcctCreated++;
    }

    //
    public void depositChecking(double deposit){
        System.out.println("Amount in Checking: " + this.getCheckingBal() + " Amount in Saving: " + this.getSavingBal());
        this.setCheckingBal(this.getCheckingBal() + deposit);
        System.out.println("Deposit Amount: " + deposit);
        System.out.println("Checking After Deposit: " + this.getCheckingBal());
        totalAmtInBank += deposit;
        viewAccount();
    }

    public void depositSaving(double deposit){
        System.out.println("Amount in Checking: " + this.getCheckingBal() + " Amount in Saving: " + this.getSavingBal());
        this.setSavingBal(this.getSavingBal() + deposit);
        System.out.println("Deposit Amount: " + deposit);
        System.out.println("Savings After Deposit: " + this.getSavingBal());
        totalAmtInBank += deposit;
        viewAccount();
    }

    //
    public void withdraw(double withdraw){
        if(withdraw <= this.getCheckingBal()) {
            this.setCheckingBal(this.getCheckingBal() - withdraw);
            System.out.println("You withdrew: " + withdraw + ". Remaining funds: " + this.getCheckingBal());
            totalAmtInBank -= withdraw;
            viewAccount();
        } else {
            System.out.println("You have insufficient funds");
            viewAccount();
        }
    }

    public void viewAccount(){
        totalAmtInBank = this.getCheckingBal() + this.getSavingBal();
        System.out.println("Total in Bank: " + totalAmtInBank);
    }


    //getters and setters

    public double getCheckingBal() {
        return this.checkingBal;
    }

    public void setCheckingBal(double checking) {
        this.checkingBal = checking;
    }
    

    public double getSavingBal() {
        return this.savingBal;
    }

    public void setSavingBal(double saving) {
        this.savingBal = saving;
    }
}
