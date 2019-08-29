public class ImmutablitiyDemo {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = new String("Hello");

        if(s1 == s2){
            System.out.println("Equal == ");
        }

        if(s1.equals(s2)){
            System.out.println("Equal equals()");
        }
        System.out.println(" "+s1.hashCode()+" "+s2.hashCode());
    }
}
