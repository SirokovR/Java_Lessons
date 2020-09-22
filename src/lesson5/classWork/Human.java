package lesson5.classWork;

public class Human {
    public static final boolean MEN = false;
    public static final boolean WOEN = true;
    private String firstName;
    private String lastName;
    private boolean sex;


    public Human(String firstName, String lastName, boolean sex) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
    }

    public static boolean isMEN() {
        return MEN;
    }

    public static boolean isWOEN() {
        return WOEN;
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

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public void wedding(Human anotherHuman){
        if(this.sex == MEN){
            anotherHuman.lastName = this.lastName;
        }

        if (this.sex == WOEN){
            this.lastName = anotherHuman.lastName;
        }
    }
}
