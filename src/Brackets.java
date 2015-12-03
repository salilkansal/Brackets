import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class Brackets {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        String input = s1.nextLine();

        System.out.println(braces(input));

    }
    static String braces(String input){
        if(input.length()%2!=0)
            return "NO";
        Stack<Character> myStack = new Stack<>();
        HashMap<Character,Character> myHashmap = new HashMap<>();
        myHashmap.put('{','}');
        myHashmap.put('(',')');
        myHashmap.put('[',']');
        int i=0;

        while (i<input.length()){
            if (myHashmap.containsKey(input.charAt(i))){
                myStack.push(input.charAt(i));
            }
            else if (myStack.empty() || (input.charAt(i) != myHashmap.get(myStack.pop()))) {
                return "NO";
            }
            i++;
        }
        return "YES";
    }
}

