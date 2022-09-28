import thread.MyThread;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ThreadGroup group = new ThreadGroup("Основные потоки");

        Thread thread1 = new MyThread(group, "Поток первый");
        Thread thread2 = new MyThread(group, "Поток второй");
        Thread thread3 = new MyThread(group, "Поток третий");
        Thread thread4 = new MyThread(group, "Поток четвертый");

        System.out.println("Запускаю потоки");
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        Thread.sleep(12000);
        group.interrupt();
        Thread.sleep(3000);
        System.out.println("Завершаю все потоки");
    }
}
