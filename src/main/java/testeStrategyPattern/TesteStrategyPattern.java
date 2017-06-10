package testeStrategyPattern;

import java.util.Scanner;

import tv_a_cabo.Fatura;
import tv_a_cabo.PacoteDeCanais;

/** StrategyPattern 
 *
 *	Defini��o: define uma fam�lia de algoritmos, encapsula cada um deles e 
 *	           os torna intercambi�veis. O Strategy deixa o algoritmo variar 
 *	           independente dos que o utilizam. **/
public class TesteStrategyPattern {

	public static void main(String[] args) {
		try(Scanner teclado = new Scanner(System.in)){
			Fatura fatura = null;
			System.out.println("\nNossa TV a Cabo agora est� com �timas Promo��es!\n "
			                    +"Temos os seguites pacotes de Canais:");
			
			/** Neste exemplo o Enum, PacoteDeCanais, est� intercambiando as classes 
			 *  respons�veis por calcular o pre�o**/
			for(PacoteDeCanais pacote : PacoteDeCanais.values()){
				int numero = pacote.ordinal();
				fatura = pacote.obterFatura();
				System.out.println(numero+1 + " " + pacote + " por apenas R$ " + fatura.calcularPreco());
			}
			System.out.println("\nN�o perca mais tempo. Adquira j� o seu!!! \n");

			
			System.out.println("Digite o numero do pacote para ver o pre�o novamente:");
			int opcaoPacote = teclado.nextInt();
			
			//-> De acordo com o valor do Enum retornado ser� intercambiado a classe que vai calcular o pre�o da fatura.
			PacoteDeCanais pacote = PacoteDeCanais.values()[opcaoPacote -1];
			fatura = pacote.obterFatura();//-> obtendo a classe que vai calcular a Fatura.
			System.out.println("Pacote escolhido: " + pacote);
			System.out.println("Pre�o R$ " + fatura.calcularPreco());
		}
	}
}