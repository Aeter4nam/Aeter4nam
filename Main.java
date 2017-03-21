class Stack {
    
    int intArray[] = new int[8];
    int index = -1;
    
    void push(int intValue) {
        if(index < 8) {
            System.out.println("Array full");
        }
        else {
            intArray[++index] = intValue;
        }
    }
    
    int pull() {
        if(index < 0) {
            System.out.println("Array empty");
            return 0;
        }
        else {
            return intArray[index--];
        }
    }
    
}

class Main {
    public static void main(String argc[]) {
        
        Stack stack = new Stack();
        stack.push(5);
        System.out.println(stack.pull());
        
    }
}