abstract class Shape {
    double area;

    abstract void calculateArea();

    abstract void getArea();

    abstract void getDimensions();
}

class Square extends Shape {
    double a;

    Square(double a) {
        this.a = a;
    }

    @Override
    void calculateArea() {
        this.area = this.a * this.a;
    }

    @Override
    void getArea() {
        System.out.println("Area of Square is " + area);
    }

    @Override
    void getDimensions() {
        System.out.println("Dimension is " + a);
    }
}

class Rectangle extends Shape {
    double l;
    double b;

    Rectangle(double l, double b) {
        this.l = l;
        this.b = b;
    }

    @Override
    void calculateArea() {
        this.area = this.l * this.b;
    }

    @Override
    void getArea() {
        System.out.println("Area of Rectangle is " + area);
    }

    @Override
    void getDimensions() {
        // System.out.println("Dimensions are " + l + " and " + b);
        System.out.printf("Dimensions are %2f and %2f\n", l, b);

    }
}

class Circle extends Shape {
    double pi = 3.142;
    double r;

    Circle(double r) {
        this.r = r;
    }

    @Override
    void calculateArea() {
        this.area = (this.r * this.r) * this.pi;
    }

    @Override
    void getArea() {
        System.out.println("Area of Circle is " + area);
    }

    @Override
    void getDimensions() {
        System.out.println("Dimension is " + r);
    }
}

public class abstractDemo {
    public static void main(String[] args) {
        // Square
        Square sq = new Square(4);
        sq.calculateArea();
        sq.getArea();
        sq.getDimensions();

        // Rectangle
        Rectangle rect = new Rectangle(4, 5);
        rect.calculateArea();
        rect.getArea();
        rect.getDimensions();

        // Circle
        Circle cir = new Circle(7);
        cir.calculateArea();
        cir.getArea();
        cir.getDimensions();

    }
}
