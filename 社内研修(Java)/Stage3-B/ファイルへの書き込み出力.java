import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Text {
  
  //クラス変数writingを宣言
  public static String writing = "output/0424_output.txt" ;
  
  public static void main(String[] args) {
    
    //可変長引数を設定し、メソッドstrへ渡す
    String date = "四月二十四日";
    String greeting = "おはようございます";
    str(date,greeting);
}

  //可変長引数を受け取りテキストファイルへ出力
  private static void str(String...introduction){
    try {
      
      // FileWriterクラスのオブジェクトを生成する
      FileWriter file = new FileWriter(writing);
      // PrintWriterクラスのオブジェクトを生成する
      PrintWriter printwriter = new PrintWriter(new BufferedWriter(file));
     
      //ファイルに書き込む
      printwriter.println(introduction[0]);
      printwriter.println(introduction[1]);
     
      //ファイルを閉じる、例外があれば表示する
      printwriter.close();
        }catch (IOException e) {
          e.printStackTrace();
        }
    }
}