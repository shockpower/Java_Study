class Ex3_11 {
	public static void main(String args[]) { 
		double pi = 3.141592; 
		double shortPi = Math.round(pi * 1000) / 1000.0;  //�ݿø� 
		double shortPi2 = (double) Math.round(pi * 1000) / 1000.0;  //�ݿø� 
		System.out.println(shortPi);
		System.out.println(shortPi2);
	}
}