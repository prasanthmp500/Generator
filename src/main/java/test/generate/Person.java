package test.generate;

import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Person {

	// String header = "msisdn, firstname, last name, address, emailaddress, loginid, license number, social security number, passport number, credit card details, date of birth, location, gender, race, age, job";

	private long msisdn;

	private String firstName;

	private String lastName;

	private String address;

	private String emailAddress;

	private String loginId;

	private String licenseNumber;

	private String socialSecurityNumber;

	private String passPortNumber;

	private String crediCardDetails;

	private String dateOfBirth;

	private String location;

	private String gender;

	private String race;

	private int age;

	private String job;

	public Person(long msisdn) {
		this.msisdn = msisdn;
		this.getFirstName();
		this.getLastName();
		this.getAddress();
		this.getEmailAddress();
		this.getLoginId();
		this.getLicenseNumber();
		this.getSocialSecurityNumber();
		this.getPassPortNumber();
		this.getCrediCardDetails();
		this.getDateOfBirth();
		this.getLocation();
		this.getGender();
		this.getRace();
		this.getAge();
		this.getJob();
		
//		private long msisdn;
//
//		private String firstName;
//
//		private String lastName;
//
//		private String address;
//
//		private String emailAddress;
//
//		private String loginId;
//
//		private String licenseNumber;
//
//		private String socialSecurityNumber;
//
//		private String passPortNumber;
//
//		private String crediCardDetails;
//
//		private String dateOfBirth;
//
//		private String location;
//
//		private String gender;
//
//		private String race;
//
//		private int age;
//
//		private String job;
	}

	public long getMsisdn() {
		return msisdn;
	}

	public void setMsisdn(long msisdn) {
		this.msisdn = msisdn;
	}

	public String getFirstName() {
		this.firstName = SampleData.firstNames[new Random().nextInt(SampleData.firstNames.length)];
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		this.lastName = SampleData.lastNames[new Random().nextInt(SampleData.lastNames.length)];
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		this.address = "73, The Lodge, Seaview Manor, Baldoyel , D13";
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmailAddress() {
		this.emailAddress = firstName.toLowerCase().concat(".").concat(lastName.toLowerCase()).concat("@gmail.com");
		return this.emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getLoginId() {
		this.loginId = lastName.concat(firstName.substring(0, 1)).toLowerCase();
		return this.loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getLicenseNumber() {
		this.licenseNumber = SampleData.getAlphaNumericString(8).toUpperCase();
		return this.licenseNumber;
	}

	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}

	public String getSocialSecurityNumber() {
		this.socialSecurityNumber = SampleData.getAlphaNumericString(16).toUpperCase();
		return this.socialSecurityNumber;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	public String getPassPortNumber() {
		this.passPortNumber = SampleData.getAlphaNumericString(10).toUpperCase();
		return this.passPortNumber;
	}

	public void setPassPortNumber(String passPortNumber) {
		this.passPortNumber = passPortNumber;
	}

	public String getCrediCardDetails() {
		this.crediCardDetails = SampleData.getAlphaNumericString(16).toUpperCase();
		return this.crediCardDetails;
	}

	public void setCrediCardDetails(String crediCardDetails) {
		this.crediCardDetails = crediCardDetails;
	}

	public String getDateOfBirth() {
		long aDay = TimeUnit.DAYS.toMillis(1);
		long now = new Date().getTime();
		Date hundredYearsAgo = new Date(now - aDay * 365 * 100);
		Date tenDaysAgo = new Date(now - aDay * 10);
		SampleData.between(hundredYearsAgo, tenDaysAgo);
		this.dateOfBirth = SampleData.between(hundredYearsAgo, tenDaysAgo).toString();
		return this.dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getLocation() {
		this.location = SampleData.locationNames[new Random().nextInt(SampleData.locationNames.length)];
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getGender() {
		this.gender = SampleData.gender[new Random().nextInt(SampleData.gender.length)];
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getRace() {
		this.race = SampleData.races[new Random().nextInt(SampleData.races.length)];
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public int getAge() {
		this.age = 40;
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getJob() {
		this.job = SampleData.jobs[new Random().nextInt(SampleData.jobs.length)];
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String print() {
		
		return  msisdn + "," + firstName + "," + lastName + ","
				+ address + "," + emailAddress + "," + loginId + ","
				+ licenseNumber + "," + socialSecurityNumber + ","
				+ passPortNumber + "," + crediCardDetails + "," + dateOfBirth
				+ "," + location + "," + gender + "," + race + "," + age + "," + job
				;
	}
	
	public void test() {
		
	}
	
	@Override
	public String toString() {
		return "Person [msisdn=" + msisdn + ", firstName=" + firstName + ", lastName=" + lastName + ", address="
				+ address + ", emailAddress=" + emailAddress + ", loginId=" + loginId + ", licenseNumber="
				+ licenseNumber + ", socialSecurityNumber=" + socialSecurityNumber + ", passPortNumber="
				+ passPortNumber + ", crediCardDetails=" + crediCardDetails + ", dateOfBirth=" + dateOfBirth
				+ ", location=" + location + ", gender=" + gender + ", race=" + race + ", age=" + age + ", job=" + job
				+ "]";
	}
	
	
}
