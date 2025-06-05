// GENERICS ARRAYS

import java.io.*;

class A<T extends Number> {
	T[] Arr;
	double sum = 0;

	A(T[] obj) {
		Arr = obj;
	}

	void fnDisplay() {

		for (int i = 0; i < Arr.length; i++) {
			sum += Arr[i].doubleValue();
			System.out.println(Arr[i]);
		}
		System.out.println("Sum = "+sum);
	}
}

class arrgen1 {
	public static void main(String as[]) throws Exception {
		Integer[] iarr = { 1, 3, 5, 7, 9 };
		A<Integer> iobj = new A<Integer>(iarr);
		iobj.fnDisplay();

		Double[] darr = { 1.1, 3.4, 5.7, 7.1, 9.0, 2.8, 9.4 };
		A<Double> dobj = new A<Double>(darr);
		dobj.fnDisplay();

		// String[] sarr = { "Hello", "IT", "Welcome" };
		// A<String> sobj = new A<String>(sarr);
		// sobj.fnDisplay();

	}
}