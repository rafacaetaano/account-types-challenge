package br.com.accounttypes.model.dto;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TransactionsDTO {
	
	private String payerName;
	
	private String payeeName;
	
	private Date transactionDate;
	
	private Long amount;
	
}
