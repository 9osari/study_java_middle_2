package generic.test.ex3;


import generic.test.ex3.unit.BioUnit;

public class Shuttle<T extends BioUnit> {   //상한 필요 getname, gethp 써야하니

    private T unit;

    public void in(T t) {
        unit = t;
    }

    public void showInfo() {
        System.out.println("이름: " + unit.getName() + ", HP : " + unit.getHp());
    }
}
