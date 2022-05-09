import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
     Scanner leitor = new Scanner(System.in);

		int N = leitor.nextInt();
		double acertos[] = new double[3];
		double dados[] = new double[3];
		for (int i=0; i<N; i++) {
			leitor.next(); 
			for (int x=0; x<3; x++) {
				dados[x] += leitor.nextDouble();
			}
			for (int j=0; j<3; j++) {
				acertos[j] += leitor.nextDouble();
			}
		}
		double saques = (acertos[0]) /dados[0] * 100;
		double bloqueios = (acertos[1]) /dados[1] *100;
		double ataques = (acertos[2]) / dados[2]*100;
		System.out.println(String.format("Pontos de Saque: %.2f", saques) + " %.");
		System.out.println(String.format("Pontos de Bloqueio: %.2f", bloqueios) + " %.");
		System.out.println(String.format("Pontos de Ataque: %.2f", ataques) + " %.");
 
    }
 
}
