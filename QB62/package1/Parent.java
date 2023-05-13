package package1;

/*
 * Create a multiple package and show the uses of different access modifier
 */
public class Parent {
    public int publicVar = 1;
    protected int protectedVar = 2;
    int defaultVar = 3;
    private int privateVar = 4;

    public void printVars() {
        System.out.println("Class Parent: publicVar = " + publicVar);
        System.out.println("Class Parent: protectedVar = " + protectedVar);
        System.out.println("Class Parent: defaultVar = " + defaultVar);
        System.out.println("Class Parent: privateVar = " + privateVar);
    }
}