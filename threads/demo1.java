class book extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Updating Data");
            try{
                Thread.sleep(5000);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }   
}

class Num extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(i);
            try{
                Thread.sleep(3000);
                
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}

class demo1{
    public static void main(String[] args)throws Exception{
        book b = new book();
        Num n = new Num();
        System.out.println(b.getState());
        b.start();
        n.start();
        System.out.println(b.getState());
        System.out.println(b.isAlive());
        System.out.println(b.getState());
        b.join();
        
        n.join();
        System.out.println(b.getState());
        System.out.println(b.isAlive());
        System.out.println("hello");
    }
}
