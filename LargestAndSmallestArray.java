import java.util.Arrays;


//How to find largest and smallest number in unsorted array

public class LargestAndSmallestArray {
	
	public static void main(String[] args) {
		
		int arr[]= new int[]{5,2,3,4,6,7};
		System.out.println("Array length is--->"+arr.length);
		System.out.println("Array is:--"+Arrays.toString(arr));
		search(arr);
	}
	
	public static void search(int[] arr2)
	{
		int largest=arr2[0];
		int smallest=arr2[0];
		
		for (int i = 1; i < arr2.length; i++) {
			if (arr2[i] > largest) {
				largest=arr2[i];
			}
			else if (arr2[i] < smallest) {
				smallest=arr2[i];
			}
		}
		
		System.out.println("Smallest Number is:-- "+smallest);
		System.out.println("largest number is:--"+largest);
	
	}
}

//:::::::Another Way::::::
/*
public static void main(String[] args) {
		
		int arr[]= new int[]{5,2,3,4,6,7};
		System.out.println("Array Length is==" +arr.length);
		System.out.println("Array is:--"+Arrays.toString(arr));
		int l=arr[0];
		int s=arr[0];
		search(l,s,arr);
	}
	
	public static void search(int l,int s,int arr[])
	{
		//int largest=arr2[0];
		//int smallest=arr2[0];
		
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > l) {
				l=arr[i];
			}
			else if (arr[i] < s) {
				s=arr[i];
			}
		}
		
		System.out.println("Smallest Number is:-- "+s);
		System.out.println("largest number is:--"+l);
	
	}
*/