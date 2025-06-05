//sorting array generics
import java.io.*;
import java.util.*;
class A<T extends Comparable<T>>
{
	T[] Arr;
	T temp;
	A(T[] obj)
	{
		Arr=obj;
	}
	void fnSort()
	{
		for(int i=0;i<Arr.length-1;i++) 
		{
            for(int j=i+1;j<Arr.length;j++) 
			{
                if(Arr[i].compareTo(Arr[j])>0)
				{
                    temp=Arr[i];
                    Arr[i]=Arr[j];
                    Arr[j]=temp;
                }
            }
		}
	}
	void fnDisplay()
	{
		System.out.println(Arr.getClass().getName());
		System.out.println(Arrays.toString(Arr));
	}
}
class Gensort
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
		System.out.println("Entered array is:"+Arrays.toString(iarr));
        A<Integer> iobj=new A<Integer>(iarr);
		iobj.fnSort();
		iobj.fnDisplay();
		System.out.print("Enter the number of elements in Double array:");
		n=sc.nextInt();
        Double [] darr=new Double[n];
		System.out.print("Enter the Double elements:");
		for(int i=0;i<n;i++)
		{
			darr[i]=sc.nextDouble();
		}
		System.out.println("Entered array is:"+Arrays.toString(darr));
        A<Double> dobj=new A<Double>(darr);
		dobj.fnSort();
		dobj.fnDisplay();
		System.out.print("Enter the number of elements in String array:");
		n=sc.nextInt();
		String [] sarr=new String[n];
		System.out.print("Enter the String elements:");
		for(int i=0;i<n;i++)
		{
			sarr[i]=sc.next();
		}
		System.out.println("Entered array is:"+Arrays.toString(sarr));
        A<String> sobj=new A<String>(sarr);
		sobj.fnSort();
		sobj.fnDisplay();
        sc.close();
	}
}