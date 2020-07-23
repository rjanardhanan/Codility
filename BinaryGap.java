package main.src.java;

public class BinaryGap {
	
	
	public int solution(int N) {
		
		String binaryStr = Integer.toBinaryString(N);
		int prevBinaryGap = 0, currBinaryGap = 0;
		
		if(N <= 0){
			return 0;
		}
		
		for(int i=1; i < binaryStr.length(); i++){
			
			if(binaryStr.charAt(i) == '0'){				
				
				currBinaryGap = currBinaryGap + 1;				
			
			}else if(currBinaryGap > prevBinaryGap){
				
				prevBinaryGap = currBinaryGap;				
				currBinaryGap = 0;
			}
		}
		
		if(binaryStr.charAt(binaryStr.length()-1) == 1 && currBinaryGap > prevBinaryGap){
			return currBinaryGap;
		}else{
			return prevBinaryGap;
		}
		
		
	}
	

	public static void main(String[] args) {
		
		int number = 32;
		
		BinaryGap obj = new BinaryGap();
		
		System.out.println("Binary Gap for the given input is "+ obj.solution(number));		

	}

}
