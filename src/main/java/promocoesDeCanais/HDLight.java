package promocoesDeCanais;

import tv_a_cabo.Fatura;

public class HDLight implements Fatura{

	@Override
	public double calcularPreco() {
		int canaisFullHD = 0;
		int canaisHD = 8;
		int canaisBasicos = 50;
		
		return (canaisFullHD * 3) + (canaisHD * 1.5) + (canaisBasicos * 1.2);
	}

}