package testeStrategyPattern;

import java.util.Scanner;

import tv_a_cabo.Fatura;
import tv_a_cabo.PacoteDeCanais;

/** StrategyPattern 
 *
 *	Definição: define uma família de algoritmos, encapsula cada um deles e 
 *	           os torna intercambiáveis. O Strategy deixa o algoritmo variar 
 *	           independente dos que o utilizam. **/
public class TesteStrategyPattern {

	public static void main(String[] args) {
		try(Scanner teclado = new Scanner(System.in)){
			Fatura fatura = null;
			System.out.println("\nNossa TV a Cabo agora está com Ótimas Promoções!\n "
			                    +"Temos os seguites pacotes de Canais:");
			
			/** Neste exemplo o Enum, PacoteDeCanais, está intercambiando as classes 
			 *  responsáveis por calcular o preço**/
			for(PacoteDeCanais pacote : PacoteDeCanais.values()){
				int numero = pacote.ordinal();
				fatura = pacote.obterFatura();
				System.out.println(numero+1 + " " + pacote + " por apenas R$ " + fatura.calcularPreco());
			}
			System.out.println("\nNão perca mais tempo. Adquira já o seu!!! \n");

			
			System.out.println("Digite o numero do pacote para ver o preço novamente:");
			int opcaoPacote = teclado.nextInt();
			
			//-> De acordo com o valor do Enum retornado será intercambiado a classe que vai calcular o preço da fatura.
			PacoteDeCanais pacote = PacoteDeCanais.values()[opcaoPacote -1];
			fatura = pacote.obterFatura();//-> obtendo a classe que vai calcular a Fatura.
			System.out.println("Pacote escolhido: " + pacote);
			System.out.println("Preço R$ " + fatura.calcularPreco());
		}
	}
}