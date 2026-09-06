package com.hasan.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class AppService {

	@Value("${server.port}")
	private int port;
	
	public String checkPalindrome(int n) {
		int num=0;
		int temp=n;
		while(n>0) {
			int t=n%10;
			num=num*10+t;
			n=n/10;
		}
		if(temp==num) return "Its a palindrome number. "+port;
		else return "Its not palindrome number."+port;
	}
	
	public String checkArmstrong(int n) {
		int count=0;
		int temp=n;
		int num=n;
		while(n>0) {
			count++;
			n=n/10;
		}
		int sum=0;
		while(num>0) {
			int t=num%10;
			sum +=Math.pow(t, count);
			num=num/10;
		}
		if(sum==temp) return "Its a armstrong number. "+port;
		else return "Not a Armstrong number. "+port;
	}
}
