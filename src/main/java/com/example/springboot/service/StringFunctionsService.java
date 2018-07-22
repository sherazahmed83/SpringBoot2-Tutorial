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
public class StringFunctionsService {

	public String reverseString(String string) {
		StringBuilder sb = new StringBuilder(string);
		return sb.reverse().toString();
	}

	public int countWords(String string) {
		int count = 0;
		if (!(" ".equals(string.substring(0, 1))) || !(" ".equals(string.substring(string.length() - 1)))) {
			for (int i = 0; i < string.length(); i++) {
				if (string.charAt(i) == ' ') {
					count++;
				}
			}
			count = count + 1;
		}
		return count;
	}
}
