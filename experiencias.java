import java.util.Scanner;

public class experiencias {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int dados = entrada.nextInt();
        char c;
        double especie;
        double soma = 0, coelhos = 0, ratos = 0, sapos = 0;

        for(int i=0; i<dados; i++){
            especie = entrada.nextDouble();
            c = entrada.next().toUpperCase().charAt(0);
            soma += especie;
            if(c =='C'){
                coelhos += especie;
            }if(c == 'R'){
                ratos += especie;
            }if(c == 'S'){
                sapos += especie;
            }
        }
        System.out.println("Total: " + (int)soma + " cobaias");
        System.out.println("Total de coelhos: " + (int)coelhos);
        System.out.println("Total de ratos: " + (int)ratos);
        System.out.println("Total de sapos: " + (int)sapos);
        System.out.println("Percentual de coelhos: " + String.format("%.2f", coelhos/soma*100) + " %");
        System.out.println("Percentual de ratos: " + String.format("%.2f", ratos/soma*100) + " %");
        System.out.println("Percentual de sapos: " + String.format("%.2f", sapos/soma*100) + " %");
    }
}
