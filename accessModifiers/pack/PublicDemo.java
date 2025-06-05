
package pack;

public class PublicDemo {
    private int value = 10;

    public PublicDemo(int value) {
        this.value = value;
    }

    public void msg() {
        System.out.println("Hello from public");
        System.out.println("value = " + this.value);
    }
}