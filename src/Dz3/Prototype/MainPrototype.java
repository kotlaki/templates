package Dz3.Prototype;

// Prototype

public class MainPrototype {

    private Prototype prototype;

    public MainPrototype(Prototype prototype) {
        this.prototype = prototype;
    }

    public Prototype makeOtherPrototype() throws CloneNotSupportedException {
        return this.prototype.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Prototype prototype;
        Prototype otherPrototype = new OtherPrototype();

        MainPrototype mainPrototype = new MainPrototype(otherPrototype);

        for (int i = 0; i < 10 ; i++) {
            prototype = mainPrototype.makeOtherPrototype();
            System.out.println(prototype);
        }

    }

}
