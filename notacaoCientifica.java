import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class notacaoCientifica {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        String valorP = leitor.nextLine();
        Double valorPreciso = Double.parseDouble(valorP);
        if(valorPreciso>0) {
            if (1 <= valorPreciso && valorPreciso < 10) {
                String valorAr = String.format("%.4f", valorPreciso);
                System.out.println("+" + valorAr + "E+00");
            }
            if (10 <= valorPreciso && valorPreciso < 100) {
                valorPreciso = valorPreciso * 0.1;
                String valorAr = String.format("%.4f", valorPreciso);
                System.out.println("+" + valorAr + "E+01");
            }
            if (100 <= valorPreciso && valorPreciso < 1000) {
                valorPreciso = valorPreciso * 0.2;
                String valorAr = String.format("%.4f", valorPreciso);
                System.out.println("+" + valorAr + "E+02");
            }
            if (valorPreciso>=1000) {
                int expoente = valorP.length()-1;
                System.out.println("+" + valorP.substring(0,1) + "." + valorP.substring(1,4) + "E+" + String.format("%d", expoente));
            }
            if (0.1 <= valorPreciso && valorPreciso < 1) {
                valorPreciso = valorPreciso * 10;
                String valorAr = String.format("%.4f", valorPreciso);
                System.out.println("+" + valorAr + "E-01");
            }
            if (0.01 <= valorPreciso && valorPreciso < 0.1) {
                valorPreciso = valorPreciso * 100;
                String valorAr = String.format("%.4f", valorPreciso);
                System.out.println("+" + valorAr + "E-02");
            }
            if (0.001 <= valorPreciso && valorPreciso < 0.01) {
                valorPreciso = valorPreciso * 1000;
                String valorAr = String.format("%.4f", valorPreciso);
                System.out.println("+" + valorAr + "E-03");
            }
            if (0.0001 <= valorPreciso && valorPreciso <= 0.001) {
                valorPreciso = valorPreciso * 10000;
                String valorAr = String.format("%.4f", valorPreciso);
                System.out.println("+" + valorAr + "E-04");
            }
            if (0.00001 <= valorPreciso && valorPreciso < 0.0001) {
                valorPreciso = valorPreciso * 100000;
                String valorAr = String.format("%.4f", valorPreciso);
                System.out.println("+" + valorAr + "E-05");
            }
            if (0.000001 <= valorPreciso && valorPreciso <= 0.00001) {
                valorPreciso = valorPreciso * 1000000;
                String valorAr = String.format("%.4f", valorPreciso);
                System.out.println("+" + valorAr + "E-06");
            }
        }if(valorPreciso==0){
            if (valorP.contains("-")){
                System.out.println("-0.0000E+00");
            }else{
                System.out.println("+0.0000E+00");
            }
        }if(valorPreciso<0){
            valorPreciso = Math.abs(valorPreciso);
            if (1 <= valorPreciso && valorPreciso < 10) {
                String valorAr = String.format("%.4f", valorPreciso);
                System.out.println("-" + valorAr + "E+00");
            }
            if (10 <= valorPreciso && valorPreciso < 100) {
                valorPreciso = valorPreciso * 0.1;
                String valorAr = String.format("%.4f", valorPreciso);
                System.out.println("-" + valorAr + "E+01");
            }
            if (100 <= valorPreciso && valorPreciso < 1000) {
                valorPreciso = valorPreciso * 0.2;
                String valorAr = String.format("%.4f", valorPreciso);
                System.out.println("-" + valorAr + "E+02");
            }
            if (valorPreciso>=1000) {
                int expoente = valorP.length()-2;
                System.out.println(valorP.substring(0,2) + "." + valorP.substring(2,5) + "E+" + String.format("%d", expoente));
            }
            if (0.1 <= valorPreciso && valorPreciso < 1) {
                valorPreciso = valorPreciso * 10;
                String valorAr = String.format("%.4f", valorPreciso);
                System.out.println("-" + valorAr + "E-01");
            }
            if (0.01 <= valorPreciso && valorPreciso < 0.1) {
                valorPreciso = valorPreciso * 100;
                String valorAr = String.format("%.4f", valorPreciso);
                System.out.println("-" + valorAr + "E-02");
            }
            if (0.001 <= valorPreciso && valorPreciso < 0.01) {
                valorPreciso = valorPreciso * 1000;
                String valorAr = String.format("%.4f", valorPreciso);
                System.out.println("-" + valorAr + "E-03");
            }
            if (0.0001 <= valorPreciso && valorPreciso <= 0.001) {
                valorPreciso = valorPreciso * 10000;
                String valorAr = String.format("%.4f", valorPreciso);
                System.out.println("-" + valorAr + "E-04");
            }
            if (0.00001 <= valorPreciso && valorPreciso < 0.0001) {
                valorPreciso = valorPreciso * 100000;
                String valorAr = String.format("%.4f", valorPreciso);
                System.out.println("-" + valorAr + "E-05");
            }
            if (0.000001 <= valorPreciso && valorPreciso <= 0.00001) {
                valorPreciso = valorPreciso * 1000000;
                String valorAr = String.format("%.4f", valorPreciso);
                System.out.println("-" + valorAr + "E-06");
            }
        }
    }
}
