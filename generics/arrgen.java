// GENERICS ARRAYS

import java.io.*;

class A<T extends Number>
{
	T [] Arr;
	double min;
	double max;
	int len;
	
	A(T[] obj)
	{
		Arr = obj;
		max=0;
		min=Arr[0].doubleValue();
		len=Arr.length;
	}
	void minmax()
	{
		for(int i=1;i<len;i++)
		{
			if(max<Arr[i].doubleValue()){
					max=Arr[i].doubleValue();
			}

			if(min>Arr[i].doubleValue()){
					min=Arr[i].doubleValue();

					
			}
		}
		
		System.out.println("Min value = "+min);
		System.out.println("Max value = "+max);
		
	}

	void sort(){
		for(int i=0;i<len-1;i++){
			int pos=i;
			for(int j=i+1;j<len;j++){
				if(Arr[i].doubleValue()<Arr[pos].doubleValue()){
					pos=j;
				}
			}
			T temp=Arr[i];
			Arr[i]=Arr[pos];
			Arr[pos]=temp;
		}
		System.out.println("Sorted array : ");
		for(int i=0;i<len;i++)
			System.out.print(Arr[i]+",");
		System.out.print("\n");
	}
}

class arrgen
{
	public static void main(String as[])throws Exception
	{
		Integer [] iarr = {1,2,3,4,5};
		A<Integer> iobj = new A<Integer>(iarr);
		iobj.minmax();	
		iobj.sort();
		
		Double [] darr = {1.1,3.4,5.7,7.1,9.0,0.8, 9.4};
		A<Double> dobj = new A<Double>(darr);
		dobj.minmax();
		dobj.sort();

		/*String [] strarr = {"hello","programing","world"};
		A<String> strobj = new A<String>(strarr);
		strobj.fnDisplay();*/
	
	}
}