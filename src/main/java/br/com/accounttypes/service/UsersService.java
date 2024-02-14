package br.com.accounttypes.service;

import br.com.accounttypes.model.dto.UsersDTO;
import br.com.accounttypes.model.dto.UsersRequestDTO;

public interface UsersService {

	public UsersDTO insert(UsersRequestDTO request);
	
}
