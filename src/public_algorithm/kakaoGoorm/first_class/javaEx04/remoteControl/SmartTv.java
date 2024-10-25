package public_algorithm.kakaoGoorm.first_class.javaEx04.remoteControl;

public class SmartTv implements RemoteControl, Searchable{
    private int volume;

    @Override
    public void turnOn() {
        System.out.println("티비 켭니다.");

    }

    @Override
    public void turnOff() {
        System.out.println("티비 끕니다.");
    }

    @Override
    public void setVolume(int volume) {
        if (volume > RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        }
        System.out.println("TV 볼륨 " + this.volume);
    }

    @Override
    public void search(String url) {
        System.out.println(url + "을 검색합니다.");
    }
}
