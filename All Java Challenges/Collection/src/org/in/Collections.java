package org.in;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedHashMap;


public class Collections {

	public static void main(String[] args) {
		// create arraylist
		List<Integer> l = new ArrayList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(90);
		l.add(10);
		l.add(10);
		l.add(40);
		l.add(50);
		System.out.println("L="+l);
		int size = l.size();
		System.out.println("Size="+size);
		// using enhanced for loop
		for (Integer no : l) {
            System.out.println("no="+no);}
		// remove duplicates from linked hash set
		Set<Integer> s = new LinkedHashSet();
		s.add(100);
		s.add(100);
		s.add(20);
		s.add(50);
		s.add(60);
		s.add(80);
		s.add(60);
		s.add(50);
		System.out.println("S="+s);
		
		// convert list into set
		s.addAll(l);
		System.out.println(s);
		
		// use remove all function
		s.removeAll(s);
		System.out.println("S="+s);
		
		//create a linked hash map
		Map<Integer,String> m = new LinkedHashMap();
        m.put(10, "java");
        m.put(20, "sql");
        m.put(30, "oops");
        m.put(40, "Sql");
        m.put(50, "oracle");
        m.put(60, "DB");
        m.put(10, "selenium");
        m.put(50, "psql");
        m.put(40, "Hadoop");
        System.out.println("M="+m);
        
     // iterate map using enhanced for loop   
           
                for (Map.Entry<Integer, String> entry : m.entrySet()) {
                    System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
                }
		

	}

	}