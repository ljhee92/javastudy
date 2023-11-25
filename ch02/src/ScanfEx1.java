import java.util.*;	// 1. import문 추가 

public class ScanfEx1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		// 2. scanner 클래스의 객체 생성 
		// 입출력 관련된 객체들은 사용 후 닫아줘야 하므로 밑줄이 뜰 수 있으나 신경쓰지 않아도 됨 
		
		int num = scanner.nextInt();
		int num2 = scanner.nextInt();
		System.out.println(num);
		System.out.println(num2);
		
//		String input = scanner.nextLine();
//		int num3 = Integer.parseInt(input);
//		System.out.println(num3);
		
	}

}
