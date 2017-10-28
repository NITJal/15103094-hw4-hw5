package assign4;

import java.util.ArrayList;

/**
 *
 * @author Sooraj Manohar
 */
public class Stack {
    private ArrayList<Integer> stack = null;
  
    public Stack(){
        stack = new ArrayList<Integer>();
    }
  
    public void push(int value){
        System.out.println("Push " + value + " in stack");
        stack.add(value);
    }
  
    public void pop() {
        if(!isEmpty()){
        System.out.println("Pop " + stack.get(stack.size() - 1) + " from stack");
        stack.remove(stack.size() - 1);
        }
    }
  
    public boolean isEmpty(){
        if(stack.size() == 0) return true;
        else return false;
    }
  
    public int top() {
        if(!isEmpty()){
            return stack.get(stack.size() - 1);
        }
		return 0;
    }
  
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
      
       
            System.out.println("Top entry in stack :" + st.top());
       
      
       
        st.pop();
        st.pop();
        st.pop();
        st.pop();
    }
}




