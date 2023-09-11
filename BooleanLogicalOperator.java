package aug31;

public class BooleanLogicalOperator {

	public static void main(String[] args) {
		boolean a =true;
		boolean b= false;
		
		boolean c= a | b;
		System.out.println(c);
		
		boolean d= a & b;
		System.out.println(d);
		
		boolean f= !a;
		System.out.println(f);
		
		
		boolean g= (!a&b) |  (a&!b);
		System.out.println(g);
		

	}

}
