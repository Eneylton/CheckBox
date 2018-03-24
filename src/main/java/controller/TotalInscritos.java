package main.java.controller;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import main.java.dao.InscritosDAO;
import main.java.model.Questao01;
import main.java.model.Questao02;
import main.java.model.Questao03;
import main.java.model.Questao04;
import main.java.model.Questao05;
import main.java.model.Questao06;
import main.java.model.Questao07;
import main.java.model.Questao08;
import main.java.model.Questao09;
import main.java.model.Questao10;
import main.java.model.Questao11;
import main.java.model.Questao12;
import main.java.model.Questao13;
import main.java.model.Questao14;
import main.java.model.Questao15;
import main.java.model.Questao16;
import main.java.model.Questao17;
import main.java.model.Questao18;

import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.BarChartModel;
import org.primefaces.model.chart.ChartSeries;
import org.primefaces.model.chart.PieChartModel;

@ManagedBean(name = "totalInscritos")
@ViewScoped
public class TotalInscritos implements Serializable {

	private static final long serialVersionUID = 1L;

	private InscritosDAO inscritosDAO = new InscritosDAO();

	private List<Questao01> questao01 = new ArrayList<Questao01>();

	private List<Questao02> questao02 = new ArrayList<Questao02>();

	private List<Questao03> questao03 = new ArrayList<Questao03>();

	private List<Questao04> questao04 = new ArrayList<Questao04>();

	private List<Questao05> questao05 = new ArrayList<Questao05>();

	private List<Questao06> questao06 = new ArrayList<Questao06>();

	private List<Questao07> questao07 = new ArrayList<Questao07>();

	private List<Questao08> questao08 = new ArrayList<Questao08>();

	private List<Questao09> questao09 = new ArrayList<Questao09>();

	private List<Questao10> questao10 = new ArrayList<Questao10>();

	private List<Questao11> questao11 = new ArrayList<Questao11>();

	private List<Questao12> questao12 = new ArrayList<Questao12>();

	private List<Questao13> questao13 = new ArrayList<Questao13>();

	private List<Questao14> questao14 = new ArrayList<Questao14>();

	private List<Questao15> questao15 = new ArrayList<Questao15>();

	private List<Questao16> questao16 = new ArrayList<Questao16>();

	private List<Questao17> questao17 = new ArrayList<Questao17>();

	private List<Questao18> questao18 = new ArrayList<Questao18>();

	private BarChartModel barModel;

	private BarChartModel barModel2;

	private BarChartModel barModel4;

	private BarChartModel barModel5;

	private BarChartModel barModel6;

	private BarChartModel barModel7;

	private BarChartModel barModel8;

	private BarChartModel barModel9;

	private BarChartModel barModel10;

	private BarChartModel barModel11;

	private BarChartModel barModel12;

	private BarChartModel barModel13;

	private BarChartModel barModel14;

	private BarChartModel barModel15;

	private BarChartModel barModel16;

	private BarChartModel barModel17;

	private BarChartModel barModel18;

	private PieChartModel pieModelSexo;

	@PostConstruct
	public void init() {

		createBarModel();
		createBarModel2();
		createBarModel4();
		createBarModel5();
		createBarModel6();
		createBarModel7();
		createBarModel8();
		createBarModel9();
		createBarModel10();
		createBarModel11();
		createBarModel12();
		createBarModel13();
		createBarModel14();
		createBarModel15();
		createBarModel16();
		createBarModel17();
		createBarModel18();
		createPieModelSexo();

	}

	private BarChartModel initBarModel() throws SQLException {
		BarChartModel model = new BarChartModel();

		ChartSeries barra = new ChartSeries();

		List<Questao01> totalQuestao01 = inscritosDAO.getTotalQuestao01();

		for (Questao01 questao01 : totalQuestao01) {
			barra.set(questao01.getQuestao(), questao01.getTotal());

		}

		model.addSeries(barra);

		return model;
	}

