package generic.test.ex3;

import generic.test.ex3.unit.Marine;
import generic.test.ex3.unit.Zealot;

public class UnitUtilTest {
    public static void main(String[] args) {
        Marine m1 = new Marine("Marine1", 40);
        Marine m2 = new Marine("Marine2", 60);
        Marine resultMarine = UnitUtil.maxHp(m1,m2);
        System.out.println("resultMarine = " +  resultMarine);

        Zealot z1 = new Zealot("Zealot1", 100);
        Zealot z2 = new Zealot("Zealot2", 200);
        Zealot resultZealot = UnitUtil.maxHp(z1,z2);
        System.out.println("resultZealot = " +  resultZealot);

    }
}
