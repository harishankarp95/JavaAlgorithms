import java.util.HashSet;

public class RemoveDuplicatesInArray {
	
	public static void main(String[] args) {
		
		int [] a={1,3,2,4,2,3,5};
		HashSet<Integer> ht=new HashSet<Integer>();
		for(int i=0; i<a.length;i++)
		{
			ht.add(a[i]);
		}
		for(int no:ht)
		{
			System.out.print(no+" ");
		}
    }
}
