public class LuhnAlgTester {

	//test LuhnAlg()
	public static void main(String[] args){
		String number = "8112189876";
		int[] array1;
		int[] array2 = {8,1,1,2,1,8,9,8,7,6};

		array1 = stringToIntArray(number);

		boolean b = LuhnAlgorithm.luhnAlg(array1);
		System.out.println(b);
	}


	//String unlimited size. pewpew.
	public static int[] stringToIntArray(String value){
		int length = value.length();
		int[] array = new int[length];

		for(int i = 0; i < length; i++){
			array[i] = Integer.parseInt(value.charAt(i) + "");
		}

		return array;
	}


	//cool function. to big numbers for integers.
	public static int[] intToArray(int value){
		int i = 0;
		int length = String.valueOf(value).length();
		int[] array = new int[length];

		while(value > 0){
			array[i++] = value % 10;
			value = value / 10;
		}

		return array;
	}
}