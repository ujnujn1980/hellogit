package hoge;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Timeget {
	public static String hogetime(){
		Date accesstime = new Date();
		SimpleDateFormat d1 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String ret = d1.format(accesstime);
		return ret;
	}



	public static void main(String args[]){
		System.out.println(hogetime());
	}

}
