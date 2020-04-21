import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class Time {
 
    public static void main(String[] args) {
    	System.out.println("20秒カウントスタート");
    	
    	//clを宣言
        Calendar cl = Calendar.getInstance();
 
        // フォーマットを指定し、sdfを宣言
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
        
        //timerとtaskを宣言
        Timer timer = new Timer();
		TimerTask task = new TimerTask() {
			
			//cntを宣言
			int cnt=0;
 
			public void run() {
				
				//現在時刻から一秒ずつカウントを始める
				System.out.println(sdf.format(cl.getTime()));
				cl.add(Calendar.SECOND, 1);
				cnt++;
				
				//20回実行で終了
				if ( cnt >= 20 ) timer.cancel();
				if ( cnt >= 20 ){
					System.out.println("20秒カウント終わりました");
				}
				
			}
		};
		timer.schedule(task,0,1000);
	}
}