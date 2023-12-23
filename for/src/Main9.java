import java.util.Arrays;

public class Main9 {
    public static void main(String[] args) {

        // 1. 5*5 이차원 배열 만들기
        int[][] arr = new int[5][5];

        // 2. 1~25를 저장
//        arr[0][0] = 1, arr[0][1] = 2, arr[0][2] = 3, arr[0][3] = 4, arr[0][4] = 5,
//        arr[1][0] = 6, arr[1][1] = 7, arr[1][2] = 8, arr[1][3] = 9, arr[1][4] = 10,
//        arr[2][0] = 11, arr[2][1] = 12, arr[2][2] = 13, arr[2][3] = 14, arr[2][4] = 15,
//        arr[3][0] = 16, arr[3][1] = 17, arr[3][2] = 18, arr[3][3] = 19, arr[3][4] = 20,
//        arr[4][0] = 21, arr[4][1] = 22, arr[4][2] = 23, arr[4][3] = 24, arr[4][4] = 25

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = sum + 1;
                sum++;
            }
        }

        // 섞는다. arr[0][0]과 arr[0][1] 섞기
//        temp = arr[0][0];
//        arr[0][0] = arr[1][0];
//        arr[1][0] = temp;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                int k = (int) (Math.random() * 5);
                int l = (int) (Math.random() * 5);
                int temp = arr[i][j];
                arr[i][j] = arr[k][l];
                arr[k][l] = temp;
            }
        }
        // 3. 잘 섞어서 출력
        System.out.println(Arrays.deepToString(arr));
    }
}
