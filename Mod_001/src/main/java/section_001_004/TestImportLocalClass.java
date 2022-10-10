package section_001_004;


// Type-import-on-demand declaration

// More specific import is overriding the on demand import


public class TestImportLocalClass {
    public static void main(String[] args) {
        java.lang.String s = "We are testing ways to import classes";
        System.out.println(s);

        // String class in the java.lang package, simple class name ok
        String s1 = "We are testing ways to import classes";
        System.out.println(s1);

        // We use simple name because we specified location in import statement
        VineVegetable.main(args);

        section_001_003.garden.vegetable.VineVegetable.main(args);
    }
}

class VineVegetable{
    public static void main(String[] args) {
        System.out.println("I am a local VineVegetable");
    }
}