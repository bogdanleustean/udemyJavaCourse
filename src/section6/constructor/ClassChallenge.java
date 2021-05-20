package section6.constructor;

public class ClassChallenge {

    private int accountNumber;
    private int balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public ClassChallenge(){
        System.out.println(" --->Empty constructor called<---");
    }


   public ClassChallenge(int accountNumber, int balance, String customerName, String email, int phoneNumber){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email= email;
        this.phoneNumber = phoneNumber;
       System.out.println("-> construnctor cu parama <-");
   }

    public ClassChallenge(String customerName, String email, int phoneNumber) {
       this(999, 390, "marinica","test@test.ro", 12345679);
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
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

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void deposit(int amount) {
        balance += amount;
        System.out.println("deposit of " + amount + "made. New balance is " + balance);
    }
    public void  withdraw(int refund) {
        if (balance - refund < 0) {
            System.out.println("only " + balance + " available . Withdrawal not processed");
        } else {
            balance -= refund;
            System.out.println("withdrawl of "+ refund +" processed. Remaining balance  "+ balance);
        }
    }
}
