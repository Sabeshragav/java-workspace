//min max array generics
import java.io.*;
import java.util.*;
class A<T extends Comparable<T>>
{
    T[] Arr;
    T min;
	T max;
    A(T[] obj)
    {
        Arr=obj;
		min=max=Arr[0];
    }
	void fnMin()
	{
		for(int i=1;i<Arr.length;i++)
        {
            if(Arr[i].compareTo(min)<0)
            {
                min=Arr[i];
            }
        }
	}
	void fnMax()
	{
		for(int i=1;i<Arr.length;i++)
        {
            if(Arr[i].compareTo(max)>0)
            {
                max=Arr[i];
            }
        }
	}
    void fnDisplay()
    {
		System.out.println(Arr.getClass().getName());
		System.out.println("Given array: "+Arrays.toString(Arr));
		System.out.println("Minimum= "+min);
		System.out.println("Maximum= "+max);
    }
}

class Genminmax
{
    public static void main(String [] as) throws IOException
    {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of elements in integer array:");
		n=sc.nextInt();
		Integer [] iarr=new Integer[n];
		System.out.print("Enter the integer elements:");
		for(int i=0;i<n;i++)
		{
			iarr[i]=sc.nextInt();
		}
        A<Integer> iobj=new A<Integer>(iarr);
		iobj.fnMin();
		iobj.fnMax();
		iobj.fnDisplay();
		System.out.print("Enter the number of elements in Double array:");
		n=sc.nextInt();
        Double [] darr=new Double[n];
		System.out.print("Enter the Double elements:");
		for(int i=0;i<n;i++)
		{
			darr[i]=sc.nextDouble();
		}
        A<Double> dobj=new A<Double>(darr);
		dobj.fnMin();
		dobj.fnMax();
		dobj.fnDisplay();
		System.out.print("Enter the number of elements in String array:");
		n=sc.nextInt();
		String [] sarr=new String[n];
		System.out.print("Enter the String elements:");
		for(int i=0;i<n;i++)
		{
			sarr[i]=sc.next();
		}
        A<String> sobj=new A<String>(sarr);
		sobj.fnMin();
		sobj.fnMax();
		sobj.fnDisplay();
        sc.close();
    }
}