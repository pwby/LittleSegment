 
 
 
 //如果不对应，则其对应的下标就会有差异
  public boolean isIsomorphic1(String s, String t) {
        int len = s.length();
        for (int i = 0; i < len; i++) {
            if(s.indexOf(s.charAt(i)) != t.indexOf(t.charAt(i))){
                return false;
            }
        }
        return true;
    }
	
	
	//使用map存储
 public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> map =new HashMap<>();
        for(int j=0;j<s.length();j++){
            char s_ch=s.charAt(j);
            char t_ch=t.charAt(j);
            if(!map.containsKey(s_ch) ){
                if(!map.containsValue(t_ch)){
                    map.put(s.charAt(j),t.charAt(j));
                }else{
                    map.put(s_ch,null);
                }
               
            }

            if(map.get(s_ch)==null || t_ch!=map.get(s_ch)){
                return false;
            }
        }
        return true;
    }