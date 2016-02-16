public class readMembers {

	public static void main(String[] args){

		private ArrayList<Member> members = new ArrayList<>();
		private int id = 0;
		private String name 0 "";
		private String familyName = "";
		private String birthDate = "";
		private String memberSinceDate = "";
		private int role = 0;
		private String team = "";
		private int gender = 1;
		private Member newMember;
		

		while(true){
			//get all variables

			newMember = new Member(id, name, familyName, birthDate,
						 		memberSinceDate, role, team, gender);
			members.add(newMember);
		}

	}

}