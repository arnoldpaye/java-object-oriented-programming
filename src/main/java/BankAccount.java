public class BankAccount {
  // attributes
  private String owner;
  private double balance;

  // getters
  public String getOwner() {
    return owner;
  }

  public double getBalance() {
    return balance;
  }

  // constructor
  public BankAccount(String owner, double startingBalance) {
    this.owner = owner;
    this.balance = Math.max(startingBalance, 0);
  }

  // behaviors
  public double withdraw(double amount) {
    if (amount <= this.balance) {
      this.balance -= amount;
      return amount;
    }
    return 0;
  }

  public double deposit(double amount) {
    if (amount > 0) {
      this.balance += amount;
      return amount;
    }
    return 0;
  }
}
