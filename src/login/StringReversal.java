package login;

public class StringReversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//String s= new String("Rahul");
String[] s1 = {"Vinu","kaml","dattu"};
String s2 = "rahul shetty academy";
String[] s5= s2.split("");
	System.out.println(s5[0]);
	System.out.println(s5[1]);
//System.out.println(splittedstring[0]);
//System.out.println(splittedstring[1]);
//Sytem.out.println(splittedstring[2]);
//for (int i=0;i<s2.length();i++) {
//System.out.println(s2);	
//}
	String s = "Rahul Shetty Academy";
	
//Sting[] splittedString = s.split("Shetty");
	String[] splittedString = s.split("Shetty");

	System.out.println(splittedString[0]);

	System.out.println(splittedString[1]);

	System.out.println(splittedString[1].trim());
	//to print in characters
	/*
	 * for(int i=0;i<s.length();i++) { System.out.println(s.charAt(i)); }
	 */
//To print in reversal
for(int i=s.length()-1;i>=0;i--)
{
	System.out.println(s.charAt(i));
}
	/*
}
	 * for(int i =s.length()-1;i>=0;i--)
	 * 
	 * {
	 * 
	 * 
	 * 
	 * System.out.println(s.charAt(i));
	 * 
	 * }
	 */	}

}
