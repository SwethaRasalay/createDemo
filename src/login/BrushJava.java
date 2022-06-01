package login;

import java.util.ArrayList;

public class BrushJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int[] numb = new int[5]; numb[0] = 1; numb[1]= 2; numb[3]=3;
		 */
int[] arr = {1,2,3,4,5,6,7,8,16,14,18};
for(int i=0;i<arr.length;i++) {
	if(arr[i]%2==0) {
		System.out.println(arr[i]);
	}
	/*
	 * else { System.out.println(arr[i] +"is not multiple of 2"); }
	 */
}
ArrayList<String> a = new ArrayList<String>();
a.add("rahul");

System.out.println(a.get(0));
	}

}
 