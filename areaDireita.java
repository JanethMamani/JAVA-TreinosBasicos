import java.io.IOException;
import java.util.Scanner;

public class areaDireita{

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double soma = 0;
        char O = leitor.next().toUpperCase().charAt(0);
        double[][] M = new double[12][12];
        for (int i=0; i<12;i++) {
            for (int j=0; j<12;j++) {
                M[j][i] = leitor.nextDouble();
            }
        }
        for (int i=8;i<12;i++) {
            for (int j=4;j<8;j++) {
                soma += M[i][j];
            }
        }
        for (int i=10;i<12;i++) {
            for (int j=2;j<4;j++) {
                soma += M[i][j];
            }
        }
        for (int i=10;i<12;i++) {
            for (int j=8;j<10;j++) {
                soma += M[i][j];
            }
        }
        soma = soma + M[11][1] + M[9][3] + M[7][5] + M[7][6] + M[9][8] + M[11][10];
        
        if (O == 'M') soma /= 30;
        System.out.println(String.format("%.1f", soma));
    }

}
