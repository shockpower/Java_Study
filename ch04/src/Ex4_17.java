class Ex4_17 {
	public static void main(String[] args) {
		for(int i=0;i <= 10;i++) {
			if (i%3==0)  // 3�� ���, 3���� ���������� 0���� ���� 
				continue;  //���� �ݺ����� �Ѿ 
			System.out.println(i);
		}
	}
}