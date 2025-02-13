package exercise;
public class ExtractClass {
// todo extract class TelephoneNumber from class Person
	class Person {
	  private String name;
	  private String officeAreaCode;
	  private PersonData data = new PersonData();

	public String getName() {
		return name;
	  }
	  public String getTelephoneNumber() {
		return ("(" + officeAreaCode + ") " + data.officeNumber);
	  }
	  public String getOfficeAreaCode() {
		return officeAreaCode;
	  }
	  public void setOfficeAreaCode(String arg) {
		officeAreaCode = arg;
	  }
	  public String getOfficeNumber() {
		return data.officeNumber;
	  }
	  public void setOfficeNumber(String arg) {
		data.officeNumber = arg;
	  }
	}
}