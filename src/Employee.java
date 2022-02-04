import java.math.BigDecimal;
import java.util.*;

//        int id; - employee id
//        String name; - employee name
//        String department; - employee department
//        BigDecimal salary; - employee salary
//        BankAccount account; - employee account
//        void paySalary()  - increase current salary

public class Employee
{
    private int id;
    private String name;
    private String department;
    private BigDecimal salary;
    private BankAccount account;

    public Employee(int id, String name, String department, BigDecimal salary, BankAccount account) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.account = account;
    }

    @Override
    public String toString() {
        return "\nEmployee: " + "[ ID: " + id + ", Name: " + name +
                ", Department: " + department + ", Salary: " + salary +
                ", " + account + " ]";
    }

    public double paySalary()                //current salary
    {
        account.setBalance(BigDecimal.valueOf(account.getBalance()).add(salary));
        return account.getBalance();
    }
}
