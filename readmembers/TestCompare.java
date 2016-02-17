import java.util.*;

public class TestCompare {
	public static void main(String[] args){
		Member m1 = new Member(420, "Elias", "Eldh", "1994-08-10", 
								"2001-01-01", 0, "Fnatic", 1);
		Member m2 = new Member(1337, "Viktor", "Svensson", "1994-05-01", 
								"2000-01-01", 0, "Fnatic", 1);
		Member m3 = new Member(1, "ds", "strid", "1994",
								 "2016", 0, "Fnatic", 1);

		ArrayList<Member> memebersList = new ArrayList<>();

		memebersList.add(m3);
		memebersList.add(m2);
		memebersList.add(m1);

		//unsorted print
		for(Member m : memebersList){
			System.out.println(m);
		}

		Collections.sort(memebersList, new CompareName());
		System.out.println("\n");

		//sorted print
		for(Member m : memebersList){
			System.out.println(m);
		}
	}
}
