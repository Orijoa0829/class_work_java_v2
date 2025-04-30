package thread;

public class Worker2 implements Runnable{

    @Override
    public void run() {
        for(int i = 0; i<5000; i++){
            System.out.print(i + "\t");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
