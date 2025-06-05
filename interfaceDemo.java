interface Running {
    int x = 10;

    public void running();
}

abstract class Eating {
    int y = 20;

    public abstract void eating();
}

class Animal extends Eating implements Running {
    @Override
    public void running() {
        // x = 20;
        System.out.println("Dog is running" + x);

    }

    @Override
    public void eating() {
        y = 430;
        System.out.println("Dog is eating" + y);
    }
}

public class interfaceDemo {
    public static void main(String[] args) {
        Animal obj = new Animal();
        obj.running();
        obj.eating();
    }

}
