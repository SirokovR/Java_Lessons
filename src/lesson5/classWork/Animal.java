package lesson5.classWork;

public class Animal {
    private String kind;
    private int age;


    public Animal(String kind) {
        this.kind = kind;
        this.age = 2;
    }


    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public  void getOneYearOlder(){
        this.age = this.age + 1;
    }

}
