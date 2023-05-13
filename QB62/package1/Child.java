package package1;

public class Child extends Parent {
    public void printVars() {
        System.out.println("Child in same package");
        System.out.println("Class Child: publicVar = " + publicVar);
        System.out.println("Class Child: protectedVar = " + protectedVar);
        System.out.println("Class Child: defaultVar = " + defaultVar);
        System.out.println("Class Child: Cannot access priavteVar");
        // System.out.println("Class Child: privateVar = " + privateVar);
    }
}
