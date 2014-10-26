/**
 * Created by liguifan on 10/23/2014.
 */
import java.util.Random;
public class LCS {

    public static void main(String[] args) {




        // 随机生成字符串
        String x = "liguifan";
        String y = "jamesliguifan";
        int substringLength1 = x.length();
        int substringLength2 = y.length();
        Long startTime = System.nanoTime();

        int[][] opt = new int[substringLength1 + 1][substringLength2 + 1];

        // 动态规划计算所有子问题
        for (int i = substringLength1 - 1; i >= 0; i--) {
            for (int j = substringLength2 - 1; j >= 0; j--) {
                if (x.charAt(i) == y.charAt(j))
                    opt[i][j] = opt[i + 1][j + 1] + 1;
                else
                    opt[i][j] = Math.max(opt[i + 1][j], opt[i][j + 1]);
            }
        }

        System.out.println(opt[0][0]);
    }
}
