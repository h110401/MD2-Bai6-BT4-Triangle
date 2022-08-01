
public class Main {
    public static void main(String[] args) {

        Shape shape = new Shape("blue", false);

        System.out.println(shape);

        Triangle triangle = new Triangle("red", true, 1, 2, 3);

        System.out.println(triangle);
    }
}