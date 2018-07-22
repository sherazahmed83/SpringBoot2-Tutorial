/**
 * 
 */
package com.example.springboot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.payload.StringResult;
import com.example.springboot.service.StringFunctionsService;

/**
 * @author Sheraz Ahmed
 *
 */
@RestController
@RequestMapping("/api")
public class StringFunctionsController {

	@Autowired
	private StringFunctionsService strService;
	
	private static final Logger logger = LoggerFactory.getLogger(StringFunctionsController.class);

	@GetMapping("/user/reverseString")
	public StringResult reverseString(@RequestParam(value = "string") String string) {
		return new StringResult(strService.reverseString(string));
	}

	@GetMapping("/user/countWords")
	public StringResult countWords(@RequestParam(value = "string") String string) {
		String result = "" + strService.countWords(string);
		return new StringResult(result);
	}

}
