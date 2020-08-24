public class Main {
    public static void main(String[] args) {
        Triangle triangleA = new Triangle(15,8,15,8,17);
        Triangle triangleB = new Triangle(3,2.598,3,3,3);

        double triangleAArea = triangleA.findArea();
        System.out.println(triangleAArea);

        double triangleBArea = triangleB.findArea();
        System.out.println(triangleBArea);

        // accessing viriables
        System.out.println(triangleA.sideLenThree);
        System.out.println(triangleB.base);

        // non-static - variables are not the same for every triangle
        // static - variables are the same for every triangle instance

        // this is a static variable
        System.out.println(Triangle.numOfSides);
    }
}
