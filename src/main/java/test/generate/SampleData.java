package test.generate;

import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

public class SampleData {

	public static String[] firstNames = { "Norah", "Samantha", "Esha", "Gloria", "Theodor", "Ameera", "Amritpal",
			"Ishmael", "Leja", "Brielle", "Jagoda", "Liana", "Kajal", "Sasha", "Louie", "Leanna", "Seb", "Nevaeh",
			"Felix", "Jay", "Ayyub", "Suranne", "Kiana", "Abdurrahman", "Warren", "Chace", "Kylan", "Lacie-Mae",
			"Gracie", "Eliana", "Aqeel", "Kiara", "Lexi", "Luqman", "Tymon", "Lucille", "Abdallah", "Dougie", "Nadeem",
			"Devin", "Che", "Rocky", "Anees", "Safiyyah", "Melissa", "Sanjay", "Tommie", "Steven", "Rodney", "Yara",
			"Constance", "Yuvraj", "Zayaan", "Layla-Mae", "Shanice", "Dominic", "Fabien", "Rebeca", "Enrico", "Meera",
			"Jeanette", "Hayley", "Isobella", "Daisy-May", "Roshni", "Sidney", "Terry", "Aaminah", "Atticus", "Lorcan",
			"Lauren", "Adem", "Lyndon", "Cohen", "Alesha", "Talhah", "Coby", "Priscilla", "Ruby-May", "Caroline",
			"Niam", "Yusra", "Kaylie", "Eleri", "Kabir", "Harvey", "Taliyah", "Sophie-Louise", "Kaitlyn", "Alix",
			"Fatima", "Sommer", "Scarlett-Rose", "Thiago", "Mila", "Brayden", "Austen", "Honor", "Sierra" };

	public static String[] lastNames = { "Cartwright", "Coulson", "Vega", "Murillo", "Buck", "Farrington", "Bloom",
			"Trujillo", "Mill", "Todd", "Wharton", "Saunders", "Burn", "Best", "Dejesus", "Turner", "Osborne",
			"Haworth", "Ferry", "Herbert", "Owens", "Cotton", "Goddard", "Mccall", "Hickman", "Martins", "Macfarlane",
			"Bray", "Meyer", "Gamble", "Crosby", "Corbett", "Hardin", "Joseph", "Farrow", "Morse", "Mcghee", "Deleon",
			"Hart", "Schroeder", "Barnes", "Dolan", "Busby", "Maynard", "Boyce", "Weston", "Stephenson", "Person",
			"Almond", "Collier", "Bates", "Lester", "Clark", "Mckenna", "Wilkins", "Cummings", "Doyle", "Heaton",
			"Dalton", "Mahoney", "Diaz", "Schneider", "Melendez", "Chan", "Hines", "Bartlett", "Lin", "Moyer", "Knight",
			"Dennis", "Wells", "Boyle", "Hahn", "Anthony", "Nicholson", "Winter", "Flores", "Kim", "Fields", "Fry",
			"Durham", "Magana", "Watt", "Molina", "Ibarra", "Martinez", "Sparrow", "Copeland", "Houghton", "Eaton",
			"Cross", "Roth", "Cameron", "Rooney", "Archer", "Walls", "Bonilla", "Donald", "Marks" };

	public static String[] locationNames = { "Sungkur Lor", "Situburung", "Babakan", "Molino Satu", "Geloeng",
			"Citapen Dalam", "Ciledug", "Kamalawatar Barat", "Balong", "Sukajadi", "Kelapatinggi", "Kalijudan",
			"Pasirtangkil", "Pakuwesi", "Otaklendang", "Sadawangi", "Karangpondong", "Wakumoro", "Gedeg", "Hacar",
			"Kajoemangiwa", "Dago", "Ketanggi", "Puukapaka", "Tangnga", "Jeruknipis", "Naga Boentoe", "Telukkuantan",
			"Tutung", "Pandeyan", "Weda", "Cibunar", "Pematang Merbau", "Kaligana", "Dimadjar", "Cabangtiga", "Jati 1",
			"Sonorejo", "Lhokleumak", "Kampung Baru", "Sabantulung", "Tampungkrajan", "Padangtjermin", "Serayu",
			"Tongo", "Cikalaht-tengah", "Jombor", "Jeruk Timur", "Parangkarambil", "Plalangan" };

	public static String[] races = { "Asian", "African", "Chinese", "European" };
	
	public static String[] gender = {"Male", "Female", "Wish Not to Specify"};

	public static String[] jobs = { "Utilities Manager", "Graphic Designer", "Oil Field Equipment Mechanic Supervisor",
			"Geriatric Physical Therapist", "Institutional Commodity Analyst", "Staff Anesthetist", "Forestry Laborer",
			"Well Service Rig Operator", "Menswear Salesperson", "Aircraft Electrician" };

	static String getAlphaNumericString(int n) {

		// chose a Character random from this String
		String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + "abcdefghijklmnopqrstuvxyz";

		// create StringBuffer size of AlphaNumericString
		StringBuilder sb = new StringBuilder(n);

		for (int i = 0; i < n; i++) {

			// generate a random number between
			// 0 to AlphaNumericString variable length
			int index = (int) (AlphaNumericString.length() * Math.random());

			// add Character one by one in end of sb
			sb.append(AlphaNumericString.charAt(index));
		}

		return sb.toString();

	}

	public static Date between(Date startInclusive, Date endExclusive) {
		long startMillis = startInclusive.getTime();
		long endMillis = endExclusive.getTime();
		long randomMillisSinceEpoch = ThreadLocalRandom.current().nextLong(startMillis, endMillis);

		return new Date(randomMillisSinceEpoch);
	}

}
