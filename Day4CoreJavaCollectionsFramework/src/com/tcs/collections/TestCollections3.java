package com.tcs.collections;

import java.util.*;
import java.util.Map.Entry;

public class TestCollections3 {

	public static void main(String[] args) {
		
		Investor i1 = new Investor(1, "abc", "chennai", "shares", 50000);
		Investor i2 = new Investor(2, "xyz", "hyd", "bonds", 75000);
		Investor i3 = new Investor(3, "pqr", "pune", "deposits", 80000);
		Investor i4 = new Investor(4, "mno", "delhi", "shares", 40000);
		Investor i5 = new Investor(5, "ijk", "mumbai", "bonds", 30000);
		Investor i6 = new Investor(5, "ijk", "mumbai", "bonds", 30000);
		Investor i7 = i6;
		
		HashMap<Integer, Investor> dataMap = new HashMap<Integer, Investor>();
		dataMap.put(i5.getId(), i5);
		dataMap.put(i3.getId(), i3);
		dataMap.put(i2.getId(), i2);
		dataMap.put(i4.getId(), i4);
		dataMap.put(i1.getId(), i1);

		//System.out.println(dataMap.get(4));
		
		//System.out.println(dataMap);
		
		//System.out.println(dataMap.get(5));
		//i5.setInstrument("shares");
		//dataMap.put(i5.getId(), i5);
		//System.out.println(dataMap.get(5));
		
		Set<Integer> keys = dataMap.keySet();
		System.out.println(keys);
		
		Collection<Investor> values = dataMap.values();
		System.out.println(values);
		
		Set<Entry<Integer, Investor>> keyValues = dataMap.entrySet();
		//System.out.println(keyValues);
		
		Iterator<Entry<Integer, Investor>> iter = keyValues.iterator();
		while(iter.hasNext()) {
			Entry<Integer, Investor> entry = iter.next();
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}		
		
	}

}
