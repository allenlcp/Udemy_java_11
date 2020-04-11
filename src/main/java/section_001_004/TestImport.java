package section_001_004;

// A single-type-import declaration
//import section_001_003.garden.vegetable.VineVegetable;

// Type-import-on-demand only imports class in that package, NOT the nested package
// import section_001_003.garden.*;

// Type-import-on-demand declaration
import section_001_003.garden.vegetable.*;

// More specific import is overriding the on demand import
import section_001_003.nursery.vegetable.VineVegetable;

public class TestImport {
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
