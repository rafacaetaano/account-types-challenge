package br.com.accounttypes.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.accounttypes.dao.impl.UsersDAOImpl;
import br.com.accounttypes.model.dto.UsersDTO;
import br.com.accounttypes.model.dto.UsersRequestDTO;
import br.com.accounttypes.service.UsersService;

@Service
public class UsersServiceImpl implements UsersService{
	
	@Autowired
	UsersDAOImpl usersDAOImpl;
	
	@Override
	public UsersDTO insert(UsersRequestDTO request) {
		return usersDAOImpl.insert(request);
	}

}
