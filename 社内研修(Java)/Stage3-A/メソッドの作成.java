import java.util.Scanner;

public class Circle {
    
    //メンバ変数numberを宣言
    double number;
    
    public static void main (String []args){
        
        //求める円の半径を入力し、引数としてcircleAreaへ渡す
        Scanner scan = new Scanner(System.in);
        System.out.print("円の半径：");
        double radius = scan.nextDouble();
        circleArea(radius);
        
        //戻り値を受け取り、出力する
        System.out.println("円の面積：" + circleArea(radius));
    }
        
        
    //引数(radius)を変数calculateで受け取る
    private static double circleArea(double calculate ){
        
        //円の面積を計算し、戻り値でmainメソッドに返す
        double number = 3.14;
        double answer = calculate*calculate*number;
        return answer;
    }
}