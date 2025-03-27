package kr.ac.kopo.day17;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Mapmain01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Map<String, String> members = new HashMap<>();
        members.put("aaa","1111");
        members.put("bbb","2222");
        members.put("ccc","3333");
        members.put("ddd","4444");

        System.out.println("비밀번호 변경서비스");
        System.out.print("ID를 입력하세요:");
        String id = sc.nextLine();
        if(!members.containsKey(id)){
            System.out.println("입력한 ID"+id+"는뒈");
            System.out.println("프로그램 뒤질게~");
            System.exit(0);
        }
        System.out.print("현재 비밀번호를 입력하세요:");
        String password = sc.nextLine();
        if(!members.get(id).equals(password)){
            System.out.println("비번 틀렸죠?");
            System.out.println("프로그램 꺼질게~");
            System.exit(0);
        }
        System.out.print("새로운 비밀번호를 입력하세요:");
        password = sc.nextLine();
        members.put(id,password);

        System.out.println("비밀번호가 변경되었습니다");
        System.out.println("\n\n전체 정보조회");
        System.out.println("=====================" +
                            "\nID \t PASSWORD");
        Set<Map.Entry<String,String>>entry = members.entrySet();
        for (Map.Entry<String, String> e:entry){
            System.out.println(e.getKey()+" \t"+e.getValue());
        }
        Set<String>Keys=members.keySet();
        for (String key:Keys){
            System.out.println(key+" \t"+members.get(key));
        }

    }
}
