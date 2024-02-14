package br.com.accounttypes.model.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsersDTO {

	private String name;
	
	private String document;
	
	private String email;
	
	private String userType;
	
	private Long balance;
	
}
