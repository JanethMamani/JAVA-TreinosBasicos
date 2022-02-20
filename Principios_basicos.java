import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class minhaClasse {
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
//declare suas variaveis corretamente
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(leitor.nextInt());
        lista.add(leitor.nextInt());
        lista.add(leitor.nextInt());
        lista.add(leitor.nextInt());
        lista.add(leitor.nextInt());
        int par = 0;
        int impar = 0;
        int positivo = 0;
        int negativo = 0;
        

//continue a solução
        for(Integer item:lista) {
        	if(item%2==0){par++;}
        	if(item%2==1 || item%2==-1){impar++;}
        	if(item>0){positivo++;}
        	if(item<0){negativo++;}
        }
//insira suas variaveis corretamente
        System.out.println(par + " par(es)");
        System.out.println(impar + " impar(es)");
        System.out.println(positivo + " positivo(s)");
        System.out.println(negativo + " negativo(s)");
    }
	
}
