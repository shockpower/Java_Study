import java.util.Iterator;

class Ex6_4 {
	public static void main(String args[]) {
		MyMath mm = new MyMath();
		long result1 = mm.add(5L, 3L); // add 메서드 호출 
		long result2 = mm.subtract(5L, 3L);
		long result3 = mm.multiply(5L, 3L);
		double result4 = mm.divide(5L, 3L);
		int result5 = mm.max(5, 3);
		mm.printGugudan(13);
		
		
		System.out.println("두수 중 큰 값 출력 max(5L, 3L) = " + result5); // 두수중 큰 값을 출려한다. 
		System.out.println("add(5L, 3L) = " + result1);
		System.out.println("subtract(5L, 3L) = " + result2);
		System.out.println("multiply(5L, 3L) = " + result3);
		System.out.println("divide(5L, 3L) = " + result4);
	}
 }

 class MyMath {
	 
	void printGugudan(int dan) {
		if (!(2<= dan && dan <= 9)) {
			System.out.println("구구단 범위를 벗어났습니다." + dan);
			return ;
		}
		
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d*d = %d%n",dan,i,dan*i);
		}
		
		// return;
	}
	 
	long add(long a, long b) {
		long result = a + b;
		return result;
	//	return a + b;	// 위의 두 줄을 이와 같이 한 줄로 간단히 할 수 있다.
	}
	
	// 두값을 받아서 큰 값을 반환하는 메서드 
	int max(int a, int b) {		
		return a>b ? a:b;
	}
	
	long subtract(long a, long b) { return a - b; }
	long multiply(long a, long b) { return a * b; }
	double divide(double a, double b) {
		return a / b;
	}
 }
