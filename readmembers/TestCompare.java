public class TestCompare {
	public static void main(String[] args){
		Member m1 = new Member(420, "Elias", "Eldh", "1994-08-10", 
					"2001-01-01", 0, "Fnatic", 1);
		Member m2 = new Member(1337, "Viktor", "Eldh", "1994-05-01", 
					"2000-01-01", 0, "Fnatic", 1);

		int xXx = m1.compareTo(m2);
		System.out.println(xXx);
	}
}