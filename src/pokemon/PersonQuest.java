package pokemon;

public class PersonQuest extends Person {

	public PersonQuest(String firstName, String lastName, String displayName, 
			PeopleType type, boolean gender, int id) {
		super(firstName, lastName, displayName, type, gender, id);
		super.setClassID('Q');
		// TODO Auto-generated constructor stub
	}

}
