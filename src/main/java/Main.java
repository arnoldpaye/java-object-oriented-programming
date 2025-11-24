public class Main {
  public static void main(String[] args) {
    BankAccount bankAccount = new BankAccount("Arnex", 999.89);

    System.out.println(bankAccount.getBalance());
    bankAccount.withdraw(12.5);
    bankAccount.deposit(18.1);

    System.out.println(bankAccount.getOwner());
    System.out.println(bankAccount.getBalance());
  }
}
