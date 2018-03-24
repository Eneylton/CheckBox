package main.java.model;

public class Questao {

	private int idQuestao;
	private String questao;
	private int checkin;
	private int subjetiva;

	public int getSubjetiva() {
		return subjetiva;
	}

	public void setSubjetiva(int subjetiva) {
		this.subjetiva = subjetiva;
	}

	public int getCheckin() {
		return checkin;
	}

	public void setCheckin(int checkin) {
		this.checkin = checkin;
	}

	public int getIdQuestao() {
		return idQuestao;
	}

	public void setIdQuestao(int idQuestao) {
		this.idQuestao = idQuestao;
	}

	public String getQuestao() {
		return questao;
	}

	public void setQuestao(String questao) {
		this.questao = questao;
	}

}
