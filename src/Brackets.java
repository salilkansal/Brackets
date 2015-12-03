import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class Brackets {
    public static void main(String[] args) {
        Stack<Character> myStack = new Stack<>();
        Scanner s1 = new Scanner(System.in);
        boolean finished = false;
        String input = s1.nextLine();

        HashMap<Character,Character> myHashmap = new HashMap<>();
        myHashmap.put('{','}');
        myHashmap.put('(',')');
        myHashmap.put('[',']');

        int i=0;

        while (i<input.length() && !finished){
            if (myHashmap.containsKey(input.charAt(i))){
                myStack.push(input.charAt(i));
            }
            else if (myStack.empty() || (input.charAt(i) != myHashmap.get(myStack.pop()))) {
                finished = true;
            }
            i++;
        }
            if (!finished){
                System.out.printf("YES");
        }
        else System.out.printf("NO");
    }
}
