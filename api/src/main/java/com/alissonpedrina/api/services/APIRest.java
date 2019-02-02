package com.alissonpedrina.api.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alissonpedrina.model.repo.UserAPRepository;

@RestController
@RequestMapping(value = "/rest", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
@PreAuthorize("hasRole('ROLE_USER')")
public class APIRest {

	@Autowired
	private UserAPRepository UserRepository;

	@RequestMapping(value = "/getRest", method = RequestMethod.GET)
	public @ResponseBody String getKeyValues() {
		Map<String, Object> response = new HashMap<>();
		
		long count = UserRepository.count();
		
		response.put("ResponseVal", "value:" + count);

		return "{'version':'1'}";
	}

}
