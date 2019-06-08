package br.com.etechoracio.avaliacao.business;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.com.etechoracio.avaliacao.dao.InstrumentoDAO;
import br.com.etechoracio.avaliacao.model.Instrumento;
import br.com.etechoracio.common.business.BaseSB;

@Service
public class InstrumentoSB extends BaseSB{
	

	private InstrumentoDAO instrumentoDAO;
	
	@Override
	protected void postConstructImp() {
		instrumentoDAO = getDAO(InstrumentoDAO.class);
	}
	
	@Transactional(propagation = Propagation.REQUIRED)
	protected void save(Instrumento instrumento) {
		instrumentoDAO.save(instrumento);
	}

}
