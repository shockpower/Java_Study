class Ex4_16 {
	public static void main(String[] args) { 
		int sum = 0;
		int i   = 0;

		//for(;;) {  //���ѹݺ���  for(;;){}
		while(true) {  //���ѹݺ���  for(;;){}
			if(sum > 100)
				break;  // �ݺ����� �����.
			++i;
			sum += i;
		} // end of while

		System.out.println("i=" + i);
		System.out.println("sum=" + sum);
	}   
}