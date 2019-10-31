

//深度遍历，
class Solution {
    public int orangesRotting(int[][] grid) {
        if(grid==null)
        {
            return 0;
        }
        int rlen=grid.length;
        int clen=grid[0].length;
        for(int i=0;i<rlen;i++){
            for(int j=0;j<clen;j++){
                if(grid[i][j]==2){
                   DFS(grid,i,j,rlen,clen,grid[i][j]);
                }
            }
        }
        int max=0;
        for(int i=0;i<rlen;i++){
            for(int j=0;j<clen;j++){
                if(grid[i][j]==1){
                    return -1;
                }
               max=Math.max(grid[i][j],max);
            }
        }
        if(max==0){
            return 0;
        }
        return max-2;
        
    }
    public void DFS(int[][] grid,int x,int y,int rlen,int clen,int count){
        grid[x][y]=count;
        int[][] pos=new int[][]{{-1,0},{0,1},{1,0},{0,-1}};
        for(int i=0;i<4;i++){
            int newx=x+pos[i][0];
            int newy=y+pos[i][1];
            if(newx<0 || newx>=rlen || newy<0 || newy>=clen){
                continue;
            }
            if(grid[newx][newy]==1 || grid[newx][newy]-grid[x][y]>1){
              DFS(grid,newx,newy,rlen,clen,count+1);
            }
        }
    
    }
}

//广度遍历
  public int orangesRotting(int[][] grid) {
        int times = 1;
        boolean flag = true;
        int[][] note = new int[grid.length][grid[0].length];
        for(int i=0; i<note.length; i++){
            for(int j=0; j<note[0].length; j++){
                if(grid[i][j]==2){
                    note[i][j] = times;
                }else{
                    note[i][j] = 0;
                }
            }
        }
		int[][] pos=new int[][]{{-1,0},{0,1},{1,0},{0,-1}};
        while(flag){
            flag = false;
            for(int i=0; i<grid.length; i++){
                for(int j=0; j<grid[0].length; j++){
                    if(grid[i][j]==2&&note[i][j]==times){
						 for(int k=0;k<4;k++){
                              int newx=i+pos[k][0];
                              int newy=j+pos[k][1];
                             if(newx<0 || newx>=grid.length || newy<0 || newy>=grid[0].length){
                                    continue;
                               }
                             if(grid[newx][newy]==1){
                                grid[newx][newy] = 2;
                                note[newx][newy] = times+1;
                                flag = true;
                               }
                            }
					}
                }
            }
            if(flag){
                times++;;
            }
        }
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j]==1){
                    return -1;
                }
            }
        }
        return times-1;
    }

