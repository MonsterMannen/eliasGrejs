import java.io.*;
import java.util.*;

public class readMembers {

	public ArrayList<Member> members = new ArrayList<>();

	public String fileName = "memebers.txt";	//file to read from
	public File file = new File(fileName);
	public String line;
	public int pos;
	public Member newMember;
	public Scanner sc;

	public int id = 0;
	public String name = "";
	public String familyName = "";
	public String birthDate = "";
	public String memberSinceDate = "";
	public int role = 0;
	public String team = "";
	public int gender = 1;

	// <<< main function >>>
	public static void main(String[] args){
		readMembers rm = new readMembers();
		rm.readMembers();
		System.out.println("\n" + rm.members.size() + " memebers read from " + rm.fileName);

	}

	public void readMembers(){

		try{
			sc = new Scanner(file);
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}

		while(sc.hasNextLine()){
			//get the row with all data
			line = sc.nextLine();

			//get id
			pos = line.indexOf(';');
			id = Integer.parseInt(line.substring(0, pos));
			line = line.substring(pos+1);

			//get name
			pos = line.indexOf(';');
			name = line.substring(0, pos);
			line = line.substring(pos+1);

			//get familyName
			pos = line.indexOf(';');
			familyName = line.substring(0, pos);
			line = line.substring(pos+1);

			//get birthDate
			pos = line.indexOf(';');
			birthDate = line.substring(0, pos);
			line = line.substring(pos+1);

			//get memberSinceDate
			pos = line.indexOf(';');
			memberSinceDate = line.substring(0, pos);
			line = line.substring(pos+1);

			//get role
			pos = line.indexOf(';');
			role = Integer.parseInt(line.substring(0, pos));
			line = line.substring(pos+1);

			//get team
			pos = line.indexOf(';');
			team = line.substring(0, pos);
			line = line.substring(pos+1);

			//get gender
			gender = Integer.parseInt(line);

			//create member
			newMember = new Member(id, name, familyName, birthDate,
						 		memberSinceDate, role, team, gender);
			//put member in list
			members.add(newMember);

			//test
			newMember.printMember();
		}
	}
}
