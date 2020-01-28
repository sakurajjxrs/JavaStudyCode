import java.util.Scanner;

//do...while循环
public class demo1 {
    public static void main(String[] args){
        //商场购物 先购买一件商品后 继续购买
        Scanner input = new Scanner(System.in);
        String isContiune = "";
        int sum = 0;
        do {
            System.out.println("请选择：\n1.T-Shirt(100)\t2.夹克衫(200)\t3.衬衫(300)");
            int choice = input.nextInt();
            if (choice == 1){
                System.out.println("T-Shirt\t￥100");
                sum = sum + 100;
            }else if(choice == 2){
                System.out.println("夹克衫\t￥200");
                sum = sum + 200;
            }else if(choice == 3){
                System.out.println("衬衫\t￥300");
                sum = sum + 300;
            }else {
                System.out.println("输入有误！");
            }

            System.out.println("是否继续？y/n");
            isContiune = input.next();//捕获屏幕上的y/n
        }while (isContiune.equals("y"));
        System.out.println(sum);
    }
}
