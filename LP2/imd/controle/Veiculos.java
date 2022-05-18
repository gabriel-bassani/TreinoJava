package br.ufrn.sigaa.imd.controle;

import java.util.ArrayList;

import br.ufrn.sigaa.imd.modelo.Veiculo;

public class Veiculos {
	protected ArrayList<Veiculo> lista;
	
	public Veiculos() {
		lista = new ArrayList<Veiculo>();
	}
	
	public void addVeiculo(Veiculo veiculo) {
		lista.add(veiculo);
	}
	
	public void printCarbonFootPrint() {
		for(int i = 0; i < lista.size(); i++) {
			System.out.println("CarbonFootPrint: " + lista.get(i).getCarbonFootPrint() + "\n");
		}
	}
}
