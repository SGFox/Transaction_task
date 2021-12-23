import java.math.BigDecimal;

//iban - card number
//balance - balance
//increaseBalance(BigDecimal) - take from one account and give another one
//decreaseBalance(BigDecimal)

public class BankAccount
{
    private long iban;                                   // = 3216_8975_4561_7418L;
    private double balance;                              // = 541.80;

    public void Account(long iban, double balance)
    {
        this.iban = iban;
        System.out.println("\nAccount iban number: " + iban);
        this.balance = balance;
        System.out.println("Balance: " + balance);
    }

//    increaseBalance(BigDecimal)
//    {
//
//    }

//    decreaseBalance(BigDecimal)
//    {
//
//    }
}
