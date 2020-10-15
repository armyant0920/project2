/**
 * 多參數讀取案例
 */
public class Params {
    public static void main(String[] args) {
        System.out.println(Params.connect("dsd","asdf","gfh"));
    }
    public static boolean connect(String...params ){
//        System.out.println(Arrays.stream(params).toArray());
//        System.out.println(params);
        for(String s:params){

            System.out.println(s);
        }

//        Connection conn= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=JDBCDB","scott","tiger");
        return true;

    }
}
