
public class VarEx3 {

	public static void main(String[] args) {
		
		int x = 4, y = 2;
		int temp;	// 빈컵
		
		temp = x;	// 1. x의 값을 temp에 저장
		x = y;		// 2. y의 값을 x에 저장
		y = temp;	// 3.temp의 값을 y에 저장 
		
		System.out.println("x=" + x);
		System.out.println("y=" + y);

		
	}

}
