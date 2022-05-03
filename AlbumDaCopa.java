import java.util.Scanner;

public class scriptUnico {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numTotal = scan.nextInt();
        int numFigCompradas = scan.nextInt();
        int figurasCompradas[] = new int[numTotal];
        int quantidadeFalta = 0;

        for (int i=0; i<numFigCompradas; i++) {
            int figura = scan.nextInt();
            figurasCompradas[figura - 1] = figura;
        }
        for (int faltam=0; faltam<numTotal; faltam++){
            if (figurasCompradas[faltam] == 0) {
                quantidadeFalta ++;
            }
        }
        System.out.println(quantidadeFalta);
    }
}
