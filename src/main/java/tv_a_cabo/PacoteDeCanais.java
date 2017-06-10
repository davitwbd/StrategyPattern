package tv_a_cabo;

import promocoesDeCanais.HDLight;
import promocoesDeCanais.HD_ALLinONE;
import promocoesDeCanais.Simples;
import promocoesDeCanais.SuperHD;

/** Este Enum est� sendo usado como estrat�gia para intercambiar
 *  as classes que det�m os algoritmos respons�veis por calcular o 
 *  pre�o dos pacotes de canais de TV **/

public enum PacoteDeCanais {
	SIMPLES {
		@Override
		public Fatura obterFatura() {
			return new Simples(); 
			//-> retorna a classe que calcula o preso do pacote Simples;
		}
	},	
	
	HD_LIGHT {
		@Override
		public Fatura obterFatura() {
			return new HDLight();
		}
	},	
	
	SUPER_HD {
		@Override
		public Fatura obterFatura() {
			return new SuperHD();
		}
	},
	
	HD_ALL_IN_ONE{
		@Override
		public Fatura obterFatura() {
			return new HD_ALLinONE();
		}
	};
	
	public abstract Fatura obterFatura(); 
}
