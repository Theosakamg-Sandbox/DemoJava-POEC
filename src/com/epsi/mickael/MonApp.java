package com.epsi.mickael;

import java.util.ArrayList;
import java.util.List;

public class MonApp {

	public static void main(String[] args) {
		int i = 0; // Decl + Inti
		int j, k, l;
		
		j = 10;
		
		Integer toto = 10;
		
		
		i = i + 1;
		System.out.println("Hello W!");
		
		
		int tableau[] = new int[10];
		tableau[2] = 10;
		for(int x = 0; x < 10; x++ ) {
			int item = tableau[x];
			System.out.println(item);
		}
		
		
		List<Integer> coll = new ArrayList<>();
		coll.add(10);
		for(int x = 0; x < coll.size(); x++ ) {
			int item = coll.get(x);
			System.out.println(item);
		}
		
		for (Integer item : coll) {
			System.out.println(item);
		}
		
		
		i = 20;
	}

}
