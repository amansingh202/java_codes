public class Date {
  private int month;
  private int day;
  private int year;
  
  private static final int [] validDays = {0,31,28,31,30,31,30,31,31,30,31,30,31};  
  private static final int DEFAULT_DAY=1, DEFAULT_MONTH=1, DEFAULT_YEAR=2000;

  public Date( )  {
	  month=DEFAULT_MONTH;
	  day=DEFAULT_DAY;
	  year=DEFAULT_YEAR;
  }

  public Date( int mm, int dd, int yyyy ) {
    setDate( mm, dd, yyyy );
  }

  int getMonth( ) { return month; }
  int getDay( )   { return day; }
  int getYear( )  { return year; }

  private void setMonth( int mm ) {
    month = ( mm >= 1 && mm <= 12 ? mm : DEFAULT_MONTH );
  }

  private void setDay( int dd ) {
  	int maxDays=validDays[month];
	  if (leapYear() && month==2) {
		  maxDays=29;
	  }
    day = ( dd >= 1 && dd <= maxDays ? dd : DEFAULT_DAY );
  }

  private void setYear( int yyyy ) {
    year = yyyy;
  }

  public void setDate( int mm, int dd, int yyyy ) {
    setYear(yyyy);
    setMonth( mm );
    setDay( dd );
  }

  public String toString( ) {
    return month + "/" + day + "/" + year;
  }

  public boolean equals( Date d ) {
    return ( month == d.month && day == d.day  && year == d.year );
  }

  public boolean leapYear() {
    return ((year%4==0) && ((year%100!=0)||(year%400==0))); 
  }
  
  public int compareTo(Date that) {    // improvement would to return the number of days between, like String returns the difference in ASCII values
	  if (this.year<that.year) {
	    return -1;
	  }
  	else {
  	  if (this.year>that.year) {
  	     return 1;
  	  }
      else {
        if (this.month<that.month) {
          return -1;
        }
    		else {
    		  if (this.month>that.month) {
    		    return 1;
    		  }
      		else {
		        if (this.day<that.day) {
		          return -1;
		        }
      			else {
      			  if (this.day>that.day) {
      			    return 1;
      			  }
        			else {
        			  return 0;
        			}
      			}
      		}
    		}
      }
		}
  }
  public void incrementMonth() {
	  if (month==12) {
		  setMonth(1);
		  setYear(year+1);
    }
    else {
      setMonth(month+1);
    }
    int maxDays = validDays[month];    
	  if (leapYear() && month==2) {
	    maxDays=29;
	  }
	  if (day>maxDays) {
	    setDay(maxDays);
	  }
  }
}