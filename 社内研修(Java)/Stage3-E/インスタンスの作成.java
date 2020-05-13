import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.io.*;

     //内部クラスの作成
     class UserBean implements Serializable{
            private static final long serialVersionUID = 1L;
        
            //クラスフィールドの定義
            private  String id;
            private  String name;
            private  String pass;
            private  Date date;
            private  int age;
            private String birthDay;
            
            //コンストラクタの設定
            UserBean(){
                this.id = "４６４９"; 
                this.name = "山本義之";
                this.pass = "秘密";
                Calendar calendar = Calendar.getInstance();
                calendar.set(Calendar.YEAR, 1998); //年を設定
                calendar.set(Calendar.MONTH, 1); //月を設定
                calendar.set(Calendar.DAY_OF_MONTH, 2);//日を設定
                this.date = calendar.getTime();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
                this.birthDay =  sdf.format(date);
                this.age = 22;
        }
            
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
            public void setBirthDay(String birthday){
                this.birthDay = birthDay;
            }
            //年齢のsetter
            public void setInt(int age){
                this.age = age;
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
            
    }
        public class Main2{
    	    public static void main(String[]args){
    	         
    	        //Beansクラスのインスタンスを生成
	        	UserBean beans = new UserBean();
	        	
	        	//それぞれのインスタンスの値を出力する
	        	System.out.println("ユーザーID：" + beans.getId());
	        	System.out.println("ユーザー名：" + beans.getName());
	        	System.out.println("パスワード：" + beans.getPass());
	        	System.out.println("生年月日：" + beans.getBirthDay());
	        	System.out.println("年齢：" + beans.getAge());
}
}