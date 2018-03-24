package main.java.service;

import java.util.List;

import main.java.dao.PesquisaDAO;
import main.java.model.Usuario;

public class PesquisaService {

	PesquisaDAO pesquisaDAO = new PesquisaDAO();
	
	@SuppressWarnings("rawtypes")
	public List getQuestaoERespostas(int idQuestao){
		return pesquisaDAO.getQuestaoERespostas(idQuestao);
	}
	
	public void registraResposta(int idUsuario, int idResposta){
		pesquisaDAO.registraResposta(idUsuario, idResposta);
	}
	
	public void registraAberta(int idUsuario, int idResposta, String resposta){
		pesquisaDAO.registraAberta(idUsuario, idResposta, resposta);
	}
	
	public Usuario getUsuario(String chave){
		return pesquisaDAO.getUsuario(chave);
	}
}
