import java.util.Locale;
import java.util.Scanner;

public class Pensão {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número de quartos vagos(0 á 9): ");
        int n = sc.nextInt(); //Números de quartos

        //*VETORES:
        String[] nomes = new String[n]; //Numero de vetores criados
        String[] email = new String[n]; //Numero de vetores criados
        int[] quarto = new int[n]; //Numero de vetores criados

        //*LEITURA DOS VETORES: 
        for(int i = 0; i < n; i++) {
            System.out.println("Dados do " + (i + 1) + " Hospede: ");
            System.out.print("Nome: ");
            nomes[i] = sc.next(); //Nome na posicão 0
            System.out.print("Email: ");
            email[i] = sc.next(); //Email na posição 0
            System.out.print("Número do Quarto: ");
            quarto[i] = sc.nextInt(); //Qaurto na posição
        }

        //*APRESENTAÇÃO DOS HOSPEDES:
        System.out.println("Quartos ocupados: ");
        for(int i = 0; i < n; i++){
            if(quarto[i] != 0) {
                System.out.println("Quarto número " + quarto[i] + ": " +nomes[i] + ", " + email[i]);
            }
        }

        sc.close();
    }
}
