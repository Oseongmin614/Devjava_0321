package kr.ac.kopo.day16;

import java.util.ArrayList;
import java.util.List;

public class ListMain {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        System.out.println("전체 원소의 개수:"+list.size());
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        System.out.println("add() 후 전체 원소의 개수 : "+list.size());
        System.out.println(list.remove(0));
        System.out.println(list);


    }
}
