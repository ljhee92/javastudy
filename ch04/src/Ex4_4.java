import java.util.Scanner;

public class Ex4_4 {

	public static void main(String[] args) {
		
		int score = 0;
		char grade = 'D';
		
		System.out.print("점수를 입력하세요.>");
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt();	// 화면을 통해 입력받은 숫자를 score 에 저장 
		
		if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} 
		
//		else {
//			grade = 'D';
//		}
//		초기화를 공백으로 하지 않고 D로 하면 else문 생략 가능
		
		System.out.println("당신의 학점은 " + grade + "입니다.");
	}

}
