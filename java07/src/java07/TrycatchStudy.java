package java07;

public class TrycatchStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArrery[] = new int[5];
		
		try
		{
			intArrery[3] = 10;
			intArrery[6] = 6;
		}
		catch(Exception e)
		{
			e.printStackTrace(); // 실제 에러문 출력 
			System.out.println("배열 범위 초과");
			//System.out.println("오류내용 =>  " + e);
			System.exit(0);// 강제 종료 
		}
		
		System.out.println("프로그램이 끝났어요.");
	}
}
