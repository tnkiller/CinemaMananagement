package Model;

import java.text.ParseException;
import java.util.Date;

public class Employee extends Person{
    private double salary;

    public Employee(String userName, String password, String lastName, String firstName, String address, String phoneNum, String dob, double salary) throws ParseException {
        super(userName, password, lastName, firstName, address, phoneNum, dob);
        this.salary = salary;
        
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    
    
}
