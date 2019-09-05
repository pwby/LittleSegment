package exam;

public class DynamicIntegerDepart {
    /*
     * 使用动态规划的方式来求解
     *
     * */
    public int[] memory;

    public int integerBreak(int n) {
        memory = new int[n + 1];
        memory[n] = dynamicBreak(n);
        return memory[n];
    }

    public int dynamicBreak(int n) {

        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }

        if (memory[n] != 0) {
            return memory[n];
        }
        int res = -1;
        for (int i = 1; i < n; i++) {
            res = Math.max(res, Math.max(i * (n - i), i * dynamicBreak(n - i)));
        }
        memory[n] = res;
        return res;
    }

    /*
     * 使用递推的方式
     * */

    public int anotherBreak(int n) {
        memory[2] = 1;
        for (int i = 3; i <= n; i++) {
            for (int j = 1; j <= i - 1; j++) {
                memory[i] = Math.max(memory[i], Math.max(j * memory[i - j], j * (i - j)));
            }
        }
        return memory[n];
    }

}
