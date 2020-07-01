import java.util.Scanner;
import java.util.Random;

public class BlackJack{
    public static void main(String args[]){
        
        //配列numbersを宣言
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        
        //ランダムの値をnumberとnumber2に代入する
        Random random = new Random();
        int number = numbers[random.nextInt(10)];
        int number2 = numbers[random.nextInt(10)];
        int randomValue = random.nextInt();
        
        //子合計の変数resultを宣言
        int result = number;
        
        //現在の合計を表示する
        System.out.println("数値：" + number + " 合計：" + result);
        System.out.println("次のランダム数値を取得しますか[Y/N]");
        
        //コンソール入力を受け付けて、値をstrに代入する
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        
        int i = 0;
        outside:while(i < 100){
            
            //Yesを入力した場合の処理
            if (str.equals("Y")){
                number2 = numbers[random.nextInt(10)];
                result = result + number2; 
                System.out.println("数値：" + number2 + " 合計：" + result);
                
                //合計が21を超えるとLOSEを表示する
                if(result > 21){
                    System.out.println("lOSE");
                    break;
                }
                System.out.println("次のランダム数値を取得しますか[Y/N]");
                scan = new Scanner(System.in);
                str = scan.nextLine();
            }
            
            //Noが入力された場合の処理
            else if(str.equals("N")){
                
                //配列numbers2を宣言
                int[] numbers2 = {15,16,17,18,19,20,21,22};
        
                //numbers2の要素をランダム表示して、親数値として代入する
                Random random2 = new Random();
                int parentNumber = numbers2[random2.nextInt(8)];
                System.out.println("親数値：" + parentNumber + " 合計：" + parentNumber);
                
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
                
            //YesとNo以外が入力された場合はoutsideに戻る
            }else{
                number = numbers[random.nextInt(10)];
                result = number;
                System.out.println("次のランダム数値を取得しますか[Y/N]");
                System.out.println("数値：" + number + " 合計：" + result);
                scan = new Scanner(System.in);
                str = scan.nextLine();
                continue outside;
            }
            i ++;
        }
    }
}