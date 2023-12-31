package com.sso.api.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sso.api.common.messages.BaseResponse;
import com.sso.api.dto.EmployeeDTO;
import com.sso.api.service.EmployeeService;

@Validated
@RestController
@RequestMapping("/sso")
public class SampleContoller {

	
	@GetMapping(value = "/check")
	public String getSSO() {
		
		return "Welcome in SSO";
	}


}
