/*
 * package P contain a class One that has x as data member.
 * package Q contain a class Two that has y as data member
 * package R contain a class Test that has add() method which add X anf Y of claas One and Two.
 */
package P;

import java.util.Scanner;

public class One {
    public int x;

    public One() {
        System.out.print("Enter x : ");
        x = new Scanner(System.in).nextInt();
    }
}