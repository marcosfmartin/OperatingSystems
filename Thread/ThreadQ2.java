public class ThreadQ2 extends Thread {
    private int pathSize;
    private int restTime;
    private String name;

    public ThreadQ2 (int pathSize, int restTime, String name) {
        this.pathSize =  pathSize;
        this.restTime = restTime;
        this.name = name;
    }

    public void run() {
        try {
            for (; this.pathSize>0;this.pathSize--)
            {
                System.out.println("Faltam "+ this.pathSize + " para o " + this.name);
                Thread.sleep(this.restTime*1000);
                System.out.println(this.name + " está descansando");
            }
            System.out.println(this.name + " chegou!");
        } catch (InterruptedException e) {
            e.printStackTrace(); }


    }

    public static void main(String[] args) {
        ThreadQ2 threadQ2 = new ThreadQ2(100, 2,"Corredor 01");
        threadQ2.run();
    }

}