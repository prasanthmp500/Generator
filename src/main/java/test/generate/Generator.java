package test.generate;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Generator {

	public static void main(String[] args) {

		// String header = "msisdn, firstname, last name, address, emailaddress,
		// loginid, license number, social security number, passport number, credit card
		// details, date of birth, location, gender, race, age, job";

		
		FileWriter fw;
		try {
			fw = new FileWriter("/tmp/onemillion.csv", true);
	
	    BufferedWriter bw = new BufferedWriter(fw);
	    PrintWriter out = new PrintWriter(bw);

		
		long msisdnInitial = 830456489;
		
		out.println("msisdn,firstName,lastName,address,emailAddress,loginId,licenseNumber,socialSecurityNumber,passPortNumber,crediCardDetails,dateOfBirth,location,gender,race,age,job");

		for (long i = 0; i < 1000000; i++) {
			Person p = new Person(msisdnInitial+ i );
			out.println(p.print());
		}

		out.close();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
