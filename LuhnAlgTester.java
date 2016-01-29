public class LuhnAlgTester {

	//test LuhnAlg()
	public static void main(String[] args){

		int[] array = {8,1,1,2,1,8,9,8,7,6};

		System.out.println("This should be true: " +
			LuhnAlgorithm.luhnAlg(array));

		//-------------------------------
		int nr = 1000;

		GenerateNumbers[] gNumbers = new GenerateNumbers[nr];
		for(int i = 0; i < nr; i++){
			gNumbers[i] = new GenerateNumbers(10);
		}

		int accepterNumbers = 0;

		for(int i = 0; i < nr; i++){
			String s = gNumbers[i].getNumer();
			//System.out.println(s);
			boolean check = LuhnAlgorithm.luhnAlg(stringToIntArray(s));
			if(check) accepterNumbers++;
		}

		System.out.println("accepted numbers: " + accepterNumbers 
			+ " / " + nr);
		//-------------------------------
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