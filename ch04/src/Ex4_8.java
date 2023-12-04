
public class Ex4_8 {

	public static void main(String[] args) {
		
		
		// 조건식을 생략하면 true로 간주되어서 무한반복문이 됨
		
		for (int i=1; i<=10; i++) {
			System.out.println("Hello");
		}
		
		
		// 변수 2개 사용 가능 
		for (int i=1, j=10; i<=10; i++, j--) {
			System.out.println("i="+i+",j="+j);
		}
	}

}
