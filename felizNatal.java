import java.io.IOException;
import java.util.Scanner;

public class felizNatal {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();

        System.out.println("Feliz nat" + "a".repeat(N) + "l!");
    }
}
