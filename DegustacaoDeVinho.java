import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String T = scan.nextLine();
    String respostasCompetidores = scan.nextLine();

    String[] respostasCompetidoresSplit = respostasCompetidores.split(" ");
 
    int count = 0;
    for (int i=0; i<5; i++) {
      //System.out.println(respostasCompetidoresSplit[i]);
      //Use o contains, senão ele tentará igualar o9s espaços e dará errado
      if (respostasCompetidoresSplit[i].contains(T)){
        count++;
      }
    }
    
    System.out.println(count);
  }
}
