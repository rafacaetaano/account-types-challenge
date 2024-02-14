package br.com.accounttypes.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.accounttypes.dao.impl.TransactionsDAOImpl;
import br.com.accounttypes.model.dto.TransactionsDTO;
import br.com.accounttypes.model.dto.TransactionsRequestDTO;
import br.com.accounttypes.service.TransactionsService;

@Service
public class TransactionsServiceImpl implements TransactionsService{
	
	@Autowired
	TransactionsDAOImpl transactionsDAOImpl;

	@Override
	public TransactionsDTO transfer(TransactionsRequestDTO request) {
		return transactionsDAOImpl.validateTransactions(request);
	}

}
