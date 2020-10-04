package lesson8.classWork;

import lesson8.classWork.service.Company;
import model.Accouter;
import model.Employee;
import model.Manager;
import model.Programmer;

public class Main {
    public static void main(String[] args) {

        Employee manager = new Manager("joe", "do", 32, 50_000,6);
        System.out.println(manager.getSalary());
        manager.salaryReview(500);
        System.out.println(manager.getSalary());
        System.out.println();

        Employee programmer = new Programmer("Anna","Annika",new String[]{"Python"});
        System.out.println(programmer.getSalary());
        programmer.salaryReview(500);
        System.out.println(programmer.getSalary());

//        Employee programmer = new Programmer("Joe","Do",new String[]{"Java"});
//        Employee manager = new Manager("Chuk", "Norris",50);
//        Employee accouter = new Accouter("Kat", "Kat", "Marketing");
//
//        Company bt = new Company((new Employee[]{programmer,manager,accouter}));
//
//        Employee rich = bt.getWithMaxSalary();
//        System.out.println(" Richest is: " + rich);
//
//        Employee lowestSalary = bt.getWithMinSalary();
//        System.out.println("Lowest salary have: " + lowestSalary);
//
//         bt.salaryReview();
//
//        Employee rich2 = bt.getWithMaxSalary();
//        System.out.println(" Richest is: " + rich2);







//        Employee accouter1 = new Accouter("Kat", "Kat",30, 500000, "Marketing");
//        Employee accouter2 = new Accouter("Kat", "Kat",30, 500000, "Marketing");
//        Employee accouter3 = accouter2;
//
//
//        boolean resultRefComp = accouter1 == accouter2;
//        System.out.println(" Ref comp:  " + resultRefComp);
//
//
//        boolean resultRefComp2 = accouter2 == accouter3;
//        System.out.println(resultRefComp2);
//
//        boolean resultEquals = accouter1.equals(accouter2);
//        System.out.println(" Eq comp:  " + resultRefComp);





    }// main




} //class
