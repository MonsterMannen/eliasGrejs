public class Member implements Comparable {
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

	public String getFamilyName(){
		return familyName;
	}

	public String getName(){
		return name;
	}

	public void printMember(){
		System.out.println(id + ", " + name + ", " + familyName + ", "
		 + birthDate + ", " + memberSinceDate + ", " + role + ", "
		 + team + ", " + gender);
	}

	@Override
	public int compareTo(Object obj){
		Member memeber = (Member) obj;
		int theD = familyName.compareTo(memeber.getFamilyName());
		if(theD == 0){
			theD = name.compareTo(memeber.getName());
		}
		return theD;
	}

	//works?
	@Override
	public boolean equals(Object obj){
		Member memeber = (Member) obj;
		return (this.compareTo(memeber) == 0);
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

  rogue sword

*/