
public class DuplicateChar {
	
	public static void main(String[] args) {
		
		int cnt=0;
		String str="harpadhrss";
		char[] ch=str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				if(ch[i] == ch[j])
				{
					System.out.print(ch[j]);
					cnt++;
					break;
					
				}
			}
			
		}
		System.out.println("\ncount of Duplicates is :"+cnt);
	}
}
