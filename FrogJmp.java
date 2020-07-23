package main.src.java;

public class FrogJmp {
	
	public int solution(int X, int Y, int D){
		if(Y < 0 || D <= 0){
			return -1;
		}
		
		if(X == Y){
			return 0;
		}
		
		int jmpCount = 0;
		
		jmpCount = (Y-X)/D ;
		
		if((Y - X) % D != 0){
			jmpCount = jmpCount + 1;
		}
		
		return jmpCount;		
	}

	public static void main(String[] args) {
	
		FrogJmp obj = new FrogJmp();
		
		System.out.println(obj.solution(10, 85, 30));

	}

}
