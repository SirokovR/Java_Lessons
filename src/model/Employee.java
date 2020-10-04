package model;

import utilities.RandomUtils;

public abstract class Employee {
    protected String firstName;
    protected String lastName;
    protected int age;
    protected long salary;


    public Employee(String firstName, String lastName) {
        this(
                firstName,
                lastName,
                RandomUtils.getRandomFromRange(18,65),
                RandomUtils.getRandomFromRange(80_000, 150_000));
    }

    //вверху через this мы вызываем нижний конструктор. и передаем в него значение вместе с параметрами которые мы сгенерировали сами

    public Employee(String firstName, String lastName, int age, long salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }


    //public Employee(){}


    public  abstract void salaryReview(long bonus);   //имплеминтировать во всех классах.  Мы в Коммпанни делаем salaryReview() но для всех классов будет своя логика.





    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }




    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;

        Employee employee = (Employee) o;

        if (age != employee.age) return false;
        if (salary != employee.salary) return false;
        if (!firstName.equals(employee.firstName)) return false;
        return lastName.equals(employee.lastName);
    }

    @Override
    public int hashCode() {
        int result = firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        result = 31 * result + age;
        result = 31 * result + (int) (salary ^ (salary >>> 32));
        return result;
    }
}
