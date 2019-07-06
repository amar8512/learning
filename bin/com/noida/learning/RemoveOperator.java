
import java.util.Stack;
class RefmoveOpertaor{

    
   public static String reverseExpression(String expression){
    
    Stack<Character> stack = new Stack<Character>();
    
   // StringBuilder expression = new StringBuilder(expression);
    String newExpression = " ";

   	for(int i=0;i<expression.length();++i){
   	if(expression.charAt(i) == '+' || expression.charAt(i) == '*' || 
   	   expression.charAt(i) == '-' || expression.charAt(i) == '/' ||
   	   expression.charAt(i) == '%' || expression.charAt(i) == '^' ){
        stack.push(expression.charAt(i));
   		expression.charAt(i)=' ';
   	}
   }
   	String expValue[] = expression.split(" ");
   	for(int i=expValue.length-1;i>=expValue.length;i--){
       	newExpression=expValue[i]+stack.pop();
   	}
   }

	public static void main(String args[]){
      String expression="6+8-7*215/0";
	}
}
