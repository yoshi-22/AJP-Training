import java.util.*;
public class Value  {
    public static void main(String[] args) {
        
        //変数strを宣言
        String str = "１：orange/２：apple/３：cherry/４：grape/５：apple";
        
        //配列変数fruitsを宣言
        //変数strを/で区切って出力する
        String[] fruits = str.split("/");
        Arrays.stream(fruits).forEach(e -> System.out.println(e));
    }
}