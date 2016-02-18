public class TestBooleanFunction {

	public static void main(String[] args){
		boolean b = true;

		//change to false
		b = !b;
		System.out.println("Should be false: " + b);

		//change to true
		b = !b;
		System.out.println("Should be true: " + b);
		
	}
}