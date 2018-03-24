package main.java.controller;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

import main.java.model.Questao;
import main.java.model.Resposta;
import main.java.model.RespostaAberta;
import main.java.model.Usuario;
import main.java.service.PesquisaService;

@ManagedBean(name = "pesquisaBean")
@ViewScoped
public class PesquisaBean {

	@SuppressWarnings("rawtypes")
	private List questaoERespostas;
	private List<Resposta> respostas;

	private int idRespostaSelect;

	private Resposta respostaSelected;
	private String[] idRespostasSelected;
	private String[] respostasSelected;
	private Usuario usuario;
	private Questao questao;
	private RespostaAberta aberta;

	private int checkint;

	private String respostaRespostaSelect;
	private String tituloGrupo;
	private String usuarioHash;

	private PesquisaService pesquisaService;

	private boolean respostasObjetivas;
	private boolean respostasSubjetivas;
	private boolean grupo2;
	private boolean fim;
	private boolean semUsuario;

	private boolean renderedRadio;
	private boolean renderedCheck;

	@SuppressWarnings("unchecked")
	public PesquisaBean() {

		HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext()
				.getRequest();
		usuarioHash = request.getParameter("user");

		pesquisaService = new PesquisaService();
		usuario = pesquisaService.getUsuario(usuarioHash);

		if (usuario == null) {
			respostasObjetivas = false;
			respostasSubjetivas = false;
			grupo2 = false;
			fim = false;
			semUsuario = false;
		} else {
			questaoERespostas = pesquisaService.getQuestaoERespostas(usuario.getQuestoesRespondidas() + 1);
			questao = (Questao) questaoERespostas.get(0);
			respostas = (List<Resposta>) questaoERespostas.get(1);

			respostasObjetivas = true;
			respostasSubjetivas = false;
			grupo2 = false;
			fim = false;
			semUsuario = false;

			renderedCheck = false;
			renderedRadio = false;

			if (questao.getCheckin() == 1) {
				renderedCheck = true;
			} else {
				renderedRadio = true;
			}

			switch (usuario.getQuestoesRespondidas()) {
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				tituloGrupo = "ENTENDENDO MELHOR NOSSOS COLABORADORES";
				break;
			case 6:
			case 7:
			case 8:
			case 9:
			case 10:
			case 11:
			case 12:
			case 13:
			case 14:
			case 15:
			case 16:
			case 17:
				tituloGrupo = "ENTENDENDO MELHOR SOBRRE O GRAU DE SATISFAÇÃO DOS NOSSOS COLABORADORES";
				grupo2 = true;
				break;
			case 18:
				tituloGrupo = "O MOMENTO DE VOCÊ FALAR";

				respostasObjetivas = false;
				respostasSubjetivas = true;
				grupo2 = false;

				aberta = new RespostaAberta();
				break;
			case 19:
				tituloGrupo = "FIM";
				respostasObjetivas = false;
				respostasSubjetivas = false;
				fim = true;
				break;
			}
		}
	}

	@SuppressWarnings("unchecked")
	public String registraResposta() {

		if (questao.getCheckin() == 1) {
			for (String id : idRespostasSelected) {
				int idResposta = Integer.valueOf(id);
				pesquisaService.registraResposta(usuario.getIdUsuario(), idResposta);
			}
		} else if (questao.getSubjetiva() == 1) {
			pesquisaService.registraAberta(usuario.getIdUsuario(), idRespostaSelect, aberta.getResposta());
		} else {
			pesquisaService.registraResposta(usuario.getIdUsuario(), idRespostaSelect);
		}

		usuario.setQuestoesRespondidas(usuario.getQuestoesRespondidas() + 1);
		questaoERespostas = pesquisaService.getQuestaoERespostas(usuario.getQuestoesRespondidas() + 1);
		questao = (Questao) questaoERespostas.get(0);
		respostas = (List<Resposta>) questaoERespostas.get(1);

		renderedCheck = false;
		renderedRadio = false;

		if (questao.getCheckin() == 1) {
			renderedCheck = true;
		} else {
			renderedRadio = true;
		}

		switch (usuario.getQuestoesRespondidas()) {
		case 6:
			tituloGrupo = "ENTENDENDO MELHOR SOBRRE O GRAU DE SATISFAÇÃO DOS NOSSOS COLABORADORES";
			grupo2 = true;
			break;
		case 18:
			tituloGrupo = "O MOMENTO DE VOCÊ FALAR";

			respostasObjetivas = false;
			respostasSubjetivas = true;
			grupo2 = false;

			aberta = new RespostaAberta();
			break;
		case 19:
			tituloGrupo = "FIM";
			respostasObjetivas = false;
			respostasSubjetivas = false;
			fim = true;
			break;
		}

		return null;
	}

