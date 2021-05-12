public class Main {
    public static void main(String[] args) {

        working obj = new working();

        new Thread(()->{
            obj.printpoint();
        }).start();

        new Thread(()->{
            obj.printpoint();
        }).start();

    }
}
