package question;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        /*question29 求任意自然數各位數之和
        接收用戶輸入的任意自然數,累計所有位數數字之和 需求:接收用戶輸入的行數*/
        System.out.println("請輸出您要求和的自然數:");
        int n = new Scanner(System.in).nextInt();
        int sum = 0;
        while (n!=0){
            sum = sum+(n%10);
            n=n/10;
        }
        System.out.println(sum);

        //question30 求任意數組中所有元素的最大值
        int[] arr = {1,555,66,9999,333};
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);

        //question31 求1000以內的完數
        for(int i=1;i<=1000;i++){
            int s = 0;
            for(int j=1;j<=i/2;j++){
                if(i % j == 0){
                    s+=j;
                }
            }
            if(s==i){
                System.out.println(i);
            }
        }

        /*question32 隨機數組的歸併問題
        生成兩個任意的隨機數組，並將這兩個數組按照數字大小按順序歸併到一個新數組中
         */
        int[] a = suiJi();
        int[] b = suiJi();
        Arrays.sort(a);
        Arrays.sort(b);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        int[] c = heBing(a, b);
        System.out.println(Arrays.toString(c));
    }

    private static int[] suiJi() {
        int n = 5+ new Random().nextInt(6);
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = new Random().nextInt(100);
        }
        return a;
    }

    private static int[] heBing(int[] a, int[] b) {
        int[] c = new int[a.length+b.length];
        for(int i=0,j=0,k=0;i<c.length;i++) {
            if(j>=a.length) {

                System.arraycopy(b,k,c,i,b.length-k);
                break;
            } else if(k>=b.length) {

                System.arraycopy(a,j,c,i,a.length-j);
                break;
            }
            if(a[j]<=b[k]) {
                c[i] = a[j];
                j++;
            } else {
                c[i] = b[k];
                k++;
            }
        }
        return c;
    }


}
