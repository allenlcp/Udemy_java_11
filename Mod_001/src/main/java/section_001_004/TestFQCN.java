package section_001_004;

public class TestFQCN {
    public static void main(String[] args) {
        java.lang.String s = "We are testing ways to import classes";
        System.out.println(s);

        // String class in the java.lang package, simple class name ok
        String s1 = "We are testing ways to import classes";
        System.out.println(s1);

        // Any class in any other package must be qualified or imported
        section_001_003.garden.vegetable.VineVegetable.main(args);
    }
}
