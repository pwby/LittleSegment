
    public  static int countPrimes(int n) {

      int arr[]=new int[n];
      Arrays.fill(arr,1);
      for(int i=2;i<n;i++){
          if(arr[2]==1){
              for(int j=2;j * i< n;j++){
                  arr[i * j]=0;
              }
          }
      }
      int res=0;
      for ( int i=2;i<n;i++){
          if(arr[i] == 1){
              res++;
          }
      }
      return res;

    }
	
	
/* 素数34544.0
素数78498
开平方310.0
开平方78498
综合114.0
综合78498
数组178.0
数组78499 */
	
	 public  static int countPrimes2(int n) {
        double start = System.currentTimeMillis();
        int arr[]=new int[n];
        Arrays.fill(arr,1);
        for(int i=2;i<n;i++){
            if(arr[2]==1){
                for(int j=2;j * i< n;j++){
                    arr[i * j]=0;
                }
            }
        }
        int res=0;
        for ( int i=1;i<n;i++){
            if(arr[i] == 1){
                res++;
            }
        }
        double end=System.currentTimeMillis();
        System.out.println("数组"+(end - start));
        return res;

    }
    public static int primeNumber1() {

        double start = System.currentTimeMillis();
        List<Integer> list = new ArrayList<>();
        list.add(2);
        for (int i = 3; i < 1000_000; i +=2) {
            boolean flag=true;
            for(int rest=2;rest<Math.sqrt(i+0.0)+1;rest++){
                if(i%2==0 || i%rest==0){
                    flag=false;
                    break;
                }
            }
            if(flag){
                list.add(i);
            }
        }
        double end=System.currentTimeMillis();
        System.out.println("开平方"+(end - start));
        return list.size();
    }

 //任意几个素数之积是合数
public static int primeNumber(){
        double start=System.currentTimeMillis();
        List<Integer> list=new ArrayList<>();
        list.add(2);
        for(int i=3;i< 1000_000 ;i +=2) {
            boolean flag = true;
            for (int rest : list) {
                if (i % rest == 0) {
                    flag = false;
                    break;
                }
            } if(flag){
                list.add(i);
            }
        }
        double end=System.currentTimeMillis();
    System.out.println("素数"+(end-start));
    return list.size();
}

    //任意几个素数之积是合数
    public static int primeNumber2(){
        double start=System.currentTimeMillis();
        List<Integer> list=new ArrayList<>();
        list.add(2);
        for(int i=3;i< 1000_000 ;i +=2) {
            boolean flag = true;
            for (int rest : list) {
                if (i % rest == 0) {
                    flag = false;
                    break;
                }
                if(rest> Math.ceil(Math.sqrt(i+0.0))) {
                    flag=true;
                    break;
                }
            } if(flag){
                list.add(i);
            }
        }
        double end=System.currentTimeMillis();
        System.out.println("综合"+(end-start));
        return list.size();
    }