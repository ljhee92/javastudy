
public class Ex2_12 {

	public static void main(String[] args) {
		
		String str = "3";
		
		System.out.println(str.charAt(0) - '0');	// 문자열 "3"을 문자 '3'으로 변환 -> charAt(0), 문자 '3' - '0' = 숫자 3으로 변환 
		System.out.println('3' - '0' + 1);			// 문자 '3' - '0' = 숫자 3으로 변환 후 +1 하면 4
		System.out.println(Integer.parseInt(str) + 1);	// 문자열 "3"을 정수형 숫자 3으로 변환
		System.out.println("3" + 1);				// 문자열 "3"에 1을 더하면 1이 문자로 변환되어 "3"+"1"
		System.out.println(3 + '0');				// 숫자 3에 문자 '0'(숫자로 48)을 더함
		

	}

}
