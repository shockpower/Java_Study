class Ex2_12 {
	public static void main(String args[]) {
		String str = "3";

		System.out.println(str.charAt(0) - '0');
		System.out.println('3' - '0' + 2);
		System.out.println(Integer.parseInt("3") + 3);
		System.out.println("3" + 1);
		System.out.println(3 + '0');   // '0'은 숫자로 48
		System.out.println((char)(3 + '0'));   // 형변환 
	}
}