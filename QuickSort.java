import java.util.*;

class QuickSort{

	static int partition(int[] arr,int l,int r)
	{
		int x = arr[l];
		int j=l,temp=0;

		for(int i=l+1;i<=r;i++)
		{
			if(arr[i]<=x){
				j++;
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		temp = arr[l];
		arr[l] = arr[j];
		arr[j] = temp;

		return j;
	}

	static void quicksort(int[] arr,int l,int r)
	{
		if(l>=r)
			return;
		int m = partition(arr,l,r);
		quicksort(arr,l,m-1);
		quicksort(arr,m+1,r);
	}

	public static void main(String[] args)
	{
		int[] arr = new int[100];

		Scanner sc = new Scanner(System.in);

		System.out.println("\nEnter the number of element in the array :");
		int n = sc.nextInt();

		System.out.println("\nEnter the elements of the array :");

		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}

		quicksort(arr,0,(n-1));

		System.out.println("\nThe sorted array is : ");

		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]+"\t");
		}

		System.out.println();
	}
}