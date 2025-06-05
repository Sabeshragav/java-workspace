import java.util.*;
import java.lang.*;

class names<T extends Comparable<T>>{
    Scanner sc = new Scanner(System.in);
    int sz;
    T [] arr;
    void fnget(){
        System.out.print("Enter the size : ");
        sz = sc.nextInt();
        arr = new String[sz];
        System.out.println("Enter names : ");
        for(int i=0;i<sz;i++){
            arr[i] = sc.next();
        }
    }
    void fnsort(){
        for(int i=0;i<sz;i++){
            for(int j=0 ; j<(sz-(i+1)) ;j++){
                if((arr[j].compareTo(arr[j+1])) > 0){
                    String t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;

                }
            }
        }
    }
    void fndisp(){
        for(String i : arr){
            System.out.println(i);
        }
    }

} 

class check{
    public static void main(String[] args) {
    names obj = new names();
    obj.fnget();
    obj.fnsort();
    obj.fndisp();   
    }
}