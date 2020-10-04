package model;

import java.util.Arrays;

public class Programmer extends  Employee{

    private String[] languages;


    public Programmer(String firstName, String lastName, String[] languages) {
        super(firstName, lastName);
        this.languages = languages;
    }


    @Override
    public void salaryReview(long bonus){

        setSalary(getSalary() + (long)(1.1*bonus));

    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }


    @Override
    public String toString() {
        return "Programmer{" +
                "languages=" + Arrays.toString(languages) +
                '}';
    }
}
