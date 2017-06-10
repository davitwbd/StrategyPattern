package promocoesDeCanais;

import tv_a_cabo.Fatura;

public class SuperHD implements Fatura{

	@Override
	public double calcularPreco() {
		int canaisFullHD = 1;
		int canaisHD = 20;
		int canaisBasicos = 55;
		
		return (canaisFullHD * 3) + (canaisHD * 1.5) + (canaisBasicos * 1.2);
	}

}
