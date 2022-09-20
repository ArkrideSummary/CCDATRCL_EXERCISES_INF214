import java.util.LinkedList;
import java.util.Queue;

public class App {
    
    public static void main(String[] args){
        Queue<String> classmates = new LinkedList<>();

        classmates.add("Bablis, Winna Jane");
        classmates.add("Valencia, Jamil");
        classmates.add("Jalalon, James Francis");
        classmates.add("Paller, Richael");
        classmates.add("Vargas, Jethro Ruiz");

        System.out.println("The size of the Queue \"Classmates\" is " + classmates.size() + ".");

        System.out.println("The front of the Queue is " + classmates.peek() + ".");

        classmates.remove();
        classmates.remove();
        classmates.remove();
        classmates.remove();
        classmates.remove();

        classmates.add("Legaspi, Carlos Leslie");
        classmates.add("Aranilla, Idel Lawrence");
        classmates.add("Lalo, Kean Jerald");
        classmates.add("Mercado, Jul Seth Mari");
        classmates.add("Bantegui, Moses Christian");

        System.out.println("The size of the Queue \"Classmates\" is " + classmates.size() + ".");
        
        System.out.println("The front of the Queue is " + classmates.peek() + ".");
    }
}
