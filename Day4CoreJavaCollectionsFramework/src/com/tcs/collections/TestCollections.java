package com.tcs.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestCollections {
	
	public static void main(String[] args) {
		Investor i1 = new Investor(1, "abc", "chennai", "shares", 50000);
		Investor i2 = new Investor(2, "xyz", "hyd", "bonds", 75000);
		Investor i3 = new Investor(3, "pqr", "pune", "deposits", 80000);
		Investor i4 = new Investor(4, "mno", "delhi", "shares", 40000);
		Investor i5 = new Investor(5, "ijk", "mumbai", "bonds", 30000);
		Investor i6 = new Investor(5, "ijk", "mumbai", "bonds", 30000);
		Investor i7 = i6;
		
		HashSet<Investor> set = new HashSet<Investor>();
		
		set.add(i1);
		set.add(i2);
		set.add(i3);
		set.add(i4);
		set.add(i5);
		set.add(i6);
		set.add(i7);
		set.add(null);
		set.add(null);
		
//		System.out.println(set.size());
//		
//		Iterator<Investor> iter = set.iterator();
//		while(iter.hasNext()) {
//			System.out.println(iter.next());
//		}
		
		ArrayList<Set<Investor>> list = new ArrayList<>();
		list.add(set);
		
		HashSet<Investor> set2 = set;
		HashSet<Investor> set3 = set;
		
		list.add(set2);
		list.add(set3);
		
		System.out.println(list);
		
		Set<Investor> item = list.get(2);
		for(Investor i : set) {
			System.out.println(i);
		}
		
	}
}
