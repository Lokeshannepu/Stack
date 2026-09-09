package Demo;

public class StackLinkedList {
	    static class Node {
	        int data;
	        Node next;
	        Node(int data) {
	            this.data = data;
	        }
	    }
	    private Node top;
	    void push(int value) {
	        Node newNode = new Node(value);
	        newNode.next = top;
	        top = newNode;
	    }
	    int pop() {
	        if (top == null) {
	            System.out.println("Stack Underflow");
	            return -1;
	        }
	        int value =top.data;
	        top=top.next;
	        return value;
	    }
	    int peek() {
	    	if(top==null) {
	    		return -1;
	    	}
	    	return top.data;
	    }
	    boolean isEmpty() {
	    	return top==null;
	    }
	    public static void main(String[] args) {
			StackLinkedList stack=new StackLinkedList();
			stack.push(10);
			stack.push(20);
			stack.push(30);
			stack.push(40);
			System.out.println(stack.peek());
			System.out.println("popped element: "+stack.pop());
			System.out.println("popped element: "+stack.pop());
		}
	}