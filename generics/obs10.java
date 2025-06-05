//min max array generics
import java.io.*;
class A<T extends Comparable<T>>
{
    T[] Arr;
    int len;
    
    A(T[] obj)
    {
        Arr=obj;
        len=Arr.length;
    }
	void sort()
	{
		for(int i=0;i<len-1;i++)
            for(int j=i+1;j<len;j++) 
                if(Arr[i].compareTo(Arr[j])>0)
				{
                    T temp=Arr[i];
                    Arr[i]=Arr[j];
                    Arr[j]=temp;
                }
            }
    void disp()
    {
		System.out.println(Arr.getClass().getName());
		System.out.print("Sorted array: ");
        for(int i=0;i<len;i++)
            System.out.print(Arr[i]+",");
        System.out.print("\n");
		System.out.println("Minimum= "+Arr[0]);
		System.out.println("Maximum= "+Arr[len-1]);
        System.out.print("\n");
    }
}

class obs10
{
    public static void main(String [] as) throws IOException
    {
		Integer [] iarr = {4,3,5,2,6,1};
		A<Integer> iobj = new A<Integer>(iarr);	
		iobj.sort();
        iobj.disp();
		
		Double [] darr = {1.1,3.4,5.7,7.1,9.0,0.8, 9.4};
		A<Double> dobj = new A<Double>(darr);
		dobj.sort();
        dobj.disp();

		String [] strarr = {"world","hello","action","strike"};
		A<String> strobj = new A<String>(strarr);
		strobj.sort();
        strobj.disp();
    }
}