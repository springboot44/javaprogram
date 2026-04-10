public class Stack {

    private int[] arr;
    private int top;
    private int capacity;

    public Stack(int size) {
        capacity = size;
        arr = new int[capacity];
        top = -1;
    }

    // Push element
    public void push(int x) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = x;
    }

    // Pop element
    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top--];
    }

    // Peek (top element)
    public int peek() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return arr[top];
    }

    // Check empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Display stack
    public void display() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return;
        }

        for (int i = top; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Stack s = new Stack(5);

        s.push(10);
        s.push(20);
        s.push(30);

        s.display(); // 30 20 10

        System.out.println("Popped: " + s.pop());
        System.out.println("Top: " + s.peek());
    }
}