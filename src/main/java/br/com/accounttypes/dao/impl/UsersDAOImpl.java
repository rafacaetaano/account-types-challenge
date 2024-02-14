package br.com.accounttypes.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.accounttypes.dao.UsersDAO;
import br.com.accounttypes.entity.Users;
import br.com.accounttypes.model.dto.UsersDTO;
import br.com.accounttypes.model.dto.UsersRequestDTO;
import br.com.accounttypes.model.mapper.UsersMapper;
import br.com.accounttypes.repository.UsersRepository;

@Repository
public class UsersDAOImpl implements UsersDAO{
	
	@Autowired
	UsersRepository usersRepository;
	@Autowired
	UsersMapper usersMapper;

	@Override
	public UsersDTO insert(UsersRequestDTO request) {
		Users entity = new Users();
		entity.setDocument(request.getDocument());
		entity.setEmail(request.getEmail());
		entity.setName(request.getName());
		entity.setUserType(request.getUserType());
		entity.setPassword(request.getPassword());
		entity.setBalance(request.getBalance());
		usersRepository.save(entity);
		return usersMapper.fromEntityToDTO(entity);
	}

	@Override
	public UsersDTO show(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
