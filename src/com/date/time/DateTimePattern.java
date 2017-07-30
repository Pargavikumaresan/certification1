package
com.date.time;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DateTimePattern { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date1 = LocalDate.of(2020, Month.JANUARY, 20);
		LocalTime time = LocalTime.of(11, 12, 34); 
		LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
		LocalDateTime dateTime = LocalDateTime.of(date1, time);
		DateTimeFormatter f = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm"); 
		System.out.println(dateTime.format(f));     // January 20, 2020, 11:12
		DateTimeFormatter f1 = DateTimeFormatter.ofPattern("MM dd, yyyy, hh:mm"); 
		System.out.println(dateTime.format(f1));     // 01 20, 2020, 11:12
		/*SimpleDateFormat sf = new SimpleDateFormat("hh:mm");
	System.out.println(sf.format(time));
	*/
       DateTimeFormatter f2 = DateTimeFormatter.ofPattern("hh:mm"); 
	   System.out.println(dateTime.format(f2));
	   DateTimeFormatter f3 = DateTimeFormatter.ofPattern("hh:mm");  
	   System.out.println( f3.format(dateTime));
	   System.out.println(f3.format(time));
	 //  System.out.println(f3.format(date));
	   DateTimeFormatter f4 = DateTimeFormatter.ofPattern("MM dd yyyy");
	   LocalDate date2 = LocalDate.parse("01 02 2015", f4);
	   LocalTime time1 = LocalTime.parse("11:22");
	   System.out.println(date2);          // 2015-01-02 
	   System.out.println(time1);          // 11:22

	}

}
