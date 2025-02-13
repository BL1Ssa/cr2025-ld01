package exercise;
public class ExtractClass {
// to do extract class TelephoneNumber from class Person
	class Person {
	  private String name;
	  private PersonData TelephoneNumber = new PersonData();

	public String getName() {
		return name;
	  }
	  public String getTelephoneNumber() {
		return ("(" + TelephoneNumber.officeAreaCode + ") " + TelephoneNumber.officeNumber);
	  }
	  public String getOfficeAreaCode() {
		return TelephoneNumber.officeAreaCode;
	  }
	  public void setOfficeAreaCode(String arg) {
		TelephoneNumber.officeAreaCode = arg;
	  }
	  public String getOfficeNumber() {
		return TelephoneNumber.officeNumber;
	  }
	  public void setOfficeNumber(String arg) {
		TelephoneNumber.officeNumber = arg;
	  }
	}
	
	class TelephoneNumber{
		
	}
}