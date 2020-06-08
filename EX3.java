package variable;

public class EX3 {
	public static void main (String[] args) {
		
		//삼항연산자를 사용하여 num값에 따라 양수 음수 0을 출력하라
		
		int num = 10;
		
		System.out.println((num>0) ? '양' :
	  		 			   (num<0) ? '음' :
	  		 				'0');
	}
}
