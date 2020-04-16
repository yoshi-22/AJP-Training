import java.util.Scanner;
    public class Communication{
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String  str  = scan.nextLine();
        
        //文字数を入れる変数を宣言
        int number = str.length();
        
        //頭文字を入れる変数を宣言
        String str2 = str.substring(0,1);
        
        //語尾を入れる変数を宣言
        String str3 = str.substring(str.length()-1);
        
        System.out.println("入力された値は " + str + " です。");
        System.out.println(number   +   "桁");
        
        //文字数が2文字以上の場合のみ出力する
        if (number>=2){
            System.out.println("頭文字：" +   str2);
            System.out.println("語尾：" +   str3);
        }
    }
}