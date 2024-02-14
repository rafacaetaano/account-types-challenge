package br.com.accounttypes.model.mapper;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.accounttypes.entity.Transactions;
import br.com.accounttypes.entity.Users;
import br.com.accounttypes.model.dto.TransactionsDTO;
import br.com.accounttypes.repository.UsersRepository;

@Component
public class TransactionsMapper {
	
	@Autowired
	UsersRepository usersRepository;

	public TransactionsDTO fromEntityToDTO(Transactions entity) {
		TransactionsDTO dto = new TransactionsDTO();
		Users payer = usersRepository.findUserByID(entity.getIdUserPayer());
		Users payee = usersRepository.findUserByID(entity.getIdUserPayee());
		dto.setAmount(entity.getAmount());
		dto.setPayerName(payer.getName());
		dto.setPayeeName(payee.getName());
		dto.setTransactionDate(new Date());
		return dto;
	}
	
}
