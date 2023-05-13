package R;

import P.One;
import Q.Two;

public class Test {
    static int add() {
        int addition;
        addition = new One().x + new Two().y;
        return addition;
    }

    public static void main(String[] args) {
        System.out.println("Addition : " + add());
    }
}
