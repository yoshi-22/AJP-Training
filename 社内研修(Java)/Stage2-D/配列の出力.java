import java.util.*;
public class Value  {
    public static void main(String[] args) {
        
        //変数strを宣言
        String str = "orange/apple/cherry/grape/apple";
        
        //配列変数fruitsを宣言
        String[] fruits = str.split("/",0);
        
        //配列変数fruitsを順番に出力
        for (int i = 0; i < 5; i++) {
        System.out.println((i + 1) + ":" + fruits[i]);
        }
    }
}