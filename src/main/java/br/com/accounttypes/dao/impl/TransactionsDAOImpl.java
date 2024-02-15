package br.com.accounttypes.dao.impl;


import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.accounttypes.dao.TransactionsDAO;
import br.com.accounttypes.entity.Transactions;
import br.com.accounttypes.entity.Users;
import br.com.accounttypes.exception.AccountTypesException;
import br.com.accounttypes.model.dto.TransactionsDTO;
import br.com.accounttypes.model.dto.TransactionsRequestDTO;
import br.com.accounttypes.model.mapper.TransactionsMapper;
import br.com.accounttypes.repository.TransactionsRepository;
import br.com.accounttypes.repository.UsersRepository;

@Repository
public class TransactionsDAOImpl implements TransactionsDAO {
	
	@Autowired
	TransactionsRepository transactionsRepository;
	
	@Autowired
	UsersRepository usersRepository;
	
	@Autowired
	TransactionsMapper transactionsMapper;

	@Override
	public TransactionsDTO validateTransactions(TransactionsRequestDTO request) throws AccountTypesException{
		Transactions entity = new Transactions();
		Users payer = usersRepository.findUserByID(request.getIdUserPayer());
		Users payee = usersRepository.findUserByID(request.getIdUserPayee());
		if(payer.getUserType().equals("Lojista")) {
			throw new AccountTypesException("Lojistas não podem enviar dinheiro, apenas receber");
		}
		if(payer.getBalance() < request.getAmount()) {
			throw new AccountTypesException("O saldo de sua carteira é menor do que o valor de transferência");
		}
		entity.setAmount(request.getAmount());
		entity.setIdUserPayee(request.getIdUserPayee());
		entity.setIdUserPayer(request.getIdUserPayer());
		entity.setTransactionDate(new Date());
		payer.setBalance(payer.getBalance() - request.getAmount());
		payee.setBalance(payee.getBalance() + request.getAmount());
		
		transactionsRepository.save(entity);
		return transactionsMapper.fromEntityToDTO(entity);
	}
	

}
