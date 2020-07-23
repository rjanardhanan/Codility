package main.src.java;

public class MissingElement {
	
	public int solution(int[] arr){
		
		if(arr == null || arr.length == 0){
			return -1;
		}
		
		if(arr.length == 1 && arr[0] == 2){
			return 1;
		}
		
		long n_Int_Sum = (long)((arr.length + 1) * (arr.length + 2))/2;
		
		long arrSum = 0;
		
		for(int element : arr){
			arrSum = arrSum + element;
		}
		
		return (int)(n_Int_Sum - arrSum);
		
	}

	public static void main(String[] args) {
		
		MissingElement obj = new MissingElement();
		
		int[] input = {2,3,1,5};
		
		System.out.println("Missing element in the array ----->"+obj.solution(input));

	}

}
