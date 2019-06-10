package com.br.zup.modelo;

public class controleCatraca {
	
	private double horarioEntrada;
	private double horarioSaida;
	private double toleranciaGratis = 15;
	private double precoHora = 10.00;
	private double precoAdicional = 5.00;
	
	public controleCatraca(double horarioEntrada, double horarioSaida, double toleranciaGratis, double precoHora,
			double precoAdicional) {
		this.horarioEntrada = horarioEntrada;
		this.horarioSaida = horarioSaida;
		this.toleranciaGratis = toleranciaGratis;
		this.precoHora = precoHora;
		this.precoAdicional = precoAdicional;
	}

	public double getHorarioEntrada() {
		return horarioEntrada;
	}

	public void setHorarioEntrada(double horarioEntrada) {
		this.horarioEntrada = horarioEntrada;
	}

	public double getHorarioSaida() {
		return horarioSaida;
	}

	public void setHorarioSaida(double horarioSaida) {
		this.horarioSaida = horarioSaida;
	}

	public double getToleranciaGratis() {
		return toleranciaGratis;
	}

	public void setToleranciaGratis(double toleranciaGratis) {
		this.toleranciaGratis = toleranciaGratis;
	}

	public double getPrecoHora() {
		return precoHora;
	}

	public void setPrecoHora(double precoHora) {
		this.precoHora = precoHora;
	}

	public double getPrecoAdicional() {
		return precoAdicional;
	}

	public void setPrecoAdicional(double precoAdicional) {
		this.precoAdicional = precoAdicional;
	}
	
	public String toString() {
		String modelo = "";
		
		modelo +="Hora da entrada : "+ this.getHorarioEntrada()+ "\n";
		modelo +="Hora de saída : "+ this.getHorarioSaida()+ "\n";
		modelo +="Tempo de tolerância gratuita : "+ this.getToleranciaGratis()+ "\n";
		modelo +="Preço 1 hora de estadia : "+ this.getPrecoHora()+ "\n";
		modelo +="Valor adicional após 1 hora de estadia : "+ this.getPrecoAdicional()+ "\n";
		
		return modelo;
	}
	
	
	

}
