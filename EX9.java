package variable;

public class EX9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//대문자인 경우에만 소문자료 변경,,  대문자 + 32 = 소문자
		
		char Large = 'F';
		char Small = (char) (('A' <= Large & Large <= 'Z') ? (Large + 32) : Large);
		
		System.out.println("Large is : " + Large);
		System.out.println("Small is : " + Small);
		
		
	}

}


/*char ch = 'A';
char lowerCase = (char) (('A' <= ch & ch <= 'Z' ) ? ( ch + 32 ) : ch); 
 
System.out.println("ch:"+ch);
System.out.println("ch to lowerCase:"+lowerCase); */