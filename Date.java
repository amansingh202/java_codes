public class Date {
  private int day;
  private int month;
  private int year;
  private static final int DEFAULT_YEAR=2000,  DEFAULT_MONTH=1,  DEFAULT_DAY=1;

  /** default constructor
  *  sets month to 1, day to 1 and year to 2000 (the defaults)
  */
  public Date( )   {
    setDate( DEFAULT_MONTH, DEFAULT_DAY, DEFAULT_YEAR);
  }

  /** overloaded constructor
  *  @param mm    initial value for month
  *  @param dd    initial value for day
  *  @param yyyy  initial value for year
  *
  *  passes parameters to setDate method
  */
  public Date( int mm, int dd, int yyyy )   {
    setDate( mm, dd, yyyy );
  }

  /** accessor method
  *  returns the month
  */
  public int getMonth( ) { return month; }

  /** accessor method
  *  returns the day
  */
  public int getDay( )   { return day; }
  
  /** accessor method
  *  returns the year
  */
  public int getYear( )  { return year; }

  /** mutator method */
  /** setDate
  *  @param mm    new value for month
  *  @param dd    new value for day
  *  @param yyyy  new value for year
  *  passes parameters to setMonth, setDay, and setYear for validation and setting
  */
  public void setDate( int mm, int dd, int yyyy )   {
    setYear(yyyy);
    setMonth( mm );
    setDay( dd );
  }
  
  /** helper methods */  
  /** setDay (private)
  *  @param dd new value for day
  *  if dd is legal day for current month, sets day to dd
  *  otherwise, sets day to 1
  */
  private void setDay( int dd )   {
    int [] validDays = { 0,  31, 29, 31, 30,
                         31, 30, 31, 31, 30,
                         31, 30, 31 };
	if (dd >= 1 && dd <= validDays[month] ) {
	  day = dd;
	}
	else {
	  day = DEFAULT_DAY;
	}
  } 
  /** setMonth (private)
  *  @param mm new value for month
  *  if mm is between 1 and 12, sets month to mm
  *  otherwise, sets month to 1
  */
  private void setMonth( int mm ) {
	if (mm >= 1 && mm <= 12) {
	  month = mm;
	}
	else {
	  month = DEFAULT_MONTH;
	}
  }
  /** setYear (private)
  *  @param yyyy new value for year
  *  sets year to yyyy
  */
  private void setYear( int yyyy ) {
    year = yyyy;
  }
  
  /** toString
  *  @return String
  *  returns date in mm/dd/yyyy format
  */
  public String toString( ) {
    return month + "/" + day + "/" + year;
  }
}