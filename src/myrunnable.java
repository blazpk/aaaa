public class myrunnable implements Runnable{

    private String name;

    public myrunnable(String name){
        this.name=name;
    }

    @Override
    public void run(){
        System.out.println(name+" đang thực thi...");
        try {
            Thread.sleep(1000
            );
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name+ " kết thúc.");
    }

}
