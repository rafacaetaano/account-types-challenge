package br.com.accounttypes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.accounttypes.model.dto.UsersDTO;
import br.com.accounttypes.model.dto.UsersRequestDTO;
import br.com.accounttypes.service.UsersService;

@RestController
@RequestMapping("/users")
public class UsersController {
	
	@Autowired
	private UsersService usersService;
	
	@PostMapping("/insert")
	public UsersDTO insert(@RequestBody UsersRequestDTO request) {
		UsersDTO dto = usersService.insert(request);
		return dto;
	}

}
