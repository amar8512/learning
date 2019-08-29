public class MergeSorting {

    public static void main(String[] args) {
        Runnable r = ()->{
            System.out.println("Called by "+Thread.currentThread().getName());
        };

        Thread t1= new Thread(r);
        t1.setName("Thread1");

        Thread t2 = new Thread(r);
        t2.setName("Thread2");

        Thread t3 = new Thread(r);
        t3.setName("Thread3");

        try {
            t1.start();
            t1.join();
            t2.start();
            t2.join();
            t3.start();
            t3.join();
        }
        catch (Exception exc){

        }

    }

   /* public int[] mergeArray(int larr[[],int rarr[]],int length){

    }*/
}
