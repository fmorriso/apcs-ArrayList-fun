import java.util.ArrayList;
import java.util.Arrays;

public class Driver {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		for(char c = 'A' ; c <= 'E'; c++) {
			list.add(Character.toString(c));
		}
		System.out.println(list);
		for(int k = 1; k <= 3; k++)
			list.remove(1);
		System.out.println(list);
		for(int k = 1; k <= 3; k++)
			list.add(1, "*");
		
		System.out.println(list);
		
		ArrayList<Integer> rays = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,5,10, 20));
		System.out.println(numCount(rays, 5));
	}
	
	private static int add(int x, int y) {
		return x + y;
	}
	
	private static int multiply(int x, int y) {
		return x * y;
	}
	
	private static int numCount(ArrayList<Integer> rayList, int num) {
		int n = 0;
		for(Integer i: rayList) {
			if(i.equals(num)) n++;
		}		
		return n;
	}

}
