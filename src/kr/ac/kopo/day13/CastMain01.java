package kr.ac.kopo.day13;

public class CastMain01 {

	/*
	public static void print(Child01 c) {
		c.info();
	}
	
	public static void print(Child02 c) {
		c.info();
	}
	*/
	public static void print(Parent p) {
		p.info();
	}
	
	public static void main(String[] args) {
		
		Child01 c01 = new Child01();
		Child02 c02 = new Child02();
		Parent p = new Parent();
		
		print(new Child03());
		print(c01);
		print(c02);
		print(p);
		
		/*
		c01.info();
		c02.info();
		p.info();
		*/

	}
}
