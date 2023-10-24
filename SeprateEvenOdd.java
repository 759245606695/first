import java.util.Scanner;
class EvenOdd{
	
	void displayEvenOdd(int Arr[])
	{
		int i;

	int size1;
	Scanner sc= new Scanner(System.in);
   System.out.println(" enter array size1");
   size1=sc.nextInt();

	int size2;
   System.out.println(" enter array size2");
   size2=sc.nextInt();

	
	int a[]=new int[size1];
	int b[]=new int[size2];
			System.out.println("even number: ");

		for( i=0;i<Arr.length;i++)
		{
           if(Arr[i]%2==0)
           {
           	a[i]=Arr[i];
           	System.out.print(" "+a[i]);
           }
           }
         	System.out.println("odd number: ");

         for(i=0;i<Arr.length;i++)
         {
         	if(Arr[i]%2!=0)
         	{
         		b[i]=Arr[i];
         		System.out.println(" "+b[i]);
         	}
         }
		}
		
		
	}

class SeprateEvenOdd
{
	public static void main(String arg[])
	{
   int size;
   Scanner sc= new Scanner(System.in);
   System.out.println(" enter size");
   size=sc.nextInt();


   int A[]=new int[size];

   System.out.println("enter array element: ");
   for(int i=0;i<A.length;i++)
   {
   	 A[i]=sc.nextInt();
   }

   System.out.println("array are: ");

   for(int i=0;i<A.length;i++)
   {
   	System.out.println(A[i]+" ");
   }

    EvenOdd a=new EvenOdd();

    a.displayEvenOdd(A);

  }
} 


hii prajakta