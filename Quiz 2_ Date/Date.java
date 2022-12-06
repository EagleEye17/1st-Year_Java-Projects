
public class Date {
	
	private int year;
	private int month;
	private int day;
	
	public Date() {
		this(0, 0, 0);
	}
	
	public Date(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public void output() {
		
		if(this.month == 1) {
			if(this.day < 1 || this.day > 31) {
				System.out.println("Invalid number of days");
			}else {
				System.out.println("January " + this.day + ", " + this.year);
				System.out.println("31 days");
				leap_year_checker();
			}
		}
		
		if(this.month == 2) {
			if(this.day < 1 || this.day > 28) {
				System.out.println("Invalid number of days");
			}else {
				System.out.println("February " + this.day + ", " + this.year);
				System.out.println("29 days");
				leap_year_checker();
			}
		}
		
		if(this.month == 3) {
			if(this.day < 1 || this.day > 31) {
				System.out.println("Invalid number of days");
			}else {
				System.out.println("March " + this.day + ", " + this.year);
				System.out.println("31 days");
				leap_year_checker();
			}
		}
		
		if(this.month == 4) {
			if(this.day < 1 || this.day > 30) {
				System.out.println("Invalid number of days");
			}else {
				System.out.println("April " + this.day + ", " + this.year);
				System.out.println("30 days");
				leap_year_checker();
			}
		}
		
		if(this.month == 5) {
			if(this.day < 1 || this.day > 31) {
				System.out.println("Invalid number of days");
			}else {
				System.out.println("May " + this.day + ", " + this.year);
				System.out.println("31 days");
				leap_year_checker();
			}
		}
		
		if(this.month == 6) {
			if(this.day < 1 || this.day > 30) {
				System.out.println("Invalid number of days");
			}else {
				System.out.println("June " + this.day + ", " + this.year);
				System.out.println("30 days");
				leap_year_checker();
			}
		}
		
		if(this.month == 7) {
			if(this.day < 1 || this.day > 31) {
				System.out.println("Invalid number of days");
			}else {
				System.out.println("July " + this.day + ", " + this.year);
				System.out.println("31 days");
				leap_year_checker();
			}
		}
		
		if(this.month == 8) {
			if(this.day < 1 || this.day > 31) {
				System.out.println("Invalid number of days");
			}else {
				System.out.println("August " + this.day + ", " + this.year);
				System.out.println("31 days");
				leap_year_checker();
			}
		}
		
		if(this.month == 9) {
			if(this.day < 1 || this.day > 30) {
				System.out.println("Invalid number of days");
			}else {
				System.out.println("September " + this.day + ", " + this.year);
				System.out.println("30 days");
				leap_year_checker();
			}
		}

		if(this.month == 10) {
			if(this.day < 1 || this.day > 31) {
				System.out.println("Invalid number of days");
			}else {
				System.out.println("October " + this.day + ", " + this.year);
				System.out.println("31 days");
				leap_year_checker();
			}
		}
		
		if(this.month == 11) {
			if(this.day < 1 || this.day > 30) {
				System.out.println("Invalid number of days");
			}else {
				System.out.println("November " + this.day + ", " + this.year);
				System.out.println("30 days");
				leap_year_checker();			}
		}

		if(this.month == 12) {
			if(this.day < 1 || this.day > 31) {
				System.out.println("Invalid number of days");
			}else {
				System.out.println("December " + this.day + ", " + this.year);
				System.out.println("31 days");
				leap_year_checker();
			}
		}
		
	}
	
	public void leap_year_checker() {
		
		if(this.year % 4 == 0 && this.year % 100 != 0 || this.year % 400 == 0) {
			System.out.println(this.year + " is a Leap Year");
		}
		else {
			System.out.println(this.year + " is a Common Year");
		}
		
	}

	// GETTERS AND SETTERS
	
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}
	
}
