import java.util.*;

class MergeSort{

    static void merge(int[] arr,int l,int m, int r){
    	int n1 = m-l+1;
    	int n2 = r-m;

    	int a[] = new int[n1];
    	int b[] = new int[n2];

    	for(int i=0;i< n1;i++)
    	{
    		a[i] = arr[l+i];
    	}  

    	for(int i=0;i<n2;i++)
    	{
    		b[i] = arr[m+1+i];
    	}

    	int i=0,j=0;
    	int k =l;

    	while(i<n1 && j<n2)
    	{
    		if(a[i]<b[j])
    		{
    			arr[k] = a[i];
    			i++;
    		}

    		else
    		{
    			arr[k] = b[j];
    			j++;
    		}
    		k++;
    	}

    	while(i<n1)
    	{
    		arr[k] = a[i];
    		i++;
    		k++;
    	}

    	while(j<n2)
    	{
    		arr[k] = b[j];
    		j++;
    		k++;
    	}
    }


	static void mergesort(int[] arr,int l,int r)
	{
		if(l>=r)
			return;

		int m= (l+r)/2;

		mergesort(arr,l,m);
		mergesort(arr,m+1,r);
		merge(arr,l,m,r);
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

		mergesort(arr,0,(n-1));

		System.out.println("\nThe sorted array is : ");

		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]+"\t");
		}

		System.out.println();
	}
}