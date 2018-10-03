//author: Mike Finnessey
public class Entry {
	//TODO A class to model a single entry.
	private static int nextEntryNumber = 0;
	private static int nextSchoolNumber = 0;
	private String name1;
	private String name2;
	private String schoolCode;
	private int schoolNumber;
	private String division;
	private String event;
	private String entryCode;
	private int entryNumber;

	public Entry(String name1, String name2, String schoolCode, String division, String event) {
		this.name1 = name1;
		this.name2 = name2;
		this.schoolCode = schoolCode;
		this.division = division;
		this.event = event;
		this.entryNumber = nextEntryNumber++;
		this.entryCode = (schoolCode + " " + this.name1.charAt(0) + this.name2.charAt(0));
	}
	
	public Entry(String name1, String schoolCode, String division, String event) {
		this.name1 = name1;
		this.schoolCode = schoolCode;
		this.division = division;
		this.event = event;
		this.entryNumber = nextEntryNumber++;
		this.entryCode = schoolCode + " " + this.name1.charAt(0);
	}

}
