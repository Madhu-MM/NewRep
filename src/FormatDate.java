import java.util.Date;
import java.text.SimpleDateFormat;

public class FormatDate 
{
	public static String FormattedDate(Date d)
	{
		SimpleDateFormat format1 = new SimpleDateFormat("dd.MM.yyyy");
		return format1.format(d);
	}

	public static void main(String[] args) {
		Date d;
		
		d = new Date();
		
		System.out.println("Current date is : " + d);
		
		System.out.println("Formatted date is : " + FormattedDate(d));
	}
}
