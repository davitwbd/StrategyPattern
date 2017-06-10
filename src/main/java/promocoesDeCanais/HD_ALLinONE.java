package promocoesDeCanais;

import tv_a_cabo.Fatura;

public class HD_ALLinONE implements Fatura{

	@Override
	public double calcularPreco() {
		int canaisFullHD = 20;
		int canaisHD = 45;
		int canaisBasicos = 80;
		
		return (canaisFullHD * 3) + (canaisHD * 1.5) + (canaisBasicos * 1.2);
	}

}
