public class Main {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();
        myAccount.withdrawFunds(100.0);
        myAccount.depositFunds(250);
        myAccount.withdrawFunds(100.0);
       // BankAccount.fundsFromAccount();
    }
}
