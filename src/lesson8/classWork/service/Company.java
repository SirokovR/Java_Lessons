package lesson8.classWork.service;

import model.Employee;

public class Company {
    private Employee[] employees;

    public Company(Employee[] employees) {
        this.employees = employees;
    }


    public Employee getWithMaxSalary(){
        Employee result = employees[0];
        for (Employee employee: employees){
            if(employee.getSalary() > result.getSalary()){
                result = employee;
            }

        }
        return  result;
    }


    public Employee getWithMinSalary(){
        Employee result = employees[0];
        for (Employee employee: employees){
            if(employee.getSalary() < result.getSalary()){
                result = employee;
            }

        }
        return  result;
    }




    public void salaryReview(){
        long bonus = 0;
        for (Employee employee: employees){
            employee.setSalary(employee.getSalary() + bonus);
        }

    }

}
