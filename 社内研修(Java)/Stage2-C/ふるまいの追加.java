import java.util.Scanner;
    public class Sentence{
        public static void main(String args[]) {
            Scanner scan = new Scanner(System.in);
            
            //キーボード入力(エンターまで)を変数strに代入する
            String str = scan.nextLine();
            
            //文字列の文字数を変数str2に代入する
            int number = str.length();
            
            //頭文字の変数を宣言
            String str2 = str.substring(0,1);
            
            //語尾の変数を宣言
            String str3 = str.substring(str.length() - 1);
    
            System.out.println("入力された値は" + str + " です。");
            System.out.println("桁数：" + number + "桁");
        
        //文字数が2文字以上の場合のみ出力する
            if (number >= 2){
            System.out.println("頭文字：" + str2);
            System.out.println("語尾：" + str3);
            }
        
        //変数answerを宣言
            String answer = "";
            
        //Aが存在するならanswerの値はYesとなり、それ以外はNoとなる
            if (str.contains("A")){
                answer = "Yes";
            }else{
                answer = "No" ;
            }
            
            System.out.println("文字列にAを含む:" + answer);
        }
    }
