

//31ms
 public String[] findRestaurant(String[] list1, String[] list2) {
        List < String > res = new ArrayList < > ();
        for (int sum = 0; sum < list1.length + list2.length - 1; sum++) {
            for (int i = 0; i <= sum; i++) {
                if (i < list1.length && sum - i < list2.length && list1[i].equals(list2[sum - i]))
                    res.add(list1[i]);
            }
            if (res.size() > 0)
                break;
        }
        return res.toArray(new String[res.size()]);
    }

//8ms
public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap < String, Integer > map = new HashMap < String, Integer > ();
        for (int i = 0; i < list1.length; i++)
            map.put(list1[i], i);
        List < String > res = new ArrayList < > ();
        int min_sum = Integer.MAX_VALUE, sum;
        for (int j = 0; j < list2.length && j <= min_sum; j++) {
            if (map.containsKey(list2[j])) {
                sum = j + map.get(list2[j]);
                if (sum < min_sum) {
                    res.clear();
                    res.add(list2[j]);
                    min_sum = sum;
                } else if (sum == min_sum)
                    res.add(list2[j]);
            }
        }
        return res.toArray(new String[res.size()]);
    }

//38ms
public static String[] findRestaurant(String[] list1, String[] list2) {
        int len1=list1.length,len2=list2.length;
        int len=len1+len2;
        String[] strs=new String[len];
        List<String> list=new ArrayList<>();
        for(int i=0;i<len1;i++){
            list.add(list1[i]);
        }
        for(int i=0;i<len2;i++){
            String s=list2[i];
            if(list.contains(s)){
              int index=list.indexOf(s)+i;
              if(strs[index]==null){
                  strs[index]=s;
              }else{
                  strs[index] +=","+s;
              }

            }

        }
        int i=0;
       for(;i<len;i++){
            if(strs[i]!=null){
                break;
            }
       }
       if(strs[i].contains(",")){
           return strs[i].split(",");
       }else{
           return new String[]{strs[i]};
       }

    }