/**
 * 
 */
package com.example.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.payload.StringResult;
import com.example.springboot.service.IntegerFunctionsService;

/**
 * @author sahmed
 *
 */
@RestController
@RequestMapping("/api")
public class IntegerFunctionsController {
	
	@Autowired
	private IntegerFunctionsService intService;
	
	@GetMapping("/user/fibonacciWR")
	public StringResult fibonacciWithRecursion(@RequestParam(value = "num") int num) {
		return new StringResult(intService.fibonacciWR(num));
	}
	
	@GetMapping("/user/fibonacciWOR")
	public StringResult fibonacciWithOutRecursion(@RequestParam(value = "num") int num) {
		return new StringResult(intService.fibonacciWOR(num));
	}

}
