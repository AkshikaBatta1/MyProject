package com.mysolutions;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Palindrome {
	
	    public static void main(String[] args) throws Exception {
	        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
	        
	        System.out.println(isPalindrome(br.readLine()));
	        
	    }
	    public static boolean isPalindrome(String str){
	        char[] strCharArr = str.toCharArray();
	        int len  = strCharArr.length;
	        boolean isPalin = true;
	        
	        for(int i = 0, j = len -1; i == j || (i <= len/2 && j >= len/2); i++, j-- ){
	            if(strCharArr[i] != strCharArr[j]){
	                isPalin = false;
	                break;
	            }
	        }
	        return isPalin;
	    }
	
}
