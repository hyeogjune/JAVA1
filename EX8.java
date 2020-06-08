package variable;

public class EX8 {
	public static void main(String[] args) {
		//CH가 영어거나 숫자일때 b가 참 값
		char ch = 'z';
		boolean b = ( ('a' <= ch & ch <= 'z' )||('A' <= ch & ch <= 'Z')  ); 
		 
		System.out.println(b); 
	}
}
