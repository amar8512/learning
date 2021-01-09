package designpatterns;

abstract class NetworkPlan{
    protected double rate;
    abstract void getRate();
    public void  processBill(int minute){
        System.out.println(minute*rate);
    }
}
class ABCNetwork extends NetworkPlan{
    public void getRate(){
        rate=1.50;
    }
}

class DEFNetwork extends NetworkPlan{
    public void getRate(){
        rate=0.50;
    }
}

class GHINetwork extends NetworkPlan{
    public  void getRate(){
        rate=2.50;
    }
}

class NetworkFactory {
    static NetworkPlan plan =null;
    public static NetworkPlan getInstance(String nameOfPlan){
        if(nameOfPlan.equalsIgnoreCase("abcNetwork")){
            plan= new ABCNetwork();
        }
        else if(nameOfPlan.equalsIgnoreCase("defnetwork")){
            plan = new DEFNetwork();
        }
        else if(nameOfPlan.equalsIgnoreCase("ghiNetwork")){
            plan = new GHINetwork();
        }
        else{
            return null;
        }
        return plan;
    }
}
public class FactoryDemo {
    public static void main(String[] args) {
         NetworkPlan plan=null;
         String network="ABCNETWORK";
         plan= NetworkFactory.getInstance(network);
         plan.getRate();
          plan.processBill(50);
    }
}
