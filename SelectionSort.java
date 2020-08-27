import java.util.*;

class SelectionSort{

	static void selsort(int arr[],int l,int r)
	{
		int minindex = 0,temp = 0;
		for(int i=l;i<r;i++)
		{
			minindex = i;
			for(int j=i+1;j<r;j++)
			{
				if(arr[j]<arr[minindex])
				{
					minindex = j;
				}
			}

			temp = arr[minindex];
			arr[minindex] = arr[i];
			arr[i] = temp;
		}
	}


	public static void main(String []args)
	{
		int[] arr = new int[100];

		Scanner sc= new Scanner(System.in);

		System.out.println("\nEnter the number of elements in the array :");
		int n = sc.nextInt();

		System.out.println("\nEnter the elements : ");

		for (int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		selsort(arr,0,n);

		System.out.println("\nThe sorted array is :");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+"\t");
		}

		System.out.println();
	}
}