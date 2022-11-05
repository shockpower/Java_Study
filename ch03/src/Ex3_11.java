class Ex3_11 {
	public static void main(String args[]) { 
		double pi = 3.141592; 
		double shortPi = Math.round(pi * 1000) / 1000.0;  //반올림 
		double shortPi2 = (double) Math.round(pi * 1000) / 1000.0;  //반올림 
		System.out.println(shortPi);
		System.out.println(shortPi2);
	}
}