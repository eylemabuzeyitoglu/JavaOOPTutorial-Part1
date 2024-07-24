public class BankAccount {
    private String accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private String phone;

    public BankAccount(){
        this("1234",900.0,"Eylem","myemail@email.com","555 555 55 55");
        System.out.println("Emp ty constructor called");
    }
    public BankAccount(String accountNumber,double accountBalance,String customerName,String email,String phone){
        System.out.println("Acoount constructor with parameters called");
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.email = email;
        this.phone = phone;
    }
    public void depositFunds(double depositAmount){
      accountBalance += depositAmount;
        System.out.println("Deposit of $" + depositAmount + "made. New balance is $"+ accountBalance);
    }



    public void withdrawFunds(double withdrawalAmount){
        if(accountBalance - withdrawalAmount < 0){
            System.out.println("Insufficient Funds");
        }else{
            accountBalance -= withdrawalAmount;
            System.out.println("Withdrawal of $" + withdrawalAmount + "processed, Remaining balance =? $" + accountBalance);
        }
    }


    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


}
