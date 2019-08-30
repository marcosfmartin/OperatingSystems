public class q1 {
    public static void main(String[] args) {
        CounterAsc counterAsc = new CounterAsc(0,"T1");
        CounterDesc counterDesc = new CounterDesc (80,"T2");
        Thread thread = new Thread(counterAsc);
        thread.start();
        counterDesc.start();
    }
}