	private void createBarModel() {
		try {
			barModel = initBarModel();
			barModel.setTitle("1 - Há quanto tempo você trabalha no Detran ?");
			barModel.setAnimate(true);
			barModel.setShowPointLabels(true);

			Axis xAxis = barModel.getAxis(AxisType.X);
			xAxis.setLabel("Respostas");
			xAxis.setTickAngle(-50);

			barModel.setSeriesColors("000000,FFFF00,0000CD,00d41a,6495ED,DC143C,800000,66CDAA,FF0000,2F4F4F,FFA500,8B4513,EEE8AA,90EE90 ");
			barModel.setExtender("chartExtender");

			Axis yAxis = barModel.getAxis(AxisType.Y);
			yAxis.setLabel("Total");

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	private BarChartModel initBarModel2() throws SQLException {
		BarChartModel model = new BarChartModel();

		ChartSeries barra = new ChartSeries();

		List<Questao03> totalQuestao03 = inscritosDAO.getTotalQuestao03();

		for (Questao03 questao03 : totalQuestao03) {
			barra.set(questao03.getQuestao(), questao03.getTotal());

		}

		model.addSeries(barra);

		return model;
	}

	private void createBarModel2() {
		try {
			barModel2 = initBarModel2();
			barModel2.setTitle("3 - Assinale a Diretoria em que você trabalha");
			barModel2.setAnimate(true);
			barModel2.setShowPointLabels(true);

			Axis xAxis = barModel2.getAxis(AxisType.X);
			xAxis.setLabel("Respostas");
			xAxis.setTickAngle(-50);

			barModel2
					.setSeriesColors("000000,FFFF00,0000CD,00d41a,6495ED,DC143C,800000,66CDAA,FF0000,2F4F4F,FFA500,8B4513,EEE8AA,90EE90 ");
			barModel2.setExtender("chartExtender");

			Axis yAxis = barModel2.getAxis(AxisType.Y);
			yAxis.setLabel("Total");

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	private BarChartModel initBarModel4() throws SQLException {
		BarChartModel model = new BarChartModel();

		ChartSeries barra = new ChartSeries();

		List<Questao04> totalQuestao04 = inscritosDAO.getTotalQuestao04();

		for (Questao04 questao04 : totalQuestao04) {
			barra.set(questao04.getQuestao(), questao04.getTotal());

		}

		model.addSeries(barra);

		return model;
	}

	private void createBarModel4() {
		try {
			barModel4 = initBarModel4();
			barModel4
					.setTitle("4 - Assinale a alternativa abaixo que corresponde à sua remuneração mensal total, incluindo vantagens");
			barModel4.setAnimate(true);
			barModel4.setShowPointLabels(true);

			Axis xAxis = barModel4.getAxis(AxisType.X);
			xAxis.setLabel("Respostas");
			xAxis.setTickAngle(-50);

			barModel4
					.setSeriesColors("000000,FFFF00,0000CD,00d41a,6495ED,DC143C,800000,66CDAA,FF0000,2F4F4F,FFA500,8B4513,EEE8AA,90EE90 ");
			barModel4.setExtender("chartExtender");

			Axis yAxis = barModel4.getAxis(AxisType.Y);
			yAxis.setLabel("Total");

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	private BarChartModel initBarModel5() throws SQLException {
		BarChartModel model = new BarChartModel();

		ChartSeries barra = new ChartSeries();

		List<Questao05> totalQuestao05 = inscritosDAO.getTotalQuestao05();

		for (Questao05 questao05 : totalQuestao05) {
			barra.set(questao05.getQuestao(), questao05.getTotal());

		}

		model.addSeries(barra);

		return model;
	}

	private void createBarModel5() {
		try {
			barModel5 = initBarModel5();
			barModel5
					.setTitle("5 - Assinale entre as alternativas abaixo qual correspondente à sua escolaridade");
			barModel5.setAnimate(true);
			barModel5.setShowPointLabels(true);

			Axis xAxis = barModel5.getAxis(AxisType.X);
			xAxis.setLabel("Respostas");
			xAxis.setTickAngle(-50);

			barModel5
					.setSeriesColors("000000,FFFF00,0000CD,00d41a,f9c018,DC143C,800000,66CDAA,FF0000,2F4F4F,FFA500,8B4513,EEE8AA,90EE90 ");
			barModel5.setExtender("chartExtender");

			Axis yAxis = barModel5.getAxis(AxisType.Y);
			yAxis.setLabel("Total");

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	private BarChartModel initBarModel6() throws SQLException {
		BarChartModel model = new BarChartModel();

		ChartSeries barra = new ChartSeries();

		List<Questao06> totalQuestao06 = inscritosDAO.getTotalQuestao06();

		for (Questao06 questao06 : totalQuestao06) {
			barra.set(questao06.getQuestao(), questao06.getTotal());

		}

		model.addSeries(barra);

		return model;
	}

	private void createBarModel6() {
		try {
			barModel6 = initBarModel6();
			barModel6
					.setTitle("6 - Dos itens abaixo relacionados, marque até 3 opções que você considera como os principais fatores que motivam a trabalhar");
			barModel6.setAnimate(true);
			barModel6.setShowPointLabels(true);

			Axis xAxis = barModel6.getAxis(AxisType.X);
			xAxis.setLabel("Respostas");
			xAxis.setTickAngle(-50);

			barModel6
					.setSeriesColors("000000,FFFF00,0000CD,00d41a,f9c018,DC143C,800000,66CDAA,FF0000,2F4F4F,FFA500,8B4513,EEE8AA,90EE90 ");
			barModel6.setExtender("chartExtender");

			Axis yAxis = barModel5.getAxis(AxisType.Y);
			yAxis.setLabel("Total");

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	private BarChartModel initBarModel7() throws SQLException {
		BarChartModel model = new BarChartModel();

		ChartSeries barra = new ChartSeries();

		List<Questao07> totalQuestao07 = inscritosDAO.getTotalQuestao07();

		for (Questao07 questao07 : totalQuestao07) {
			barra.set(questao07.getQuestao(), questao07.getTotal());

		}

		model.addSeries(barra);

		return model;
	}

	private void createBarModel7() {
		try {
			barModel7 = initBarModel7();
			barModel7.setTitle("7 - Imagem da organização");
			barModel7.setAnimate(true);
			barModel7.setShowPointLabels(true);

			Axis xAxis = barModel7.getAxis(AxisType.X);
			xAxis.setLabel("Respostas");
			xAxis.setTickAngle(-50);

			barModel7
					.setSeriesColors("000000,FFFF00,0000CD,00d41a,f9c018,DC143C,800000,66CDAA,FF0000,2F4F4F,FFA500,8B4513,EEE8AA,90EE90 ");
			barModel7.setExtender("chartExtender");

			Axis yAxis = barModel7.getAxis(AxisType.Y);
			yAxis.setLabel("Total");

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	private BarChartModel initBarModel8() throws SQLException {
		BarChartModel model = new BarChartModel();

		ChartSeries barra = new ChartSeries();

		List<Questao08> totalQuestao08 = inscritosDAO.getTotalQuestao08();

		for (Questao08 questao08 : totalQuestao08) {
			barra.set(questao08.getQuestao(), questao08.getTotal());

		}

		model.addSeries(barra);

		return model;
	}

	private void createBarModel8() {
		try {
			barModel8 = initBarModel8();
			barModel8.setTitle("8 - Comunicação interna");
			barModel8.setAnimate(true);
			barModel8.setShowPointLabels(true);

			Axis xAxis = barModel8.getAxis(AxisType.X);
			xAxis.setLabel("Respostas");
			xAxis.setTickAngle(-50);

			barModel8
					.setSeriesColors("000000,FFFF00,0000CD,00d41a,6495ED,DC143C,800000,66CDAA,FF0000,2F4F4F,FFA500,8B4513,EEE8AA,90EE90 ");
			barModel8.setExtender("chartExtender");

			Axis yAxis = barModel8.getAxis(AxisType.Y);
			yAxis.setLabel("Total");

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	private BarChartModel initBarModel9() throws SQLException {
		BarChartModel model = new BarChartModel();

		ChartSeries barra = new ChartSeries();

		List<Questao09> totalQuestao09 = inscritosDAO.getTotalQuestao09();

		for (Questao09 questao09 : totalQuestao09) {
			barra.set(questao09.getQuestao(), questao09.getTotal());

		}

		model.addSeries(barra);

		return model;
	}

	private void createBarModel9() {
		try {
			barModel9 = initBarModel9();
			barModel9
					.setTitle("9 - Relacionamento da organização com os cidadãos e sociedade");
			barModel9.setAnimate(true);
			barModel9.setShowPointLabels(true);

			Axis xAxis = barModel9.getAxis(AxisType.X);
			xAxis.setLabel("Respostas");
			xAxis.setTickAngle(-50);

			barModel9
					.setSeriesColors("000000,FFFF00,0000CD,00d41a,f9c018,DC143C,800000,66CDAA,FF0000,2F4F4F,FFA500,8B4513,EEE8AA,90EE90 ");
			barModel9.setExtender("chartExtender");

			Axis yAxis = barModel9.getAxis(AxisType.Y);
			yAxis.setLabel("Total");

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	private BarChartModel initBarModel10() throws SQLException {
		BarChartModel model = new BarChartModel();

		ChartSeries barra = new ChartSeries();

		List<Questao10> totalQuestao10 = inscritosDAO.getTotalQuestao10();

		for (Questao10 questao10 : totalQuestao10) {
			barra.set(questao10.getQuestao(), questao10.getTotal());

		}

		model.addSeries(barra);

		return model;
	}

	private void createBarModel10() {
		try {
			barModel10 = initBarModel10();
			barModel10
					.setTitle("10 - Envolvimento dos colaboradores no processo de tomada de decisão");
			barModel10.setAnimate(true);
			barModel10.setShowPointLabels(true);

			Axis xAxis = barModel10.getAxis(AxisType.X);
			xAxis.setLabel("Respostas");
			xAxis.setTickAngle(-50);

			barModel10
					.setSeriesColors("000000,FFFF00,0000CD,00d41a,f9c018,DC143C,800000,66CDAA,FF0000,2F4F4F,FFA500,8B4513,EEE8AA,90EE90 ");
			barModel10.setExtender("chartExtender");

			Axis yAxis = barModel10.getAxis(AxisType.Y);
			yAxis.setLabel("Total");

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	private BarChartModel initBarModel11() throws SQLException {
		BarChartModel model = new BarChartModel();

		ChartSeries barra = new ChartSeries();

		List<Questao11> totalQuestao11 = inscritosDAO.getTotalQuestao11();

		for (Questao11 questao11 : totalQuestao11) {
			barra.set(questao11.getQuestao(), questao11.getTotal());

		}

		model.addSeries(barra);

		return model;
	}

	private void createBarModel11() {
		try {
			barModel11 = initBarModel11();
			barModel11
					.setTitle("11 - Envolvimento dos colaboradores em atividades de melhoria");
			barModel11.setAnimate(true);
			barModel11.setShowPointLabels(true);

			Axis xAxis = barModel11.getAxis(AxisType.X);
			xAxis.setLabel("Respostas");
			xAxis.setTickAngle(-50);

			barModel11
					.setSeriesColors("000000,FFFF00,0000CD,00d41a,f9c018,DC143C,800000,66CDAA,FF0000,2F4F4F,FFA500,8B4513,EEE8AA,90EE90 ");
			barModel11.setExtender("chartExtender");

			Axis yAxis = barModel11.getAxis(AxisType.Y);
			yAxis.setLabel("Total");

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	private BarChartModel initBarModel12() throws SQLException {
		BarChartModel model = new BarChartModel();

		ChartSeries barra = new ChartSeries();

		List<Questao12> totalQuestao12 = inscritosDAO.getTotalQuestao12();

		for (Questao12 questao12 : totalQuestao12) {
			barra.set(questao12.getQuestao(), questao12.getTotal());

		}

		model.addSeries(barra);

		return model;
	}

	private void createBarModel12() {
		try {
			barModel12 = initBarModel12();
			barModel12
					.setTitle("12 - Envolvimento dos colaboradores em atividades de melhoria");
			barModel12.setAnimate(true);
			barModel12.setShowPointLabels(true);

			Axis xAxis = barModel12.getAxis(AxisType.X);
			xAxis.setLabel("Respostas");
			xAxis.setTickAngle(-50);

			barModel12
					.setSeriesColors("000000,FFFF00,0000CD,00d41a,f9c018,DC143C,800000,66CDAA,FF0000,2F4F4F,FFA500,8B4513,EEE8AA,90EE90 ");
			barModel12.setExtender("chartExtender");

			Axis yAxis = barModel12.getAxis(AxisType.Y);
			yAxis.setLabel("Total");

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	private BarChartModel initBarModel13() throws SQLException {
		BarChartModel model = new BarChartModel();

		ChartSeries barra = new ChartSeries();

		List<Questao13> totalQuestao13 = inscritosDAO.getTotalQuestao13();

		for (Questao13 questao13 : totalQuestao13) {
			barra.set(questao13.getQuestao(), questao13.getTotal());

		}

		model.addSeries(barra);

		return model;
	}

	private void createBarModel13() {
		try {
			barModel13 = initBarModel13();
			barModel13.setTitle("13 - Horário de trabalho");
			barModel13.setAnimate(true);
			barModel13.setShowPointLabels(true);

			Axis xAxis = barModel13.getAxis(AxisType.X);
			xAxis.setLabel("Respostas");
			xAxis.setTickAngle(-50);

			barModel13
					.setSeriesColors("000000,FFFF00,0000CD,00d41a,f9c018,DC143C,800000,66CDAA,FF0000,2F4F4F,FFA500,8B4513,EEE8AA,90EE90 ");
			barModel13.setExtender("chartExtender");

			Axis yAxis = barModel13.getAxis(AxisType.Y);
			yAxis.setLabel("Total");

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	private BarChartModel initBarModel14() throws SQLException {
		BarChartModel model = new BarChartModel();

		ChartSeries barra = new ChartSeries();

		List<Questao14> totalQuestao14 = inscritosDAO.getTotalQuestao14();

		for (Questao14 questao14 : totalQuestao14) {
			barra.set(questao14.getQuestao(), questao14.getTotal());

		}

		model.addSeries(barra);

		return model;
	}

	private void createBarModel14() {
		try {
			barModel14 = initBarModel14();
			barModel14
					.setTitle("14 - Igualdade de oportunidade para o desenvolvimento de novas competências profissionais ");
			barModel14.setAnimate(true);
			barModel14.setShowPointLabels(true);

			Axis xAxis = barModel14.getAxis(AxisType.X);
			xAxis.setLabel("Respostas");
			xAxis.setTickAngle(-50);

			barModel14
					.setSeriesColors("000000,FFFF00,0000CD,00d41a,f9c018,DC143C,800000,66CDAA,FF0000,2F4F4F,FFA500,8B4513,EEE8AA,90EE90 ");
			barModel14.setExtender("chartExtender");

			Axis yAxis = barModel14.getAxis(AxisType.Y);
			yAxis.setLabel("Total");

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	private BarChartModel initBarModel15() throws SQLException {
		BarChartModel model = new BarChartModel();

		ChartSeries barra = new ChartSeries();

		List<Questao15> totalQuestao15 = inscritosDAO.getTotalQuestao15();

		for (Questao15 questao15 : totalQuestao15) {
			barra.set(questao15.getQuestao(), questao15.getTotal());

		}

		model.addSeries(barra);

		return model;
	}

	private void createBarModel15() {
		try {
			barModel15 = initBarModel15();
			barModel15
					.setTitle("15 - Igualdade de oportunidades nos processos de promoção");
			barModel15.setAnimate(true);
			barModel15.setShowPointLabels(true);

			Axis xAxis = barModel15.getAxis(AxisType.X);
			xAxis.setLabel("Respostas");
			xAxis.setTickAngle(-50);

			barModel15
					.setSeriesColors("000000,FFFF00,0000CD,00d41a,f9c018,DC143C,800000,66CDAA,FF0000,2F4F4F,FFA500,8B4513,EEE8AA,90EE90 ");
			barModel15.setExtender("chartExtender");

			Axis yAxis = barModel15.getAxis(AxisType.Y);
			yAxis.setLabel("Total");

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	private BarChartModel initBarModel16() throws SQLException {
		BarChartModel model = new BarChartModel();

		ChartSeries barra = new ChartSeries();

		List<Questao16> totalQuestao16 = inscritosDAO.getTotalQuestao16();

		for (Questao16 questao16 : totalQuestao16) {
			barra.set(questao16.getQuestao(), questao16.getTotal());

		}

		model.addSeries(barra);

		return model;
	}

	private void createBarModel16() {
		try {
			barModel16 = initBarModel16();
			barModel16.setTitle("16 - Condições de higiene e segurança");
			barModel16.setAnimate(true);
			barModel16.setShowPointLabels(true);

			Axis xAxis = barModel16.getAxis(AxisType.X);
			xAxis.setLabel("Respostas");
			xAxis.setTickAngle(-50);

			barModel16
					.setSeriesColors("000000,FFFF00,0000CD,00d41a,f9c018,DC143C,800000,66CDAA,FF0000,2F4F4F,FFA500,8B4513,EEE8AA,90EE90 ");
			barModel16.setExtender("chartExtender");

			Axis yAxis = barModel16.getAxis(AxisType.Y);
			yAxis.setLabel("Total");

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	private BarChartModel initBarModel17() throws SQLException {
		BarChartModel model = new BarChartModel();

		ChartSeries barra = new ChartSeries();

		List<Questao17> totalQuestao17 = inscritosDAO.getTotalQuestao17();

		for (Questao17 questao17 : totalQuestao17) {
			barra.set(questao17.getQuestao(), questao17.getTotal());

		}

		model.addSeries(barra);

		return model;
	}

	private void createBarModel17() {
		try {
			barModel17 = initBarModel17();
			barModel17.setTitle("17 - Equipamentos e mobiliário");
			barModel17.setAnimate(true);
			barModel16.setShowPointLabels(true);

			Axis xAxis = barModel16.getAxis(AxisType.X);
			xAxis.setLabel("Respostas");
			xAxis.setTickAngle(-50);

			barModel17
					.setSeriesColors("000000,FFFF00,0000CD,00d41a,f9c018,DC143C,800000,66CDAA,FF0000,2F4F4F,FFA500,8B4513,EEE8AA,90EE90 ");
			barModel17.setExtender("chartExtender");

			Axis yAxis = barModel17.getAxis(AxisType.Y);
			yAxis.setLabel("Total");

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	private BarChartModel initBarModel18() throws SQLException {
		BarChartModel model = new BarChartModel();

		ChartSeries barra = new ChartSeries();

		List<Questao18> totalQuestao18 = inscritosDAO.getTotalQuestao18();

		for (Questao18 questao18 : totalQuestao18) {
			barra.set(questao18.getQuestao(), questao18.getTotal());

		}

		model.addSeries(barra);

		return model;
	}

	private void createBarModel18() {
		try {
			barModel18 = initBarModel18();
			barModel18.setTitle("18 - Serviços sociais e de saúde");
			barModel18.setAnimate(true);
			barModel18.setShowPointLabels(true);

			Axis xAxis = barModel18.getAxis(AxisType.X);
			xAxis.setLabel("Respostas");
			xAxis.setTickAngle(-50);

			barModel18
					.setSeriesColors("000000,FFFF00,0000CD,00d41a,f9c018,DC143C,800000,66CDAA,FF0000,2F4F4F,FFA500,8B4513,EEE8AA,90EE90 ");
			barModel18.setExtender("chartExtender");

			Axis yAxis = barModel18.getAxis(AxisType.Y);
			yAxis.setLabel("Total");

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	private void createPieModelSexo() {
		pieModelSexo = new PieChartModel();

		try {
			List<Questao02> questao02;

			questao02 = inscritosDAO.getTotalQuestao02();

			for (Questao02 qt : questao02) {

				pieModelSexo.set(qt.getQuestao() + " Total (" + qt.getTotal()
						+ ")", qt.getTotal());

			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

		pieModelSexo.setTitle("2 - Inscrições Por Gênero");

		pieModelSexo.setLegendPosition("s");
		pieModelSexo.setFill(true);

		pieModelSexo.setShowDataLabels(true);
		pieModelSexo.setDiameter(150);
		pieModelSexo.setMouseoverHighlight(true);
		pieModelSexo.setShadow(true);

	}

	public List<Questao01> getQuestao01() {
		return questao01;
	}

	public void setQuestao01(List<Questao01> questao01) {
		this.questao01 = questao01;
	}

	public BarChartModel getBarModel() {
		return barModel;
	}

	public void setBarModel(BarChartModel barModel) {
		this.barModel = barModel;
	}

	public List<Questao02> getQuestao02() {
		return questao02;
	}

	public void setQuestao02(List<Questao02> questao02) {
		this.questao02 = questao02;
	}

	public BarChartModel getBarModel2() {
		return barModel2;
	}

	public void setBarModel2(BarChartModel barModel2) {
		this.barModel2 = barModel2;
	}

	public PieChartModel getPieModelSexo() {
		return pieModelSexo;
	}

	public void setPieModelSexo(PieChartModel pieModelSexo) {
		this.pieModelSexo = pieModelSexo;
	}

	public List<Questao03> getQuestao03() {
		return questao03;
	}

	public void setQuestao03(List<Questao03> questao03) {
		this.questao03 = questao03;
	}

	public List<Questao04> getQuestao04() {
		return questao04;
	}

	public void setQuestao04(List<Questao04> questao04) {
		this.questao04 = questao04;
	}

	public BarChartModel getBarModel4() {
		return barModel4;
	}

	public void setBarModel4(BarChartModel barModel4) {
		this.barModel4 = barModel4;
	}

	public List<Questao05> getQuestao05() {
		return questao05;
	}

	public void setQuestao05(List<Questao05> questao05) {
		this.questao05 = questao05;
	}

	public BarChartModel getBarModel5() {
		return barModel5;
	}

	public void setBarModel5(BarChartModel barModel5) {
		this.barModel5 = barModel5;
	}

	public List<Questao06> getQuestao06() {
		return questao06;
	}

	public void setQuestao06(List<Questao06> questao06) {
		this.questao06 = questao06;
	}

	public BarChartModel getBarModel6() {
		return barModel6;
	}

	public void setBarModel6(BarChartModel barModel6) {
		this.barModel6 = barModel6;
	}

	public List<Questao07> getQuestao07() {
		return questao07;
	}

	public void setQuestao07(List<Questao07> questao07) {
		this.questao07 = questao07;
	}

	public BarChartModel getBarModel7() {
		return barModel7;
	}

	public void setBarModel7(BarChartModel barModel7) {
		this.barModel7 = barModel7;
	}

	public List<Questao08> getQuestao08() {
		return questao08;
	}

	public void setQuestao08(List<Questao08> questao08) {
		this.questao08 = questao08;
	}

	public BarChartModel getBarModel8() {
		return barModel8;
	}

	public void setBarModel8(BarChartModel barModel8) {
		this.barModel8 = barModel8;
	}

	public List<Questao09> getQuestao09() {
		return questao09;
	}

	public void setQuestao09(List<Questao09> questao09) {
		this.questao09 = questao09;
	}

	public BarChartModel getBarModel9() {
		return barModel9;
	}

	public void setBarModel9(BarChartModel barModel9) {
		this.barModel9 = barModel9;
	}

	public List<Questao10> getQuestao10() {
		return questao10;
	}

	public void setQuestao10(List<Questao10> questao10) {
		this.questao10 = questao10;
	}

	public BarChartModel getBarModel10() {
		return barModel10;
	}

	public void setBarModel10(BarChartModel barModel10) {
		this.barModel10 = barModel10;
	}

	public List<Questao11> getQuestao11() {
		return questao11;
	}

	public void setQuestao11(List<Questao11> questao11) {
		this.questao11 = questao11;
	}

	public BarChartModel getBarModel11() {
		return barModel11;
	}

	public void setBarModel11(BarChartModel barModel11) {
		this.barModel11 = barModel11;
	}

	public List<Questao12> getQuestao12() {
		return questao12;
	}

	public void setQuestao12(List<Questao12> questao12) {
		this.questao12 = questao12;
	}

	public BarChartModel getBarModel12() {
		return barModel12;
	}

	public void setBarModel12(BarChartModel barModel12) {
		this.barModel12 = barModel12;
	}

	public List<Questao13> getQuestao13() {
		return questao13;
	}

	public void setQuestao13(List<Questao13> questao13) {
		this.questao13 = questao13;
	}

	public BarChartModel getBarModel13() {
		return barModel13;
	}

	public void setBarModel13(BarChartModel barModel13) {
		this.barModel13 = barModel13;
	}

	public List<Questao14> getQuestao14() {
		return questao14;
	}

	public void setQuestao14(List<Questao14> questao14) {
		this.questao14 = questao14;
	}

	public BarChartModel getBarModel14() {
		return barModel14;
	}

	public void setBarModel14(BarChartModel barModel14) {
		this.barModel14 = barModel14;
	}

	public List<Questao15> getQuestao15() {
		return questao15;
	}

	public void setQuestao15(List<Questao15> questao15) {
		this.questao15 = questao15;
	}

	public BarChartModel getBarModel15() {
		return barModel15;
	}

	public void setBarModel15(BarChartModel barModel15) {
		this.barModel15 = barModel15;
	}

	public List<Questao16> getQuestao16() {
		return questao16;
	}

	public void setQuestao16(List<Questao16> questao16) {
		this.questao16 = questao16;
	}

	public BarChartModel getBarModel16() {
		return barModel16;
	}

	public void setBarModel16(BarChartModel barModel16) {
		this.barModel16 = barModel16;
	}

	public List<Questao17> getQuestao17() {
		return questao17;
	}

	public void setQuestao17(List<Questao17> questao17) {
		this.questao17 = questao17;
	}

	public BarChartModel getBarModel17() {
		return barModel17;
	}

	public void setBarModel17(BarChartModel barModel17) {
		this.barModel17 = barModel17;
	}

	public List<Questao18> getQuestao18() {
		return questao18;
	}

	public void setQuestao18(List<Questao18> questao18) {
		this.questao18 = questao18;
	}

	public BarChartModel getBarModel18() {
		return barModel18;
	}

	public void setBarModel18(BarChartModel barModel18) {
		this.barModel18 = barModel18;
	}

}
