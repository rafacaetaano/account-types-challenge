package br.com.accounttypes.dao;


import br.com.accounttypes.model.dto.TransactionsDTO;
import br.com.accounttypes.model.dto.TransactionsRequestDTO;

public interface TransactionsDAO {

	public TransactionsDTO validateTransactions(TransactionsRequestDTO request);
	
}
