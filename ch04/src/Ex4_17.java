class Ex4_17 {
	public static void main(String[] args) {
		for(int i=0;i <= 10;i++) {
			if (i%3==0)  // 3의 배수, 3으로 나누었을때 0으로 나옴 
				continue;  //다음 반복으로 넘어감 
			System.out.println(i);
		}
	}
}