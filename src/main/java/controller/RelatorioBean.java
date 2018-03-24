package main.java.controller;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import main.java.dao.RelatorioDAO;
import main.java.model.Resposta01;
import main.java.model.Resposta02;
import main.java.model.Resposta03;
import main.java.model.Resposta04;
import main.java.model.Resposta05;
import main.java.model.Resposta06;
import main.java.model.Resposta07;
import main.java.model.Resposta08;
import main.java.model.Resposta09;
import main.java.model.Resposta10;
import main.java.model.Resposta11;
import main.java.model.Resposta12;
import main.java.model.Resposta13;

@ManagedBean(name = "relatorioBean")
@ViewScoped
public class RelatorioBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private RelatorioDAO relatorioDAO = new RelatorioDAO();

	private List<Resposta01> listaResposta01;

	private List<Resposta02> listaResposta02;

	private List<Resposta03> listaResposta03;

	private List<Resposta04> listaResposta04;

	private List<Resposta05> listaResposta05;

	private List<Resposta06> listaResposta06;

	private List<Resposta07> listaResposta07;

	private List<Resposta08> listaResposta08;

	private List<Resposta09> listaResposta09;

	private List<Resposta10> listaResposta10;

	private List<Resposta11> listaResposta11;

	private List<Resposta12> listaResposta12;

	private List<Resposta13> listaResposta13;

	@PostConstruct
	public void init() {
		CarregarListaQuestao01();

		CarregarListaQuestao02();

		CarregarListaQuestao03();

		CarregarListaQuestao04();

		CarregarListaQuestao05();

		CarregarListaQuestao06();

		CarregarListaQuestao07();

		CarregarListaQuestao08();

		CarregarListaQuestao09();

		CarregarListaQuestao10();

		CarregarListaQuestao11();

		CarregarListaQuestao12();

		CarregarListaQuestao13();
	}

	public void CarregarListaQuestao01() {
		try {

			listaResposta01 = relatorioDAO.getTotalResposta01();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void CarregarListaQuestao02() {
		try {

			listaResposta02 = relatorioDAO.getTotalResposta02();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void CarregarListaQuestao03() {
		try {

			listaResposta03 = relatorioDAO.getTotalResposta03();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void CarregarListaQuestao04() {
		try {

			listaResposta04 = relatorioDAO.getTotalResposta04();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void CarregarListaQuestao05() {
		try {

			listaResposta05 = relatorioDAO.getTotalResposta05();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void CarregarListaQuestao06() {
		try {

			listaResposta06 = relatorioDAO.getTotalResposta06();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void CarregarListaQuestao07() {
		try {

			listaResposta07 = relatorioDAO.getTotalResposta07();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void CarregarListaQuestao08() {
		try {

			listaResposta08 = relatorioDAO.getTotalResposta08();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void CarregarListaQuestao09() {
		try {

			listaResposta09 = relatorioDAO.getTotalResposta09();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void CarregarListaQuestao10() {
		try {

			listaResposta10 = relatorioDAO.getTotalResposta10();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void CarregarListaQuestao11() {
		try {

			listaResposta11 = relatorioDAO.getTotalResposta11();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void CarregarListaQuestao12() {
		try {

			listaResposta12 = relatorioDAO.getTotalResposta12();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void CarregarListaQuestao13() {
		try {

			listaResposta13 = relatorioDAO.getTotalResposta13();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public List<Resposta01> getListaResposta01() {
		return listaResposta01;
	}

	public void setListaResposta01(List<Resposta01> listaResposta01) {
		this.listaResposta01 = listaResposta01;
	}

	public List<Resposta02> getListaResposta02() {
		return listaResposta02;
	}

	public void setListaResposta02(List<Resposta02> listaResposta02) {
		this.listaResposta02 = listaResposta02;
	}

	public List<Resposta03> getListaResposta03() {
		return listaResposta03;
	}

	public void setListaResposta03(List<Resposta03> listaResposta03) {
		this.listaResposta03 = listaResposta03;
	}

	public List<Resposta04> getListaResposta04() {
		return listaResposta04;
	}

	public void setListaResposta04(List<Resposta04> listaResposta04) {
		this.listaResposta04 = listaResposta04;
	}

	public List<Resposta05> getListaResposta05() {
		return listaResposta05;
	}

	public void setListaResposta05(List<Resposta05> listaResposta05) {
		this.listaResposta05 = listaResposta05;
	}

	public List<Resposta06> getListaResposta06() {
		return listaResposta06;
	}

	public void setListaResposta06(List<Resposta06> listaResposta06) {
		this.listaResposta06 = listaResposta06;
	}

	public List<Resposta07> getListaResposta07() {
		return listaResposta07;
	}

	public void setListaResposta07(List<Resposta07> listaResposta07) {
		this.listaResposta07 = listaResposta07;
	}

	public List<Resposta08> getListaResposta08() {
		return listaResposta08;
	}

	public void setListaResposta08(List<Resposta08> listaResposta08) {
		this.listaResposta08 = listaResposta08;
	}

	public List<Resposta09> getListaResposta09() {
		return listaResposta09;
	}

	public void setListaResposta09(List<Resposta09> listaResposta09) {
		this.listaResposta09 = listaResposta09;
	}

	public List<Resposta10> getListaResposta10() {
		return listaResposta10;
	}

	public void setListaResposta10(List<Resposta10> listaResposta10) {
		this.listaResposta10 = listaResposta10;
	}

	public List<Resposta11> getListaResposta11() {
		return listaResposta11;
	}

	public void setListaResposta11(List<Resposta11> listaResposta11) {
		this.listaResposta11 = listaResposta11;
	}

	public List<Resposta12> getListaResposta12() {
		return listaResposta12;
	}

	public void setListaResposta12(List<Resposta12> listaResposta12) {
		this.listaResposta12 = listaResposta12;
	}

	public List<Resposta13> getListaResposta13() {
		return listaResposta13;
	}

	public void setListaResposta13(List<Resposta13> listaResposta13) {
		this.listaResposta13 = listaResposta13;
	}

}
