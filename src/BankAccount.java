import java.math.BigDecimal;

//iban - card number
//balance - balance
//increaseBalance(BigDecimal) - take from one account and give another one
//decreaseBalance(BigDecimal)

public class BankAccount
{
    private long iban;                                   // = 3216_8975_4561_7418L;
    private double balance;                              // = 541.80;

    public BankAccount(long iban, double balance)
    {
        this.iban = iban;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance.doubleValue();
    }

    @Override
    public String toString() {
        return "Bank Account: " + "[ IBAN: " + iban + " , Balance: " + balance + " ]";
    }
}
