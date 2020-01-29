public class Test3 {
    public static void main(String[] args) {
        //给数组中插入一个元素90；要求保持从小到大的顺序（要求不能用排序算法）
        int[] nums = new int[] {67, 87, 88, 98, 99};//数组长度一旦定义，则不能改变；
        int insertNum = 90;//插入的数据；

        //创建新数组，能容纳新插入后的 全部元素
        int[] newNums = new int[nums.length+1];
        for (int i=0; i<nums.length; i++){
            newNums[i] = nums[i];
        }

        System.out.println("查看新数组：");
        for (int i=0; i<newNums.length; i++){
            System.out.print(newNums[i]+"\t");
        }

        //插入操作：1.找插入位置（数组中第一个比90大的位置） 2.平移
        int position = newNums.length-1;//默认插入的位置就是最大值得位置;因为最大值初始值为0;
        for (int i=0; i<newNums.length; i++){
            if (newNums[i]>90){
                position = i;
                break;
            }
        }
        System.out.println();
        System.out.println("待插元素的位置是："+position);

        //平移操作：
        for (int i=newNums.length-2; i>=position; i--){
            newNums[i+1] = newNums[i];
        }
        System.out.println("平移后的数组为：");
        for (int i=0; i<newNums.length; i++){
            System.out.print(newNums[i]+"\t");
        }
        System.out.println();

        //最后把90 插入到position位置：
        newNums[position] = insertNum;
        System.out.println("插入后的数组为：");
        for (int i=0; i<newNums.length; i++){
            System.out.print(newNums[i]+"\t");
        }
    }
}
