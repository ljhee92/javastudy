import java.util.Arrays;

public class Main9_2 {
    public static void main(String[] args) {
        // 2차원 배열 3*3 만든다.
        int[][] arr = new int[3][3];

        // 배열에 1~9를 저장한다.
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = sum+1;
                sum++;
            }
        }
        // 잘 섞어서 출력한다.
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                int k = (int)(Math.random() * 3);
                int l = (int)(Math.random() * 3);
                int tmp = arr[i][j];
                arr[i][j] = arr[k][l];
                arr[k][l] = tmp;
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
