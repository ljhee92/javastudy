
public class Ex3_2 {

	public static void main(String[] args) {
		
		int i = 5, j= 0;
		
		j = i++;			//	후위형
		System.out.println("j=i++; 실행 후, i=" + i +", j=" + j);
		
		i = 5;
		j = 0;				// 결과 비교를 위해 i와 j를 다시 5와 0으로 설정
		
		j = ++i;			//	전위형 
		System.out.println("j=++i; 실행 후, i=" + i +", j=" + j);
	}

}
