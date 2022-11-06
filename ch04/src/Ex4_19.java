class Ex4_19
{
	public static void main(String[] args)
	{
      // for문에 Loop1이라는 이름을 붙였다.
		Loop1 : for(int i=2;i <=9;i++) {  // loop1이름은 임의로 작성해도 된다. 	
				for(int j=1;j <=9;j++) {
					if(j==5)  // 5가되면 빠져나간다. 
						break Loop1; // 해당 반복문까지에서 적용 
//						break;
//						continue Loop1;
//						continue;
					System.out.println(i+"*"+ j +"="+ i*j);
				} // end of for i
				System.out.println();
		} // end of Loop1

	}
}