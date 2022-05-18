package br.ufrn.sigaa.imd.visao;

import br.ufrn.sigaa.imd.controle.Veiculos;
import br.ufrn.sigaa.imd.modelo.Carro;
import br.ufrn.sigaa.imd.modelo.Moto;
import br.ufrn.sigaa.imd.modelo.Taxi;

public class VisaoVeiculos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Veiculos veiculos = new Veiculos();
		Moto moto1 = new Moto(600, 700);
		Moto moto2 = new Moto(250, 100);
		Carro carro1 = new Carro(800, 2.5);
		Carro carro2 = new Carro(1000, 0.5);
		Taxi taxi1 = new Taxi(4000, 4);
		Taxi taxi2 = new Taxi(5000, 3);
		
		veiculos.addVeiculo(moto1);
		veiculos.addVeiculo(moto2);
		veiculos.addVeiculo(carro1);
		veiculos.addVeiculo(carro2);
		veiculos.addVeiculo(taxi1);
		veiculos.addVeiculo(taxi2);
		
		veiculos.printCarbonFootPrint();
		
	}

}
