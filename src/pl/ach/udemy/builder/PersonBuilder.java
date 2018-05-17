package pl.ach.udemy.builder;

public class PersonBuilder {
	Person person = new Person();
	
	public PersonJobBuilder works() {
		return new PersonJobBuilder(person);
	}
	
	public PersonAddressBuilder lives() {
		return new PersonAddressBuilder(person);
	} 
	
	public Person build() {
		return person;
	}
}
