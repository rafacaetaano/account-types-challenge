package br.com.accounttypes.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Table(name = "TRANSACTIONS")
@Getter
@Setter
@Entity
public class Transactions {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private Long idUserPayer;
	
	@Column
	private Long idUserPayee;
	
	@Column
	private Date transactionDate;
	
	@Column
	private Long amount;
	
}
