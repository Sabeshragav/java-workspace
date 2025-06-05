public class chk<T extends Number> {
    private T num1;
    private T num2;

    public chk(T num1, T num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @SuppressWarnings("unchecked")
    public T add() {
        if (num1 instanceof Integer) {
            return (T) (Integer) (num1.intValue() + num2.intValue());
        } else if (num1 instanceof Double) {
            return (T) (Double) (num1.doubleValue() + num2.doubleValue());
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        chk<Integer> intAdder = new chk<>(2, 3);
        Integer intResult = intAdder.add();
        System.out.println("Integer Result: " + intResult);

        chk<Double> doubleAdder = new chk<>(2.5, 3.5);
        Double doubleResult = doubleAdder.add();
        System.out.println("Double Result: " + doubleResult);
    }
}