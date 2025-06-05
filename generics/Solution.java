import java.io.*;
import java.util.*;

class Gen<T> {
    T[] Arr;

    Gen(T[] Arr) {
        this.Arr = Arr;
    }

    void printArray() {
        for (T t : Arr) {
            System.out.println(t);
        }
    }

}

public class Solution {
    public static void main(String[] args) {
        Integer[] iarr = { 1, 2, 3 };
        Gen<Integer> iobj = new Gen<>(iarr);
        iobj.printArray();
        String[] strarr = { "Hello", "World" };
        Gen<String> strobj = new Gen<>(strarr);
        strobj.printArray();
    }
}