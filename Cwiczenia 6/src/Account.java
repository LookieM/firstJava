public class Account {
    private int balance;
    private String owner;
    private String accountNumber;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Account(int balance, String owner, String accountNumber) {
        this.balance = balance;
        this.owner = owner;
        this.accountNumber = accountNumber;
    }

    public static class InsufficientFundsException extends Exception {
        public InsufficientFundsException(String message) {
            super(message);
        }
    }

    public void withdraw(int amount) throws InsufficientFundsException {
        if (balance < amount) {
            throw new InsufficientFundsException("Niewystarcajace srodki na koncie. Dostepne: " + balance +" żądane: " + amount);
        }
        balance -= amount;
    }

    public static void main(String[] args) {
        try {
            Account account = new Account(1500, "John", "Douglas");
            System.out.println(account.getBalance());

            account.withdraw(1000);
            System.out.println(account.getBalance());

            account.withdraw(1000);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
