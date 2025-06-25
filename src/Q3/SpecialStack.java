package Q3;

public class SpecialStack {
    private int maxSize;
    private int[] stack;
    private int[] minStack;
    private int top;

    public SpecialStack(int size){
        this.maxSize=size;
        this.stack=new int[maxSize];
        this.minStack=new int[maxSize];
        this.top=-1;
    }

//    push value to stack

    public void push(int value){
        if(isFull()){
            System.out.println("Stack overflow");
            return;
        }
        top++;
        stack[top] = value;

//        maintain the minstack(O(1))
        if(top==0){
            minStack[top]=value;
        }else{
            minStack[top]=Math.min(value,minStack[top-1]);
        }
    }

    // Pop the top element
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow. Cannot pop.");
            return -1;
        }

        int popped = stack[top];
        top--;
        return popped;
    }

    public boolean isEmpty(){
        return top==-1;
    }

    public boolean isFull(){
        return top==maxSize-1;
    }

//    for get the min value in O(1)
    public int getMin(){
        if(isEmpty()){
            System.out.println("Stack is empty. No minimum.");
            return -1;
        }
        return minStack[top];
    }
}
