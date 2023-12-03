
public class Ex4_7 {

	public static void main(String[] args) {
		
		int num = 0;
		
		// 괄호 {} 안의 내용을 20 반복한다.
		// -5 ~ 5 사이의 난수를 20개 출력한다.
		
		for (int i=1; i<=20; i++) {
			num = (int)(Math.random()*11)-5;
			System.out.println(num);
		}

	}

}