	public List<Resposta> getRespostas() {
		return respostas;
	}

	public void setRespostas(List<Resposta> respostas) {
		this.respostas = respostas;
	}

	public int getIdRespostaSelect() {
		return idRespostaSelect;
	}

	public void setIdRespostaSelect(int idRespostaSelect) {
		this.idRespostaSelect = idRespostaSelect;
	}

	public Resposta getRespostaSelected() {
		return respostaSelected;
	}

	public void setRespostaSelected(Resposta respostaSelected) {
		this.respostaSelected = respostaSelected;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Questao getQuestao() {
		return questao;
	}

	public void setQuestao(Questao questao) {
		this.questao = questao;
	}

	public String getRespostaRespostaSelect() {
		return respostaRespostaSelect;
	}

	public void setRespostaRespostaSelect(String respostaRespostaSelect) {
		this.respostaRespostaSelect = respostaRespostaSelect;
	}

	public RespostaAberta getAberta() {
		return aberta;
	}

	public void setAberta(RespostaAberta aberta) {
		this.aberta = aberta;
	}

	public boolean isRespostasObjetivas() {
		return respostasObjetivas;
	}

	public void setRespostasObjetivas(boolean respostasObjetivas) {
		this.respostasObjetivas = respostasObjetivas;
	}

	public boolean isRespostasSubjetivas() {
		return respostasSubjetivas;
	}

	public void setRespostasSubjetivas(boolean respostasSubjetivas) {
		this.respostasSubjetivas = respostasSubjetivas;
	}

	public boolean isGrupo2() {
		return grupo2;
	}

	public void setGrupo2(boolean grupo2) {
		this.grupo2 = grupo2;
	}

	public String getTituloGrupo() {
		return tituloGrupo;
	}

	public void setTituloGrupo(String tituloGrupo) {
		this.tituloGrupo = tituloGrupo;
	}

	public boolean isFim() {
		return fim;
	}

	public void setFim(boolean fim) {
		this.fim = fim;
	}

	public boolean isSemUsuario() {
		return semUsuario;
	}

	public void setSemUsuario(boolean semUsuario) {
		this.semUsuario = semUsuario;
	}

	public String[] getRespostasSelected() {
		return respostasSelected;
	}

	public void setRespostasSelected(String[] respostasSelected) {
		this.respostasSelected = respostasSelected;
	}

	public String[] getIdRespostasSelected() {
		return idRespostasSelected;
	}

	public void setIdRespostasSelected(String[] idRespostasSelected) {
		this.idRespostasSelected = idRespostasSelected;
	}

	public boolean isRenderedRadio() {
		return renderedRadio;
	}

	public void setRenderedRadio(boolean renderedRadio) {
		this.renderedRadio = renderedRadio;
	}

	public boolean isRenderedCheck() {
		return renderedCheck;
	}

	public void setRenderedCheck(boolean renderedCheck) {
		this.renderedCheck = renderedCheck;
	}

	public int getCheckint() {
		return checkint;
	}

	public void setCheckint(int checkint) {
		this.checkint = checkint;
	}

}
