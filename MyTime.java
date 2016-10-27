import java.util.*;
public class MyTime {
	int Y,M,D,hh,mm,ss;
	Calendar t; 
	public String getDate()
	{
		t = new GregorianCalendar();
		Date trialTime = new Date();
		t.setTime(trialTime);
		
		Y = t.get(Calendar.YEAR);
		M = t.get(Calendar.MONTH);
		D = t.get(Calendar.DAY_OF_MONTH);
		return "" + Y + "," + M + "," + D;
	}
	public String getTime()
	{
		t = new GregorianCalendar();
		Date trialTime = new Date();
		t.setTime(trialTime);
		
		hh = t.get(Calendar.HOUR);
		mm = t.get(Calendar.MINUTE);
		ss = t.get(Calendar.SECOND);
		return "" + hh + ":" + mm + ":" + ss;
	}
}
