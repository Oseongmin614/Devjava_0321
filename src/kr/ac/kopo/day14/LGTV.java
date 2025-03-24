package kr.ac.kopo.day14;

public class LGTV implements TV{

    private  boolean onOff;
    private  int volumeSize;
    private  int channelNo;


    public LGTV(){
        onOff=false;
        volumeSize=5;
        channelNo=3;
        System.out.println("LG구매");
    }

    @Override
    public void powerOn() {
        onOff=true;
        System.out.println("TV전원을 켭니다.");
        info();
    }

    @Override
    public void powerOff() {
        onOff=false;
        System.out.println("TV 전원을 끕니다.");

    }

    @Override
    public void channelUp() {
        if (channelNo<TV.MAX_CHANNEL){
            channelNo++;
        }else
            channelNo=1;
        System.out.println("채널을 올립니다.");
        info();
    }

    @Override
    public void channelDown() {
        if (channelNo<1){
            channelNo--;
        }else
            channelNo=TV.MAX_CHANNEL;
        System.out.println("채널을 내립니다.");
        info();
    }

    @Override
    public void soundUp() {
        if (volumeSize<TV.MAX_VOLUME){
            volumeSize++;
            System.out.println("볼륨을 높입니다.");}
        info();
    }

    @Override
    public void soundDown() {
        if (volumeSize<=0){
            volumeSize--;
        System.out.println("볼륨을 내립니다.");}
        info();
    }

    @Override
    public void mute() {
        volumeSize=0;
        System.out.println("음소거중입니다.");
        info();
    }
    public void  info(){
        System.out.println("현재채널번호:"+channelNo+", 음량크기:"+volumeSize);
    }

}
