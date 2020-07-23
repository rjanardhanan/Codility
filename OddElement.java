package main.src.java;

import java.util.HashMap;
import java.util.Map;

public class OddElement {

	public int solution(int[] inpArr){
		
		if(inpArr == null || inpArr.length == 0 || inpArr.length % 2 == 0){
			return -1;
		}
		
		Map<Integer,Integer> countMap = new HashMap<>();
		int temp = 0;
		
		for(int i = 0, j = (inpArr.length - 1); i <= (inpArr.length - 1)/2 ; i++ , j--){
			
			if(i != j && inpArr[i] == inpArr[j]){
				if(!countMap.containsKey(inpArr[i])){
					countMap.put(inpArr[i], 2);
				}else{
					temp = countMap.get(inpArr[i]);
					countMap.put(inpArr[i], temp + 2);
				}
				
			}else if(i != j){
				
				if(countMap.containsKey(inpArr[i])){
					temp = countMap.get(inpArr[i]);
					countMap.put(inpArr[i], temp + 1);
				}else{
					countMap.put(inpArr[i], 1);
				}
				
				if(countMap.containsKey(inpArr[j])){
					temp = countMap.get(inpArr[j]);
					countMap.put(inpArr[j], temp + 1);
				}else{
					countMap.put(inpArr[j], 1);
				}
				
			}else if(i == j){
				
				if(countMap.containsKey(inpArr[j])){
					temp = countMap.get(inpArr[j]);
					countMap.put(inpArr[j], temp + 1);
				}else{
					countMap.put(inpArr[j], 1);
				}
				
			}
			
		}
		
		for(Map.Entry<Integer, Integer> entry : countMap.entrySet()){
			if(entry.getValue() % 2 == 1){
				return entry.getKey();
			}			
		}		
		
		return 0;
	}
	
	public static void main(String[] args) {
		
		OddElement obj = new OddElement();
		int[] a = {9,3,9,3,9,7,9};
		System.out.println("Odd Element in array --->"+obj.solution(a));

	}

}
