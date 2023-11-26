
public class Ex3_9 {

	public static void main(String[] args) {
		
		int a = 1_000_000;	// 1백만 = 10의 6제곱
		int b = 2_000_000;	// 2백만 = 10의 6제곱
		
		// 10의 12제곱. int의 범위는 10의 9제곱
		
		long c = (long)a * b;
		
		// a 혹은 b를 오버플로우가 되지 않도록 형변환 해준다
		
		System.out.println(c);

	}

}
