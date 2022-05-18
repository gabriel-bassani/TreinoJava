package br.ufrn.sigaa.imd.modelo;

public class Taxi extends Veiculo implements ICarbonFootPrint{
	protected int quantPessoas;
	
	public Taxi(int quilometragem, int quantPessoas) {
		// TODO Auto-generated constructor stub
		super(quilometragem);
		this.quantPessoas = quantPessoas;
	}
	
	public int getQuantPessoas() {
		return quantPessoas;
	}

	public void setQuantPessoas(int quantPessoas) {
		this.quantPessoas = quantPessoas;
	}

	public double getCarbonFootPrint() {
		double carbono = this.quilometragem * 1.10;
		
		System.out.println("Taxi");
		
		return carbono;
	}
}
