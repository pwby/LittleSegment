
// 输入："abbaca"
// 输出："ca"
// 解释：
// 例如，在 "abbaca" 中，我们可以删除 "bb" 由于两字母相邻且相同，这是此时唯一可以执行删除操作的重复项。
//之后我们得到字符串 "aaca"，其中又只有 "aa" 可以执行重复项删除操作，所以最后的字符串为 "ca"。

//题解：使用栈的思想
//当栈为空时，将当前字符入栈
//若当前的字母和栈顶的字母不同，则放入当前的字母。
//若当前的字母和栈顶的字母相同，则弹出栈顶的字母；



//java
 public static String removeDuplicates(String S) {
       if(S==null)
           return S;
       StringBuilder sb=new StringBuilder();
       for(char ch:S.toCharArray()){
           if(sb.length()!=0 && ch==sb.charAt(sb.length()-1)){
               sb.deleteCharAt(sb.length()-1);
           }else{
               sb.append(ch);
           }
       }
       return sb.toString();
    }
	
//python
class Solution:
    def removeDuplicates(self, S: str) -> str:
        output=[]
        for ch in S:
            if output and ch == output[-1]:
                output.pop()
            else:
                output.append(ch)
        return ''.join(output)
    