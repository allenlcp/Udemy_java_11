package section_001_005;

public class TestImportStatic {
    public static void main(String[] args) {
        int radius = 2;

        // We can use a static class variable on the Math class to
        // get the value of PI
        double circumference = 2 * java.lang.Math.PI * radius;
        System.out.println("circumference = " + circumference);

        // We can use a static class method on the Math class to
        // get the square root of a number
        double sqrt81 = java.lang.Math.sqrt(81);
        System.out.println("sqrt81 = " + sqrt81);
    }
}
