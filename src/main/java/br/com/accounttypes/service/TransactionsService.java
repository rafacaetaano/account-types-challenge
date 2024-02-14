package br.com.accounttypes.service;

import br.com.accounttypes.model.dto.TransactionsDTO;
import br.com.accounttypes.model.dto.TransactionsRequestDTO;

public interface TransactionsService {

	public TransactionsDTO transfer(TransactionsRequestDTO request);
	
}
