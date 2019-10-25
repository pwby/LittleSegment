 //记录nums的最大值max
 //新建数组，其长度为nums为max+1
 //以nums成绩作为下标，以下标为值
 //遍历新数组，以最大值max为索引处开始遍历
 //选择值大于0的
 //从max到0处，代表其成绩已从高到低排序
 //O（n）
 public String[] findRelativeRanks(int[] nums) {
        int max=-1;
        for(int i=0;i<nums.length;i++)
            max=Math.max(max,nums[i]);
        int[] record=new int[max+1];
        String rs[]=new String[nums.length];
        for(int i=0;i<nums.length;i++){
            record[nums[i]]=i+1;
        }
        for(int i=max,flag=1;i>=0;i--){
            if(record[i]>0){
                switch(flag){
                    case 1:rs[record[i]-1]="Gold Medal";break;
                    case 2:rs[record[i]-1]="Silver Medal";break;
                    case 3:rs[record[i]-1]="Bronze Medal";break;
                    default:rs[record[i]-1]=String.valueOf(flag);      
                }
                flag++;
            }
        }
        return rs;
    }
	
	
//O(n^2)
	    public String[] findRelativeRanks(int[] nums) {
        if(nums==null){
            return null;
        }
        int len=nums.length;
        String[] str=new String[len];
        int count=0;
        int index=0;
        for(int i=0;i<len;i++){
            int key=i;
            count++;
            for(int j=0;j<len;j++){
                if(nums[j]>nums[key]){
                    key=j;
                }
            }
            nums[key]=0;

                switch(count) {
                    case 1:
                        str[key] = "Gold Medal";
                        break;
                    case 2:
                        str[key] = "Silver Medal";
                        break;
                    case 3:
                        str[key] = "Bronze Medal";
                        break;
                        default:
                            str[key]=Integer.toString(count);

            }
        }
        return str;
    }