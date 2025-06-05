//threads

class thd extends Thread{
    public static void main(String[] args) {
        Thread T = new Thread("World");
        T.setPriority(9);
        System.out.println(T.getPriority());
        System.out.println(T.getState());
        System.out.println(T);
        Thread T1 = Thread.currentThread( );
        T1.setPriority(1);
        System.out.println(T1);

    }
}