import java.util.Iterator;

class Ex4_8 {
	public static void main(String args[]) {		
		int k;
		
		for (int i = 1; i <= 3; i++) { // 괄호{}안의 문장을 3번 반복
			System.out.println("Hello");
		}
		
		for (int i = 0, j = 10; i <= 10; i++, j--) {
			System.out.println("i= " + i + ", j=  " + j);
		}
		
		for (k = 0; k <=3; k++) {
			System.out.println("k= " + k);
		}
		
		System.out.println("k결과 = " +k);
	}
}