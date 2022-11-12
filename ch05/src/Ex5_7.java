class Ex5_7 {
	// run 컨피그레이션에  args에 데이터 값을 넣어서 테스트 한다. 
	
	public static void main(String[] args) {
		System.out.println("매개변수의 개수:"+args.length);
		for(int i=0;i< args.length;i++) {
			System.out.println("args[" + i + "] = \""+ args[i] + "\"");
		}
	}
}