package repeticao;
import java.util.*;

public class exercicio6 {
	public static void main (String [] args) {
		Scanner ler = new Scanner(System.in);
		int num, soma = 0, contador = 0;
		
		do {
			System.out.println("Digite um número inteiro: ");
			num = ler.nextInt();
			if(num %3 == 0) {
				contador++;
				soma = num + soma;
			}
		}while(num > 0);
		
		System.out.println("A média dos números múltiplos de 3 é: " + soma/contador);

	}
}
