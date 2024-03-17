class MyAlpha extends Thread
{
    @Override
    public void run() {
       try {
        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.println(i);
            Thread.sleep(2000);
        }
       } catch (InterruptedException e) {
            System.out.println(e);
       }
    }
}
class DisplayAlphabets
{
    public static void main(String[] args) throws InterruptedException {
       MyAlpha thr = new MyAlpha();
       thr.start();
    }
}