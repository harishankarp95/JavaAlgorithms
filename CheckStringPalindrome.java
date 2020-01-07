package algorithim;

public class CheckStringPalindrome {

public static void main(String[] args) {
		
		String str="hah";
		String s="";
		for(int i=str.length()-1;i>=0;i--)
		{
			s+=str.charAt(i);
			
		}
		if(str.equals(s))
		{
			System.out.println("Palindrome");
		}else
		{
			System.out.println("Not Palindrome");
		}
		System.out.println(s);
	}
}
