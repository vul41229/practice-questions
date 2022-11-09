package question;

import java.util.Scanner;

public class Question3 {
    /*question20 通過java基礎的相關知識，設計並完成一個簡單的商品錄入系統，
        可以實現：菜單顯示、商品信息展示、商品信息錄入、商品信息查詢、退出的功能*/

    static String[] names = {"iphone14 Pro","Samsung S22","Google Pixel7 Pro","OPPO X5 Pro","小米 12T Pro"};
    static double[] price = {35000,30000,26999,28000,21000};
    static int[] numbers = {50,20,80,120,90};

    public static void main(String[] args) {
        outer:
        while (true){
            int c = menu();

            switch (c){
                case 1: f1(); break;
                case 2: f2(); break;
                case 3: f3(); break;
                case 4: f4(); break;
                case 5: break outer;
            }
        }


    }
    private static int menu() {
        System.out.println("----------------------");
        System.out.println("1. 商品列表");
        System.out.println("2. 商品錄入");
        System.out.println("3. 商品查詢");
        System.out.println("4. 統計信息");
        System.out.println("5. 退出");
        System.out.println("----------------------");
        System.out.print("選擇：> ");
        return new Scanner(System.in).nextInt();
    }

    private static void f1(){
        for (int i =0; i< names.length;i++){
            String n = names[i];
            double p = price[i];
            int b = numbers[i];
            System.out.println((i+1)+". 名稱："+n+"，價格："+p+"，數量："+b);
        }
    }
    private static void f2() {

        for (int i = 0; i < names.length; i++) {
            System.out.println("錄入第"+(i+1)+"件商品：");
            System.out.print("名稱：");
            String n = new Scanner(System.in).nextLine();
            System.out.print("價格：");
            double p = new Scanner(System.in).nextDouble();
            System.out.print("數量：");
            int b = new Scanner(System.in).nextInt();
            names[i] = n;
            price[i] = p;
            numbers[i] = b;
        }
        f1();
    }

    private static void f3() {

        System.out.print("輸入查詢的商品名：");
        String n = new Scanner(System.in).nextLine();
        for (int i = 0; i < names.length; i++) {
            if(n.equals(names[i])) {
                String name = names[i];
                double p = price[i];
                int b = numbers[i];
                System.out.println(
                        (i+1)+". 名稱："+name+"，價格："+p+"，數量："+b);
                return;
            }
        }

        System.out.println("找不到商品");
    }

    private static void f4() {

        double all = 0;
        double oneAll = 0;
        double oneMax = 0;
        double allMax = 0;

        for (int i = 0; i < names.length; i++) {
            all += price[i] * numbers[i];
            oneAll += price[i];

            if(price[i] > oneMax) {
                oneMax = price[i];
            }
            if(price[i]*numbers[i] > allMax) {
                allMax = price[i]*numbers[i];
            }
        }
        System.out.println("商品總價："+all);
        System.out.println("單價均價："+(oneAll/names.length));
        System.out.println("最單單價："+oneMax);
        System.out.println("最高總價："+allMax);
    }

}
