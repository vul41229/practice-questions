package question;

import java.util.Scanner;

public class Question {

    public static void main(String[] args) {
        //question1 輸出一句話：“我要開始學習JAVA了，今天又是知識量滿滿的一天~”
        System.out.println("我要開始學習JAVA了，今天又是知識量滿滿的一天");

        //question2 打印個人信息案例，將一個人的一些個人信息打印輸出
        System.out.println("姓名:大撒瓜");
        System.out.println("性別:男");
        System.out.println("年齡:"+15);

        //question3 定義兩個整數，計算這兩個整數加減乘除運算的結果，並把結果打印到控制台
        int a = 10;
        int b = 5;
        int c = a+b;
        int d = a-b;
        int e = a*b;
        int f = a/b;
        System.out.println("輸出:"+"c="+c+"d="+d+"e="+e+"f="+f);

        /*question4 預測身高案例
        其實我們可以通過父母的身高大致推斷出子女的身高，假定父母與子女的身高遺傳關係如下：
        兒子身高（厘米）＝(父親身高＋母親身高) ×1.08÷2
        女兒身高（厘米）＝(父親身高×0.923＋母親身高) ÷2
        那已知：現有父親身高175CM,母親身高160CM。
        請將預測的子女身高打印輸出*/
        double dad = 175;
        double mom = 160;
        double son = (dad+mom)*1.08/2;
        double girl =(dad*0.923+mom)/2;
        System.out.println("兒子身高:"+son+"厘米");
        System.out.println("女兒身高:"+girl+"厘米");

        /*question5 邏輯判斷
        已知小紅同學有25元，她攢了幾天錢之後發現自己的現在的錢比原來的2倍還多出10塊。
        而小藍同學有30元，他攢了幾天錢之後發現自己的錢正好是原來的2倍。
        於是小胖說：小紅和小藍現在的錢一樣多，請問，他說的對嗎？
         */
        int rad = 25;
        int blue = 30;
        rad = rad*2+10;
        blue *= 2;
        System.out.println(rad==blue);

        /*question6 最優選擇
        某小伙想定一份外賣，商家的優惠方式如下：魚香肉絲單點24元，油炸花生米單點8元，
        米飯單點3元。訂單滿30元8折優惠。魚香肉絲優惠價16元，但是優惠價和折扣不能同時使用。
        那麼這個小伙要點這三樣東西，最少要花多少錢？*/
        double money1 = 24 + 8 + 3;
        money1 = (money1 <= 30 ? money1:money1*0.8);
        double money2 = 16 + 8 + 3;
        double money = money1 < money2 ? money1 : money2;
        System.out.println(money);

        //question7 接收用戶輸入的3個整數,並將它們的最大值作為結果輸出
        System.out.println("請輸入第一個數字");
        int a1 = new Scanner(System.in).nextInt();
        System.out.println("請輸入第二個數字");
        int a2 = new Scanner(System.in).nextInt();
        System.out.println("請輸入第三個數字");
        int a3 = new Scanner(System.in).nextInt();
        int x = a1 > a2 ? a1 : a2;
        x = x > a3 ? x : a3;
        int max = a1>a2?(a1>a3?a1:a3):(a2>a3?a2:a3);
        System.out.println("三個數的最大值是:"+x);
        System.out.println("三個數的最大值是:"+max);

        //question8 接收用戶輸入的數據，判斷是奇數還是偶數
        System.out.println("請輸入要判斷的數據");
        int z = new Scanner(System.in).nextInt();
        if (z % 2 == 0){
            System.out.println("是偶數");
        }else {
            System.out.println("是奇數");
        }

        //question9 接收用戶輸入的數據，判斷是奇數還是偶數
        System.out.println("請輸入數字1-7");
        int s = new Scanner(System.in).nextInt();
        if (s==1){
            System.out.println("星期一");
        }else if (s==2){
            System.out.println("星期二");
        }else if (s==3){
            System.out.println("星期三");
        }else if (s==4) {
            System.out.println("星期四");
        }else if (s==5){
            System.out.println("星期五");
        }else if (s==6){
            System.out.println("星期六");
        }else if (s==7){
            System.out.println("星期日");
        }else if (s>7) {
            System.out.println("請輸入正確數字");
        }
        /*question10 BMI 指數測試BMI = 體重(kg) / 身高² (m)
        接收用戶輸入的身高和體重,將判斷結果輸出
        過輕：低於18.5
        正常：18.5 ~ 22.9
        偏胖：23 ~ 24.9
        肥胖：25 ~ 29.9
        重度肥胖：高於30
        極度肥胖：高於40 */
        //第一種方法
        System.out.println("請輸入體重");
        double kg = new Scanner(System.in).nextDouble();
        System.out.println("請輸入身高(m)");
        double m = new Scanner(System.in).nextDouble();
        double bmi = kg/(m*m);
        System.out.println("您的BMI為:"+bmi);
        if (bmi < 18.5){
            System.out.println("您太輕了,要多吃一點");
        }else if (bmi <=22.9){
            System.out.println("你的體型正常,要繼續保持呀");
        }else if (bmi <=24.9){
            System.out.println("你的體型微胖,飲食上注意一下呀");
        }else if (bmi <=29.9){
            System.out.println("你的體型肥胖,要控制飲食並且多運動呀");
        }else if (bmi <=30){
            System.out.println("你重度肥胖,一定要少吃一些多多運動啊");
        }else if (bmi <=40){
            System.out.println("你極度肥胖,要去看醫生接受治療呀");
        }
        //第二種方法
        System.out.println("請輸入體重");
        double kg2 = new Scanner(System.in).nextDouble();
        System.out.println("請輸入身高(m)");
        double m2 = new Scanner(System.in).nextDouble();
        getBean(kg2,m2);

    }
    public static void getBean(double h,double j) {
        double bmi = h / (j * j);
        String r = "";
        if (bmi < 18.5) {
            r = "過輕";
        } else if (bmi <= 22.9) {
            r = "正常";
        } else if (bmi <= 24.9) {
            r = "偏胖";
        } else if (bmi <= 29.9) {
            r = "肥胖";
        } else if (bmi <= 30) {
            r = "重度肥胖";
        } else if (bmi <= 40) {
            r = "極度肥胖";
        }
        System.out.println("您的BMI為:"+bmi);
        System.out.println("您的體重屬於:"+r);
    }
}
