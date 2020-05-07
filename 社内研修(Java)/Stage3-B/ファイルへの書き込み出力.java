import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.io.File;

public class Text {
  
  //クラス変数writingを宣言
  public static String writing = "/home/ec2-user/environment/サンプル実行/output";
  
  public static void main(String[] args) {
  
    //可変長引数を設定し、メソッドstrへ渡す
    String day  = "月曜日";
    String greeting = "おはようございます";
    str(day,greeting);
}

  //可変長引数を受け取りテキストファイルへ出力
  private static void str(String...introduction){
    try {
      
      //日付とファイル名の取得
      Date date = new Date();
      SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
      String fileName = sdf.format(date) + "_output.txt";
    
      File file = new File(writing + "/" + fileName);
      // FileWriterクラスのオブジェクトを生成する
      FileWriter filewriter = new FileWriter(file);
      // PrintWriterクラスのオブジェクトを生成する
      PrintWriter printwriter = new PrintWriter(new BufferedWriter(filewriter));
     
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