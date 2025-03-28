package kr.ac.kopo.day18;
import java.util.HashMap;
import java.util.Map;

class Member {
    private String name;
    private String phone;

    public Member() {
    }

    public Member(String name, String phone) {
        super();
        this.name = name;
        this.phone = phone;
    }
    public boolean equals(Object obj){
        boolean result = false;
        Member m =(Member)obj;
        if(name.equals(m.name)&&phone.equals(m.phone)){
            result=true;
        }
        return result;

    }
}

class Car extends Object{
    private String model;
    private String id;

    public Car() {
    }

    public Car(String model, String id) {
        super();
        this.model = model;
        this.id = id;
    }

}

public class MapMain02 {

    public static void main(String[] args) {

        Map<Member, Car> map = new HashMap<>();

        map.put(new Member("홍길동", "010-1111-2222"), new Car("모닝", "26나2367"));
        map.put(new Member("강길동", "010-3333-4444"), new Car("그랜저", "235도6734"));
        map.put(new Member("홍길동", "010-5555-6666"), new Car("산타페", "53마4567"));
        map.put(new Member("홍길동", "010-1111-2222"), new Car("소나타", "351로4572"));

        System.out.println("등록대수 : " + map.size());

    }
}

