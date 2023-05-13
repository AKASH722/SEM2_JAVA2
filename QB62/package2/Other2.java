package package2;

import package1.Parent;

public class Other2 {
    public void printVars() {
        Parent p = new Parent();
        System.out.println("Other2 in differnet pacakage");
        System.out.println("Class Other2: publicVar = " + p.publicVar);
        System.out.println("Class Child2: Cannot access protectedVar");
        System.out.println("Class Child2: Cannot access defaultVar");
        System.out.println("Class Child2: Cannot access privateVar");
        // System.out.println("Class Other2: protectedVar = " + p.protectedVar);
        // System.out.println("Class Other2: defaultVar = " + p.defaultVar);
        // System.out.println("Class Other2: privateVar = " + p.privateVar);
    }
}
