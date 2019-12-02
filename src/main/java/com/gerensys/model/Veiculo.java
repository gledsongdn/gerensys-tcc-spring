package com.gerensys.model;

import javax.persistence.*;

@Entity
public class Veiculo {

	@Id
	private Long renavam;
	
	private String chassi;
	
	private String modelo;
	
	private String marca;
	
	private String ano;
	
	private String placa;
	
	private int quilometragem;
	
	@OneToOne(mappedBy = "veiculo", cascade = CascadeType.REMOVE, orphanRemoval = true)
	private Manutencao manutencao;
	
	@OneToOne
	@JoinColumn(name = "Seguro_numApolice")
	private Seguro seguro;
	
	@OneToOne(mappedBy = "veiculo", cascade = CascadeType.ALL)
	private Funcionario funcionario;

	public Long getRenavam() {
		return renavam;
	}

	public void setRenavam(Long renavam) {
		this.renavam = renavam;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getQuilometragem() {
		return quilometragem;
	}

	public void setQuilometragem(int quilometragem) {
		this.quilometragem = quilometragem;
	}

	public Manutencao getManutencao() {
		return manutencao;
	}

	public void setManutencao(Manutencao manutencao) {
		this.manutencao = manutencao;
	}

	public Seguro getSeguro() {
		return seguro;
	}

	public void setSeguro(Seguro seguro) {
		this.seguro = seguro;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
}