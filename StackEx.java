package Demo;

public class StackEx {

    private int[] stack;
    private int top;
    private int capacity;
    StackEx(int capacity) {
        this.capacity = capacity;
        stack = new int[capacity];
        top = -1;
    }
    void push(int value) {

        if (top == capacity - 1) {
            System.out.println("Stack Overflow");
            return;
        }

        stack[++top] = value;
    }

    int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return stack[top--];
    }
    int peek() {
    	if(isEmpty()) {
    		System.out.println("Stack Unserflow");
    		return - 1;
    	}
    	return stack[top];
    }
    boolean isEmpty() {
        return top == -1;
    }
    void display () {
    	for(int i = top; i>=0;i--) {
    		System.out.print(stack[i] + " ");
    	}
    	System.out.println();
    }
    public static void main(String[] args) {
        StackEx s = new StackEx(5);
        s.push(10);
        s.push(20);
        s.push(30);
        s.display();
        System.out.println("Top: "+ s.peek());
        System.out.println("Popped: "+ s.pop());
        s.display();

    }
}