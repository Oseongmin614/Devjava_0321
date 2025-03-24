package kr.ac.kopo.day14;

public class SamsungTV implements TV{
    private boolean power;
    private  int volumeSize;
    private  int channelNo;
    private  int TampvolumSie;
    private boolean mute;

    public  SamsungTV(){
        power =false;
        mute = false;
        System.out.println("삼성티비 구매완료");
    }

    @Override
    public void powerOn() {
        power =true;
        System.out.println("티비가 켜졌습니다.");
    }

    @Override//power만 만들고 true false 비교해서 power=!power;
    public void powerOff() {
        power =false;
        System.out.println("티비가 꺼졌습니다.");
    }

    @Override
    public void channelUp() {
        channelNo=++channelNo%TV.MAX_CHANNEL;
        System.out.println("channelDown...");
    }

    @Override
    public void channelDown() {
        System.out.println("channelDown..");
    }

    @Override
    public void soundUp() {
        System.out.println("soundUp..");
    }

    @Override
    public void soundDown() {
        System.out.println("soundDown..");
    }

    @Override
    public void mute() {
        if (!mute){//음소거중
            TampvolumSie=volumeSize;
            volumeSize=0;
            System.out.println("음소거 되었습니다.");
        }
        else{//음소거 해제
            volumeSize=TampvolumSie;
            System.out.println("음소거 해제");
        }
        mute=!mute;
    }
}
