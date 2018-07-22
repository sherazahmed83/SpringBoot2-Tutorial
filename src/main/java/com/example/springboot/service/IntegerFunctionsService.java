/**
 * 
 */
package com.example.springboot.service;

import org.springframework.stereotype.Service;

/**
 * @author Sheraz Ahmed
 *
 */
@Service
public class IntegerFunctionsService {

	public String fibonacciWR(int num) {
		StringBuilder sb = new StringBuilder();

		for (int index = 0; index <= num; index++) {
			sb.append(fib(index));

			if (index < num) {
				sb.append(",");
			}
		}

		return sb.toString();
	}

	private int fib(int n) {
		if (n == 0 || n == 1) {
			return n;
		}

		return (fib(n - 1) + fib(n - 2));
	}

	public String fibonacciWOR(int num) {
		StringBuilder sb = new StringBuilder();

		int first = 0, second = 1, next = 0;

		for (int index = 0; index < num; index++) {

			if (index <= 1)
				next = index;
			else {
				next = first + second;
				first = second;
				second = next;
			}
			
			sb.append(next);

			if (index < (num - 1)) {
				sb.append(",");
			}
		}

		return sb.toString();
	}

}
