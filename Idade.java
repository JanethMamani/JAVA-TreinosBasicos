import java.io.IOException;
import java.util.Scanner;

public class  Desafio {
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int cont = 0;
        int n = 1;
        float soma =0;
        while (n>0) {
            n = leitor.nextInt();
            if (n>0) { 
                soma = soma + n;
                cont ++;
            }
        }
        float media = soma / cont;
        System.out.printf("%.2f", media);
    }
	
}
