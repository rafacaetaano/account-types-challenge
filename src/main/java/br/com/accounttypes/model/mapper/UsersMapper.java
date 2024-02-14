package br.com.accounttypes.model.mapper;

import org.springframework.stereotype.Component;

import br.com.accounttypes.entity.Users;
import br.com.accounttypes.model.dto.UsersDTO;

@Component
public class UsersMapper {

	public UsersDTO fromEntityToDTO(Users entity) {
		UsersDTO dto = new UsersDTO();
		dto.setDocument(entity.getDocument());
		dto.setEmail(entity.getEmail());
		dto.setName(entity.getName());
		dto.setUserType(entity.getUserType());
		dto.setBalance(entity.getBalance());
		return dto;
	}
	
}
