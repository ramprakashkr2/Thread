public class ImpThread implements Runnable {
    int id;
    int c;

    public ImpThread(int id, int c) {
        this.id = id;
        this.c = c;
    }

    @Override
    public void run() {
        invoke();
    }

    public void invoke() {
        for (int i = 1; i <= c; i++) {
            System.out.println("id: " + id + " count: " + i);
        }
    }
}
