import java.util.ArrayList;
import java.util.Random;

public class working {

    int Bank=0;

    public synchronized void minus(){
        if(Bank<50000){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Bank = Bank - 30000;
        System.out.println(Bank);
    }


    public synchronized void add(){
        for (int i = 0; i < 10; i++) {
            Bank = Bank + 10000;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        notify();
    }


}
