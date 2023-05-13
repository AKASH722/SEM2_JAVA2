package package1;

/*
 * Create a multiple package which show the difference between protected and default access modifier
 */
public class Parent {
    protected int protectedVar = 2;
    int defaultVar = 3;

    public void printVars() {
        System.out.println("Class Parent: protectedVar = " + protectedVar);
        System.out.println("Class Parent: defaultVar = " + defaultVar);
    }
}