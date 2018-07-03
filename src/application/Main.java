package application;

public class Main {
	public static void main(String[] args) {
		Operation op = new Operation();
		
		System.out.println(op.add(1, 3));
		System.out.println(op.subtract(5, 1));
		System.out.println(op.multiply(10, 20));
		System.out.println(op.divide(10, 2));
		System.out.println(op.divide(200, 0));
	}
	
	

}
