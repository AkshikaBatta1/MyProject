package com.mysolutions;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class IntegerOp {

	public static void main(String[] args) {
		List<Integer> tokens = new ArrayList<>(); 
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st;
		try {
			st = new StringTokenizer(br.readLine());
			 while (st != null && st.hasMoreElements()) {
		            tokens.add(Integer.parseInt(st.nextToken()));
		        }
		} catch (IOException e) {
			e.printStackTrace();
		}
	   
	    moveZerosToEnd(tokens);

	}
	
	public static void moveZerosToEnd(List<Integer> tokens) {
		int len  = tokens.size();
		Integer[] outputArr = new Integer[len];
		int ctr = 0;
				
		for(int i : tokens) {
			if(i != 0) {
				outputArr[ctr++] = i;
			}
		}
		
		while(ctr < len) {
			outputArr[ctr++] = 0;
		}
		
		for(int out: outputArr) {
			System.out.print(out+" ");
		}
			
	}

}
