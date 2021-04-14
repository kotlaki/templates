package Dz3.Factory;

public class ProductA1 implements AbstractProductA {
    @Override
    public void interact(AbstractProductB b) {
        System.out.println(this.getClass().getName() + " interacts with " + b.getClass().getName());
    }
}
