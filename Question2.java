package question;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        /*question11 最優選擇2
        小藍同學想買一個價值8888元的新手機，她的舊手機在二手市場能賣1880元，
        而手機專賣店推出以舊換新的優惠，把她的舊手機交給店家，新手機就能夠打7.5折優惠。
        為了更省錢，小藍要不要以舊換新？*/
        double money1 = 8888 - 1880;
        double money2 = 8888 * 0.75;
        if (money1 > money2) {
            System.out.println("使用以舊換新更省錢");
        } else {
            System.out.println("不使用以舊換新更省錢");
        }
        /*question12 求數字的絕對值
        絕對值是指一個數在數軸上所對應點到原點的距離，用“| |”來表示。
        負數的絕對值是他去掉負號以後的值，而非負數（0和正數）的絕對值是他本身。
        請定義一個方法，接收用戶輸入的數字，輸出絕對值結果。
         */
        System.out.println("請輸入要判斷的數字");
        double math = new Scanner(System.in).nextDouble();
        double result = getAbsNum(math);
        System.out.println(math + "的絕對值是:" + result);

        //question13 求指定兩個數的最大公約數和最小公倍數
        System.out.println("請輸入兩個整數");
        int a = new Scanner(System.in).nextInt();
        int b = new Scanner(System.in).nextInt();

        int d = one(a, b);
        long c = two(a, b);
        System.out.println("最大公約數:" + d);
        System.out.println("最小公倍數:" + c);

        /*question14 銀行收入計算
        某銀行推出了整存整取定期儲蓄業務，其存期分為一年、兩年、三年、五年，到期憑存單支取本息。存款年利率表如下：
        存期年利率（%）
        一年2.25
        兩年2.7
        三年3.25
        五年3.6
        請存入一定金額（1000起存），存一定年限（四選一），計算到期後得到的本息總額。
        提示：
        存入金額和存入年限均由鍵盤錄入
        本息計算方式：本金+本金×年利率×年限
         */
        System.out.println("請輸入存款金額:");
        int money = new Scanner(System.in).nextInt();
        System.out.println("請輸入存款年限:(1,2,3,5年,四選一)");
        int year = new Scanner(System.in).nextInt();
        double outMoney = 0;
        if (year == 1 ){
            outMoney = money+money*2.25 / 100 * 1;
        }else if (year == 2){
            outMoney = money+money*2.25 / 100 * 2;
        }else if (year == 3){
            outMoney = money+money*2.25 / 100 * 3;
        }else if (year == 5){
            outMoney = money+money*2.25 / 100 * 5;
        } else {
            System.out.println("輸入年限有誤");
        }
        System.out.println("存款:"+year+"年"+"本息總額為:"+outMoney);

        /*question15 求稅後工資問題
        2019年1月1日起，國家推出新的個人所得稅政策，起徵點上調值5000元。也就是說稅前工資扣除三險一金
        （三險一金數額假設是稅前工資的10%）後如果不足5000元，則不交稅。
        如果大於5000元，那麼大於5000元的部分按梯度交稅，具體梯度比例如下：
        0 ~ 3000元的部分，交稅3%
        3000 ~ 12000的部分 ，交稅10%
        12000 ~ 25000的部分，交稅20%
        25000 ~ 35000的部分，交稅25%
        35000 ~ 55000的部分，交稅30%
        55000 ~ 80000的部分，交稅35%
        超過80000的部分，交稅45%
        比如：小藍入職一家企業後，稅前工資是18000，則他每月該交個稅的部分是18000-1800-5000=11200元，
        個稅繳納數額是3000×3%+8200×10%=910元。稅後工資15290元。
        請完成一個個稅計算程序，在用戶輸入稅前工資後，計算出他對應的納稅數額，以及稅後工資為多少？*/
        Scanner wages = new Scanner(System.in);
        System.out.println("請輸入您的稅前工資");
        int jobMoney = wages.nextInt();
        double before = jobMoney-(jobMoney*0.1)-5000;
        double tax = 0;
        if (before > 0 && before <=3000){
            tax = before*0.03;
        }else if (before>3000 && before<12000){
            tax = 3000*0.03 +(before-3000) *0.1;
        }else if (before>12000 && before<25000){
            tax = 3000*0.03 +(before-3000) *0.2;
        }else if (before>25000 && before<35000){
            tax = 3000*0.03 +(before-3000) *0.25;
        }else if (before>35000 && before<55000){
            tax = 3000*0.03 +(before-3000) *0.3;
        }else if (before>55000 && before<80000){
            tax = 3000*0.03 +(before-3000) *0.35;
        }else if (before>80000){
            tax = 3000*0.03 +(before-3000) *0.45;
        }
        double after = jobMoney - (jobMoney*0.1) - tax;
        System.out.println("個人所得稅" + tax + "元");
        System.out.println("稅後工資" + after + "元");

        /*question16 手機選號:根據用戶輸入的手機號來確認用戶實際支付的價格
        如果尾數為8，需支付辦卡費50元
        如果尾數為4，需支付辦卡費用0元
        如果是其他尾號,需支付辦卡費用20元
         */
        System.out.println("請輸入10位數字手機號碼");
        String phone = new Scanner(System.in).nextLine();
        getPrice(phone);

        /*question17 獲取郵箱名字
        接收用戶輸入的郵箱名，獲取郵箱的名字
        比如：cxy@gmail.com,輸出cxy
         */
        System.out.println("請輸入email:");
        String email = new Scanner(System.in).nextLine();
        String n = getName(email);
        System.out.println(n);

        /*question18 分別通過for循環/While循環/do-While循環寫一個死循環*/
//        for (int i = 1; ;i++){
//            System.out.println("歡迎學習java基礎,繼續加油喔~");
//        }
//        while (true){
//            System.out.println("都到這裡啦,奧利給!!");
//        }
//         do {
//              System.out.println("相信我們可以的");
//          }while (true);

        /*question19 雞兔同籠問題(窮舉法)
        已知：雞兔共35隻，共94隻腳，那麼雞和兔各幾隻？
         */
        for (int j=0,t=35; j<=35;j++,t--){
            if (j*2 + t*4 ==94){
                System.out.println("雞有:"+j+"隻"+"兔有:"+t+"隻");
            }
        }
    }


    private static double getAbsNum(double math) {
        if (math >= 0) {
            return math;
        } else {
            return -math;
        }

    }

    private static int one(int a, int b) {
        int min = a < b ? a : b;
        for (int i = min; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }
        return 0;
    }

    private static long two(int a, int b) {
        int max = a > b ? a : b;
        for (long i = max; ; i += max) {
            if (i % a == 0 && i % b == 0) {
                return i;
            }
        }
    }
    private static void getPrice(String phone){
        if (phone.length() !=10){
            System.out.println("輸入格式號碼有誤");
            return;
        }

        char v = phone.charAt(9);

        int price = 0;

        switch (v){
            case '8' : price=50; break;
            case '4' : price=0; break;
            default:price=20;
        }
        System.out.println("您實際應付價格為:"+price);
    }
    static String getName(String email){
        int index = email.indexOf("@");
        if (index == -1){
            return "郵箱格是錯誤";
        }
        return email.substring(0,index);
    }

}
