import java.util.Scanner;
import java.util.Random;

public class BlackJack{
    public static void main(String args[]){
        
        int i = 0;
        
        //配列numbersを宣言
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        
        //子合計の変数resultを宣言
        Random random = new Random();
        int number = numbers[random.nextInt(10)];
        int number2 = numbers[random.nextInt(10)];
        int result = number;
        int randomValue = random.nextInt();
        System.out.println("数値：" + number + " 合計：" + result);
        System.out.println("次のランダム数値を取得しますか[Yes/No]");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        //numbersの要素をランダム表示し、値を一つ取得する
        outside:while(i < 100){
            
            //Yesの場合
            if (str.equals("Yes")){
                number2 = numbers[random.nextInt(10)];
                result = result + number2; 
                System.out.println("数値：" + number2 + " 合計：" + result);
                
                //合計が21を超えると初めに戻る
                if(result > 21){
                    System.out.println("lose");
                    number = numbers[random.nextInt(10)];
                    result = number;
                    System.out.println("次のランダム数値を取得しますか[Yes/No]");
                    System.out.println("数値：" + number + " 合計：" + result);
                    scan = new Scanner(System.in);
                    str = scan.nextLine();
                    continue outside;
                }
                System.out.println("次のランダム数値を取得しますか[Yes/No]");
                scan = new Scanner(System.in);
                str = scan.nextLine();
            }
            
            //Noが入力された場合の処理
            else if(str.equals("No")){
                
                //配列numbers2を宣言
                int[] numbers2 = {15,16,17,18,19,20,21,22};
        
                //numbers2の要素をランダム表示して、親数値として代入する
                Random random2 = new Random();
                int parentNumber = numbers2[random2.nextInt(8)];
                System.out.println("数値：" + parentNumber + " 合計：" + parentNumber);
                
                //親数値が22より大きければWINを表示する    
                if(parentNumber > 22){
                System.out.println("WIN");
                    break;
                    
                //親数値が合計より大きい場合、LOSEを表示する
                }else if(parentNumber > result){
                System.out.println("LOSE");
                    break;
                    
                //親数値が合計と同じ場合、DRAWを表示する
                }else if(parentNumber == result){
                System.out.println("DRAW");
                    break;
                    
                //親数値が合計より小さい場合、WINを表示する    
                }else if(parentNumber < result){
                System.out.println("WIN");
                    break;
                }
                
            //YesとNo以外が入力された場合は同じ表示を繰り返す
            }else{
                    System.out.println("数値：" + number + " 合計：" + result);
                    System.out.println("次のランダム数値を取得しますか[Yes/No]");
                    scan = new Scanner(System.in);
                    str = scan.nextLine();
            }
            i ++;
        }
    }
}