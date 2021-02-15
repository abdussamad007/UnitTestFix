package banking;

public class Person {
	private String firstName;
	private String lastName;
	private int idNumber;

	public int getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}

	public Person(String firstName, String lastName, int idNumber) {
		// complete the function
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		// complete the function
        return firstName;
	}

	public String getLastName() {
		// complete the function
        return lastName;
	}
}
