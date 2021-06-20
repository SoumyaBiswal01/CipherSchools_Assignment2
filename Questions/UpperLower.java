package Questions;

public class UpperLower {
	static void toggleCase(char str[])
	{
	    for (int i=0; i<str.length; i++)
	    {
	        if (str[i]>='A' && str[i]<='Z')
	            str[i] = (char) (str[i] + 'a' - 'A');
	        else if (str[i]>='a' && str[i]<='z')
	            str[i] = (char) (str[i] + 'A' - 'a');
	    }
	}

	public static void main(String[] args) {
		char str[] = "ProGraMMer".toCharArray();
	    toggleCase(str);
	    System.out.print("String after toggle: ");
	    System.out.print(String.valueOf(str));
	}

}
