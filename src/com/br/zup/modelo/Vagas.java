package com.br.zup.modelo;

public class Vagas {
	
	private int vagasTotal;
	private int vagaIdosos;
	private int vagaDeficientes;
	private int vagaMotos;
	
	public Vagas(int vagasTotal, int vagaIdosos, int vagaDeficientes, int vagaMotos) {
		this.vagasTotal = vagasTotal;
		this.vagaIdosos = vagaIdosos;
		this.vagaDeficientes = vagaDeficientes;
		this.vagaMotos = vagaMotos;
	}

	public int getVagasTotal() {
		return vagasTotal;
	}

	public void setVagasTotal(int vagasTotal) {
		this.vagasTotal = vagasTotal;
	}

	public int getVagaIdosos() {
		return vagaIdosos;
	}

	public void setVagaIdosos(int vagaIdosos) {
		this.vagaIdosos = vagaIdosos;
	}

	public int getVagaDeficientes() {
		return vagaDeficientes;
	}

	public void setVagaDeficientes(int vagaDeficientes) {
		this.vagaDeficientes = vagaDeficientes;
	}

	public int getVagaMotos() {
		return vagaMotos;
	}

	public void setVagaMotos(int vagaMotos) {
		this.vagaMotos = vagaMotos;
	}
	
	public String toSTring () {
		String modelo = "";
		
		modelo +="Total de vagas : "+ this.getVagasTotal()+ "\n";
		modelo +="Total de vagas para idosos : "+ this.getVagaIdosos()+ "\n";
		modelo +="Total de vagas para deficientes : "+ this.getVagaDeficientes()+ "\n";
		modelo +="Total de vagas para motos : "+ this.getVagaMotos()+ "\n";
		
		return modelo;
	}
	
}
