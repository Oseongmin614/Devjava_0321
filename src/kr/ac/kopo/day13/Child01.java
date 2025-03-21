package kr.ac.kopo.day13;

public class Child01 extends Parent {

	String name;
	int age;
	
	public Child01() {
		name = "첫번째 자식";
		age = 15;
	}
	
	public void study() {
		System.out.println("나는 공부를 합니다");
	}
	
	public void sleep() {
		System.out.println("나는 잠을 잡니다.");
	}
	
	@Override
	public void info() {
		System.out.println("나는 " + name + "이고, 나이는 " + age + "세입니다");
	}
	
	
}
