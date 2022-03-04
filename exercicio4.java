package repeticao;
import java.util.*;

public class exercicio4 {
	public static void main (String [] args) {
		Scanner ler = new Scanner(System.in);
		int idadePessoas, sexoPessoas, opcoes, numDados = 1; 
		int pessoaCalma = 0, mulherNervosa = 0, homemAgressivo = 0, outrosCalmos = 0, pessoaCalmaMenor = 0, pessoaNervosaMaior = 0;
		
		System.out.println("Qual sua idade? ");
		idadePessoas = ler.nextInt();
		System.out.println("Qual seu sexo? \n1-Feminino \n2-Masculino e \n3-Outros");
		sexoPessoas = ler.nextInt();
		System.out.println("Como você está hoje? \n1-Calmo; \n2-Nervoso; \n3-Agressivo");
		opcoes = ler.nextInt();
		
		while(numDados < 150){
			if (opcoes == 1) {
				pessoaCalma++;
			}
			if(opcoes == 2 && sexoPessoas == 1) {
				mulherNervosa++;
			}
			if (opcoes == 3 && sexoPessoas == 2) {
				homemAgressivo++;
			}
			if (opcoes == 1 && sexoPessoas == 3) {
				outrosCalmos++;
			}
			if (opcoes == 2 && idadePessoas > 40) {
				pessoaNervosaMaior++;
			}
			if (opcoes == 1 && idadePessoas < 18) {
				pessoaCalmaMenor++;
			}			
			System.out.println("Qual sua idade? ");
			idadePessoas = ler.nextInt();
			System.out.println("Qual seu sexo? \n1-Feminino \n2-Masculino e \n3-Outros");
			sexoPessoas = ler.nextInt();
			System.out.println("Como você está hoje? \n1-Calmo; \n2-Nervoso; \n3-Agressivo");
			opcoes = ler.nextInt();
			numDados++;
			
		}
		System.out.println("O número de pessoas calmas é: " + pessoaCalma);
		System.out.println("O número de mulheres nervosas é: " + mulherNervosa);
		System.out.println("O número de homens agressivos é: " + homemAgressivo);
		System.out.println("O número de outros calmos é: " + outrosCalmos);
		System.out.println("O número de pessoas nervosas com mais de 40 anos é: " + pessoaNervosaMaior);
		System.out.println("O número de pessoas calmas com menos de 18 anos é: " + pessoaCalmaMenor);
	}
}
