import java.util.Scanner;
//用循环实现 登录操作：若用户名、密码错误(zs,123) 则给出提示，并重新登录
public class demo2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String username = "";
        String password = "";
        String isContiune = "";
        do {
            if (!(username.equals("") && password.equals(""))) {
                System.out.println("是否重新登录? y/n");//判断是否重新登录
                isContiune = input.next();
                //对判断进行选择
                if (isContiune.equals("y")){
                    //如果选择y结果为真继续进行do...while循环
                }else {
                    //break; //用break则会执行System.out.println("登录成功！");
                    return;  //选择n则会结束程序，并且不会执行System.out.println("登录成功！");
                }
            }
            System.out.println("请输入用户名：");
            username = input.next();
            System.out.println("请输入密码");
            password = input.next();
        }while (!(username.equals("zs") && password.equals("123")));
        System.out.println("登录成功！");
    }
}
