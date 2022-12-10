class MyPoint3 extends Object{
	int x;
	int y;
	//	String getLocation() {
	//		return "x:" + x + ", y:"+y;
	//	}

	MyPoint3(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	//object 클래스의  toString()을 오버라이딩 
	public String toString() {
		return "x:" + x + ", y:"+y;
	}
}

//class Mypoint3D extends MyPoint3{
//	int z;
//	//조상의 getLocation()을 오버라이딩 
//	String getLocation() {
//		return "x:" + x + ", y:"+y+", z:"+z;
//	}
//}

public class OverriderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//		Mypoint3D p = new Mypoint3D();
		//		p.x = 3;
		//		p.y = 5;
		//		p.z = 7;
		
		//		System.out.println(p.getLocation());
		
		MyPoint3 p = new MyPoint3(1,3);
//		p.x = 3;
//		p.y = 5;
		
		System.out.println(p);	
//		System.out.println(p.toString());	
//		System.out.println(p.x);
//		System.out.println(p.y);
	}
}