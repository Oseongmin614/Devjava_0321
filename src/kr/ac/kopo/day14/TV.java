package kr.ac.kopo.day14;

public interface TV {
    /*public static final */int MAX_VOLUME=100;
    int MAX_CHANNEL=9;
    /*public  abstract */void powerOn();
    void powerOff();
    void channelUp();
    void channelDown();
    void soundUp();
    void soundDown();
    void mute();


    default void copyright(){
        //interface에서 메소드는 못쓰지만 default 쓰면 메소드를 쓸수있다.좋은방법은아님
        System.out.println("모든기능의 표준은 TV협회에서 정의합니다. ");
    }
}
