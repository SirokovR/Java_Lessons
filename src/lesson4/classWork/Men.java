package lesson4.classWork;

public class Men {
    public int age;
    public String name;
    public String profession;
    public int salary;

    public Men(){

    }

    public Men(int age, String name, String profession) {
        this.age = age;
        this.name = name;
        this.profession = profession;
    }
    

    public Men(String name, String profession, int salary){
        this.age = lesson2.classWork.Main.getRandomFromRange(18, 65);
        this.name = name;
        this.profession = profession;
        this.salary = lesson2.classWork.Main.getRandomFromRange(30_000, 120_000);
    }

}
