public class Main8 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 3, 2};

        int b = 0;
        int s = 0;
        // 같은 값이 있으면 b++, 같은 값이면서 위치도 같으면 s++, s와 b의 값을 출력

        /* arr1[0], arr2[0] 비교, arr1[0], arr2[1] 비교, arr1[0], arr2[2] 비교,
        arr1[1], arr2[0] 비교, arr1[1], arr2[1] 비교, arr1[1], arr1[2] 비교,
        arr1[2], arr2[0] 비교, arr1[2], arr2[1] 비교, arr1[2], arr2[2] 비교
         */

//        for (int i = 0; i < arr1.length; i++) {
//            for (int j = 0; j < arr2.length; j++) {
//                if (arr1[i] == arr2[j]) {
//                    b++;
//                }
//                if (arr1[i] == arr2[j] && i==j) {
//                    s++;
//                }
//            }
//        } System.out.println("b = " + b);
//        System.out.println("s = " + s);

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    if (i == j) {
                        s++;
                    } else b++;
                }
            }
        }
        System.out.println("s = " + s + ", b = " + b);
    }
}
