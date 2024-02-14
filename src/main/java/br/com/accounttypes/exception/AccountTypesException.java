package br.com.accounttypes.exception;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class AccountTypesException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public AccountTypesException(String message) {
		super(message);
		for(StackTraceElement stackTraceElement : this.getStackTrace()) {
			log.error(this.toString());
			log.error(stackTraceElement.toString());
		}
	}
	
}
