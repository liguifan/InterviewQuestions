/**
 * Created by liguifan on 10/24/2014.
 */
import java.util.*;
public class BacktraceSubset {
    public static void main(String[] args) {
        int sum = 10;
        int r = 0;
        int[] s = {1, 3, 6, 4, 2};
        int[] x = new int[5];
        int N = 5;


        sumSet(0,sum, r, s, N, x);
        return ;

    }


    static void sumSet(int i,int sum, int r, int[] s, int N, int[] x) {
        if (i >= N) {
            if (sum == r) print(s, x, N);
            return;
        }
        if (r < sum) {
            r += s[i];
            x[i] = 1;
            sumSet(i + 1, sum, r, s, N, x);
            r -= s[i];
        }

        x[i] = 0;// this is after the execution of the left one, and it failed already so that we can have come to this line;
        sumSet(i + 1, sum, r, s, N, x);
    }

    static void print(int[] s, int[] x, int N){
        for(int j=0;j<N;j++){
            if(x[j]==1){
                System.out.print(s[j]+" ");
            }
        }
        System.out.println("");
    }
}

//    void Bcktrack(int t) //参数t表示当前递归深度
//    {
//        if(t>n)Output(x); //遍历到解，则将解输出或其他处理  n用来控制递归深度即解空间树的高度
//        else
//        {
//            //f(n,t)和g(n,t)表示当前节点（扩展节点）处未搜索过的子树的起始编号和中指编号
//            for(int i=f(n,t);i<=g(n,t);i++)
//            {
//                x[t]=h(i);    //h(i)表示当前节点（扩展节点）处x[i]的第i个可选值
//                if(Constarint(t)&&Bound(t)) //剪枝函数：约束函数，限界函数
//                    Bcktrack(t+1);
//            }
//        }
//    }


public class BacktracePerm {

    public List<List<Integer>> permute(int[] num) {
        List<List<Integer>> result = new List<List<Integer>>();
        permute(num, 0, result);
        return result;
    }

    void permute(int[] num, int start, List<List<Integer>> result) {

        if (start >= num.length) {
            List<Integer> item = convertArrayToList(num);
            result.add(item);
        }

        for (int j = start; j <= num.length - 1; j++) {
            swap(num, start, j);
            permute(num, start + 1, result);
            swap(num, start, j);
        }
    }

    private List<Integer> convertArrayToList(int[] num) {
        List<Integer> item = new ArrayList<Integer>();
        for (int h = 0; h < num.length; h++) {
            item.add(num[h]);
        }
        return item;
    }

    private void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

}
