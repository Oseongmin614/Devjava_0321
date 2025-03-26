package kr.ac.kopo.day16;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/*
 	Set
 	특징 : 순서(X), 중복(X)
 	장점 : 빠른 탐색
 	구현클래스
 	   - HashSet
 	   - TreeSet 
 */

public class SetMain {

	public static void main(String[] args) {

//		Set<String> set = new HashSet<>();
		Set<String> set = new TreeSet<>();
		
		System.out.println("전체 원소의 개수 : " + set.size());
		
		set.add("one");
		set.add("two");
		set.add("three");
		set.add("four");
		set.add("five");
		
		System.out.println("중복데이터 \"one\" 삽입여부 : " + set.add("one"));
		
		System.out.println("전체 원소의 개수 : " + set.size());
		
		System.out.println("< 전체 데이터 출력 >");
		for(String data : set) {
			System.out.print(data + "  ");
		}
		System.out.println();
		System.out.println("< 전체 데이터 출력 >");
		/*
		 * Iterator객체(순환자)
		 *    hasNext()  : 다음데이터 존재여부 판단
		 *    next()	 : 다음데이터 이동
		 */
		Iterator<String> ite = set.iterator();
		while(ite.hasNext()) {
			System.out.print(ite.next() + "  ");
		}
		System.out.println();
		
		System.out.println("< 전체 데이터 출력 >");
		Object[] arr = set.toArray();
		for(Object obj : arr) {
			System.out.println(obj.toString() + ((String)obj).length());
			String str = (String)obj;
			System.out.println(str + " : " + str.length());
		}
	}
	
}







