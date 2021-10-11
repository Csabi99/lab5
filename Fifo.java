import java.util.LinkedList;

public class Fifo {
    LinkedList<String> list= new LinkedList<String>();
    public synchronized void put(String str) throws InterruptedException {
        while(list.size()>=10){
            this.wait();
        }
        list.add(str);
        this.notify();
    }
    public synchronized String get() throws InterruptedException {
        String str;
        while(list.size()<=0){
            this.wait();
        }
        str=list.removeFirst();
        return str;
    }
}
