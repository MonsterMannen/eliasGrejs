public class Member {
	//variables
	private int id;
	private String name;
	private String familyName;
	private String birthDate;
	private String memberSinceDate;
	private int role;
	private String team;
	private int gender;

	//constructor
	public Member(int id, String name, String familyName, String birthDate, 
					String memberSinceDate, int role, String team, int gender){
		this.id = id;
		this.name = name;
		this.familyName = familyName;
		this.birthDate = birthDate;
		this.memberSinceDate = memberSinceDate;
		this.role = role;
		this.team = team;
		this.gender = gender;
	}

	public void printMember(){
		System.out.println();
	}
}

/*
	/\
	||
	||
	||
  *====*
	||    
    OO

*/