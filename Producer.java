public class Producer extends Thread{
    String text;
    Fifo f;
    int sleepTime;
    public Producer(String str, Fifo f1, int s){text=str; f=f1;sleepTime=s;}
    public void go() throws InterruptedException {
        int i=0;
        while(true){
            f.put(text+" "+i);
            System.out.println("produced"+text+" "+i+" "+System.currentTimeMillis()%100000);
            i++;
            Thread.sleep(1000);
        }

    }
    public void run() {
        try{
            go();
        }
        catch(InterruptedException e){
            System.out.println("Megszakadt");
        }

    }
}
