package br.ufrn.sigaa.imd.modelo;

public class Veiculo {
	protected int quilometragem;
	
	public Veiculo(int quilometragem) {
		this.quilometragem = quilometragem;
	}
	
	public double custoCombustivel() {
		return 0;
	}

	public int getQuilometragem() {
		return quilometragem;
	}

	public void setQuilometragem(int quilometragem) {
		this.quilometragem = quilometragem;
	}
	
	public double getCarbonFootPrint() {
		double carbono = this.quilometragem;
		
		System.out.println("Veiculo");
		
		return carbono;
	}
}
