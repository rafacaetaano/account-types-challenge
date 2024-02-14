package br.com.accounttypes.dao;

import br.com.accounttypes.model.dto.UsersDTO;
import br.com.accounttypes.model.dto.UsersRequestDTO;

public interface UsersDAO {

	public UsersDTO insert(UsersRequestDTO user);
	
	public UsersDTO show(Long id);
		
}
