  
/* 输入: secret = "1807", guess = "7810"

输出: "1A3B"

解释: 1 公牛和 3 奶牛。公牛是 8，奶牛是 0, 1 和 7。 */

//记录相同位置字符也相等的公牛数目
//记录除了相等字符外的其他secret字符与数组mapS中
//记录除了相等字符外的其他guess字符与数组mapG中
//遍历该两个新数组，并取相同字符其值（个数）的最小值
  public String getHint(String secret, String guess) {
        int aCount = 0;     // 公牛数
        int bCount = 0;     // 母牛数
        int mapS[] = new int[10];
        int mapG[] = new int[10];

        for (int i = 0; i < secret.length(); i++) {
            char temp = secret.charAt(i);
            if (temp == guess.charAt(i))
                aCount++;
            else {
                mapS[temp - '0']++;
                mapG[guess.charAt(i) - '0']++;
            }
        }
        for (int i = 0; i < 10; i++) {
            bCount += Math.min(mapG[i], mapS[i]);
        }
        return aCount + "A" + bCount + "B";
    }
	
	//使用一个数组
	//记录相同位置相同字符的公牛个数
	//除公牛字符外，记录出现在secret中的其他字符，使该字符所在下标的数组值自增
	//               记录出现在guess中的其他字符，使该字符所在下标的数组值自减
	//(如果该字符在guess中出现，在secret中也出现，一增一减会抵消)，如果未在secrte中出现，则其值大于0
	//遍历新数组，故找出其值大于0的字符，记录这样的字符的个数
	//使用secret的长度，减去公牛字符个数，减去未在guess中出现的字符个数，其结果就是guess中出现的并位置不对的字符个数
	public String getHint1(String secret, String guess) {
        int len=secret.length();
        int bucket[] = new int[10];
        int bulls=0;
        int cows=0;
        for(int i=0;i<len;i++){
            if(secret.charAt(i)==guess.charAt(i)){
                bulls++;
                continue;
            }
            bucket[secret.charAt(i)-'0']++;
            bucket[guess.charAt(i)-'0']--;
        }
        int exclude=0;
        for(int i=0;i<10;i++){
            if(bucket[i]>0){
                exclude += bucket[i];
            }
        }
        cows=len-bulls-exclude;

        String str=bulls+"A"+cows+'B';
        return str;
    }