
/* 方法：广度优先搜索
思路
每一轮，腐烂将会从每一个烂橘子蔓延到与其相邻的新鲜橘子上。一开始，腐烂的橘子的深度为 0，每一轮腐烂会从腐烂橘子传染到之相邻新鲜橘子上，并且设置这些新的腐烂橘子的深度为自己深度 +1，我们想知道完成这个过程之后的最大深度值是多少。
算法
我们可以用一个广度优先搜索来建模这一过程。因为我们总是选择去使用深度值最小的（且之前未使用过的）腐烂橘子去腐化新鲜橘子，如此保证每一个橘子腐烂时的深度标号也是最小的。
我们还应该检查最终状态下，是否还有新鲜橘子。 */

class Solution {
    int[] dr = new int[]{-1, 0, 1, 0};
    int[] dc = new int[]{0, -1, 0, 1};

    public int orangesRotting(int[][] grid) {
        int R = grid.length, C = grid[0].length;

        // queue : all starting cells with rotten oranges
        Queue<Integer> queue = new ArrayDeque();
        Map<Integer, Integer> depth = new HashMap();
        for (int r = 0; r < R; ++r)
            for (int c = 0; c < C; ++c)
                if (grid[r][c] == 2) {
                    int code = r * C + c;
                    queue.add(code);
                    depth.put(code, 0);
                }

        int ans = 0;
        while (!queue.isEmpty()) {
            int code = queue.remove();
            int r = code / C, c = code % C;
            for (int k = 0; k < 4; ++k) {
                int nr = r + dr[k];
                int nc = c + dc[k];
                if (0 <= nr && nr < R && 0 <= nc && nc < C && grid[nr][nc] == 1) {
                    grid[nr][nc] = 2;
                    int ncode = nr * C + nc;
                    queue.add(ncode);
                    depth.put(ncode, depth.get(code) + 1);
                    ans = depth.get(ncode);
                }
            }
        }

        for (int[] row: grid)
            for (int v: row)
                if (v == 1)
                    return -1;
        return ans;

    }
}
