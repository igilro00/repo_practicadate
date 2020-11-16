package es.unileon.prg1.date;

public class Date {
	private int day;
	private int month;
	private int year;

	public Date (int day, int month, int year) throws DateException {
		this.setMonth(month);
		this.setDay(day);
		this.setYear(year);
	}

	public void setDay (int day) throws DateException {
		if ( day < 1 || day > this.getDaysOfMonth() ) {
			throw new DateException("Date error: Day " + day + " of month " + this.month + " not valid");
		}
		this.day = day;
	}

	public void setMonth (int month) throws DateException {
		if ( month < 1 || month > 12 ) {
			throw new DateException("Date error: Month " + month + " not valid");
		}
		this.month = month;
	}

	public void setYear (int year) {
		this.year = year;
	}

	private int getDaysOfMonth() {
		int numDays;

		numDays = 0;
		switch (this.month) {
			case 1: 
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				numDays = 31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				numDays = 30;
				break;
			case 2:
				numDays = 28;
				break;
		}
		return numDays;
	}

	public String toString() {
		return this.day + "/" + this.month + "/" + this.year;
	}

	public boolean isSameYear (int year){
		boolean isSame;
		isSame = false;
		if ( this.year == year ) {
			isSame = true;
		}
		return isSame;
	}

	public boolean isSameMonth (int month){
		boolean isSame;
		isSame = false;
		if ( this.month == month ) {
			isSame = true;
		}
		return isSame;
	}

	public boolean isSameDay (int day){
		boolean isSame;
		isSame = false;
		if ( this.day == day ) {
			isSame = true;
		}
		return isSame;
	}

	public boolean isSame (int day,int month,int year){
		boolean isSameDate;
		isSameDate = false;

		if ( this.year == year && this.month == month && this.day == day ) {
			isSameDate = true;
		}
		return isSameDate;
	}


	public boolean isSameYear2 (int year){
		return this.year == year;
	}

	public boolean isSameMonth2 (int month){
		return this.month == month;
	}

	public boolean isSameDay2 (int day){
		return this.day == day;
	}

	public boolean isSameDate2 (int year, int month, int day){
		return this.year == year && this.month == month && this.day == day;
	}

	public String nameOfMonth (int month) {
		String name;
		name = "";
		switch (month) {
			case 1:
				name = "January";
				break;
			case 2:
				name = "February";
				break;
			case 3:
				name = "March";
				break;
			case 4:
				name = "April";
				break;
			case 5:
				name = "May";
				break;
			case 6:
				name = "June";
				break;
			case 7:
				name = "July";
				break;
			case 8:
				name = "August";
				break;
			case 9:
				name = "September";
				break;
			case 10:
				name = "October";
				break;
			case 11:
				name = "November";
				break;
			case 12:
				name = "December";
				break;
		}
		return name;
	}

	public boolean checkDay (int day) {
		boolean ok;
		ok = true;
		if ( day < 1 || day > this.getDaysOfMonth() ) {
			ok = false;
		}
		return ok;
	}

	public String seasonOfMonth (int month) {
		String season = "";
		switch (month) {
			case 1:
			case 2:
			case 3:
				season = "winter";
				break;
			case 4:
			case 5:
			case 6:
				season = "spring";
				break;		
			case 7:
			case 8:
			case 9:
				season = "summer";
				break;
			case 10:
			case 11:
			case 12:
				season = "autumn";
				break;
		}
		return season;
	}
	
	
	public int monthsToEndOfYear() {
		int monthsLeft;
	        monthsLeft = 12 - this.month;
		return monthsLeft;
	}


	public String toString2 () {
		return this.day + " of " + nameOfMonth(this.month) + " of " + this.year ;
	}



	public String allDatesToEndOfMonth() {	
		String days;
		days = "";
		for ( int i = this.day + 1 ; i < getDaysOfMonth() + 1 ; i++ ) {
			days = days + " " + i + "/" + this.month + "/" + this.year;
		}
		return days;
	}

	public int monthsWithSameDays() {
		int months;
		months = 0;
		switch ( getDaysOfMonth() ) {
			case 31:
				months = 6;
				break;
			case 30:
				months = 3;
				break;
			case 28:
				months = 0;
				break;
		}
		return months;
	}

	public int numberOfDaysUntilToday() {
		int days;
		days = 0;
		switch ( this.month ) {
			case 1:
				days = this.day;
				break;
			case 2:
				days = this.day + 31;
				break;
			case 3:
				days = this.day + 59;
				break;
			case 4:
				days = this.day + 90;
				break;
			case 5:
				days = this.day +120;
				break;
			case 6:
				days = this.day + 151;
				break;
			case 7:
				days = this.day + 181;
				break;
			case 8:
				days = this.day + 212;
				break;
			case 9:
				days = this.day + 243;
				break;
			case 10:
				days = this.day + 273 ;
				break;
			case 11:
				days = this.day + 304;
				break;
			case 12:
				days = this.day + 334;
				break;
		}
		return days;
	}

	public int attemptToMatchDate() {
		int i = 0;
		int d = 0;
		int m = 0;
		while ( d != this.day || m != this.month ) {
			d = (int) Math.random()*32;
			m = (int) Math.random()*13;
			i++;
		}
		return i;
	}

	public int attemptToMatchDate2() {
		int i = 1;
		int d = 0;
		int m = 0;
		do {
			d = (int) Math.random()*32;
			m = (int) Math.random()*13;
			i++;

		}
		while ( d != this.day || m != this.month );
		return i - 1;
	}	

	public int dayOfWeek(int firstWeekDay) {
		int weekDay = 0;
		int daysToDate = numberOfDaysUntilToday();
		int n = daysToDate % 7;
		int s = firstWeekDay + n;
		if ( s > 7 ){
			weekDay = s - 7;
		}else{
			weekDay = s;
		}
		return weekDay;
	}	



	




}