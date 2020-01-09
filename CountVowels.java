
public class CountVowels {
	
	public static void main(String[] args) {
		
		String str="harishankar";
		int count=0;
		char[] ch=str.toCharArray();
		for(char c:ch)
		{
			switch(c)
			{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++;
				break;
				
			}
		}
		System.out.println("Numbers of Vowels in This String is : "+count);
	}
}
