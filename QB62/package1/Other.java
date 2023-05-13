package package1;

public class Other {
    public void printVars() {
        Parent p = new Parent();
        System.out.println("Other in Same pacakage");
        System.out.println("Class Other: publicVar = " + p.publicVar);
        System.out.println("Class Other: protectedVar = " + p.protectedVar);
        System.out.println("Class Other: defaultVar = " + p.defaultVar);
        System.out.println("Class Other: Cannot access priavteVar");
        // System.out.println("Class Other: privateVar = " + p.privateVar);
    }
}
