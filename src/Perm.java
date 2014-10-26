import java.util.ArrayList;
import java.util.List;


public class Perm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="abc";
		permuatation(str,"");
	}



	private static void permuatation(String str, String current) {
		if(str.equals(""))
		{
			System.out.printf("Result: %s",current);
			System.out.println();
		}
		else
		{
			for (int i = 0; i < str.length(); i++)
			{
				char c= str.charAt(i);
				permuatation(str.substring(0, i)+ str.substring(i+1), current + c);

			}
		}

	}
	

}
