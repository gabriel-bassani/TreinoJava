package br.ufrn.sigaa.imd.modelo;

public class Carro extends Veiculo implements ICarbonFootPrint{
	protected double motor;
	
	public Carro(int quilometragem, double motor) {
		// TODO Auto-generated constructor stub
		super(quilometragem);
		this.motor = motor;
	}
	
	public double getCarbonFootPrint() {
		double carbono;
		
		if(this.motor > 2.0) carbono = this.quilometragem * 1.85;
		if(this.motor < 1.0) carbono = this.quilometragem * 0.13;
		else carbono = this.quilometragem * 1.22;
		
		System.out.println("Carro");
		
		return carbono;
	}

	public double getMotor() {
		return motor;
	}

	public void setMotor(double motor) {
		this.motor = motor;
	}

}
