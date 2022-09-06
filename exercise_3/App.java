// Array implementation of Stack
public class App {
    public static void main(String[] args) {

      Stack lightNovelsStack = new Stack(4);

      lightNovelsStack.push("The Realist Hero");
      lightNovelsStack.push("The Death March to the Parallel World Rhapsody");
      lightNovelsStack.push("The Irregular Magician At Magic High School");
      lightNovelsStack.push("The Eminence in The Shadow");

      System.out.println("The size of the stack is: " + lightNovelsStack.size());

      System.out.println("The top of the stack is: " + lightNovelsStack.peek());

      lightNovelsStack.pop();

      System.out.println("After pop");

      lightNovelsStack.printStack();

      System.out.println("The top of the stack is: " + lightNovelsStack.peek());
    }
  }
