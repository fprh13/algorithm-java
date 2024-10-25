package public_algorithm.kakaoGoorm.first_class.javaEx04.remoteControl;

public class SmartTvMain {
    public static void main(String[] args) {
        RemoteControl rc = new SmartTv();
        rc.turnOn();
        rc.setVolume(10);
        rc.turnOff();


        Searchable sch = new SmartTv();
        sch.search("www.naver");

        SmartTv tv = new SmartTv();
        tv.turnOn();
        tv.turnOff();
    }
}
