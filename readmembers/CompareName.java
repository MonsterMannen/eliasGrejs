import java.util.*;

public class CompareName implements Comparator {
	public int compare(Object o1, Object o2){

		Member m1 = (Member) o1;
		Member m2 = (Member) o2;

		
		int nameCompare = m1.getFamilyName().compareTo(m2.getFamilyName());

		if(nameCompare == 0){
			nameCompare = m1.getName().compareTo(m2.getName());
		}

		return nameCompare;
	}
}
