package repeticao;
import java.util.*;

public class exercicio5 {
	public static void main (String [] args) {
		Scanner ler = new Scanner(System.in);
		int num, soma = 0, contador = 0;
		
		do {
			System.out.println("Digite um número inteiro: ");
			num = ler.nextInt();
			if(num != 0) {
				contador++;
				soma += num;
			}
		}while(num > 0);
		System.out.println("A soma dos números inteiros é: " + soma);
	}
}
