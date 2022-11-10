package question;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        //question26 生成一個順序數組,將這個數組的元素打亂順序後輸出
        int[] a = f();
        for(int i=0; i<a.length; i++) {
            System.out.println(a[i]);
        }
        System.out.println("----------------");
        shuffle(a);
        System.out.println(Arrays.toString(a));

        //question27 接收用戶輸入的行數,打印對應的全三角形,如圖所示:
        System.out.println("請輸入要打印星星的數量:");
        int n = new Scanner(System.in).nextInt();
        for(int i=1;i<=n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        /*question28 模擬雙色球生成案例
        需求：體彩中有一項是雙色球，要求在1-33號共33個紅色球裡選出6個，1-16號共16個藍色球中選出一個作為中獎號碼，請實現這個需求*/
        int[] r = abcd(33);
        int[] b = abcd(16);
        System.out.println(Arrays.toString(r));
        System.out.println(Arrays.toString(b));
        int[] red = selectRed(r);
        int blue = selectBlue(b);
        System.out.println("紅球："+Arrays.toString(red));
        System.out.println("籃球："+blue);
    }
    public static int[] f(){
        int[] a = new int[5];
        for (int i=0; i<a.length; i++){
            a[i] = i+1;
        }
        return a;
    }
    public static void shuffle(int[] a){
        for (int i = 0;i< a.length;i++){
            int j = new Random().nextInt(a.length);
            int t = a[i];
            a[i] = a[j];
            a[j] = t;
        }
    }
    private static int[] abcd(int n){
        int[] a =new int[n];
        for(int i=0;i<a.length;i++){
            a[i] = i+1;
        }
        return a;
    }
    private static int[] selectRed(int[] r) {
        for (int i = 0; i < 6; i++) {

            int j =
                    i+ new Random().nextInt(r.length-i);
            int t = r[i];
            r[i] = r[j];
            r[j] = t;
        }
        return Arrays.copyOf(r, 6);
    }
    private static int selectBlue(int[] b) {
        return b[new Random().nextInt(16)];
    }

}
