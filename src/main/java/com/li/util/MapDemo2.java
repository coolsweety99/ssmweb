package com.li.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;


public class MapDemo2 {
	public static void main(String[] args) {
	/*	// 键盘任意录入一个字符串
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个字符串：");
		String s = sc.nextLine();

		// 定义一个Map集合，键是Character，值是Integer，并且是TreeMap
		TreeMap<Character, Integer> tm = new TreeMap<Character, Integer>();

		// 把字符串转成字符数组
		char[] chs = s.toCharArray();

		// 遍历字符串，得到每一个字符
		for (char ch : chs) {
			// 拿这个字符作为键到map里面找值
			Integer i = tm.get(ch);
			// 返回null
			if (i == null) {
				// 存储
				tm.put(ch, 1);
			} else {
				// 把值++，重新存储
				i++;
				tm.put(ch, i);
			}
		}

		// 定义一个StringBuilder字符串
		StringBuilder sb = new StringBuilder();

		// 遍历TreeMap集合
		Set<Character> set = tm.keySet();
		for (Character key : set) {
			Integer value = tm.get(key);
			sb.append(key).append("(").append(value).append(")");
		}

		// 把StringBuilder转换为字符串
		String result = sb.toString();

		System.out.println(result);*/
		
		String str ="2342asfghgyu56asdasda";
	       Map<String,Integer> maps = new TreeMap<String,Integer>();
	       for(int i=0;i<str.length();i++){
	    	   String key = String.valueOf((str.charAt(i)));
	    	   if(!maps.containsKey(key))
	    	       maps.put(key, 1);
	    	   else{
	    		   int val =maps.get(key);
	    		   maps.put(key, val+1);
	    	   }
	    	   
	       }
	       
	       for(Map.Entry i : maps.entrySet()){
	    	   System.out.println(i.getKey()+ "=="+i.getValue());
	       }
	}
}
