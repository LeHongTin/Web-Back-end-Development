package Practices;

public class StopWatch {
    private long startTime;
    private long endTime;

    public void start() {
    this.startTime = System.currentTimeMillis();
    }
    public void stop(){
    this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return endTime - startTime;
    }

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        for (int i = 0; i<10000000 ; i ++) {
        }
        stopWatch.stop();
        System.out.println("Thoi gian da troi : " + stopWatch.getElapsedTime());
    }
}
