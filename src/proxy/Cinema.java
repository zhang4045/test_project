package proxy;

public class Cinema implements movie {
    RealPlay realPlay;
    public Cinema (RealPlay realPlay){
        this.realPlay = realPlay;
    }
    @Override
    public void play() {
        System.out.println("广告开始");
        realPlay.play();
        System.out.println("广告结束");
    }
}
