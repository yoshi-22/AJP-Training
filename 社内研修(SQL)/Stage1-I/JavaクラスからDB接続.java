import java.lang.*;
import java.net.*;
import java.sql.*;
import java.sql.ResultSet;
import java.sql.Statement;

//外部クラスの作成
class Outer{
    
    //内部クラスの作成
    public class Inner{
        
        //MySQLのConectionを取得するメソッドの作成。
        public Connection fetchConnection(){
            try {
                // MySQLのデータベースTASK_DBを接続
                String url = "jdbc:mysql://localhost/TASK_DB?useUnicode=true&characterEncoding=utf8";
                Connection con = DriverManager.getConnection(url,"root","");
                    return con;
                
            }catch(Exception e){
                System.out.println(e.getMessage());
                    return null;       
                
            }
            
        }
        //田が付くレコード数を返すメソッドの作成
        public String findCount(){
            try {
                String url = "jdbc:mysql://localhost/TASK_DB?useUnicode=true&characterEncoding=utf8";
                Connection con = DriverManager.getConnection(url,"root","");
                Statement stmt = con.createStatement();
                
                //’田’がつくレコード数を取得する
                String sql = "SELECT COUNT(USER_NM) FROM T_USER WHERE USER_NM LIKE '%田%'";
                ResultSet rs = stmt.executeQuery(sql);
                rs.next();
                
                //文字列型nameCountを戻り値に設定
                String nameCount = rs.getString("COUNT(USER_NM)");
                rs.close();
                stmt.close();
                    return nameCount;
            }catch(Exception e){
                System.out.println(e.getMessage());
                    return null;
            }
        }
        //USER_ID(引数)に応じて抽出条件が変わるメソッドの作成
        public String searchData(Connection con,String change){
            try {
                Statement stmt = con.createStatement();
                String sql2 = "SELECT* FROM T_USER WHERE USER_ID ='" + change + "'";
                ResultSet rs = stmt.executeQuery(sql2);
                rs.next();
                
                //USER_NMカラムを取得し、戻り値（userName）とする
                String userName = rs.getString("USER_NM");
                rs.close();
                stmt.close();
                    return userName;
            }catch(Exception e){
                System.out.println(e.getMessage());
                    return "error";
            }
        }
    }
}
    public class Transport {
        public static void main(String args[]){
            // 内部クラスのインスタンス生成
            Outer.Inner inner = new Outer().new Inner();
            
            //fetchConnectionメソッドを呼びだし、Connection(con)を取得する
            Connection con = inner.fetchConnection();
            
            
            //findCountメソッドを呼びだし、田の付くレコード数を表示する
            String nameCount = inner.findCount();
            System.out.println(nameCount);
            
            
            //引数（con,"AHAGA"）を設定し、searchDataメソッドを呼びだす
            String result = inner.searchData(con,"AHAGA");
            
            //ユーザ名(戻り値)を表示する
            System.out.println(result);
        }
    }