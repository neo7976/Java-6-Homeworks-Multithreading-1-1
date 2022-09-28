package thread;

public class MyThread extends Thread {
    public MyThread(ThreadGroup group, String name) {
        super(group, name);
    }

    @Override
    public void run() {
        try {
            while (!isInterrupted()) {
                Thread.sleep(2500);
                System.out.printf("Я %s. Всем привет! Идентификатор %s \n", getName(), getId());
            }
        } catch (InterruptedException e) {
            return;
        } finally {
            System.out.printf("%s Завершен! Группа - %s\n", getName(), getThreadGroup());
        }
    }
}

