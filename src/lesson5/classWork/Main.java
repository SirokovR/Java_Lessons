package lesson5.classWork;

import lesson4.classWork.Men;

public class Main {
    public static void main(String[] args) {

        final Men men = new Men("Ivan","Director",2000);
         men.name = "vasilij";
        System.out.println(men.name);

        Animal cat = new Animal("kat");


        cat.getOneYearOlder();
        cat.getOneYearOlder();
        cat.getOneYearOlder();
        System.out.println(cat.getAge());


        Human ivan = new Human("Ivan","Ivanov", Human.MEN);
        Human maria = new Human("Maria", "Anika",Human.WOEN);
        Human dima = new Human("Dima", "Petrov",Human.WOEN);
        ivan.wedding(maria);
        maria.wedding(dima);
        System.out.println(ivan.getLastName());
        System.out.println(maria.getLastName());

        Humans.weddingTwo(ivan,maria);


        SimpleTriangle tr1 =  new SimpleTriangle(2,2,1);
        SimpleTriangle tr2 =  new SimpleTriangle(5,7,3);
        SimpleTriangle tr3 =  new SimpleTriangle(6,9,5);
        SimpleTriangle[] simpleTriangles = {tr1,tr2,tr3};

        getTriangleWithMaxPerimetr(simpleTriangles);




    }

    static SimpleTriangle getTriangleWithMaxPerimetr(SimpleTriangle[] simpleTriangles) {
        SimpleTriangle max = simpleTriangles[0];
        for(SimpleTriangle tr: simpleTriangles){
            if(tr.getPerimetr() > max.getPerimetr()){
                max = tr;
            }
        }
        return max;
    }


}
