package kr.ac.kopo.day13;

public class Child02 extends Parent {

	String name;

	public Child02() {
		name = "두번째 자식";
	}
	
	public void sing() {
		System.out.println("나는 노래를 부릅니다.");
	}
	
	public void play() {
		System.out.println("나는 놉니다.");
	}
	
	@Override
	public void info() {
		System.out.println("나는 두번째 자식입니다.");
	}
	
}
