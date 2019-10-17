public class SavingsAccount {
    static private double annualInterestRate;
    private double savingsBalance;

    public static void main (String[] args){
        SavingsAccount saver1;
        SavingsAccount saver2;
        int i;

        saver1 = new SavingsAccount (2000.00);
        saver2 = new SavingsAccount (3000.00);

        SavingsAccount.modifyInterestRate(0.04);

        System.out.println("Saver 1 balances at 4% interest");
        for (i = 0; i < 12; ++i){
            saver1.calculateMonthlyInterest();
            System.out.printf("Month %d: %.2f\n", (i+1), saver1.getSavingsBalance());
        }

        System.out.println();

        System.out.println("Saver 2 balances at 4% interest");
        for (i = 0; i < 12; ++i){
            saver2.calculateMonthlyInterest();
            System.out.printf("Month %d: %.2f\n", (i+1), saver2.getSavingsBalance());
        }

        System.out.println();

        SavingsAccount.modifyInterestRate(0.05);

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.println("Next month's saver balances at 5% interest");
        System.out.printf("Saver 1: %.2f\n", saver1.getSavingsBalance());
        System.out.printf("Saver 2: %.2f\n", saver2.getSavingsBalance());
    }

    public void calculateMonthlyInterest(){
        double monthlyInt;
        monthlyInt = (this.savingsBalance * annualInterestRate) / 12;
        this.savingsBalance = this.savingsBalance + monthlyInt;
    }

    public static void modifyInterestRate(double newVal){
        annualInterestRate = newVal;
    }

    public SavingsAccount(double savingsBalance){
        this.savingsBalance = savingsBalance;
    }

    public double getSavingsBalance(){
        return this.savingsBalance;
    }
}
