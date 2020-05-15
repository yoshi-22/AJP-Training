import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.io.*;

     //内部クラスの作成
     class UserBean implements Serializable{
            private static final long serialVersionUID = 1L;
        
            //クラスフィールドの定義
            private String id;
            private String name;
            private String pass;
            private Date date;
            private int age;
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
             public UserBean(String id,String name,String pass,int age){
		        this.id = id;
		        this.name = name;
		        this.pass = pass;
		        this.age = age;
	        }
	        @Override
	        public String toString(){
	            
	            //生年月日を設定
	            Calendar calendar = Calendar.getInstance();
                calendar.set(Calendar.YEAR, 1998); 
                calendar.set(Calendar.MONTH, 1); 
                calendar.set(Calendar.DAY_OF_MONTH, 2);
                this.date = calendar.getTime();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
                this.birthDay =  sdf.format(date);
	            String crlf = System.getProperty("line.separator");
		        return "ユーザーID:" + id + crlf +"ユーザー名:" + name + crlf + "パスワード:" + pass + crlf + "生年月日:" + birthDay  + crlf + "年齢：" + age ;
	}
}
    public class Main2{
        public static void main(String[]args){
    	        
    	        //Beansクラスのインスタンスを生成し、値を代入する
	        	UserBean beans = new UserBean("4649", "山本義之","秘密",22);
	        	
	        	//インスタンスの値を出力する
                System.out.println(beans);
    }
}