//   有一个数列：8 4 2 1 23 344 12
//           1.求所有数字的和
//           2.随机产生一个1-3 之间的数，判断数列中是否有此数；
//           3.进行排序，并输出结果

public class Test1 {
    public static void main(String[] args) {
        int sum = 0;
        // 1.求所有数字的和
        int[] nums = {8, 4, 2, 1, 23, 20, 12};
        //数组的元素个数=nums.length;
        for (int i=0; i<nums.length; i++) {
            sum += nums[i];
        }
        System.out.println(sum);

//        2.随机产生一个1-3 之间的数，判断数列中是否有此数；
        boolean flag = false;
        int ran = (int)(Math.random()*3)+1;
        System.out.println("随机数："+ran);
        for (int i=0; i<nums.length; i++){
            if (nums[i]==ran){
                flag = true;
                break;
            }
        }
        if (flag){
            System.out.println("存在");
        }else {
            System.out.println("不存在");
        }

//          3.进行排序，并输出结果
        System.out.println("排序前：");
        for (int i=0; i<nums.length; i++) {
            System.out.print(nums[i]+"\t");
        }
        System.out.println();

        //排序    classpath： .;%JAVA_HOME%\lib
//       Arrays.sort(nums);//自动排序， 升序 api开发
//      冒泡排序
        //冒泡 当前 和下一个比，如果是：交换
        //n个元素比较比n-1次
        //i+j=nums.length-1
        for (int i=0; i<nums.length-1; i++){
            for (int j=0; j<nums.length-1-i; j++){
                if (nums[j]>nums[j+1]){
                    int t = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = t;
                }
            }
        }



        System.out.println("排序后：");
        for (int i=0; i<nums.length; i++) {
            System.out.print(nums[i]+"\t");
        }
    }
}
