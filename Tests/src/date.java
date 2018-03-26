import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class date {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		
		String test1 = "1995/10/31";
		Date date = dateFormat.parse(test1);

		System.out.println(dateFormat.format(date)); 
		
		System.out.println("This is my app!");

	}

}
