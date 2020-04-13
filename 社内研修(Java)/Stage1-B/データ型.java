import java.util.Date;

public class Data   {
        public static void main (String[]args){
        char a = '山';
        String name  = "山本義之"; 
        int age = 22;
        boolean bool = true;
        Date date = new Date();
        
        System.out.println("文字型："+a);
        System.out.println("文字列型："+name);
        System.out.println("整数型："+age);
        System.out.println("論理型："+bool);
        System.out.println("日付型：" + date);
        }
}
