 
 
 
  public boolean isSubsequence(String s, String t) {
        char[] chars=s.toCharArray();
        int index=-1;
        for(char temp:chars){
            index=t.indexOf(temp,index+1);
            if(index==-1){
                return false;
            }
        }
        return true;
    }


  public boolean isSubsequence(String s, String t) {
      int index=0;
      int i=0;
      while(index<s.length() && t.indexOf(s.charAt(index),i)>=i){
          i = t.indexOf(s.charAt(index),i)+1;
          index++;
      }
      return index==s.length();
    }
	
 
 public static boolean isSubsequence(String s, String t) {

        Stack<Character> stack=new Stack<>();
        for(int i=s.length()-1;i >=0;i--){
            stack.push(s.charAt(i));
        }
        for(int i=0;i<t.length();i++){
            if(stack.size()==0){
                break;
            }
            if(t.charAt(i)==stack.peek()){
                stack.pop();
            }
        }
        return stack.size()==0;

    } 