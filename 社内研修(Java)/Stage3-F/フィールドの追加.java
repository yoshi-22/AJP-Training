import java.io.*;

    //内部クラスの作成
    class UserBean implements Serializable{
        private static final long serialVersionUID = 1L;
        
        //クラスフィールドの設定
        public static int count = 0;
        public static String place;
        
        //インスタンスフィールドの定義
        private  String id;
        private  String name;
        private  String pass;
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
        public UserBean(String place){
            this.place = place;
            UserBean.count++;
        }
    }
    
    public class Main3{
        public static void main(String[]args){
            //Beansクラスのインスタンスを生成
	        UserBean beans = new UserBean("兵庫県");
	        
	        //インスタンスの値をセットする
	        beans.setId("４６４９");
	        beans.setName("山本義之");
	        beans.setPass("秘密");
	        beans.setBirthDay("1998年02月02日");
	        beans.setAge(22);
	        
	        //インスタンスの値を出力する
            System.out.println("ユーザID：" + beans.getId());
            System.out.println("ユーザ名：" + beans.getName());
            System.out.println("パスワード：" + beans.getPass());
            System.out.println("生年月日：" + beans.getBirthDay());
            System.out.println("年齢：" + beans.getAge());
	        System.out.println("所属地：" + beans.getPlace());
	        System.out.println("カウント数：" + UserBean.count);
        }
    }