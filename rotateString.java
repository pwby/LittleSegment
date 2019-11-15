   

 public static  boolean rotateString(String A, String B) {
        return A.length() == B.length() && (A+A).contains(B);

}

   public static  boolean rotateString(String A, String B) {
       if(A.equals(B)){
           return true;
       }
        StringBuilder sb= new StringBuilder(A);
       int len=sb.length();
       while(len>1){
           char ch=sb.charAt(0);
           sb.deleteCharAt(0);
           sb.append(ch);
           if(sb.toString().equals(B)){
               return true;
           }
           len--;
       }
       return false;
    }