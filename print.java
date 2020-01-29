public class test1 {
    public static void main(String[] args) {
        for (int i=0; i<4; i++){
            for (int k=0; k<3-i; k++){  //打印空格
                System.out.print(" ");
            }
            for (int j=0; j<2*i+1; j++){ //打印*
                if (j==0 || j==2*i) {  //变成空心的;保留开头和结尾
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i=2; i>=0; i--){
            for (int k=0; k<3-i; k++){
                System.out.print(" ");
            }
            for (int j=0; j<2*i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
