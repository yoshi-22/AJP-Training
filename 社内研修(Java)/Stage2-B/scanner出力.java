import java.util.Scanner;
    public class Communication{
    public static void main(String args[]) {
        Scanner A = new Scanner(System.in);
        String str = A.next();
        System.out.println("入力された値は " + str + " です。");
        
        int number = A.nextInt();
        System.out.println(number   +   "桁");
        
        str = A.next();
        System.out.println(str);
        
        str = A.next();
        System.out.println(str);
    }
}