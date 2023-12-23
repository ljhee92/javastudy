public class Main7 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};

        int cnt = 0;    // 같은 값의 개수

// 두 배열이 같을 때는 언제지?
// 리모콘의 번호가 가리키는 값이 같을 때

//        for (int i = 0; i < arr1.length; i++) {
//            if(arr1[i] == arr2[i]) {
//                System.out.println("같습니다");
//            }
//            else System.out.println("다릅니다");
//        }

        for (int i = 0; i <= 2; i++) {
            if (arr1[i] == arr2[i]) cnt++;
        }

//        if (arr1[0] == arr2[0]) cnt++;
//        if (arr1[1] == arr2[1]) cnt++;
//        if (arr1[2] == arr2[2]) cnt++;
//        그림을 그리자

        if (cnt == 3)
            System.out.println("같습니다");
        else
            System.out.println("다릅니다");
    }
}
