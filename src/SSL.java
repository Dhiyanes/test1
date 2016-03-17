import java.util.Calendar;
import java.util.Date;





public class SSL {
	
	
//	public static void main(String[] args) {
//		
//		System.setProperty("javax.net.ssl.trustStore", "D:/Dhiyanes/whp-jboss-web-5/server/default/conf/truststore.jks");
//		System.setProperty("javax.net.ssl.trustStorePassword", "changeit");
//		
//		System.out.println(System.getProperty("javax.net.ssl.trustStore"));
//		
//	}
	
	
	public static void main(String[] args) {
		Date date = new Date(115, 10, 19, 22, 02);		
		System.out.println(isInConfiguredhrs(date));
	}
	
	static boolean isInConfiguredhrs(Date createdDate) {
		
		// Getting the value to skip discovery attempt in hours from DASH_PROPERTY table. 
		// if its not configured in table, setting by default as 24 hours		
		int hrsBefore = Integer.valueOf("24");
		
//		System.out.println(createdDate);
		
		Calendar calendar = Calendar.getInstance();
		Date today = new Date();
		calendar.setTime(today);
		calendar.add(Calendar.HOUR, -hrsBefore);
		Date twentyFourHoursBefore = calendar.getTime();
		
		System.out.println(twentyFourHoursBefore);
		
		if (createdDate.after(twentyFourHoursBefore) && createdDate.before(today)) {
			return true;
		}
		return false;
	}
	
//	public static void main(String[] args) {
//		
//		
//		String sample = "Online.ORG";
//		
//		System.out.println(sample.endsWith("ORG"));
//	}

}
