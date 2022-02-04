import java.math.BigDecimal;
import java.util.List;

public class MainProcess
{
    public static void main(String[] args)
    {
        var company001 = new Company("MicroFox", new BankAccount(3216_8975_4561_7418L, 500_000));
        var company002 = new Company("MicroMic", new BankAccount(3216_8975_4561_7419L, 600_000));
        var company003 = new Company("MicroTik", new BankAccount(3216_8975_4561_7421L, 700_000));

        company001.addEmployee(new Employee(1,"Jhon","HR", BigDecimal.valueOf(800),new BankAccount(3216_8975_4561_7420L, 0)));
        company001.addEmployee(new Employee(2,"Bob","IT", BigDecimal.valueOf(1000),new BankAccount(3216_8975_4561_7422L, 0)));
        company001.addEmployee(new Employee(3,"Jack","Marketing", BigDecimal.valueOf(1000),new BankAccount(3216_8975_4561_7423L, 0)));
        company001.addEmployee(new Employee(4,"Bill","Research", BigDecimal.valueOf(1200),new BankAccount(3216_8975_4561_7424L, 0)));
        company001.addEmployee(new Employee(5,"Rouse","Manager", BigDecimal.valueOf(2000),new BankAccount(3216_8975_4561_7425L, 0)));
        company001.addEmployee(new Employee(6,"Andy","Finance", BigDecimal.valueOf(1500),new BankAccount(3216_8975_4561_7426L, 0)));
        company001.addEmployee(new Employee(7,"Ray","Procurement", BigDecimal.valueOf(1600),new BankAccount(3216_8975_4561_7427L, 0)));

        company002.addEmployee(new Employee(8,"Joshua","HR", BigDecimal.valueOf(800),new BankAccount(3216_8975_4561_7428L, 0)));
        company002.addEmployee(new Employee(9,"Bony","IT", BigDecimal.valueOf(1000),new BankAccount(3216_8975_4561_7429L, 0)));
        company002.addEmployee(new Employee(10,"Jill","Marketing", BigDecimal.valueOf(1000),new BankAccount(3216_8975_4561_7430L, 0)));
        company002.addEmployee(new Employee(11,"Steve","Research", BigDecimal.valueOf(1200),new BankAccount(3216_8975_4561_7431L, 0)));
        company002.addEmployee(new Employee(12,"Rene","Manager", BigDecimal.valueOf(2000),new BankAccount(3216_8975_4561_7432L, 0)));
        company002.addEmployee(new Employee(13,"Alex","Finance", BigDecimal.valueOf(1500),new BankAccount(3216_8975_4561_7433L, 0)));
        company002.addEmployee(new Employee(14,"J.Joe","Procurement", BigDecimal.valueOf(1600),new BankAccount(3216_8975_4561_7434L, 0)));

        company003.addEmployee(new Employee(15,"Stan","HR", BigDecimal.valueOf(800),new BankAccount(3216_8975_4561_7435L, 0)));
        company003.addEmployee(new Employee(16,"Shah","IT", BigDecimal.valueOf(1000),new BankAccount(3216_8975_4561_7436L, 0)));
        company003.addEmployee(new Employee(17,"Gems","Marketing", BigDecimal.valueOf(1000),new BankAccount(3216_8975_4561_7437L, 0)));
        company003.addEmployee(new Employee(18,"Henry","Research", BigDecimal.valueOf(1200),new BankAccount(3216_8975_4561_7438L, 0)));
        company003.addEmployee(new Employee(19,"Russo","Manager", BigDecimal.valueOf(2000),new BankAccount(3216_8975_4561_7439L, 0)));
        company003.addEmployee(new Employee(20,"Alejandro","Finance", BigDecimal.valueOf(1500),new BankAccount(3216_8975_4561_7440L, 0)));
        company003.addEmployee(new Employee(21,"Randy","Procurement", BigDecimal.valueOf(1600),new BankAccount(3216_8975_4561_7441L, 0)));



        System.out.println(company001.toString());
        //System.out.println(company002.toString());
        //System.out.println(company003.toString());

    }
}
