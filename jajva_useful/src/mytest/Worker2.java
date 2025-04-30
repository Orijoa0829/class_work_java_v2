package mytest;

public class Worker2 implements Runnable {
    @Override
    public void run() {
        System.out.println("작동");
        for (int i=0; i<5000; i++){
            System.out.println(i);
        }
    }
}
