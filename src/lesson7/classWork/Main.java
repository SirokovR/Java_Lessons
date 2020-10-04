package lesson7.classWork;

import lesson5.classWork.SimpleTriangle;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(4);
        Circle circle3 = new Circle(6);

        SimpleTriangle triangle1 = new SimpleTriangle(2, 3, 3);
        SimpleTriangle triangle2 = new SimpleTriangle(4, 2, 3);
        SimpleTriangle triangle3 = new SimpleTriangle(8, 6, 7);

        Square square1 = new Square(4);
        Square square2 = new Square(6);
        Square square3 = new Square(5);







       /* Figure [] figures = {circle1,circle2,circle3,triangle1,triangle2,triangle3,square1,square2,square3};
        Figure figureMaxPerimeter = figures[0];
        for (Figure figure : figures) {
            if (figure.getPerimeter() > figureMaxPerimeter.getPerimeter()) {
                figureMaxPerimeter = figure;
            }
        }
        System.out.println(figureMaxPerimeter);
        if(figureMaxPerimeter instanceof Circle){
            System.out.println("Circle");
        }else if(figureMaxPerimeter instanceof SimpleTriangle){
                System.out.println("Triangle");
        }else if(figureMaxPerimeter instanceof Square){
            System.out.println("Square");

        }




        Circle[] testCircle = {circle1, circle2, circle3};
        Circle cercleMaxPerim = testCircle[0];
        for (Circle circle : testCircle) {
            if (circle.getPerimeter() > cercleMaxPerim.getPerimeter()) {
                cercleMaxPerim = circle;
            }
        }


        SimpleTriangle [] testTriangle = {triangle1,triangle2,triangle3};
        SimpleTriangle triangleMAxPerimeter = testTriangle[0];
        for(SimpleTriangle triangle: testTriangle){
            if(triangle.getPerimetr() > triangleMAxPerimeter.getPerimetr()){
                triangleMAxPerimeter = triangle;
            }

        }


        Square[] testSquare = {square1, square2, square3};
        Square squareMAxPerimeter = testSquare[0];
        for (Square square : testSquare) {
            if (square.getPerimeter() > squareMAxPerimeter.getPerimeter()) {
                squareMAxPerimeter = square;
            }
        }


        if(cercleMaxPerim.getPerimeter() > triangleMAxPerimeter.getPerimetr()){
            System.out.println("cercle"+ cercleMaxPerim.getPerimeter());
        }else{

        }
//*/
//
//        Figure [] figures = {circle1,circle2,circle3,triangle1,triangle2,triangle3,square1,square2,square3};
//        Figure figureMaxSquare = figures[0];
//        for (Figure figure : figures) {
//            if (figure.getSquare() > figureMaxSquare.getSquare()) {
//                figureMaxSquare = figure;
//            }
//        }
//        System.out.println(figureMaxSquare);
//        if(figureMaxSquare instanceof Circle){
//            System.out.println("Circle");
//        }else if(figureMaxSquare instanceof SimpleTriangle){
//            System.out.println("Triangle");
//        }else if(figureMaxSquare instanceof Square){
//            System.out.println("Square");
//
//        }






    }//main


}
