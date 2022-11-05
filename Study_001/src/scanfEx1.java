
import java.util.*;

public class scanfEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 화면에서 입력받아 출력 하기 
		Scanner scaner = new Scanner(System.in);
		
//		int num = scaner.nextInt();
//		int num2 = scaner.nextInt();
//		System.out.println(num);
//		System.out.println(num2);
		
		String input = scaner.nextLine();  // 라인단위로 문자 입력 
		int num = Integer.parseInt(input);
		
		System.out.println(num);
		
		
	}

}
