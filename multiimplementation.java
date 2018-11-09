class D {}

abstract class E {}

class Z extends D {

    E makeE() {
        return new E() {};
    }
}


public class multiimplementation {

    static void takesD(D a) {}
    static void takesE(E b) {}

    public static void main(String[] args) {
        Z z = new Z();
        takesD(z);
        takesE(z.makeE());        
    }

}
