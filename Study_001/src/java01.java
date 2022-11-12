import java.sql.Date;
import java.util.Calendar;

public class java01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("김상태");
		System.out.println("test");
		
		Calendar cal = Calendar.getInstance();
		Date d = new Date(cal.getTimeInMillis()); // Date(long date)
		Calendar date1 = Calendar.getInstance();
		date1.set(2017, 7, 15); // 2017년 8월 15일 (7월 아님)
		
		//Date d = new Date();		
		
		System.out.println(d);
		System.out.println();		
		
		char ch1 = 'a', ch2 = 'A'; 
		System.out.println("== 연산자에 의한 결과 : "+ ch1 + " " + ch2 + " " + (ch1 == ch2));
		System.out.println("> 연산자에 의한 결과 : "+ (ch1 > ch2));
		
		int num1 = 5, num2 = 7;
		int result;		 

		result = (num1 > num2) ? num1 : num2;
		System.out.println("두 정수 중 더 큰 수는 " + result + "입니다.");
	}
}
