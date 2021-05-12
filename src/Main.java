public class Main {
    public static void main(String[] args) {

        working Bank = new working();

        new Thread(()->{
            Bank.minus();
        }).start();

        new Thread(()->{
            Bank.add();
        }).start();

    }
}
