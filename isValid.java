 
//1 "()[]{{}"    )
public boolean isValid(String s) {
        if(s.isEmpty())
            return true;
        Stack<Character> stack=new Stack<Character>();
        for(char c:s.toCharArray()){
            if(c=='(')
                stack.push(')');
            else if(c=='{')
                stack.push('}');
            else if(c=='[')
                stack.push(']');
            else if(stack.empty()||c!=stack.pop())
                return false;
        }
        
        return stack.size()==0;
    }
//2
   public boolean isValid(String s) {
       Stack<Character> stack=new Stack<>();
       String str="(){}[]";
       String[] strs=new String[]{"()","[]","{}"};
       for(int i=0;i<s.length();i++) {
           char ch = s.charAt(i);
           if (str.contains(String.valueOf(ch))) {
               if (stack.size() != 0) {
                   if ((strs[0].charAt(0)==stack.peek() && strs[0].charAt(1)==ch )
                           || (strs[1].charAt(0)==stack.peek() && strs[1].charAt(1)==ch )
                           || (strs[2].charAt(0)==stack.peek() &&strs[2].charAt(1)==ch)) {
                       stack.pop();
                   }else{
                       stack.push(ch);
                   }
               } else {
                   stack.push(ch);
               }
           }
       }
       return stack.size()==0 ;
    }
	
	//3
	class Solution {
    private HashMap<Character, Character> mappings;

    public Solution() {
    this.mappings = new HashMap<Character, Character>();
    this.mappings.put(')', '(');
    this.mappings.put('}', '{');
    this.mappings.put(']', '[');
  }

  public boolean isValid(String s) {

    // Initialize a stack to be used in the algorithm.
    Stack<Character> stack = new Stack<Character>();

    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);

      // If the current character is a closing bracket.
      if (this.mappings.containsKey(c)) {

        // Get the top element of the stack. If the stack is empty, set a dummy value of '#'
        char topElement = stack.empty() ? '#' : stack.pop();

        // If the mapping for this bracket doesn't match the stack's top element, return false.
        if (topElement != this.mappings.get(c)) {
          return false;
        }
      } else {
        // If it was an opening bracket, push to the stack.
        stack.push(c);
      }
    }

    // If the stack still contains elements, then it is an invalid expression.
    return stack.isEmpty();
  }
}
