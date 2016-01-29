public class LuhnAlgTester {

	public static void main(String[] args){
		int[] array = {8,1,1,2,1,8,9,8,7,6};
		boolean b = LuhnAlgorithm.luhnAlg(array);
		System.out.println(b);
	}

}