package com.br.zup.modelo;

public class Veiculo {
	
	private boolean veiculoComum;
	private boolean veiculoIdoso;
	private boolean veiculoDeficiente;
	private boolean moto;
	
	public Veiculo(boolean veiculoComum, boolean veiculoIdoso, boolean veiculoDeficiente, boolean moto) {
		this.veiculoComum = veiculoComum;
		this.veiculoIdoso = veiculoIdoso;
		this.veiculoDeficiente = veiculoDeficiente;
		this.moto = moto;
	}

	public boolean isVeiculoComum() {
		return veiculoComum;
	}

	public void setVeiculoComum(boolean veiculoComum) {
		this.veiculoComum = veiculoComum;
	}

	public boolean isVeiculoIdoso() {
		return veiculoIdoso;
	}

	public void setVeiculoIdoso(boolean veiculoIdoso) {
		this.veiculoIdoso = veiculoIdoso;
	}

	public boolean isVeiculoDeficiente() {
		return veiculoDeficiente;
	}

	public void setVeiculoDeficiente(boolean veiculoDeficiente) {
		this.veiculoDeficiente = veiculoDeficiente;
	}

	public boolean isMoto() {
		return moto;
	}

	public void setMoto(boolean moto) {
		this.moto = moto;
	}
	
	
}