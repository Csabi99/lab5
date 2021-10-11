public class Consumer extends Thread{
    Fifo f;
    String s;
    int n;
    Consumer(Fifo f1, String s1, int n1){
        f=f1;
        s=s1;
        n=n1;
    }
    public void run(){
        while(true){
            try{
                System.out.println("consumed "+s+" "+f.get()+" "+System.currentTimeMillis()%100000);
                Thread.sleep(n);
            }
            catch(InterruptedException e){
                System.out.println("Megszakadt");
            }
        }
    }
}
