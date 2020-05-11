import java.util.Date;
import java.io.*;

public class Main{
    
         //内部クラスの作成
         class UserBean implements Serializable{
            private static final long serialVersionUID = 1L;
        
            //クラスフィールドの定義
            private String id;
            private String name;
            private String pass;
            private Date date;
            private int age;
            
            //引数なしのコンストラクタの定義
            public UserBean(){}
        
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
            public void setDate(Date date){
                this.date = date;
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
            public Date getDate(){
                return this.date;
            }
            //年齢のgetter
            public int getAge(){
                return this.age;
        }
    }
    public static void main(String[]args){
        
    }
}