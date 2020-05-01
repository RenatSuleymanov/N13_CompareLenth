import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input string: A ");
        String inputstringA = in.nextLine();
        System.out.print("Input string: B ");
        String inputstringB = in.nextLine();
        if (inputstringA.length()>inputstringB.length())
        {
            System.out.println("Строка A самая длинная " + inputstringA);
        } else  {
                if (inputstringA.length() == inputstringB.length())
                {
                System.out.println("Строка A = B: " + inputstringA.length() + " символов");
                } else  {
                    System.out.println("Строка B самая длинная " + inputstringB);
                        }
        }

    }
}