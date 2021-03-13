package com.graphs;

import java.util.*;

class Dutch {
	
	  int maxValue = Integer.MIN_VALUE;
	
	static HashMap<Character, String> map = new HashMap<>();
    
    static {
        map.put('A', "1");
        map.put('B', "2");
        map.put('C', "3");
        map.put('D', "4");
        map.put('E', "5");
        map.put('F', "6");
        map.put('G', "7");
        map.put('H', "8");
        map.put('I', "9");
        map.put('J', "10");
        map.put('K', "11");
        map.put('L', "12");
        map.put('M', "13");
        map.put('N', "14");
        map.put('O', "15");
        map.put('P', "16");
        map.put('Q', "17");
        map.put('R', "18");
        map.put('S', "19");
        map.put('T', "20");
        map.put('U', "21");
        map.put('V', "22");
        map.put('W', "23");
        map.put('X', "24");
        map.put('Y', "25");
        map.put('Z', "26");
    }
    
    public static int numDecodings(String s) { //12
        
        List<String> list = new ArrayList<>();
        
        StringBuilder sb = new StringBuilder();
        
        for(char c : s.toCharArray()){
            
            if(map.containsValue(c)){
                sb.append(map.get(c)); //AB
            }
            
            list.add(sb.toString());
            
            sb.delete(0, sb.length());
            
            
            if(map.containsValue(s)) {
            	sb.append(map.get(c));
            }
            
            list.add(sb.toString());
            
            sb.delete(0, sb.length());
            
        }

        
        
        return list.size();
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Dutch.numDecodings("1345"));
	}

}
