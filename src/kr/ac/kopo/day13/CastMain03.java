package kr.ac.kopo.day13;

public class CastMain03 {

	public static void print(Parent p) {
		p.info();

		System.out.println("p instanceof Child01 : " + (p instanceof Child01));
		System.out.println("p instanceof Child02 : " + (p instanceof Child02));
		System.out.println("p instanceof Parent : " + (p instanceof Parent));
		System.out.println("-----------------------------------------------");

		if(p instanceof Child01) {
			Child01 c01 = (Child01)p;
			c01.sleep();
			c01.study();
		} else if(p instanceof Child02) {
			Child02 c02 = (Child02)p;
			c02.sing();
			c02.play();
		}


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
