public class GenerateNumbers {
	String number = "";
	int length;

	public GenerateNumbers(int length){
		this.length = length;
		generateNumber();
	}

	public String getNumer(){
		return number;
	}

	private void generateNumber(){
		int x;
		for(int i = 0; i < length; i++){
			x = (int) (Math.random() * 10);
			number = number + x;
		}
	}
}