package mytest;


//상속을 통해서 쓰레드를 만들기
public class Worker1 extends Thread {
    public String name;

    public Worker1(String name){
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("쓰레드 작동");
        for(int i = 0; i < 30000; i++){

        }
    }
}
