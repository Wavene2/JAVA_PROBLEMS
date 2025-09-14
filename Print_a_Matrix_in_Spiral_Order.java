import java.util.Scanner;

public class Print_a_Matrix_in_Spiral_Order {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // rows
        int m = sc.nextInt();  // cols
        int arr[][] = new int[n][m];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                arr[i][j] = sc.nextInt();

        int top = 0, bottom = n - 1, left = 0, right = m - 1;
        int total = n * m;
        int printed = 0;
        StringBuilder sb = new StringBuilder();

        while (top <= bottom && left <= right && printed < total) {
            // left -> right
            for (int j = left; j <= right && printed < total; j++) {
                if (printed > 0) sb.append(", ");
                sb.append(arr[top][j]);
                printed++;
            }
            top++;

            // top -> bottom
            for (int i = top; i <= bottom && printed < total; i++) {
                if (printed > 0) sb.append(", ");
                sb.append(arr[i][right]);
                printed++;
            }
            right--;

            // right -> left
            for (int j = right; j >= left && printed < total; j--) {
                if (printed > 0) sb.append(", ");
                sb.append(arr[bottom][j]);
                printed++;
            }
            bottom--;

            // bottom -> top
            for (int i = bottom; i >= top && printed < total; i--) {
                if (printed > 0) sb.append(", ");
                sb.append(arr[i][left]);
                printed++;
            }
            left++;
        }

        System.out.println(sb.toString());
    }
}
