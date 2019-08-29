import java.util.Scanner;

public class ShowStopper extends   Thread {

    private volatile boolean running =true;

    @Override
    public void run() {
        while (running) {

                System.out.println("Hi World!!!!");

        }
    }
    public void shutdown(){
        running=false;
    }
}

class DriverClass{
    public static void main(String[] args) {
        ShowStopper obj = new ShowStopper();
        obj.start();

        System.out.println("Please press return to stop ");
        Scanner scan = new Scanner(System.in);
        scan.nextLine();

        obj.shutdown();
    }
}