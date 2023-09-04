package TaskonLesson2;

public class CreditAccount extends Account implements Transferable{

    private double creditLimit;

    public CreditAccount(String name, double balance, double creditLimit) {
        super(name, balance);
        if (balance < 0) {
            this.creditLimit = creditLimit;
        }
    }

    @Override
    public void transfer(Account destination, double amount) {
        super.setBalance(super.getBalance() - amount);
        destination.setBalance(destination.getBalance() + amount);
    }
}
