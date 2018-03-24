package main.java.util;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailException;  
import org.apache.commons.mail.HtmlEmail; 

public class EmailUtil {

public static void enviarEmail(String de, String para, String mensagem) throws EmailException {
		
		try {
		
			HtmlEmail mensagemEmail = new HtmlEmail();  
			mensagemEmail.setHostName("mail.detran.ma.gov.br");
			mensagemEmail.setSmtpPort(587);
			mensagemEmail.setAuthenticator(new DefaultAuthenticator("automatizacaorotinas@detran.ma.gov.br", "r0t1n@sD3tr@n@ut0"));
			mensagemEmail.setFrom(de);
			
			mensagemEmail.addTo(para);   
			mensagemEmail.setSubject("Assunto");  
			mensagemEmail.setHtmlMsg(mensagem);  
			//mensagemEmail.setSSLOnConnect(false);  
			//mensagemEmail.setStartTLSEnabled(false);  
			mensagemEmail.send();
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}   
		
	}
	
}
