import java.util.Scanner;
class que1
{
static int largest(int array[],int size) 
{ 
         int i; 
         int max = array[0]; 
        
         for (i = 1; i < size; i++) 
             if (array[i] > max) 
                 max = array[i]; 
        
         return max; 
} 
public static void main(String[ ] args)
{

Scanner S=new Scanner(System.in);
System.out.println("Enter no. of elements:");
int N=S.nextInt();
int[ ] arr=new int[N];
System.out.println("Enter array elements:");
for(int i=0;i<N;i++)
{
  arr[i]=S.nextInt();
}
System.out.println("Largest in given array is : " + largest(arr,N));
}
}
