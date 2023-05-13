package package2;

import package1.Parent;

public class Child2 extends Parent {
    public void printVars() {
        System.out.println("Child2 in different package");
        System.out.println("Class Child2: protectedVar = " + protectedVar);
        System.out.println("Class Child2: Cannot access defaultVar");
        // System.out.println("Class Child2: defaultVar = " + defaultVar);
    }
}
