class Ex4_7 {
	public static void main(String args[]) {
		int num = 0;
		int num2 = 10;
		// 괄호{} 안의 내용을 5번 반복한다.
		for (int i = 1; i <= 5; i++) {
			num = (int) (Math.random() * 6) + 1;
			num2 = (int)(Math.random() * 10) +1;
			System.out.println("num random => " + num);
			System.out.println("num2 random => " + num2);
			System.out.println("random => " + (int) (Math.random() * 6));
			System.out.println("random -5~+5 => " + ((int) (Math.random() * 11) - 5)); // *수는 추출하고자 하는 개수 ,  -5 ~ +5까지 
			
		}
	}
}