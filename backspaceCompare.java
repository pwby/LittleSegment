//比较含退格的字符串
//使用了覆盖的思想

//使用i和j记录新字符串长度   
//当长度不同时，则两个字符串自然不同
//若字符串长度相同，并且每个字符相等，则是相同字符串


 public boolean backspaceCompare(String S, String T) {
         Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '#') {
                if (!stack1.empty()) {
                    stack1.pop();
                }

            } else {
                stack1.push(S.charAt(i));
            }

        }
        for (int j = 0; j < T.length(); j++) {
            if (T.charAt(j) == '#') {
                if (!stack2.empty())
                    stack2.pop();
            } else {
                stack2.push(T.charAt(j));
            }
        }
        if (stack1.size() != stack2.size()) {
            return false;
        }
        while (!stack1.empty()) { 
            if (stack1.pop() != stack2.pop()) {  // 一一判断是否相等
                return false;
            }
        }
        return true;
    }
	
	

   public boolean backspaceCompare(String S, String T) {
        int i, j, k;
        char[] charS, charT;

        i = 0;
        j = 0;
        charS = new char[S.length()];
        charT = new char[T.length()];
        for(k = 0; k < S.length(); k++){
            if(S.charAt(k) == '#'){
                if(i > 0)
                    i--;
            }
            else
                charS[i++] = S.charAt(k);
        } 
        for(k = 0; k < T.length(); k++){
            if(T.charAt(k) == '#'){
                if(j > 0)
                    j--;
            }
            else{
                charT[j++] = T.charAt(k);
            }
        } 
        if(i != j)
            return false;
        for(k = 0; k < i; k++)
            if(charS[k] != charT[k])
                return false;
        return true;
    }

