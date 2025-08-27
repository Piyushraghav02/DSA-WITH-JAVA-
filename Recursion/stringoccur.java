
import java.util.Scanner;

class stringoccur {

    static void Removeoccur(String s, int ind) {
        if (ind == s.length()) {
            return;
        }

        if (s.charAt(ind) != 'a') {
            System.out.print(s.charAt(ind));
        }

        Removeoccur(s, ind + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String :- ");
        String s = sc.nextLine();

        Removeoccur(s, 0);

    }
}