package main.src.java;

public class RotateArray {
	
	public Integer[] solution(Integer[] inputArr, int shift){
		
		for(int i = shift; i > 0 ; i--){
			
			int lastElement = inputArr[inputArr.length - 1];
			
			for(int j = inputArr.length - 1; j > 0 ; j--){
				inputArr[j] = inputArr[j-1];
			}
			
			inputArr[0] = lastElement;
		}
		
		return inputArr;
	}

	public static void main(String[] args) {
		
		Integer[] input = {3,8,9,7,6};
		
		int K = 3;
		
		RotateArray obj = new RotateArray();
		
		System.out.println("K times shifted array");
		
		obj.solution(input, K);
		
		for(int j = 0; j < input.length ; j++){
			System.out.print(input[j] + ",");
		}		
		
	}

}
