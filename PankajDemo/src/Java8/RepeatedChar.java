package Java8;

public class RepeatedChar {
	private static String inputStr= "aabbcdef";

	public static void main(String[] args) {
		char [] ch =  inputStr.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			System.out.println(ch[i]);
		}
		
	}

}
