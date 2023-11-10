import java.util.ArrayList;

public class Counter implements Runnable {
    public static ArrayList<Integer> evenList = new ArrayList<>();
    public static ArrayList<Integer> oddList = new ArrayList<>();
    public static ArrayList<Integer> t1 = new ArrayList<>();
    public static ArrayList<Integer> t2 = new ArrayList<>();
    public static ArrayList<Integer> t3 = new ArrayList<>();
    public static ArrayList<Integer> t4 = new ArrayList<>();
    ArrayList<Integer> list = new ArrayList<>();

    {
        for (int i = 1; i <= 100; i++) {
            list.add(i);
        }
        for (int i = 1; i <= list.size(); i++) {
            if (i <= (list.size() / 4)) {
                t1.add(i);
            } else if (i <= (list.size() / 2)) {
                t2.add(i);
            } else if (i <= (list.size() * 3 / 4)) {
                t3.add(i);
            } else {
                t4.add(i);
            }
        }
    }

    @Override
    public void run() {
        if (Thread.currentThread().getName().equals("Thread-0")) {
            for (Integer num : t1) {
                add(num);
            }
        }
        if (Thread.currentThread().getName().equals("Thread-1")) {
            for (Integer num : t2) {
                add(num);
            }
        }
        if (Thread.currentThread().getName().equals("Thread-2")) {
            for (Integer num : t3) {
                add(num);
            }
        }
        if (Thread.currentThread().getName().equals("Thread-3")) {
            for (Integer num : t4) {
                add(num);
            }
        }
    }

    public synchronized void add(int number) {
        if (number % 2 == 0) {
            System.out.println(Thread.currentThread().getName() + " : " + number);
            evenList.add(number);
        } else {
            System.out.println(Thread.currentThread().getName() + " : " + number);
            oddList.add(number);
        }
    }
}

