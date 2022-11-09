package question;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        /*question21 求數字階乘(for循環版)
        需求:接收用戶輸入的數字,計算該數字的階乘結果 已知:負數不可以有階乘,0的階乘結果是1,
        5 ! = 5 x 4 x 3 x 2 x 1 */
        System.out.println("輸入整數求階乘");
        int n = new Scanner(System.in).nextInt();
        f(n);

        //question22 多次生成隨機數,並打印第一次出現大於0.999 時的次數與生成的隨機數
        for (int i = 1; ;i++){
            double d = Math.random();
            if(d > 0.999){
                System.out.println("第"+i+"次生產了目標值,值為:"+d);
                break;
            }
        }

        //question23 打印100以內除了尾數為3,5,7的所有數
        for(int i=1;i<100;i++){
            int y = i%10;
            if (y==3 || y==5 || y==7){
                continue;
            }
            System.out.println(i);
        }

        //question24 求質數:接收用戶輸入的數字,判斷是否為質數
        System.out.println("請輸入要判斷的自然數:");
        int s = new Scanner(System.in).nextInt();
        getPrimeNumber(s);

        //question25 接收用戶輸入的數字,判斷在此範圍內質數的個數
        System.out.println("輸入整數q，求q內質數的數量");
        int q = new Scanner(System.in).nextInt();
        count(q);

    }

    private static void f(int n){
        if (n<0){
            System.out.println("負數不可以求階乘");
            return;
        }
        if (n==0){
            System.out.println("0的階乘是1");
            return;
        }
        long r = n;
        for(int i=n-1; i>=1; i--) {
            r *= i;
        }
        System.out.println(n+"的階乘："+r);
    }
    public static void getPrimeNumber(int s){
        if (s<2){
            System.out.println(s+"不是質數");
            return;
        }
        if (s==2){
            System.out.println(s+"是質數");
            return;
        }
        double max = 1+ Math.sqrt(s);
        for(int i=2; i<max; i++) {

            if(s%i == 0) {
                System.out.println(s+"不是質數");
                return;
            }
        }
        System.out.println(s+"是質數");
    }
    public static void count(int q){
        if(q<2) {
            System.out.println("沒有質數");
            return;
        }
        if(q==2) {
            System.out.println("有1個質數");
            return;
        }
        int count = 1;
        outer:
        for(int i=3; i<=q ;i++) {
            double max = 1+ Math.sqrt(i);
            for(int j=2; j<max; j++) {
                if(i%j == 0) {
                    continue outer;
                }
            }
            count++;
        }
        System.out.println(q+"內質數的數量："+count);
    }

}
