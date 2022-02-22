import java.io.IOException;
import java.util.Scanner;

public class FilmePercent {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double A = leitor.nextDouble();
        double B = leitor.nextDouble();
        double perc = (B-A)*100/A;

        System.out.printf("%.2f",perc);
        System.out.println("%");
    }

}
