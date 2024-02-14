package br.com.accounttypes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.accounttypes.model.dto.TransactionsDTO;
import br.com.accounttypes.model.dto.TransactionsRequestDTO;
import br.com.accounttypes.service.TransactionsService;

@RestController
@RequestMapping("/transactions")
public class TransactionsController {
	
	@Autowired
	TransactionsService transactionsService;
	
	@PostMapping("/transfer")
	public TransactionsDTO transfer(@RequestBody TransactionsRequestDTO request) {
		TransactionsDTO dto = transactionsService.transfer(request);
		return dto;
	}

}
