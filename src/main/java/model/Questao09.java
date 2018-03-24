package main.java.model;

import java.io.Serializable;

public class Questao09 implements Serializable {

	private static final long serialVersionUID = -7763274733805319430L;

	private String Questao;
	private int total;

	public String getQuestao() {
		return Questao;
	}

	public void setQuestao(String questao) {
		Questao = questao;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

}
