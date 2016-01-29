public class LuhnAlgorithm {

	//param integer divided into an array gg
	public static boolean luhnAlg(int[] array){
		//check number
		int x = 1;	//for checking if even number
		int sum = 0;
		int temp = 0;

		for(int i = array.length-1; i >= 0; i--){
			temp = array[i]*(2 - (x++ % 2));
			if(temp > 9) temp -= 9;
			sum += temp;
		}

		//check control digit
		//TODO fix

		return (sum % 10 == 0);
	}

}