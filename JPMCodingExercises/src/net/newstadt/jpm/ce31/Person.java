package net.newstadt.jpm.ce31;

public class Person {
	private String firstName;
	private String lastName;
	private int age;

	public boolean isTeen() {
		return (age > 12) && (age < 20);
	}

	public String getFullName() {
		String fullName = "";

		fullName += (!firstName.isEmpty())? this.firstName + " " : "";
		
//		if (!firstName.isEmpty()) {
//			fullName = this.firstName + " ";
//		}  ternary operator is more concise but if statements might be more readable.  both ways work.

		fullName +=(!lastName.isEmpty()) ? this.lastName : "";
		
//		if (!lastName.isEmpty()) {
//			fullName += this.lastName;
//		} ternary operator is more concise but if statements might be more readable.  both ways work.

		return fullName.trim();

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if ((age < 0) || (age > 100)) {
			this.age = 0;
		} else {
			this.age = age;
		}
	}

}
