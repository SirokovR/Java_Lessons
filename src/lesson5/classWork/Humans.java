package lesson5.classWork;

public class Humans {
    public static void weddingTwo(Human human, Human anotherHuman){
        if(human.isSex() == Human.MEN){
            anotherHuman.setFirstName(human.getFirstName());
        }

        if (human.isSex() == Human.WOEN){
            human.setFirstName(anotherHuman.getFirstName());
        }
    }
}
