package variable;

public class EX9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�빮���� ��쿡�� �ҹ��ڷ� ����,,  �빮�� + 32 = �ҹ���
		
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