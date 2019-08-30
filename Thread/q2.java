public class q2 {
    public static void main(String[] args) {
        ThreadQ2 t1 = new ThreadQ2(10, 2,"Corredor 01");
        ThreadQ2 t2 = new ThreadQ2(10, 2,"Corredor 02");
        ThreadQ2 t3 = new ThreadQ2(10, 1,"Corredor 03");
        ThreadQ2 t4 = new ThreadQ2(10, 5,"Corredor 04");

        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}