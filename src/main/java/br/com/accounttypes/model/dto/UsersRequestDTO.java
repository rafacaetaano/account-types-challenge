package br.com.accounttypes.model.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsersRequestDTO {

	private Long id;
	
	private String name;
	
	private String document;
	
	private String email;
	
	private String password;
	
	private String userType;
	
	private Long balance;
	
}
