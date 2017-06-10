package promocoesDeCanais;

import tv_a_cabo.Fatura;

public class Simples implements Fatura{
	
	@Override
	public double calcularPreco() {
		int canaisFullHD = 0;
		int canaisHD = 0;
		int canaisBasicos = 45;
		
		return (canaisFullHD * 3) + (canaisHD * 1.5) + (canaisBasicos * 1.2);
	}

}
