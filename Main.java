
public class Main {

	public static void main(String[] args) {
		
		/*형변환 및 단항연산자 연습
		 *  1byte = 0000_0000, -127~128
		 * short = 2byte
		 * int = 4byte
		 * long = 8byte
		 * 
		 * float = 4byte
		 * double = 8byte
		 * 
		 * char 2byte*/
		double a = 4.5;
		float b = (float) 5.5;
		float c = 5.5f;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		double d = 5.5f;
		System.out.println(d);
		
		int result = 2;
		result = result =1;
		System.out.println(result);
		result = result * 10;
		System.out.println(result);
		System.out.println(a/b);
		
		int i = 5;
		i++;
		System.out.println(i);
		++i;
		System.out.println(i);
		System.out.println(++i);
		System.out.println(i++);
		System.out.println(i);
	}
}
