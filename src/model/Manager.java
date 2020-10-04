package model;

public class Manager extends Employee {

    private int employee;


    public Manager(String firstName, String lastName, int age, long salary, int employee) {
        super(firstName, lastName, age, salary);
        this.employee = employee;
    }



    public Manager(String firstName, String lastName, int employee) {
        super(firstName, lastName);
        this.employee = employee;
    }


    @Override
    public void salaryReview(long bonus){

        setSalary(getSalary() + (long)(1.4*bonus));
    }



    @Override
    public String toString() {
        return "Manager{" +
                "employee=" + employee +
                '}';
    }

    @Override
    protected void finalize() throws Throwable {

        System.out.println(" By by ");
        super.finalize();
    }

    public int getEmployee() {
        return employee;
    }

    public void setEmployee(int employee) {
        this.employee = employee;
    }
}
