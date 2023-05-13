import package1.*;
import package2.*;

public class Main {
    public static void main(String[] args) {
        new Parent().printVars();
        System.out.println();
        new Child().printVars();
        System.out.println();
        new Other().printVars();
        System.out.println();
        new Child2().printVars();
        System.out.println();
        new Other2().printVars();
    }
}
