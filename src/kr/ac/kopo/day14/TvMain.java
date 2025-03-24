package kr.ac.kopo.day14;

public class TvMain {
    public static void main(String[] args) {
        TV tv = new SamsungTV();//티비 컨트롤러가 따로 있는게 좋을거같다.
        tv.powerOn();
        tv.channelDown();
        tv.channelUp();
        tv.soundDown();
        tv.soundUp();
        tv.channelUp();
        tv.channelUp();
        tv.channelUp();
        tv.channelUp();tv.channelUp(); tv.channelUp(); tv.channelUp(); tv.channelUp(); tv.channelUp(); tv.channelUp(); tv.channelUp(); tv.channelUp(); tv.channelUp();
        tv.channelUp();tv.channelUp();tv.channelUp();tv.channelUp();tv.channelUp();tv.channelUp();tv.channelUp();tv.channelUp();tv.channelUp();
        tv.powerOff();
        tv.mute();
        tv.mute();
    }
}
