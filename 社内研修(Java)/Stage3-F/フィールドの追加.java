import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.io.*;

     //内部クラスの作成
     class UserBean implements Serializable{
            private static final long serialVersionUID = 1L;
            
            //クラスフィールドの初期値の設定
            public static int count = 0;
            public String place = "兵庫県";
        
            //インスタンスフィールドの定義
            private  String id;
            private  String name;
            private  String pass;
            private  Date date;
            private  int age;
            private String birthDay;
            
            //ユーザIDのsetter
            public void setId(String id){
                this.id = id;
            } 
            //ユーザ名のsetter
            public void setName(String name){
                this.name = name;
            }
            //パスワードのsetter
            public void setPass(String pass){
                this.pass = pass;
            }
            //生年月日のsetter
            public void setBirthDay(String birthDay){
                this.birthDay = birthDay;
            }
            //年齢のsetter
            public void setAge(int age){
                this.age = age;
            }
            //所属地のsetter
            public void setPlace(String place){
                this.place = place;
            }
            //ユーザーIDのgetter
            public String getId(){
                return this.id;
            }
            //ユーザー名のgetter
            public String getName(){
                return this.name;
            }
            //パスワードのgetter
            public String getPass(){
                return this.pass;
            }
            //生年月日のgetter
            public String getBirthDay(){
                return this.birthDay;
            }
            //年齢のgetter
            public int getAge(){
                return this.age;
            }
            //所属地のgetter
            public String getPlace(){
                return this.place;
            }
            //コンストラクタの設定
            public UserBean(String id,String name,String pass,String birthDay,int age){
		        this.id = id;
		        this.name = name;
		        this.pass = pass;
		        this.age = age;
		        UserBean.count++;
	}
	        @Override
	        public String toString(){
	            
	            //生年月日を設定
	            Calendar calendar = Calendar.getInstance();
                calendar.set(Calendar.YEAR, 1998); 
                calendar.set(Calendar.MONTH, 1); 
                calendar.set(Calendar.DAY_OF_MONTH, 1);
                this.date = calendar.getTime();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
                this.birthDay =  sdf.format(date);
	            String crlf = System.getProperty("line.separator");
		        return "ユーザーID:" + id + crlf +"ユーザー名:" + name + crlf + "パスワード:" + pass + crlf + "生年月日:" + birthDay  + crlf + "年齢：" + age ;
	}
    }
        public class Main3{
    	    public static void main(String[]args){
    	         
    	        //Beansクラスのインスタンスを生成
	        	UserBean beans = new UserBean("4649", "山本義之","秘密","",22);
	        	
	        	//それぞれのインスタンスの値を出力する
                System.out.println(beans);
	        	System.out.println("所属地：" + beans.getPlace());
	        	System.out.println("カウント数：" + UserBean.count);
    }
}