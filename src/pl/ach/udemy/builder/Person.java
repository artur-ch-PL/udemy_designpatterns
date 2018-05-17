package pl.ach.udemy.builder;

public class Person {
	//address
	public String streetAddress;
	public String postcode;
	public String city;
	
	//work
	public String companyName;
	public String position;
	public int annualIncome;
	
	@Override
	public String toString(){
		 return "Person{" +
			      "streetAddress='" + streetAddress + '\'' +
			      ", postcode='" + postcode + '\'' +
			      ", city='" + city + '\'' +
			      ", companyName='" + companyName + '\'' +
			      ", position='" + position + '\'' +
			      ", annualIncome=" + annualIncome +
			      '}';
	}
	
}
