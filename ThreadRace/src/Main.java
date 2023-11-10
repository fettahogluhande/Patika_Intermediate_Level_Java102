public class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        for (int i = 1 ; i <= 4 ; i++){
            Thread t = new Thread(counter);
            t.start();
            t.join();
        }
        System.out.println("Even List : " + Counter.evenList);
        System.out.println("Odd List : " + Counter.oddList);
    }
}