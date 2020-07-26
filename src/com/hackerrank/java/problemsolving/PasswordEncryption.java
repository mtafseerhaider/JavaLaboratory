package com.hackerrank.java.problemsolving;

import java.util.List;

/**
 * @author Tafseer Haider
 * 18/07/2020
 */
public class PasswordEncryption
{
	public static String decryptPassword(String s)
	{
		int len=s.length();
		int gap=(int)Math.ceil(Math.sqrt(len));
		StringBuilder sb=new StringBuilder();
		int count=0;
		for(int i=0;i<gap;i++){
			for(int j=i;j<s.length();j=j+gap){
				sb.append(String.valueOf(s.charAt(j)));
			}
			sb.append(" ");
		}
		return sb.toString();
	}
}
