package br.com.accounttypes.model.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TransactionsRequestDTO {

	private Long idUserPayer;
	
	private Long idUserPayee;
	
	private Long amount;
	
}
