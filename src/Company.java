import java.util.*;

//NAME - company name
//ACCOUNT - company account
//EMPLOYEE - how work in company
//paySalaries(List<Employee>) - pay salary to employee from company account

public class Company
{
    private String companyName;
    private BankAccount companyAccount;
    private List<Employee> employees;

    public Company(String companyName, BankAccount companyAccount) {
        this.companyName = companyName;
        this.companyAccount = companyAccount;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee){
        this.employees.add(employee);
    }

    @Override
    public String toString() {
        return "\nCompany Name: " + companyName + "\n" +
                companyAccount + "\n" +
                "Employees: " + employees;
    }
}
