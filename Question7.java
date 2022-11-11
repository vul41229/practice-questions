package question;

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        /*question33 遍歷二維數組詩詞
        生成兩個任意的隨機數組，並將這兩個數組按照數字大小按順序歸併到一個新數組中*/
        char [] [] poetry={
                //i
                {'莫','笑','農','家','臘','酒','渾','豐','年','留','客','足','雞','豚'},
                {'山','重','水','複','疑','無','路','柳','暗','花','明','又','一','村'},
                {'簫','鼓','追','隨','春','社','近','衣','冠','簡','樸','古','風','存'},
                {'從','今','若','許','閒','乘','月','拄','杖','無','時','夜','叩','門'}
                                                                                //j
        };
        for(int j=0;j<poetry[0].length;j++) {
            for(int i=poetry.length-1; i>=0; i--) {
                System.out.print(poetry[i][j]);
            }
            System.out.println();
        }

         /*question34 求猴子大王
         5個猴子圍成一圈選大王,依次1-7循環報數,報到7的猴子被淘汰,直到最後一隻猴子稱為大王,問:哪隻猴子會成為大王?*/

        boolean[] b=new boolean[15];
        for(int i=0;i<b.length;i++){
            b[i]=true;
        }
        int num=0;
        int monkeyLeft=15;
        int index=0;
        while(monkeyLeft>1){
            if(b[index]){
                num++;
                if(num==7){
                    b[index]=false;
                    monkeyLeft--;
                    num=0;
                }
            }
            index++;
            if(index==15){
                index=0;
            }
        }
        for(int i=0;i<b.length;i++){
            if(b[i]){
                System.out.println(i+1);
            }
        }

        /*question35 斐波那契問題
        已知:斐波那契數列的前幾個數分別為0,1,1,2,3,5…從第三項開始,每一項都等於前兩項的和.請接收用戶輸入的整數n,求出此數列的前n項*/
        System.out.println("請輸入要測試的數:");
        int n = new Scanner(System.in).nextInt();
        if(n<1){
            System.out.println("輸入數據有誤！！！");
        }
        if(n==1){
            System.out.println(0);
        }
        if(n==2){
            System.out.println(0+"\t"+1);
        }
        if(n==3){
            System.out.println(0+"\t"+1+"\t"+1);
        }
        if(n>3){
            System.out.print(0+"\t"+1+"\t"+1+"\t");
        }
        int f1=1;
        int f2=1;
        int next=0;
        for(int i=4;i<=n;i++){
            next=f1+f2;
            f1=f2;
            f2=next;
            System.out.print(next+"\t");
        }

        /*question36 生兔兔問題
        有一對兔子，從出生後第3個月起都生一對兔子，小兔子長到第三個月後每個月又生一對兔子，假如兔子都不死，問每個月兔子的對數為多少？
        程序分析：前兩個月兔子的對數為1
        從第三個月開始，兔子的對數變成了2 3 5 8 13 21 …*/
        System.out.println("請輸入要判斷的月數：");
        int month = new Scanner(System.in).nextInt();
        System.out.println("第"+month+"月兔子的對數為："+getSum(month));

        /*question37 打印水仙花數
        水仙花數：是指一個三位數，其各位數字立方和等於該數字本身 例如：153就是一個水仙花數，因為153 = 1³ + 5³ + 3³ */

        for (int t = 100; t < 1000; t++) {
            //2.调用自定义方法判断是不是水仙花数
            if(isAim(t)) {
                //3.如果是水仙花数，就打印
                System.out.println(t);
            }
        }
    }

    public static int getSum(int month) {
        if (month == 1 || month == 2) {
            return 1;
        } else {
            return getSum(month - 1) + getSum(month - 2);
        }
    }

    public static boolean isAim(int a) {
        int x = a/100;
        int y = a/10%10;
        int z = a%10;
        if(a == x*x*x+y*y*y+z*z*z) {
            return true;
        }
        return false;
    }
}
