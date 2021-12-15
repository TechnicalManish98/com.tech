package com.tech;

import java.util.Map;
import java.util.TreeMap;

public class WordCount {
	
	public void countWord(String s) {
		
		Map<String,Integer> mp = new TreeMap();
		String ss[] = s.split(" ");
		
		for(int i=0; i<ss.length; i++) {
			
			if(mp.containsKey(ss[i])) {
				
				mp.put(ss[i], mp.get(ss[i])+1);
			}else {
				
				mp.put(ss[i], 1);
			}
		}
		for(Map.Entry<String,Integer> entry: mp.entrySet()) {
			System.out.println(entry.getKey()+"-"+entry.getValue());
		}		
	}
	
public static void main(String[] args) {
		
	WordCount wc =new WordCount();
	wc.countWord("go gone go away go gone going gone away");
	
	}

}
