class Ex4_16 {
	public static void main(String[] args) { 
		int sum = 0;
		int i   = 0;

		//for(;;) {  //무한반복문  for(;;){}
		while(true) {  //무한반복문  for(;;){}
			if(sum > 100)
				break;  // 반복문을 벗어난다.
			++i;
			sum += i;
		} // end of while

		System.out.println("i=" + i);
		System.out.println("sum=" + sum);
	}   
}