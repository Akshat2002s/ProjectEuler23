import java.util.*;
public class Perfectnum {
	static int div(int a) {
		int sum=0;
		for(int i=1; i<a;i++) {
			if (a%i==0) {
				sum+=i;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int limit=28124;
		int check=0;
		ArrayList<Integer> lst2= new ArrayList<Integer>();
		ArrayList<Integer> lst= new ArrayList<Integer>();
		for(int i=0; i<limit; i++) {
			lst.add(i);
			
		}
		System.out.println(lst);
		
		for(int j=0;j<28124;j++) {
			check=div(j);
			if(check>j) {
				lst2.add(j);
			}
		}
		System.out.println(lst2);
		

	}

}
