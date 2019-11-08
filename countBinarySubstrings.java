 
 /* 输入: "00110011"
输出: 6
解释: 有6个子串具有相同数量的连续1和0：“0011”，“01”，“1100”，“10”，“0011” 和 “01”。

请注意，一些重复出现的子串要计算它们出现的次数。

另外，“00110011”不是有效的子串，因为所有的0（和1）没有组合在一起。 */

  public static int countBinarySubstrings(String s) {
       
        int pre=0;
        int i=0;
        int count=1;
        int ans=0;
        for(i=1;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(i-1)) {
               ans += Math.min(pre,count);
                pre=count;
               count=1;
            }else{
                count++;
            }
        }
        ans += Math.min(pre,count);
        return ans;

}
   
 
 public static int countBinarySubstrings(String s) {
        List<Integer> list=new ArrayList<>();
        int pre=0;
        int i=1;
        for(;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(i-1)) {
                list.add(i - pre);
                pre = i;
            }
        }

        list.add(i-pre);
        int result=0;
        for(int count=0;count<list.size()-1;count++){
            result += Math.min(list.get(count),list.get(count+1));
        }
        return result;
}