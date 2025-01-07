import java.util.Stack;

public class StackSorting {

    public static void sortStack(Stack<Integer> mine){
        if(!mine.isEmpty()){
            int popped = mine.pop();
            sortStack(mine);
            sortPush(mine, popped);
        }
    }

    public static void sortPush(Stack<Integer> stk,int current){
        if(stk.isEmpty()||current>stk.peek())
            stk.push(current);
        else{
            int temp = stk.pop();
            sortPush(stk, current);
            stk.push(temp);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();
        myStack.push(5);myStack.push(-2);
        myStack.push(9);myStack.push(-7);
        myStack.push(3);

        System.out.println(myStack);
        sortStack(myStack);// O(n^2)
        System.out.println(myStack);
    }
}
