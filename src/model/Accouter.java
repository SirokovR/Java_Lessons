package model;

public class Accouter extends Employee {

    private String departmentName;

    public Accouter(String firstName, String lastName, int age, long salary, String departmentName) {
        super(firstName, lastName, age, salary);
        this.departmentName = departmentName;
    }


    public Accouter(String firstName, String lastName, String departmentName) {
        super(firstName, lastName);
        this.departmentName = departmentName;
    }

    @Override
    public void salaryReview(long bonus) {

        setSalary(getSalary() + (long)(1.2*bonus));

    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }


    @Override
    public String toString() {
        return "Accouter{" +
                "departmentName='" + departmentName + '\'' +
                '}';
    }


    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + departmentName.hashCode();
        return result;
    }

    @Override
    public  boolean equals(Object obj){
        if(obj == null){
            return false;
        }
        if(!(obj instanceof Accouter)){
            return  false;
        }
        final Accouter accouter = (Accouter) obj;     //прикастили Аккаунтер
        if(! this.departmentName.equals(accouter.getDepartmentName())){   //проверка на Не Равенство это Гууд
            return  false;
        }

        if(! this.firstName.equals(accouter.getFirstName())){
            return  false;
        }
        if(! this.lastName.equals(accouter.getLastName())){
            return  false;
        }
        if(! (this.salary == accouter.getSalary())){
            return  false;
        }
        if(! (this.age == accouter.getAge())){
            return  false;
        }
        if(!this.departmentName.equals(accouter.getDepartmentName())){
            return  false;
        }


        return (this == obj); //this показывает что это текущий обьект который прилетел в метод
    }

}
