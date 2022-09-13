
import java.util.Stack;
import java.util.LinkedList;

public class App{
    public static void main(String[] args) throws Exception {

    // ARRAYS (50 points)
    System.out.println("======================================================");
    // 1. Create an array of characters of your SURNAME.
    char[] surname = {'T', 'A', 'N', 'G', 'H', 'A', 'L'};

    // 2. Display each character of your SURNAME on each line.
    for(int i = 0; i < surname.length; i++){
        System.out.println(surname[i]);
    }

    // 3. Display the first character of your SURNAME.
    System.out.println(surname[0]);

    // 4. Display the last character of your SURNAME.
    System.out.println(surname[6]);

    // 5. Display the character of your SURNAME in reverse order.
    for(int i = surname.length - 1; i >= 0; i--){
        System.out.println(surname[i]);
    } 
    // LINKED LIST (25 points)

    System.out.println("======================================================");
    // 1. Create a Linked list of the last six numbers of your STUDENT NUMBER.
    LinkedList<Character> studentNumber = new LinkedList<>();

    studentNumber.add('2');
    studentNumber.add('0');
    studentNumber.add('2');
    studentNumber.add('0');
    studentNumber.add('1');
    studentNumber.add('0');
    studentNumber.add('2');
    studentNumber.add('9');
    studentNumber.add('1');
    studentNumber.add('1');
    
    // 2. Add an asterisk (*) to the head/front of the Linked list.
    studentNumber.addFirst('*');

    // 3. Add an asterisk (*) to the tail/end of the Linked list.
    studentNumber.addLast('*');

    // 4. Display the Linked list.
    System.out.println(studentNumber);

    // 5. Display the last character of the Linked list.
    System.out.println(studentNumber.getLast());
  
    // 6. Replace the last character of the Linked list with the exclamation symbol (!).
    studentNumber.set(11, '!');

    // 7. Remove the first character of the Linked list.
    studentNumber.removeFirst();

    // 8. Display the LinkedList.
    System.out.println(studentNumber);

    // STACK (25 points)
    System.out.println("======================================================");
    // 1. Create a Stack of characters of your SURNAME.
    Stack<Character> stackSurname = new Stack<>();
    stackSurname.push('T');
    stackSurname.push('A');
    stackSurname.push('N');
    stackSurname.push('G');
    stackSurname.push('H');
    stackSurname.push('A');
    stackSurname.push('L');

    // 2. Print the Stack.
    System.out.println(stackSurname);

    // 3. Add a "INF214" to the stack.
    stackSurname.push('I');
    stackSurname.push('N');
    stackSurname.push('F');
    stackSurname.push('2');
    stackSurname.push('1');
    stackSurname.push('4');

    // 4. Print the Stack.
    System.out.println(stackSurname);

    // 5. Remove "INF214".
    stackSurname.pop();
    stackSurname.pop();
    stackSurname.pop();
    stackSurname.pop();
    stackSurname.pop();
    stackSurname.pop();

    // 6. Add "CCDATRCL-INF214".
    stackSurname.push('C');
    stackSurname.push('C');
    stackSurname.push('D');
    stackSurname.push('A');
    stackSurname.push('T');
    stackSurname.push('R');
    stackSurname.push('C');
    stackSurname.push('L');
    stackSurname.push('-');
    stackSurname.push('I');
    stackSurname.push('N');
    stackSurname.push('F');
    stackSurname.push('2');
    stackSurname.push('1');
    stackSurname.push('4');

    // 7. Print the Stack.
    System.out.println(stackSurname);
    }
}
