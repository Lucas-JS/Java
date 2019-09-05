package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class DateExamples {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		
		Date y1 = sdf1.parse("05/09/2019");
		Date y2 = sdf2.parse("05/09/2019 19:23:35");
		Date y3 = Date.from(Instant.parse("2019-09-05T15:42:07Z"));
		
		Date x1 = new Date();
		Date x2 = new Date(System.currentTimeMillis());
		Date x3 = new Date(0L);
		
		System.out.println("y1: "+sdf1.format(y1));
		System.out.println("y2: "+sdf2.format(y2));
		System.out.println("y3: "+sdf3.format(y3));
		System.out.println("x1: "+sdf2.format(x1));
		System.out.println("x2: "+sdf2.format(x2));
		System.out.println("x3: "+sdf2.format(x3));
			
	}
	
}
