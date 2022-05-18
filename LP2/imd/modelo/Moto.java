package br.ufrn.sigaa.imd.modelo;

public class Moto extends Veiculo implements ICarbonFootPrint {
	protected int cilindrada;
	
	public Moto(int quilometragem, int cilindrada) {
		// TODO Auto-generated constructor stub
		super(quilometragem);
		this.cilindrada = cilindrada;
	}
	
	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	public double getCarbonFootPrint() {
		double carbono;
		
		if(this.cilindrada > 650) carbono = this.quilometragem * 0.65;
		if(this.cilindrada < 150) carbono = this.quilometragem * 0.20;
		else carbono = this.quilometragem * 0.50;
		
		System.out.println("Moto");
		
		return carbono;
	}
}