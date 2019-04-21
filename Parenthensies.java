import java.util.Stack; 
public class Parenthensies { 
    
    public static void main(String args[]) { 
        
        System.out.println(parenthensies("1+2*(3/4)")); 
        System.out.println(parenthensies("1+2*[3*3+{4-5(6(7/8/9)+10)-11+(12*8)]+14")); 
        System.out.println(parenthensies("(){a,b}")); 
    } 
    
    public static boolean parenthensies(String s) { 
        Stack<Character> stack  = new Stack<Character>(); 
        for(int i = 0; i < s.length(); i++) { 
            
            char c = s.charAt(i); 
            
            if(c == '[' || c == '(' || c == '{' ) {      
                stack.push(c); 
            }
            else if(c == ']') { 
                if(stack.isEmpty() || stack.pop() != '[') { 
                    return false;
                } 
            } 
            else if(c == ')') { 
                if(stack.isEmpty() || stack.pop() != '(') { 
                    return false;
                }            
            } 
            else if(c == '}') { 
                if(stack.isEmpty() || stack.pop() != '{') { 
                    return false;
                } 
            } 
            
        } 
        return stack.isEmpty(); 
    } 
}