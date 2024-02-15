package br.com.accounttypes.service.impl;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.accounttypes.model.dto.TransactionsAuthorizationDTO;
import br.com.accounttypes.service.TransactionsAuthorizationService;

@Service
public class TransactionsAuthorizationServiceImpl implements TransactionsAuthorizationService{

	@Override
	public boolean isAuthorized() {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<TransactionsAuthorizationDTO> resp = 
				restTemplate.
				getForEntity("https://run.mocky.io/v3/5794d450-d2e2-4412-8131-73d0293ac1cc", TransactionsAuthorizationDTO.class);
		if(resp.getBody().getMessage().equals("Autorizado")) {
			return true;
		}
		return false;
	}

}
