package kr.ac.kopo.day13;

public class CastMain02 {

	public static void main(String[] args) {
		
//		Child01 c = new Parent();		// 컴파일 오류
		
//		Child01 c = (Child01) new Parent();	// 실행시 오류
		
		Parent p = new Child01();		// 묵시적 형변환
		
		Child01 c = (Child01)p;			// 강제적 형변환
		
		c.info();
		c.study();
		c.sleep();
		
	}
}
