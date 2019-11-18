
//能用数组的就能用map
//抵消法
//直接在过程中就做判断


       public boolean canConstruct(String ransomNote, String magazine) {
        int[] arr=new int[26];
        int j=0;
        while(j<magazine.length()){
                arr[magazine.charAt(j)-'a'] += 1;
                 j++;
        }
    for(int i=0;i<ransomNote.length();i++){
        if(arr[ransomNote.charAt(i)-'a']==0){
            return false;
        }
        --arr[ransomNote.charAt(i)-'a'];
    }
        return true;
    }

    public boolean canConstruct(String ransomNote, String magazine) {
        int[] arr = new int[26];
        int j = 0;
        while (j < magazine.length()) {
            arr[magazine.charAt(j) - 'a'] += 1;
            j++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            if (--arr[ransomNote.charAt(i) - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }

	//结果出来之后才做判断
 public boolean canConstruct(String ransomNote, String magazine) {
		int[] arr=new int[26];
		int i=0,j=0;
		while(i<ransomNote.length() || j<magazine.length()){
			if(i<ransomNote.length()){
				arr[ransomNote.charAt(i)-'a'] -= 1;
			}
			 if(j<magazine.length()){
				arr[magazine.charAt(i)-'a'] += 1;
			}
			i++;
			j++;
		}
	 for(int k=0;k<26;k++){
				if(arr[k]<0){
					return false;
				}
		}
		return true;
	}