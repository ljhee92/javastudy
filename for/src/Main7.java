public class Main7 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};

// 두 배열이 같을 때는 언제지?
// 리모콘의 번호가 가리키는 값이 같을 때

        for (int i = 0; i < 3; i++) {
            if(arr1[i] == arr2[i]) {
                System.out.println("같습니다");
            }
            else System.out.println("다릅니다");
        }
    }
}
