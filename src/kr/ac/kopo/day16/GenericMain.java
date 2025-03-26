package kr.ac.kopo.day16;

import kr.ac.kopo.day07.homework.Icecream;
import kr.ac.kopo.day11.extend.Employee;

class AAA<T> {
	private T value;
	
	AAA() {
		
	}
	
	AAA(T value) {
		this.value = value;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {this.value = value;
	}
	
}

/*
class AAA {
	private Object value;
	
	AAA() {
		
	}
	
	AAA(Object value) {
		this.value = value;
	}
	
	public Object getValue() {
		return value;
	}
	
	public void setValue(Object value) {
		this.value = value;
	}
	
}
*/
public class GenericMain {

	public static void main(String[] args) {

		/*
		AAA obj = new AAA(10);
		AAA obj2 = new AAA(12.34);
		AAA obj3 = new AAA('A');
		AAA obj4 = new AAA("Hello");
		AAA obj5 = new AAA(new Icecream());
		AAA obj6 = new AAA(new Employee());
		
		String str = (String)obj4.getValue();
		Icecream ice = (Icecream)obj5.getValue();
		*/
		
		AAA<String> obj = new AAA("hello");
		String data = obj.getValue();
		System.out.println(data.length());
		
		
//		AAA<Icecream> obj2 = new AAA(new Icecream());
//		Icecream ice = obj2.getValue();
//		ice.name = "비비빅";
//		System.out.println(ice.name);
		
		
//		AAA<Employee> obj3 = new AAA();
//		obj3.setValue(new Icecream());
		
	}
}









